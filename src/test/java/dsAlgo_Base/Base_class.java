package dsAlgo_Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ConfigReader;
import dsAlgo_Utilities.LoggerReader;

public class Base_class {

	protected static WebDriver driver;

	@BeforeTest
	@Parameters({ "browser" })
	public void setupAll(String browser) throws Throwable {
		LoggerReader.info("browser opened");
		ConfigReader.setBrowserType(browser);
		ConfigReader.loadConfig();
		browser = ConfigReader.getBrowserType();
		driverfactory.initdriver(browser);
		LoggerReader.info("browser initialized");
		LoggerReader.info("browser opened get driver");
		driver = driverfactory.getDriver();
		driver.get(ConfigReader.getConfig("homepageurl"));
	}

	@AfterTest
	public static void teardown() throws Throwable {
		if (driver != null) {

			LoggerReader.info("Closing browser after all tests");
			// driverfactory.getDriver().close();
			driverfactory.quitDriver();
		}
	}

}
