package dsAlgo_TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import dsAlgo_Base.Base_class;
import dsAlgo_Utilities.ConfigReader;
import dsAlgo_Utilities.ExcelReader;
import ds_Algo_PageFactory.Tree_PF;

@Test(groups = "tree", dependsOnGroups = "linkedlistGroup", alwaysRun = true)
public class Tree_Test extends Base_class {

	Tree_PF tree;
	Assertion assertion = new Assertion();

	@BeforeMethod
	public void setUpPage() {
		tree = new Tree_PF();
	}

	@Test(priority = 0)
	public void clickgetstartedbutton() {
		tree.clickGetStartButton();
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("treepageurl");
		assertion.assertEquals(currenturl, expectedurl);*/

	}

	@Test(priority = 1)
	public void clickOverviewOfTree() {
		tree.clickthelink("Overview Of Tree");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("overviewpageurl");
		assertion.assertEquals(currenturl, expectedurl);*/

	}

	@Test(priority = 2)
	public void clicktryhere() {
		tree.clickTryHereButton();
	}

	@Test(priority = 3)
	public void runEmptyEditor() {
		tree.clickRunButton();
		tree.alertmessage();
		tree.navigateBack();
	}

	@Test(priority = 4, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void runInvalidCode(String invalidcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(invalidcode);
		tree.clickRunButton();
		tree.alertmessage();
		tree.navigateBack();
	}

	@Test(priority = 5, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void runvalidCode(String validcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(validcode);
		tree.clickRunButton();
		tree.getOutputText();
		tree.navigateBack();
	}

	@Test(priority = 6)
	public void practiceques() {
		tree.clickthelink("Practice Question");
		tree.navigateBack();
	}

	@Test(priority = 7)
	public void clickTerminologies() {
		tree.clickthelink("Terminologies");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("terminologies");
		assertion.assertEquals(currenturl, expectedurl);*/
		clicktryhere();
		runEmptyEditor();

	}

	@Test(priority = 8, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void runInvalidCodeter(String invalidcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(invalidcode);
		tree.clickRunButton();
		tree.alertmessage();
		tree.navigateBack();
	}

	@Test(priority = 9, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void runvalidCodeter(String validcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(validcode);
		tree.clickRunButton();
		tree.getOutputText();
		tree.navigateBack();
	}

	@Test(priority = 10)
	public void practicequester() {
		tree.clickthelink("Practice Question");
		tree.navigateBack();
	}

	@Test(priority = 11)
	public void clickTypesofTree() {
		tree.clickthelink("Types Of Tree");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("typesoftree");
		assertion.assertEquals(currenturl, expectedurl);*/
		clicktryhere();
		runEmptyEditor();

	}

	@Test(priority = 12, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void runInvalidCodeTypesOfTree(String invalidcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(invalidcode);
		tree.clickRunButton();
		tree.alertmessage();
		tree.navigateBack();
	}

	@Test(priority = 13, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void runvalidCodeterTypesOfTree(String validcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(validcode);
		tree.clickRunButton();
		tree.getOutputText();
		tree.navigateBack();

	}

	@Test(priority = 14)
	public void practicequesTypesoftree() {
		tree.clickthelink("Practice Question");
		tree.navigateBack();
	}

	@Test(priority = 15)
	public void clickTreeTraversal() {
		tree.clickthelink("Tree Traversals");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("treeTraversal");
		assertion.assertEquals(currenturl, expectedurl);*/
		clicktryhere();
		runEmptyEditor();

	}

	@Test(priority = 16, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void runInvalidCodeTreetraversal(String invalidcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(invalidcode);
		tree.clickRunButton();
		tree.alertmessage();
		tree.navigateBack();
	}

	@Test(priority = 17, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void runvalidCodeterTreetraversal(String validcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(validcode);
		tree.clickRunButton();
		tree.getOutputText();
		tree.navigateBack();

	}

	@Test(priority = 18)
	public void practicequesTreeTraversal() {
		tree.clickthelink("Practice Question");
		tree.navigateBack();
	}

	@Test(priority = 19)
	public void clickTraversalIllustration() {
		tree.clickthelink("Traversals-Illustration");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("traversal-Illustration");
		assertion.assertEquals(currenturl, expectedurl);*/
		clicktryhere();
		runEmptyEditor();

	}

	@Test(priority = 20, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void runInvalidCodeTraversalsIllustration(String invalidcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(invalidcode);
		tree.clickRunButton();
		tree.alertmessage();
		tree.navigateBack();
	}

	@Test(priority = 21, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void runvalidCodeTraversalsIllustration(String validcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(validcode);
		tree.clickRunButton();
		tree.getOutputText();
		tree.navigateBack();

	}

	@Test(priority = 22)
	public void practicequesTraversalsIllustration() {
		tree.clickthelink("Practice Question");
		tree.navigateBack();
	}

	@Test(priority = 23)
	public void clickBinaryTrees() {
		tree.clickthelink("Binary Trees");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("binarytrees");
		assertion.assertEquals(currenturl, expectedurl);*/
		clicktryhere();
		runEmptyEditor();

	}

	@Test(priority = 24, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void runInvalidCodeBinaryTrees(String invalidcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(invalidcode);
		tree.clickRunButton();
		tree.alertmessage();
		tree.navigateBack();
	}

	@Test(priority = 25, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void runvalidCodeBinaryTrees(String validcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(validcode);
		tree.clickRunButton();
		tree.getOutputText();
		tree.navigateBack();

	}

	@Test(priority = 26)
	public void practicequesBinaryTrees() {
		tree.clickthelink("Practice Question");
		tree.navigateBack();
	}

	@Test(priority = 27)
	public void clickTypesOfBinaryTrees() {
		tree.clickthelink("Types Of Binary Trees");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("typesofbinarytree");
		assertion.assertEquals(currenturl, expectedurl);*/
		clicktryhere();
		runEmptyEditor();

	}

	@Test(priority = 28, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void runInvalidCodeTypesOfBinaryTrees(String invalidcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(invalidcode);
		tree.clickRunButton();
		tree.alertmessage();
		tree.navigateBack();
	}

	@Test(priority = 29, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void runvalidCodeTypesOfBinaryTrees(String validcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(validcode);
		tree.clickRunButton();
		tree.getOutputText();
		tree.navigateBack();

	}

	@Test(priority = 30)
	public void practicequesTypesOfBinaryTrees() {
		tree.clickthelink("Practice Question");
		tree.navigateBack();
	}

	@Test(priority = 31)
	public void clickImplementationinpython() {
		tree.clickthelink("Implementation in Python");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("implementationinpython");
		assertion.assertEquals(currenturl, expectedurl);*/
		clicktryhere();
		runEmptyEditor();

	}

	@Test(priority = 32, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void runInvalidCodeImplementationinpython(String invalidcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(invalidcode);
		tree.clickRunButton();
		tree.alertmessage();
		tree.navigateBack();
	}

	@Test(priority = 33, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void runvalidCodeImplementationinpython(String validcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(validcode);
		tree.clickRunButton();
		tree.getOutputText();
		tree.navigateBack();

	}

	@Test(priority = 30)
	public void practicequesImplementationinpython() {
		tree.clickthelink("Practice Question");
		tree.navigateBack();
	}

	@Test(priority = 31)
	public void clickBinaryTreeTraversal() {
		tree.clickthelink("Binary Tree Traversals");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("binarytreetraversal");
		assertion.assertEquals(currenturl, expectedurl);*/
		clicktryhere();
		runEmptyEditor();

	}

	@Test(priority = 32, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void runInvalidCodeBinaryTreeTraversal(String invalidcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(invalidcode);
		tree.clickRunButton();
		tree.alertmessage();
		tree.navigateBack();
	}

	@Test(priority = 33, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void runvalidCodeBinaryTreeTraversal(String validcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(validcode);
		tree.clickRunButton();
		tree.getOutputText();
		tree.navigateBack();

	}

	@Test(priority = 34)
	public void practicequesBinaryTreeTraversal() {
		tree.clickthelink("Practice Question");
		tree.navigateBack();
	}

	@Test(priority = 35)
	public void clickImplementationOfBinaryTrees() {
		tree.clickthelink("Implementation Of Binary Trees");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("implementationofbinarytree");
		assertion.assertEquals(currenturl, expectedurl);*/
		clicktryhere();
		runEmptyEditor();

	}

	@Test(priority = 36, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void runInvalidCodeImplementationOfBinaryTrees(String invalidcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(invalidcode);
		tree.clickRunButton();
		tree.alertmessage();
		tree.navigateBack();
	}

	@Test(priority = 37, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void runvalidCodeImplementationOfBinaryTrees(String validcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(validcode);
		tree.clickRunButton();
		tree.getOutputText();
		tree.navigateBack();

	}

	@Test(priority = 38)
	public void practicequesImplementationOfBinaryTrees() {
		tree.clickthelink("Practice Question");
		tree.navigateBack();
	}

	@Test(priority = 39)
	public void clickApplicationOfBinaryTrees() {
		tree.clickthelink("Applications Of Binary Trees");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("applicationofbinarytree");
		assertion.assertEquals(currenturl, expectedurl);*/
		clicktryhere();
		runEmptyEditor();

	}

	@Test(priority = 40, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void runInvalidCodeApplicationOfBinaryTrees(String invalidcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(invalidcode);
		tree.clickRunButton();
		tree.alertmessage();
		tree.navigateBack();
	}

	@Test(priority = 41, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void runvalidCodeApplicationOfBinaryTrees(String validcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(validcode);
		tree.clickRunButton();
		tree.getOutputText();
		tree.navigateBack();

	}

	@Test(priority = 42)
	public void practicequesApplicationOfBinaryTrees() {
		tree.clickthelink("Practice Question");
		tree.navigateBack();
	}

	@Test(priority = 43)
	public void clickBinarySearchTrees() {
		tree.clickthelink("Binary Search Trees");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("binarysearchtree");
		assertion.assertEquals(currenturl, expectedurl);*/
		clicktryhere();
		runEmptyEditor();

	}

	@Test(priority = 44, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void runInvalidCodeBinarySearchTrees(String invalidcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(invalidcode);
		tree.clickRunButton();
		tree.alertmessage();
		tree.navigateBack();
	}

	@Test(priority = 45, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void runvalidCodeBinarySearchTrees(String validcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(validcode);
		tree.clickRunButton();
		tree.getOutputText();
		tree.navigateBack();

	}

	@Test(priority = 46)
	public void practicequesBinarySearchTrees() {
		tree.clickthelink("Practice Question");
		tree.navigateBack();
	}

	@Test(priority = 47)
	public void clickImplementationOfBST() {
		tree.clickthelink("Implementation Of BST");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("implementationofBST");
		assertion.assertEquals(currenturl, expectedurl);*/
		clicktryhere();
		runEmptyEditor();

	}

	@Test(priority = 48, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void runInvalidCodeImplementationOfBST(String invalidcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(invalidcode);
		tree.clickRunButton();
		tree.alertmessage();
		tree.navigateBack();
	}

	@Test(priority = 49, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void runvalidCodeImplementationOfBST(String validcode) throws InterruptedException {
		tree.clickTryHereButton();
		tree.enterText(validcode);
		tree.clickRunButton();
		tree.getOutputText();
		tree.navigateBack();

	}

	@Test(priority = 50)
	public void practicequesImplementationOfBST() {
		tree.clickthelink("Practice Question");
		tree.homeurl();
	}

}
