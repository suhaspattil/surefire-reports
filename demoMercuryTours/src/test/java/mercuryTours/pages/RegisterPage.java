package mercuryTours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	WebDriver driver;

	public RegisterPage(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}
	
	public void fillContactInformation(String firstName,String lastName,String phone,String userName)
	{
		driver.findElement(By.name("firstName")).sendKeys(firstName);
		driver.findElement(By.name("lastName")).sendKeys(lastName);
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("userName")).sendKeys(userName);
	}
	
	public void fillMailingInformation(String address1,String address2,String city,String state,String postalCode,String country)
	{
		driver.findElement(By.name("address1")).sendKeys(address1);
		driver.findElement(By.name("address2")).sendKeys(address2);		
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("postalCode")).sendKeys(postalCode);
		
		//WebElement select
		WebElement WebElcountry = driver.findElement(By.name("country"));
		Select sel = new Select(WebElcountry);
		sel.selectByVisibleText(country);
	}
	
	public void fillUserInformation(String email,String password,String confirmPassword)
	{
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
	}

	public void clickSubmit()
	{
		driver.findElement(By.name("register")).click();
	}
}
