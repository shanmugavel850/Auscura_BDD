package demo1;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.Login;
import POM.UserPage;
import POM.search;
import resource.base;

public class test extends base {

	public static void main(String[] args) throws InterruptedException  {
		
		// normal code

		 
	
		 driver = initializeDriver();
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	
		 //driver.get("https://beta.s-er.co/");
		 UserPage user = new UserPage(driver);
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 user.NavigatetoURL();
		 user.Username().sendKeys("aimadmin1");
		 user.Password().sendKeys("Qwerty@123");
		 user.Loginbutton().click();
		// driver.findElement(By.xpath("//h4[text()='Community Hospital']")).click();
		 
		 user.Click_User().click();
		 user.Click_List_in_the_User().click();
		 user.Wait();
/*	    driver.findElement(By.xpath("//span[text()='Users']")).click();
	    driver.findElement(By.xpath("//a[text()=' List ']")).click();
	    Thread.sleep(5000); */
	  
	    
	   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-plus']")));
	  /*  driver.findElement(By.xpath("//select[@formcontrolname='hospitalid']")).click();
	    driver.findElement(By.xpath("//option[text()='Community Hospital']")).click();
	    driver.findElement(By.xpath("//select[@formcontrolname='departmentid']")).click();
	    driver.findElement(By.xpath("//option[text()='Casuality']")).click();
	    driver.findElement(By.xpath("//button[@type='button']")).click();  */
	   
	  //  driver.findElement(By.xpath("//i[@class='fa fa-plus']")).click();
		user.verify_that_user_in_the_Users_List_page();
	  //  user.Click_Create_User_in_the_UserListPage().click();
	    
	    
	    //formfilling
	    
	  //  user.Verify_that_User_in_the_create_new_user_page();
	/*    user.Click_Username_in_the_Create_User_Page().sendKeys("shanl123456");
	    user.Click_Firstname_in_the_Create_User_Page().sendKeys("shanshan1");
	    user.Click_Title_in_the_Create_UserPage().sendKeys("Admin");
	    user.Click_Email_in_the_Create_UserPage().sendKeys("sandy123456@getnada.com");
	    user.Click_Mobile_no_in_the_Create_UserPage().sendKeys("0000100933");
	    user.Click_Role_in_the_Create_UserPage().click();
	    user.Click_DepartmentAdmin_Role_in_the_Create_UserPage().click();   */
	   
		
		
	
	}

	}


	
