package resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static WebDriver driver;

	public static WebDriver initializeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiran\\Music\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
		
	}
}
