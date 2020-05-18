package mercuryTours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectFlight {

	
	WebDriver driver;

	public SelectFlight(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
public void clickcontinue()
{
	driver.findElement(By.name("reserveFlights")).click();
}
	

}
