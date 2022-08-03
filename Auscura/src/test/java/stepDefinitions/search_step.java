package stepDefinitions;


import resource.base;

import java.sql.Driver;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import Excel.datadriven;


import POM.search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	public class search_step extends base  {		
		
		//Enter into Search Page
		
		@Given("^User successfully logged in$")
		public void user_successfully_logged_in() throws Throwable {
		    
			driver =initializeDriver();
			search Search = new search(driver);
			datadriven d = new datadriven();
			ArrayList<String> Username=d.getdata("Login");
			ArrayList<String> pass=d.getdata("password");
			Search.NavigatetoURL();
			Search.Username().sendKeys(Username.get(4));
			Search.Password().sendKeys(pass.get(4));
			Search.Loginbutton().click();
		}

		@When("^User click community hospital and search button$")
		public void User_click_community_hospital_and_search_button() throws Throwable {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			search Search = new search(driver);
			Search.Click_community_Hospital().click();
			Search.Click_Search().click();
		}

		@Then("^Verify user redirect into the search page$")
		public void Verify_user_redirect_into_the_search_page() throws Throwable {
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    search Search = new search(driver);
	    Search.Verify_user_in_search_page();
		
		}
		//verify the search functionality is working fine
		@Given("^Verify user in the search page$")
		public void Verify_user_in_the_search_page() throws Throwable {
		    
			search Search = new search(driver);
			Search.Verify_user_in_search_page();
			
		}

		@When("^User selects the Location Department From To and click search$")
		public void User_selects_the_Location_Department_From_To_and_click_search() throws Throwable {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			search Search = new search(driver);
			 Search.Select_the_date_in_the_From();
		     Search.Select_the_date_in_the_to();
			 Search.Click_search_in_the_searchpage();
			 Search.Click_Location().click();
			 Search.Click_Community_Hospital_in_the_location().click();
			 Search.Click_Department().click();
			 Search.Click_Casulaity_in_the_department().click();
			 Search.Click_search_in_the_searchpage();
			
			 
			 }

		@Then("^verify proposed searching data should be displayed$")
		public void verify_proposed_searching_data_should_be_displayed() throws Throwable {
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    search Search = new search(driver);
	    Search.verify_proposed_data_is_displayed_in_the_search_page();
	    
		
		}
		//verify that user is able to search with age filter
		@Given("^Verify the user in the search page$")
		public void verify_the_user_in_the_search_page() throws Throwable {
			driver.navigate().refresh();
			search Search = new search(driver);
			Search.Verify_user_in_search_page();
		}

		@When("^User Selects the Location, Department, From, To, age filter and click search$")
		public void user_Selects_the_Location_Department_From_To_age_filter_and_click_search() throws Throwable {
		  
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			search Search = new search(driver);
			 Search.Select_the_date_in_the_From();
		     Search.Select_the_date_in_the_to();
			 Search.Click_search_in_the_searchpage();
			 Search.Click_Location().click();
			 Search.Click_Community_Hospital_in_the_location().click();
			 Search.Click_Department().click();
			 Search.Click_Casulaity_in_the_department().click();
			 Search.click_age_filter().click();
			 Search.Click_infant_in_the_agefilter().click();
			 Search.Click_search_in_the_searchpage();
		}

		@Then("^Verify Proposed age group data should be displayed$")
		public void verify_Proposed_age_group_data_should_be_displayed() throws Throwable {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			search Search = new search(driver);
			Search.Verify_infant_details_are_displayed();
		}
		
		//Verify that user is able to search with gender filter
		@Given("^Check the user in the search page$")
		public void check_the_user_in_the_search_page() throws Throwable {
			driver.navigate().refresh();
			search Search = new search(driver);
			Search.Verify_user_in_search_page();
		}

		@When("^User Selects the Location, Department, From, To, gender filter and click search$")
		public void user_Selects_the_Location_Department_From_To_gender_filter_and_click_search() throws Throwable {
		   
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			search Search = new search(driver);
			 Search.Select_the_date_in_the_From();
		     Search.Select_the_date_in_the_to();
			 Search.Click_search_in_the_searchpage();
			 Search.Click_Location().click();
			 Search.Click_Community_Hospital_in_the_location().click();
			 Search.Click_Department().click();
			 Search.Click_Casulaity_in_the_department().click();
			 Search.Click_gender_filter().click();
			 Search.Click_Female_in_the_Genter_filter().click();
			 Search.Click_search_in_the_searchpage();
		}

		@Then("^Verify Proposed gender data should be displayed$")
		public void verify_Proposed_gender_data_should_be_displayed() throws Throwable {
		
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			search Search = new search(driver);
			Search.Verify_Female_data_should_be_displayed();
			driver.close();
		}
		
		
	}
