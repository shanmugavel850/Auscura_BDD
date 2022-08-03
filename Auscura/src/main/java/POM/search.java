package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class search {
public static WebDriver driver;
	
	public search(WebDriver driver)
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
	
	public void Verify_user_in_search_page()
	{
		String actualtext= driver.findElement(By.xpath("//strong[text()='Search']")).getText();
		String expectedtext= "Search";
		Assert.assertEquals(actualtext, expectedtext);
	}
	public WebElement Click_community_Hospital()
	{
		return driver.findElement(By.xpath("//h4[text()='Community Hospital']"));
		
	}
	public WebElement Click_Search()
	{
		return  driver.findElement(By.xpath("//span[text()='Search']"));
	}
	public WebElement Click_Location()
	{
		return  driver.findElement(By.xpath("//select[@formcontrolname='hospitalid']"));
	 
	} 
	public WebElement Click_Community_Hospital_in_the_location()
	{
		return  driver.findElement(By.xpath("//option[text()=' Community Hospital']"));
	}
	public WebElement Click_Department()
	{
		return driver.findElement(By.xpath("(//select[@name='departmentid'])[1]"));
	}
	public WebElement Click_Casulaity_in_the_department()
	{
		return driver.findElement(By.xpath("//option[text()='Casuality ']"));
	}


	public void Click_search_in_the_searchpage()
	{
      WebElement search= driver.findElement(By.xpath("//button[text()=' Search']"));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].click();", search);
		
	}
	public void verify_proposed_data_is_displayed_in_the_search_page()
	{
		String actualtext=driver.findElement(By.xpath("(//td[@style='width:15%!important;'])[1]")).getText();
		String expectedtext="Pending";
	 	if(expectedtext.equalsIgnoreCase(expectedtext))
       {
		Assert.assertEquals(actualtext, expectedtext);
	    }
		else
		{
			Assert.assertEquals(actualtext,"Excluded");
		}
	 	
	 	//JavascriptExecutor js = (JavascriptExecutor) driver;
	 	//js.executeScript("window.scrollBy(0,600)", "");
}
public WebElement click_age_filter()
{
	return  driver.findElement(By.xpath("//select[@formcontrolname='age_filter']"));
}
public WebElement Click_infant_in_the_agefilter()
{
	return driver.findElement(By.xpath("//option[@value='infant']"));
}
public void Verify_infant_details_are_displayed()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
 	js.executeScript("window.scrollBy(0,600)", "");
	 String actualtext=driver.findElement(By.xpath("(//td[@style='width:10%!important;'])[3]")).getText();
     String expectedtext = "0";
     Assert.assertEquals(actualtext,expectedtext);
}

public WebElement Click_gender_filter()
{
	return driver.findElement(By.xpath("//select[@formcontrolname='gender_filter']"));
}

public WebElement Click_Female_in_the_Genter_filter()
{
	return  driver.findElement(By.xpath("//option[@value='F']"));
}
public void Verify_Female_data_should_be_displayed()
{
	 String actualtext=driver.findElement(By.xpath("(//td[@style='width:10%!important;'])[4]")).getText();
	 String expectedtext="F";
	 Assert.assertEquals(actualtext,expectedtext);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,600)", "");
}
public void Select_the_date_in_the_From()
{
	driver.findElement(By.xpath("(//input[@class='ngx-datepicker-input ng-untouched ng-pristine ng-valid'])[2]")).click();
	 
	
	while(true)
	{
 String text1=driver.findElement(By.xpath("//span[@class='topbar-title']")).getText();
	if(text1.equalsIgnoreCase("July 2022"))
	{
		driver.findElement(By.xpath("//span[text()=' 20 ']")).click(); 
		break;
	}
	else 
		driver.findElement(By.xpath("(//div[@class='topbar-container']//*[name()='svg'])")).click();
	}
	
}

public void Select_the_date_in_the_to()
{
	driver.findElement(By.xpath("//input[@class='ngx-datepicker-input ng-untouched ng-pristine ng-valid']")).click();
	
	while(true)
	{
   String text=driver.findElement(By.xpath("//span[@class='topbar-title']")).getText();
	if(text.equalsIgnoreCase("July 2022"))
	{
		driver.findElement(By.xpath("//span[text()=' 1 ']")).click(); 
		break;
	}
	else 
		driver.findElement(By.xpath("(//div[@class='topbar-container']//*[name()='svg'])[1]")).click();
	}
}

}

