package mercuryTours.Testcases;

import org.openqa.selenium.WebDriver;

import mercuryTours.common.MercuryTours;
import mercuryTours.common.ServiceClass;
import mercuryTours.pages.BookFlight;
import mercuryTours.pages.FlightFinderPage;
import mercuryTours.pages.HomePage;
import mercuryTours.pages.RadioButtonOptionException;
import mercuryTours.pages.SelectFlight;

public class FlightFinderTestCase {

	public static void main(String[] args) throws RadioButtonOptionException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = MercuryTours.launchApp();
		HomePage home = new HomePage(driver);
		home.login("sandykop@gmail.com","India123$");
		//home.login("suhaspattil@outlook.com","India123$");
		
		FlightFinderPage flight = new FlightFinderPage(driver);
		
		//flight.flightDetails(type, passengers);
		
		flight.departingFrom("Paris", "1", "20");
		flight.arrivingin("London", "3", "18");
		flight.preferences(ServiceClass.FirstClass, "Pangea Airlines");
		
		flight.clickContinue();
		
		SelectFlight selFl = new SelectFlight(driver);
		selFl.clickcontinue();
	//	MercuryTours.close(driver);
	//	MercuryTours.quit(driver);
		
		BookFlight bf = new BookFlight(driver);
		
		bf.getPassengers("Suhas", "Patil", "Hindu");
		bf.getCreditDetails("Visa", "1234567890123456", "09", "2010");
		
	}

}
