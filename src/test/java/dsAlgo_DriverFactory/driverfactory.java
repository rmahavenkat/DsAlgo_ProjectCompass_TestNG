package dsAlgo_DriverFactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dsAlgo_Utilities.LoggerReader;

import java.time.Duration;

public class driverfactory {

	private static ThreadLocal<WebDriver> ThreadLocalDriver = new ThreadLocal<>();

	// Intialize the webdriver instance based on the browser name
	public static void initdriver(String browser) {
	
		switch (browser.toLowerCase()) {
		case "chrome":
			LoggerReader.info("chrome intialized");
			ThreadLocalDriver.set(new ChromeDriver());
			break;
		case "edge":
			LoggerReader.info("Edge intialized");
			ThreadLocalDriver.set(new EdgeDriver());
			break;
		case "firefox":
			LoggerReader.info("firefox intialized");
			ThreadLocalDriver.set(new FirefoxDriver());
			break;
		default:
			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}

		
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	// Access Drivers in tests
	public static WebDriver getDriver() {
		if (ThreadLocalDriver.get() == null) {
			throw new IllegalStateException("WebDriver is not initialized. Call initdriver() first.");
		}
		return ThreadLocalDriver.get();
	}

	// To Quit the driver
	public static void quitDriver() throws Throwable {
		if (ThreadLocalDriver.get() != null) {
			ThreadLocalDriver.get().quit();
			ThreadLocalDriver.remove();
		}
	}

}