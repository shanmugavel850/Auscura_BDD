package POM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class UserPage {

	public static WebDriver driver;
	
	public UserPage(WebDriver driver)
	{
		this.driver = driver;
	}  
	
	public void NavigatetoURL()
	{
		 driver.get("https://beta.s-er.co/");
	}
	
	public WebElement Username()
	{
		return driver.findElement(By.xpath("//input[@formcontrolname='username']"));
	}
	
	public WebElement Password()
	{
		return driver.findElement(By.xpath("//input[@formcontrolname='password']"));
	}
	
	public WebElement Loginbutton()
	{
		return driver.findElement(By.xpath("//button[text()='Login']"));
	}
	
	public WebElement Click_User()
	{
		return driver.findElement(By.xpath("//span[text()='Users']"));
	}
	
	public WebElement Click_List_in_the_User()
	{
		return driver.findElement(By.xpath("//a[text()=' List ']"));
	}
	
	public void Wait() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	
	public WebElement Click_Create_User_in_the_UserListPage()
	{
		return driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
	}
	
	public WebElement Click_Username_in_the_Create_User_Page()
	{
		return  driver.findElement(By.xpath("//input[@formcontrolname='username']"));
	}
	
	public WebElement Click_Firstname_in_the_Create_User_Page()
	{
		return  driver.findElement(By.xpath("//input[@formcontrolname='first_name']"));
	}
	
	public WebElement Click_Title_in_the_Create_UserPage()
	{
		return driver.findElement(By.xpath("//input[@formcontrolname='title']"));
	}
	
	public WebElement Click_Email_in_the_Create_UserPage()
	{
		return  driver.findElement(By.xpath("//input[@formcontrolname='email']"));
	}
	public WebElement Click_Mobile_no_in_the_Create_UserPage()
	{
		return  driver.findElement(By.xpath("//input[@formcontrolname='mobilephone']"));
	}
	
	public WebElement Click_Role_in_the_Create_UserPage()
	{
		return  driver.findElement(By.xpath("//input[@role='combobox']"));
	}
	public WebElement Click_DepartmentAdmin_Role_in_the_Create_UserPage()
	{
		return driver.findElement(By.xpath("//span[text()='Department Admin']"));
	}
	public void click_Save_button_in_the_Create_User_Page() throws InterruptedException
	{
		  WebElement save= driver.findElement(By.xpath("//a[text()='Save']"));
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,780)", "");
		    Thread.sleep(5000);
		    save.click();
	}
	
	public void verify_that_user_in_the_Users_List_page()
	{
		 String actualtext=driver.findElement(By.xpath("//button[@type='button']")).getText();
		// System.out.println(actualtext);
		 String expectedtext="Create User";
		 Assert.assertEquals(actualtext, expectedtext);
	}
	
	public void Verify_that_newly_created_user_displayed_in_the_Users_List()
	{
		  String actualtext =   driver.findElement(By.xpath("//td[text()='shanshan1  ']")).getText();
		    String expectedtext = "shanshan1";
		    Assert.assertEquals(actualtext, expectedtext);
	}
	
	public void Verify_that_Username_already_exists_validation_message_shown()
	{
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,-780)");	
		    String actualtext=driver.findElement(By.xpath("//div[@class='error']")).getText();
		    String expectedtext="Username already exists.";
		    Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void Verify_that_User_in_the_create_new_user_page()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,-780)");
	    String actualtext=  driver.findElement(By.xpath("//strong[text()='Create/Edit']")).getText();
	    String expectedtext = "Create/Edit";
	    Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void Verify_that_UserName_Required_validation_message_shown()
	{
		String actualtext =   driver.findElement(By.xpath("//font[text()='Username required']")).getText();
	    String expectedtext = "Username required";  
	    Assert.assertEquals(actualtext,expectedtext);
	 }
	 
	public void Verify_that_Name_Required_validation_message_shown()
	{
		   String actualtext =   driver.findElement(By.xpath("//font[text()='Name required']")).getText();
		    String expectedtext = "Name required";
		    Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void Verify_that_Title_required_message_is_shown()
	{
		 String actualtext =  driver.findElement(By.xpath("//font[text()='Title required']")).getText();
		 String expectedtext = "Title required";
		 Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void Verify_that_Email_Require_message_is_shown()
	{
	    String actualtext =  driver.findElement(By.xpath("//font[text()='Email required']")).getText();
	    String expectedtext = "Email required";
	    Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void Verify_that_Phone_Number_Required_message_is_shown()
	{
		 String actualtext =  driver.findElement(By.xpath("//font[text()='Phone Number required']")).getText();
		 String expectedtext = "Phone Number required";
		 Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void Verify_that_Role_Required_message_is_shown()
	{
		 String actualtext =  driver.findElement(By.xpath("//font[text()='Role required']")).getText();
		 String expectedtext = "Role required";
	     Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void Veriy_that_Level_Required_message_is_shown()
	{
	    String actualtext =  driver.findElement(By.xpath("//font[text()='Level required']")).getText();
	    String expectedtext = "Level required";
	    Assert.assertEquals(actualtext,expectedtext);
	}
	
	
	}
