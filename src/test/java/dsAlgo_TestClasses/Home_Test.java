package dsAlgo_TestClasses;

import org.testng.annotations.Test;

import dsAlgo_Base.Base_class;
import ds_Algo_PageFactory.Home_PF;


public class Home_Test extends Base_class {

	@Test(groups = "home")
    public void testHomePageNavigation() throws Throwable {
		Home_PF home = new Home_PF();
        home.clickBtn();
        home.clickdropdown();
        home.captureDropdownoOptions();
        home.clickarray();
        home.warning_msg();
        
	
	}
}