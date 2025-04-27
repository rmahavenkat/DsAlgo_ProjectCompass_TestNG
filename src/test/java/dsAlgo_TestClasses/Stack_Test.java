package dsAlgo_TestClasses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import dsAlgo_Base.Base_class;
import dsAlgo_Utilities.ExcelReader;
import ds_Algo_PageFactory.Stack_PF;
import dsAlgo_Utilities.ConfigReader;

public class Stack_Test extends Base_class {
	Stack_PF stack;
	Assertion assertion = new Assertion();

	@BeforeMethod
	public void setup() {
		stack = new Stack_PF();
	}

	@Test(priority = 0, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void goingtostackpage() {
		stack.clickdata();
		stack.clickstack();
	}

	@Test(priority = 1, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void operationsinstackpage() {
		stack.operationsinstackpage();
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		String expectedurl = ConfigReader.getConfig("opeartionsinstackurl");
		assertion.assertEquals(currenturl, expectedurl);
	}

	@Test(priority = 2, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void clicktryherelink() {
		stack.tryeditorpage();
		String currenturl = driver.getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("tryeditorpageurl");
		assertion.assertEquals(currenturl, expectedurl);
	}

	@Test(priority = 3, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void testwithEmptyTryEditor() {
		stack.runbtntest();
		stack.alertmessage();
		String expectedurl = ConfigReader.getConfig("opeartionsinstackurl");
		driver.navigate().to(expectedurl);

	}

	@Test(priority = 4, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void operationsinstackpage_valid(String pythoncode) throws InterruptedException {

		stack.tryeditorpage();
		stack.texteditor(pythoncode);
		stack.runbtntest();
		stack.getoutput();
		String expectedurl = ConfigReader.getConfig("opeartionsinstackurl");
		driver.navigate().to(expectedurl);

	}

	@Test(priority = 5, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void operationsinstackpage_invalid(String pythoncode) throws InterruptedException {

		stack.tryeditorpage();
		stack.texteditor(pythoncode);
		stack.runbtntest();
		stack.alertmessage();
		String expectedurl = ConfigReader.getConfig("opeartionsinstackurl");
		driver.navigate().to(expectedurl);

	}

	@Test(priority = 6, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void clickPracticequestion() {
		stack.practicequestionspage();
		String currenturl = driver.getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("practicepageurl");
		assertion.assertEquals(currenturl, expectedurl);
		String url = ConfigReader.getConfig("opeartionsinstackurl");
		driver.navigate().to(url);

	}

	@Test(priority = 7, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void implementationinstackpage() {
		stack.implementationinstackpage();
		String currenturl = driver.getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("implementationinstackpageurl");
		assertion.assertEquals(currenturl, expectedurl);
	}

	@Test(priority = 8, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void testtryhere() {
		clicktryherelink();
	}

	@Test(priority = 9)
	public void testtryeditor() {
		testwithEmptyTryEditor();
	}

	@Test(priority = 10, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void implementationinstackpage_valid(String pythoncode) throws InterruptedException {

		stack.tryeditorpage();
		stack.texteditor(pythoncode);
		stack.runbtntest();
		stack.getoutput();
		String expectedurl = ConfigReader.getConfig("implementationinstackpageurl");
		driver.navigate().to(expectedurl);

	}

	@Test(priority = 11, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void implementationinstackpage_invalid(String pythoncode) throws InterruptedException {

		stack.tryeditorpage();
		stack.texteditor(pythoncode);
		stack.runbtntest();
		stack.alertmessage();
		String expectedurl = ConfigReader.getConfig("implementationinstackpageurl");
		driver.navigate().to(expectedurl);

	}

	@Test(priority = 12, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void testpractice() {
		clickPracticequestion();
	}

	@Test(priority = 13, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void applicationsstackpage() {
		stack.applicationsstackpage();
		String currenturl = driver.getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("applicationsstackpageurl");
		assertion.assertEquals(currenturl, expectedurl);
	}

	@Test(priority = 14, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void tryhere() {
		clicktryherelink();
	}

	@Test(priority = 15, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void tryeditor() {
		testwithEmptyTryEditor();
	}

	@Test(priority = 16, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void applicationsstackpage_valid(String pythoncode) throws InterruptedException {

		stack.tryeditorpage();
		stack.texteditor(pythoncode);
		stack.runbtntest();
		stack.getoutput();
		String url = ConfigReader.getConfig("applicationsstackpageurl");
		driver.navigate().to(url);

	}

	@Test(priority = 17, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void applicationsstackpage_invalid(String pythoncode) throws InterruptedException {

		stack.tryeditorpage();
		stack.texteditor(pythoncode);
		stack.runbtntest();
		stack.alertmessage();
		String url = ConfigReader.getConfig("applicationsstackpageurl");
		driver.navigate().to(url);

	}

	@Test(priority = 18, groups = "stack", dependsOnGroups = "register", alwaysRun = true)
	public void practice() {
		clickPracticequestion();
		stack.application();
	}

}
