package dsAlgo_TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dsAlgo_Base.Base_class;
import dsAlgo_DriverFactory.driverfactory;
import ds_Algo_PageFactory.Home_PF;

public class Home_Test extends Base_class {

	@Test
    public void testHomePageNavigation() throws Throwable {
	
		Home_PF home = new Home_PF();
        home.clickBtn();
        home.clickdropdown();
        home.captureDropdownoOptions();
        home.clickarray();
        home.warning_msg();
        
	
	}
}
