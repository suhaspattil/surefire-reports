package mercuryTours.Testcases;

import org.openqa.selenium.WebDriver;

import com.google.common.math.Quantiles.Scale;

import mercuryTours.common.MercuryTours;
import mercuryTours.pages.BookFlight;
import mercuryTours.pages.FlightFinderPage;
import mercuryTours.pages.HomePage;
import mercuryTours.pages.SelectFlight;

public class BookFlightTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = MercuryTours.launchApp();
		HomePage hp = new HomePage(driver);
		hp.login("suhaspattil@outlook.com", "India123$");
		
		FlightFinderPage ff = new FlightFinderPage(driver);
		ff.clickContinue();
		
		SelectFlight sf = new SelectFlight(driver);
		sf.clickcontinue();
		
		BookFlight bf = new BookFlight(driver);
		bf.ticketLessTravel(true);
		Thread.sleep(5000);
		
		bf.billingAddress("Mumbai");
		
		bf.ticketLessTravel(false);
		

	}

}
