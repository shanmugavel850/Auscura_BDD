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
import POM.UserPage;
import POM.search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class User_step extends base {
  //navigating to Users List Page
    @Given("^User is successfully logged in$")
    public void user_is_successfully_logged_in() throws Throwable {
    	driver =initializeDriver();
		UserPage user = new UserPage(driver);
		datadriven d = new datadriven();
		ArrayList<String> Username=d.getdata("Login");
		ArrayList<String> pass=d.getdata("password");
		user.NavigatetoURL();
		user.Username().sendKeys(Username.get(5));
		user.Password().sendKeys(pass.get(5));
		user.Loginbutton().click();
    }

    @When("^User click User and Click list in the user$")
    public void user_click_user_and_click_list_in_the_user() throws Throwable {
    	UserPage user = new UserPage(driver);
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	user.Click_User().click();
    	user.Click_List_in_the_User().click();
    }
  
    
    @Then("^User's List Page should be displayed$")
    public void users_list_page_should_be_displayed() throws Throwable {
    	UserPage user = new UserPage(driver);
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        user.Wait();
    	user.verify_that_user_in_the_Users_List_page();
    }
//Creating a new user

    @Given("^Verify that user in the User's List Page$")
    public void verify_that_user_in_the_users_list_page() throws Throwable {
    	UserPage user = new UserPage(driver);
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	user.verify_that_user_in_the_Users_List_page();
        user.Wait();
    }
    
    @When("^User click Create User and enter valid data and click Save$")
    public void user_click_create_user_and_enter_valid_data_and_click_save() throws Throwable {
    	UserPage user = new UserPage(driver);
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	user.Click_Create_User_in_the_UserListPage().click();
    	//formfilling
    	datadriven d = new datadriven();
    	ArrayList<String> newuser=d.getdata("newuser");
        user.Click_Username_in_the_Create_User_Page().sendKeys(newuser.get(1));
   	    user.Click_Firstname_in_the_Create_User_Page().sendKeys(newuser.get(2));
   	    user.Click_Title_in_the_Create_UserPage().sendKeys(newuser.get(3));
   	    user.Click_Email_in_the_Create_UserPage().sendKeys(newuser.get(4));
   	    user.Click_Mobile_no_in_the_Create_UserPage().sendKeys(newuser.get(5));
   	    user.Click_Role_in_the_Create_UserPage().click();
   	    user.Click_DepartmentAdmin_Role_in_the_Create_UserPage().click();
   	    user.click_Save_button_in_the_Create_User_Page();

    	
    }

   
    @Then("^Verify that newly created user in the UsersList$")
    public void Verify_that_newly_created_user_displayed_in_the_Users_List() throws Throwable {
    	UserPage user = new UserPage(driver);
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	user.Verify_that_newly_created_user_displayed_in_the_Users_List();
    }
    // User can't create new user with already existing username
        @Given("^Verify that user in the Create new user page$")
        public void verify_that_user_in_the_create_new_user_page() throws Throwable {
          	 UserPage user = new UserPage(driver);
           	 driver.navigate().refresh();
           	 user.Wait();
             user.Click_Create_User_in_the_UserListPage().click();
             user.Wait();
        	 user.Verify_that_User_in_the_create_new_user_page();
        }

        @When("^User enter existing user details and click save$")
        public void user_enter_existing_user_details_and_click_save() throws Throwable {
        	UserPage user = new UserPage(driver);
        	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        	datadriven d = new datadriven();
        	ArrayList<String> newuser=d.getdata("newuser");
            user.Click_Username_in_the_Create_User_Page().sendKeys(newuser.get(1));
       	    user.Click_Firstname_in_the_Create_User_Page().sendKeys(newuser.get(2));
       	    user.Click_Title_in_the_Create_UserPage().sendKeys(newuser.get(3));
       	    user.Click_Email_in_the_Create_UserPage().sendKeys(newuser.get(4));
       	    user.Click_Mobile_no_in_the_Create_UserPage().sendKeys(newuser.get(5));
       	    user.Click_Role_in_the_Create_UserPage().click();
       	    user.Click_DepartmentAdmin_Role_in_the_Create_UserPage().click();
       	    user.click_Save_button_in_the_Create_User_Page();
        }

        @Then("^Username already exist validation message should gets displayed$")
        public void username_already_exist_validation_message_should_gets_displayed() throws Throwable {
        	 UserPage user = new UserPage(driver);
        	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        	 user.Verify_that_Username_already_exists_validation_message_shown();
        }
//Verify the validation messages of mandatory fields shown

        @Given("^Verify that user in the Create a NewUser page$")
        public void verify_that_user_in_the_create_a_newuser_page() throws Throwable {
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            UserPage user = new UserPage(driver);
            user.Wait();
            user.Verify_that_User_in_the_create_new_user_page();
        }

        @When("^User click save$")
        public void user_click_save() throws Throwable {
        	  UserPage user = new UserPage(driver);
        	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        	  user.Wait();
        	  user.click_Save_button_in_the_Create_User_Page();  
        }

        @Then("^Validation messages of the mandatory fields should gets displayed$")
        public void validation_messages_of_the_mandatory_fields_should_gets_displayed() throws Throwable {
        	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        	UserPage user = new UserPage(driver);          
     	    user.Verify_that_UserName_Required_validation_message_shown();
     	    user.Verify_that_Name_Required_validation_message_shown();
     	    user.Verify_that_Title_required_message_is_shown();
     	    user.Verify_that_Email_Require_message_is_shown();
     	    user.Verify_that_Phone_Number_Required_message_is_shown();
     	    user.Verify_that_Role_Required_message_is_shown();
     	    user.Veriy_that_Level_Required_message_is_shown();
        }
}
