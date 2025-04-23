package ds_Algo_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ConfigReader;

public class BasePageFactory {
	protected WebDriver driver = driverfactory.getDriver();

	public BasePageFactory() {
		PageFactory.initElements(driver, this);
	}

	public void application() {
		String url = ConfigReader.getConfig("url");
		driver.navigate().to(url);
	}

	public void navToHomePageUrl() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");

	}

	public void dsAlgoPageUrl() {
		String currenturl = driver.getCurrentUrl();
		System.out.println("The user is on the" + currenturl + " Page ");
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public void navigateGraph() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/graph/");
	}
	
    public void arrayInPythonNav() {
    	driver.navigate().to("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
    }
   
	 
	public void arrayInPypageurl() {
		String currenturl = driver.getCurrentUrl();
			System.out.println("The User is in the arrayInPypage page " + currenturl);
		}   


}