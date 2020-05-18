package mercuryTours.Testcases;

import org.openqa.selenium.WebDriver;

import mercuryTours.common.MercuryTours;
import mercuryTours.pages.HomePage;
import mercuryTours.pages.RegisterPage;

public class RegisterTestCase {

	public static void main(String[] args) {
		WebDriver driver = MercuryTours.launchApp();
		HomePage home = new HomePage(driver);
		home.click_reg_link();
		
		RegisterPage register = new RegisterPage(driver);
		register.fillContactInformation("Suhas","Patil","123567891","suhaspattil@gmail.com");
		register.fillMailingInformation("TCG","Hinjewadi","Pune","Maharashtra","1234567892","INDIA");
		register.fillUserInformation("azsuhas@gmail.com", "India123$", "India123$");
		register.clickSubmit();
	}
}
