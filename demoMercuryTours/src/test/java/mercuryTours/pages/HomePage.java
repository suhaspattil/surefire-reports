package mercuryTours.pages;
//sandykop@gmail.com India123$
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
			WebDriver driver;
	
		public HomePage(WebDriver driver) 
		{		
				super();
				this.driver = driver;
		}
		
		public void click_reg_link()  
		{
			driver.findElement(By.linkText("REGISTER")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		public void login(String userName,String password)
		{
			driver.findElement(By.name("userName")).sendKeys(userName);
			driver.findElement(By.name("password")).sendKeys(password);
			
			driver.findElement(By.name("login")).click();
		}
		
		
		
		

		
}
