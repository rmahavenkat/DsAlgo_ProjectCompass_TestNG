package dsAlgo_TestClasses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import dsAlgo_Base.Base_class;
import dsAlgo_Utilities.ConfigReader;
import dsAlgo_Utilities.ExcelReader;
import ds_Algo_PageFactory.DataStructure_PF;

public class DataStructure_Test extends Base_class {

	DataStructure_PF datastruct;
	Assertion assertion = new Assertion();

	@BeforeMethod
	public void setUpPage() {
		datastruct = new DataStructure_PF();
	}

	@Test(priority = 0, groups = "dsGroup", dependsOnGroups = "login", alwaysRun = true)
	public void clickGetStart() {
		datastruct.clickGetStartedButton();
		/*String currenturl = driver.getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("datastructpageurl");
		assertion.assertEquals(currenturl, expectedurl);*/

	}

	@Test(priority = 1, groups = "dsGroup", dependsOnGroups = "login", alwaysRun = true)
	public void clickTimeComplexity() {
		datastruct.clickTimeComplexityButton();

	}

	@Test(priority = 2, groups = "dsGroup", dependsOnGroups = "login", alwaysRun = true)
	public void clickTryhere() {
		datastruct.clickTryHereButton();
	}

	@Test(priority = 3, groups = "dsGroup", dependsOnGroups = "login", alwaysRun = true)
	public void runEmptyEditor() {
		datastruct.clickRunButton();
		datastruct.alertmessage();
		datastruct.navigateBack();
	}

	@Test(priority = 4, groups = "dsGroup", dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class, dependsOnGroups = "login", alwaysRun = true)
	public void runInvalidCode(String invalidcode) throws InterruptedException {
		datastruct.clickTryHereButton();
		datastruct.enterText(invalidcode);
		datastruct.clickRunButton();
		datastruct.alertmessage();
		datastruct.navigateBack();
	}

	@Test(priority = 5, groups = "dsGroup", dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class, dependsOnGroups = "login", alwaysRun = true)
	public void runvalidCode(String validcode) throws InterruptedException {
		datastruct.clickTryHereButton();
		datastruct.enterText(validcode);
		datastruct.clickRunButton();
		datastruct.getOutputText();
		datastruct.navigateBack();
	}

	@Test(priority = 6, groups = "dsGroup", dependsOnGroups = "login", alwaysRun = true)
	public void practiceques() {
		datastruct.clickPracticeQues();
		datastruct.homeurl();
	}

}
