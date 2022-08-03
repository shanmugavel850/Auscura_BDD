package POM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.base;

public class Login  {
	
	public static WebDriver driver;
	
	public Login(WebDriver driver)
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
	
	public static void verify_Homepage()
	{
		String ExpectedTitle=driver.getTitle();
		//System.out.println(ExpectedTitle);
		String ActualTitle="SmartContact | Auscura";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
	} 
	
	public static void verify_Invalid_User()
	{
		String Invalidtext =driver.findElement(By.xpath("//div[@class='error']")).getText();
		//System.out.println(Invalidtext);
		String Actualtext = "Username or password is incorrect.";
		Assert.assertEquals(Invalidtext,Actualtext);
	}
	
	public static void verify_Invalid_User2()
	{
		String Invalidtext =driver.findElement(By.xpath("//div[@class='error']")).getText();
		//System.out.println(Invalidtext);
		String Actualtext = "Invalid User";
		Assert.assertEquals(Invalidtext,Actualtext);
	}
	
	public static void verify_user_in_login_page()
	{
		String ExpectedURL = driver.getCurrentUrl();
		String ActualURL = "https://beta.s-er.co/";
		Assert.assertEquals(ExpectedURL,ActualURL);
	}

}
