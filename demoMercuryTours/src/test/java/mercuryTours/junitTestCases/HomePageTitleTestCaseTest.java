package mercuryTours.junitTestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import mercuryTours.common.MercuryTours;

class HomePageTitleTestCase {
	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		MercuryTours.quit(driver);
	}

	@BeforeEach
	void setUp() throws Exception {
		driver = MercuryTours.launchApp();
	}

	@AfterEach
	void tearDown() throws Exception {
		MercuryTours.close(driver);
	}

	

	@Test
	void try_18() {
		assertEquals("Welcome: Mercury 18 Tours_wrong", driver.getTitle());
	}

	@Test
	void try_20() {
		assertEquals("Welcome: Mercury 20 Tours_wrong", driver.getTitle());
	}

}
