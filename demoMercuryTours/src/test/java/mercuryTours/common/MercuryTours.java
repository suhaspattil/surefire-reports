package mercuryTours.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {
	public static WebDriver launchApp()
	{
	System.setProperty("webdriver.chrome.driver","G:\\1_etl_testing_2020\\DW_learning\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(Settings.url);
	driver.manage().window().maximize();
	return driver;
	}
	
	public static void close(WebDriver driver)
	{
		driver.close();
	}
	
	public static void quit(WebDriver driver)
	{
		driver.quit();
	}

}
