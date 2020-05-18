package mercuryTours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import mercuryTours.common.ServiceClass;

public class FlightFinderPage {
	
	WebDriver driver;

	public FlightFinderPage(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}
	
	public void flightDetails(String type,String passengers)
	{
		WebElement  pass = driver.findElement(By.name("passCount")); 
		Select selPass = new Select(pass);
		selPass.selectByValue(passengers);
	}
	
	public void departingFrom(String fromPort,String fromMonth,String fromDay)
	{
		WebElement  dep = driver.findElement(By.name("fromPort")); 
		Select selCity = new Select(dep);
		selCity.selectByValue(fromPort);
		
		WebElement  month  = driver.findElement(By.name("fromMonth")); 
		Select selMonth = new Select(month);
		selMonth.selectByValue(fromMonth);
		
		WebElement  day  = driver.findElement(By.name("fromDay")); 
		Select selDay = new Select(day);
		selDay.selectByValue(fromDay);
	}
	
	public void arrivingin(String toPort,String toMonth,String toDate) throws InterruptedException
	{
		WebElement  dep = driver.findElement(By.name("toPort")); 
		Select selCity = new Select(dep);
		selCity.selectByValue(toPort);
		
		WebElement  month  = driver.findElement(By.name("toMonth")); 
		Select selMonth = new Select(month);
		selMonth.selectByValue(toMonth);
		Thread.sleep(3000);
		WebElement  day  = driver.findElement(By.name("toDay")); 
		Select selDay = new Select(day);
		selDay.selectByValue(toDate);
	}
	
	public void preferences(ServiceClass serviceClass,String airline) throws RadioButtonOptionException
	{
		switch(serviceClass) 
		{
				case EconomyClass:
					driver.findElement(By.xpath("//input[@value='Coach']")).click();
					break;
				case BusinessClass:
					driver.findElement(By.xpath("//input[@value='Business']")).click();
					break;
				case FirstClass:
					driver.findElement(By.xpath("//input[@value='First']")).click();
					break;
				default:
						throw new RadioButtonOptionException();
		}
		WebElement  air  = driver.findElement(By.name("airline")); 
		Select selAir = new Select(air);
		selAir.selectByVisibleText(airline);
		
		
	}
	
	public void clickContinue()
	{
		driver.findElement(By.name("findFlights")).click();
	}

}
