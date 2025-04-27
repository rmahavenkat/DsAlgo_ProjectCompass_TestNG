package dsAlgo_TestClasses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import dsAlgo_Base.Base_class;
import dsAlgo_Utilities.ExcelReader;
import ds_Algo_PageFactory.LinkedList_PF;

public class Linkedlist_Test extends Base_class {
	LinkedList_PF linkedlist;
	Assertion assertion = new Assertion();

	@BeforeMethod
	public void setUpPage() {
		linkedlist = new LinkedList_PF();
	}

	@Test(priority = 0, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void clickGetStart() {
		linkedlist.clickGetStartedButton();
		/*
		 * String currenturl = driver.getCurrentUrl(); String expectedurl =
		 * ConfigReader.getConfig("linkedlistpageurl");
		 * assertion.assertEquals(currenturl, expectedurl);
		 */
	}

	@Test(priority = 1, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void clickIntro() {
		linkedlist.clickIntroduction();
		/*
		 * String currenturl = driver.getCurrentUrl(); String expectedurl =
		 * ConfigReader.getConfig("intropageurl"); assertion.assertEquals(currenturl,
		 * expectedurl);
		 */
	}

	@Test(priority = 2, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void clicktryhere() {
		linkedlist.clicktryhereButton();
	}

	@Test(priority = 3, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void runEmptyEditor() {
		linkedlist.clickRunButton();
		linkedlist.alertmessage();
		linkedlist.navigateBack();
	}

	@Test(priority = 4, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class, alwaysRun = true)
	public void runInvalidCode(String invalidcode) throws InterruptedException {
		linkedlist.clicktryhereButton();
		linkedlist.enterText(invalidcode);
		linkedlist.clickRunButton();
		linkedlist.alertmessage();
		linkedlist.navigateBack();
	}

	@Test(priority = 5, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class, alwaysRun = true)
	public void runvalidCode(String validcode) throws InterruptedException {
		linkedlist.clicktryhereButton();
		linkedlist.enterText(validcode);
		linkedlist.clickRunButton();
		linkedlist.getOutputText();
		linkedlist.navigateBack();
	}

	@Test(priority = 6, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void practiceques() {
		linkedlist.clickpracticeQuestion();
		linkedlist.navigateBack();
	}

	@Test(priority = 7, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void clickcreatinglinklist() {
		linkedlist.clickcreatingLinkedListButton();
	}

	@Test(priority = 8, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void clicktryhereCreatingll() {
		linkedlist.clicktryhereButton();

	}

	@Test(priority = 9, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void runEmptyEditorCreatingll() {
		linkedlist.clickRunButton();
		linkedlist.alertmessage();
		linkedlist.navigateBack();
	}

	@Test(priority = 10, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class, alwaysRun = true)
	public void runInvalidCodeCreatingll(String invalidcode) throws InterruptedException {
		linkedlist.clicktryhereButton();
		linkedlist.enterText(invalidcode);
		linkedlist.clickRunButton();
		linkedlist.alertmessage();
		linkedlist.navigateBack();
	}

	@Test(priority = 11, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class, alwaysRun = true)
	public void runvalidCodeCreatingll(String validcode) throws InterruptedException {
		linkedlist.clicktryhereButton();
		linkedlist.enterText(validcode);
		linkedlist.clickRunButton();
		linkedlist.getOutputText();
		linkedlist.navigateBack();
	}

	@Test(priority = 12, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void practicequescll() {
		linkedlist.clickpracticeQuestion();
		linkedlist.navigateBack();
	}

	@Test(priority = 13, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void clicktypesoflinkedlist() {
		linkedlist.clickTypesOfLinkedListButton();
	}

	@Test(priority = 14, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void clicktryheretll() {
		linkedlist.clicktryhereButton();
	}

	@Test(priority = 15, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void runEmptyEditortll() {
		linkedlist.clickRunButton();
		linkedlist.alertmessage();
		linkedlist.navigateBack();
	}

	@Test(priority = 16, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class, alwaysRun = true)
	public void runInvalidCodetll(String invalidcode) throws InterruptedException {
		linkedlist.clicktryhereButton();
		linkedlist.enterText(invalidcode);
		linkedlist.clickRunButton();
		linkedlist.alertmessage();
		linkedlist.navigateBack();
	}

	@Test(priority = 17, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class, alwaysRun = true)
	public void runvalidCodetll(String validcode) throws InterruptedException {
		linkedlist.clicktryhereButton();
		linkedlist.enterText(validcode);
		linkedlist.clickRunButton();
		linkedlist.getOutputText();
		linkedlist.navigateBack();
	}

	@Test(priority = 18, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void practicequestll() {
		linkedlist.clickpracticeQuestion();
		linkedlist.navigateBack();
	}

	@Test(priority = 19, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void clickImplementlinkedlist() {
		linkedlist.clickImplementLinkedListInPythonButton();
	}

	@Test(priority = 20, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void clicktryhereIll() {
		linkedlist.clicktryhereButton();

	}

	@Test(priority = 21, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void runEmptyEditorIll() {
		linkedlist.clickRunButton();
		linkedlist.alertmessage();
		linkedlist.navigateBack();
	}

	@Test(priority = 22, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class, alwaysRun = true)
	public void runInvalidCodeIll(String invalidcode) throws InterruptedException {
		linkedlist.clicktryhereButton();
		linkedlist.enterText(invalidcode);
		linkedlist.clickRunButton();
		linkedlist.alertmessage();
		linkedlist.navigateBack();
	}

	@Test(priority = 23, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class, alwaysRun = true)
	public void runvalidCodeIll(String validcode) throws InterruptedException {
		linkedlist.clicktryhereButton();
		linkedlist.enterText(validcode);
		linkedlist.clickRunButton();
		linkedlist.getOutputText();
		linkedlist.navigateBack();
	}

	@Test(priority = 24, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void practicequesIll() {
		linkedlist.clickpracticeQuestion();
		linkedlist.navigateBack();
	}

	@Test(priority = 25, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void clickTraversal() {
		linkedlist.clickTraversalButton();
	}

	@Test(priority = 26, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void clicktryhereTraversal() {
		linkedlist.clicktryhereButton();
	}

	@Test(priority = 27, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void runEmptyEditortraversal() {
		linkedlist.clickRunButton();
		linkedlist.alertmessage();
		linkedlist.navigateBack();
	}

	@Test(priority = 28, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class, alwaysRun = true)
	public void runInvalidCodetraversal(String invalidcode) throws InterruptedException {
		linkedlist.clicktryhereButton();
		linkedlist.enterText(invalidcode);
		linkedlist.clickRunButton();
		linkedlist.alertmessage();
		linkedlist.navigateBack();
	}

	@Test(priority = 29, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class, alwaysRun = true)
	public void runvalidCodetraversal(String validcode) throws InterruptedException {
		linkedlist.clicktryhereButton();
		linkedlist.enterText(validcode);
		linkedlist.clickRunButton();
		linkedlist.getOutputText();
		linkedlist.navigateBack();
	}

	@Test(priority = 30, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void practicequestraversal() {
		linkedlist.clickpracticeQuestion();
		linkedlist.navigateBack();
	}

	@Test(priority = 31, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void clickInsertion() {
		linkedlist.clickInsertionButton();

	}

	@Test(priority = 32, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void clicktryhereInsertion() {
		linkedlist.clicktryhereButton();

	}

	@Test(priority = 33, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void runEmptyEditorInsertion() {
		linkedlist.clickRunButton();
		linkedlist.alertmessage();
		linkedlist.navigateBack();
	}

	@Test(priority = 34, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class, alwaysRun = true)
	public void runInvalidCodeInsertion(String invalidcode) throws InterruptedException {
		linkedlist.clicktryhereButton();
		linkedlist.enterText(invalidcode);
		linkedlist.clickRunButton();
		linkedlist.alertmessage();
		linkedlist.navigateBack();
	}

	@Test(priority = 35, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class, alwaysRun = true)
	public void runvalidCodeInsertion(String validcode) throws InterruptedException {
		linkedlist.clicktryhereButton();
		linkedlist.enterText(validcode);
		linkedlist.clickRunButton();
		linkedlist.getOutputText();
		linkedlist.navigateBack();
	}

	@Test(priority = 36, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void practicequesInsertion() {
		linkedlist.clickpracticeQuestion();
		linkedlist.navigateBack();
	}

	@Test(priority = 37, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void clickDeletion() {
		linkedlist.clickDeletionButton();

	}

	@Test(priority = 38, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void clicktryhereDeletion() {
		linkedlist.clicktryhereButton();

	}

	@Test(priority = 39, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void runEmptyEditorDeletion() {
		linkedlist.clickRunButton();
		linkedlist.alertmessage();
		linkedlist.navigateBack();
	}

	@Test(priority = 40, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class, alwaysRun = true)
	public void runInvalidCodeDeletion(String invalidcode) throws InterruptedException {
		linkedlist.clicktryhereButton();
		linkedlist.enterText(invalidcode);
		linkedlist.clickRunButton();
		linkedlist.alertmessage();
		linkedlist.navigateBack();
	}

	@Test(priority = 41, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class, alwaysRun = true)
	public void runvalidCodeDeletion(String validcode) throws InterruptedException {
		linkedlist.clicktryhereButton();
		linkedlist.enterText(validcode);
		linkedlist.clickRunButton();
		linkedlist.getOutputText();
		linkedlist.navigateBack();

	}

	@Test(priority = 42, groups = "linkedlistGroup", dependsOnGroups = "dsGroup", alwaysRun = true)
	public void practicequesDeletion() {
		linkedlist.clickpracticeQuestion();
		linkedlist.homeurl();

	}

}
