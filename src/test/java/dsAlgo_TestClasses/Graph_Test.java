package dsAlgo_TestClasses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import dsAlgo_Base.Base_class;
import dsAlgo_Utilities.ExcelReader;
import ds_Algo_PageFactory.Graph_PF;

public class Graph_Test extends Base_class {
	Graph_PF graph;
	Assertion assertion = new Assertion();

	@BeforeMethod
	public void setUpPage() {
		graph = new Graph_PF();
	}

	@Test(priority = 0, groups = "GraphGroup", dependsOnGroups = "linkedlistGroup", alwaysRun = true)
	public void clickgetstartedbutton() {
		graph.clickGetStartButton();
	}

	@Test(priority = 1, groups = "GraphGroup", dependsOnGroups = "linkedlistGroup", alwaysRun = true)
	public void clickGraphlink() {
		graph.clickgraph();
	}

	@Test(priority = 2, groups = "GraphGroup", dependsOnGroups = "linkedlistGroup", alwaysRun = true)
	public void clicktryhere() {
		graph.clickTryHereButton();
	}

	@Test(priority = 3, groups = "GraphGroup", dependsOnGroups = "linkedlistGroup", alwaysRun = true)
	public void runEmptyEditor() {
		graph.clickRunButton();
		graph.alertmessage();
		graph.navigateBack();
	}

	@Test(priority = 4, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class, groups = "GraphGroup", dependsOnGroups = "linkedlistGroup", alwaysRun = true)
	public void runInvalidCode(String invalidcode) throws InterruptedException {
		graph.clickTryHereButton();
		graph.enterText(invalidcode);
		graph.clickRunButton();
		graph.alertmessage();
		graph.navigateBack();
	}

	@Test(priority = 5, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class, groups = "GraphGroup", dependsOnGroups = "linkedlistGroup", alwaysRun = true)
	public void runvalidCode(String validcode) throws InterruptedException {
		graph.clickTryHereButton();
		graph.enterText(validcode);
		graph.clickRunButton();
		graph.getOutputText();
		graph.navigateBack();
	}

	@Test(priority = 6, groups = "GraphGroup", dependsOnGroups = "linkedlistGroup", alwaysRun = true)
	public void practiceques() {
		graph.clickPracticeQues();
		graph.navigateBack();
	}

	@Test(priority = 7, groups = "GraphGroup", dependsOnGroups = "linkedlistGroup", alwaysRun = true)
	public void clickGraphRepresentationlink() {
		graph.clickGraphRepresentaion();
		clicktryhere();
		runEmptyEditor();

	}

	@Test(priority = 8, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class, groups = "GraphGroup", dependsOnGroups = "linkedlistGroup", alwaysRun = true)
	public void runInvalidCodeGraphRep(String invalidcode) throws InterruptedException {
		graph.clickTryHereButton();
		graph.enterText(invalidcode);
		graph.clickRunButton();
		graph.alertmessage();
		graph.navigateBack();
	}

	@Test(priority = 9, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class, groups = "GraphGroup", dependsOnGroups = "linkedlistGroup", alwaysRun = true)
	public void runvalidCodeGraphRep(String validcode) throws InterruptedException {
		graph.clickTryHereButton();
		graph.enterText(validcode);
		graph.clickRunButton();
		graph.getOutputText();
		graph.navigateBack();

	}

	@Test(priority = 10, groups = "GraphGroup", dependsOnGroups = "linkedlistGroup", alwaysRun = true)
	public void practicequesGraphRep() {
		graph.clickPracticeQues();
		graph.homeurl();
	}

}
