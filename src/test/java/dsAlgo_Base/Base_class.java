package dsAlgo_Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ConfigReader;
import dsAlgo_Utilities.LoggerReader;

public class Base_class {

	//protected static WebDriver driver;

	@BeforeTest
	@Parameters({ "browser" })
	public void setupAll(@Optional("chrome")String browser) throws Throwable {
		LoggerReader.info("browser opened");
		ConfigReader.setBrowserType(browser);
		ConfigReader.loadConfig();
		driverfactory.initdriver(browser);
		LoggerReader.info("browser initialized");
		driverfactory.getDriver().get(ConfigReader.getConfig("applicationurl"));
	}

	public static WebDriver driver() {
		return driverfactory.getDriver();
	}
	
	@AfterTest
	public  void teardown() throws Throwable {
		if (driverfactory.getDriver() != null) {
			LoggerReader.info("Closing browser after all tests");
			driverfactory.quitDriver();
		}
	}
}