package mercuryTours.Testcases;

import org.openqa.selenium.WebDriver;

import mercuryTours.common.MercuryTours;
import mercuryTours.pages.HomePage;
import mercuryTours.pages.RegisterPage;

public class RegisterTestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = MercuryTours.launchApp();
		HomePage home = new HomePage(driver);
		home.click_reg_link();
		
		RegisterPage register= new RegisterPage(driver);
		register.fillContactInformation("Niket", "Rani", "1234567892","niketrani@gmail.com");

	}

}
