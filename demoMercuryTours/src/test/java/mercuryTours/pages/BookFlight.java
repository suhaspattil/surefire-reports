package mercuryTours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookFlight {
	
	WebDriver driver;

	public BookFlight(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void getPassengers(String firstName,String lastName,String mealType) 
	{
		driver.findElement(By.name("passFirst0")).sendKeys(firstName);
		driver.findElement(By.name("passLast0")).sendKeys(lastName);
		
		WebElement meal = driver.findElement(By.name("pass.0.meal")); 
		Select selMeal = new Select(meal);
		selMeal.selectByVisibleText(mealType);
	}
	
	public void getCreditDetails(String cardType,String card16Number,String expmonth,String expYear)
	{
		WebElement creditCard = driver.findElement(By.name("creditCard")); 
		Select selCreditCard = new Select(creditCard);
		selCreditCard.selectByVisibleText(cardType);
		
		driver.findElement(By.name("creditnumber")).sendKeys(card16Number);
		driver.findElement(By.name("creditnumber")).sendKeys(card16Number);
		
		WebElement cc_exp_dt_mn = driver.findElement(By.name("cc_exp_dt_mn")); 
		Select cc_exp_dt_month = new Select(cc_exp_dt_mn);
		cc_exp_dt_month.selectByVisibleText(expmonth);
		
		WebElement cc_exp_dt_yr = driver.findElement(By.name("cc_exp_dt_yr")); 
		Select cc_exp_dt_year = new Select(cc_exp_dt_yr);
		cc_exp_dt_year.selectByVisibleText(expYear);
		
		driver.findElement(By.name("cc_frst_name")).sendKeys("cc_frst_name");
		driver.findElement(By.name("cc_mid_name")).sendKeys("cc_mid_name");
		driver.findElement(By.name("cc_last_name")).sendKeys("cc_last_name");	
	}
	
	public void ticketLessTravel(boolean checked)
	{
		WebElement checkTicket = driver.findElement(By.xpath("//font[contains(text(),'Ticketless')]/preceding-sibling::input"));
		
		if(checked)
		{
			if(!checkTicket.isSelected())
			{
				checkTicket.click();
			}
		}else
		{
			if(checkTicket.isSelected())
			{
				checkTicket.click();
			}
		}
		
	}
	
	public void billingAddress(String address1)
	{
		driver.findElement(By.name("billAddress1")).clear();
		driver.findElement(By.name("billAddress1")).sendKeys(address1);
	}

}
