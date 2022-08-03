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

import POM.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	public class stepdefinition extends base  {		
		
		//Invalid Credentails
		
		@Given("^Navigating to URL$")
		public void navigating_to_URL() throws Throwable {
		    
			driver =initializeDriver();
		}

		@When("^User enters Invalid Credentials and click login$")
		public void User_enters_Invalid_Credentials_and_click_login() throws Throwable {
		   
			Login lp = new Login(driver);
			datadriven d = new datadriven();
			ArrayList<String> Username=d.getdata("Login");
			ArrayList<String> pass=d.getdata("password");
			 
			 lp.NavigatetoURL();
			 lp.Username().sendKeys(Username.get(2));
			 lp.Password().sendKeys(pass.get(2));
			 lp.Loginbutton().click();
		}

		@Then("^Verify the notification for invalid credentials$")
		public void Verify_the_notification_for_invalid_credentials() throws Throwable {
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Login lp = new Login(driver);
		Login.verify_Invalid_User(); 
		

		}

		
				
			//valid Username and invalid password
				
				@Given("^Veriy user in the given URL$")
				public void veriy_user_in_the_given_URL() throws Throwable {
				 
					driver.navigate().refresh();
					Login lp = new Login(driver);
					Login.verify_user_in_login_page();
					
				}

				@When("^User enter valid username and invalid password$")
				public void user_enter_valid_username_and_invalid_password() throws Throwable {
			
					Login lp = new Login(driver);
					datadriven d = new datadriven();
					ArrayList<String> Username=d.getdata("Login");
					ArrayList<String> pass=d.getdata("password");
					
					 lp.Username().sendKeys(Username.get(1));
					 lp.Password().sendKeys(pass.get(2));
					 lp.Loginbutton().click();
					
				}

				@Then("^Verify the notication for invalid password$")
				public void verify_the_notication_for_invalid_password() throws Throwable {
					Login lp = new Login(driver);
					Login.verify_Invalid_User();
					
				}
				
				//Invalid Username and valid Password
				@Given("^Verify user in the given URL$")
				public void verify_user_in_the_given_URL() throws Throwable {
				   

					driver.navigate().refresh();
					Login lp = new Login(driver);
					Login.verify_user_in_login_page();
				   
				}

				@When("^User enter Invalid username and valid password$")
				public void user_enter_Invalid_username_and_valid_password() throws Throwable {
				  
					Login lp = new Login(driver);
					datadriven d = new datadriven();
					ArrayList<String> Username=d.getdata("Login");
					ArrayList<String> pass=d.getdata("password");
					
					 lp.Username().sendKeys(Username.get(3));
					 lp.Password().sendKeys(pass.get(1));
					 lp.Loginbutton().click();
				   
				}

				@Then("^Verify the notification for invalid username$")
				public void verify_the_notification_for_invalid_username() throws Throwable {
				    
					Login lp = new Login(driver);
					Login.verify_Invalid_User2();
					
					
				}

				
				//Valid Credentials	

				@Given("^Verify the user in the given URL$")
				public void Verify_the_user_in_the_given_URL() throws Throwable {
				    
					driver.navigate().refresh();
					Login lp = new Login(driver);
					Login.verify_user_in_login_page();
					
				}

				@When("^User enters valid login Credentials and click login$")
				public void User_enters_valid_login_Credentials_and_click_login() throws Throwable {
				   
					 Login lp = new Login(driver);
					 datadriven d = new datadriven();
					 ArrayList<String> Username=d.getdata("Login");
					// lp.NavigatetoURL();
					 lp.Username().sendKeys(Username.get(5));
					 ArrayList<String> pass=d.getdata("password");
					 lp.Password().sendKeys(pass.get(5));
					 lp.Loginbutton().click();

				}

				@Then("^Verify that user is successfully logged in$")
				public void verify_that_user_is_successfully_logged_in() throws Throwable {
				   
					Login lp = new Login(driver);
					Login.verify_Homepage();
					driver.close();
					}
	
		


}