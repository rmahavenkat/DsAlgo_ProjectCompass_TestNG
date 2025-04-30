package dsAlgo_TestClasses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import dsAlgo_Base.Base_class;
import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ExcelReader;
import ds_Algo_PageFactory.Queue_PF;

@Test(groups = "queue", dependsOnGroups = "stack", alwaysRun = true)
public class Queue_Test extends Base_class {
	Queue_PF queue;
	Assertion assertion = new Assertion();

	@BeforeMethod
	public void setup() {
		queue = new Queue_PF();
	}

	@Test(priority = 0)
	public void goingtoqueuepage() {
		queue.clickdata();
		queue.clickqueue();
	}

	@Test(priority = 1)
	public void clickimplementationofpython() {
		queue.queueLinks("Implementation of Queue in Python");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("implementationofpythonurl");
		assertion.assertEquals(currenturl, expectedurl);*/
	}

	@Test(priority = 2)
	public void clicktryherelink() {
		queue.tryeditorpage();
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("tryeditorpageurl");
		assertion.assertEquals(currenturl, expectedurl);*/
	}

	@Test(priority = 3)
	public void testwithEmptyTryEditor() {
		queue.runbtntest();
		queue.alertmessage();
		queue.navigateBack();
	}

	@Test(priority = 4, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void queuepage_valid(String pythoncode) throws InterruptedException {

		queue.tryeditorpage();
		queue.texteditor(pythoncode);
		queue.runbtntest();
		queue.getoutput();
		queue.navigateBack();

	}

	@Test(priority = 5, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void queuepage_invalid(String pythoncode) throws InterruptedException {

		queue.tryeditorpage();
		queue.texteditor(pythoncode);
		queue.runbtntest();
		queue.alertmessage();
		queue.navigateBack();

	}

	@Test(priority = 6)
	public void clickPracticequestion() {
		queue.practicequestionspage();
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("queuepracticepageurl");
		assertion.assertEquals(currenturl, expectedurl);*/
		queue.navigateBack();

	}

	@Test(priority = 7)
	public void clickimplementationusingcollectionspage() {

		queue.queueLinks("Implementation using collections.deque");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("implementationofcollectionsurl");
		assertion.assertEquals(currenturl, expectedurl);*/
	}

	@Test(priority = 8)
	public void collectionstryhere() {
		clicktryherelink();
	}

	@Test(priority = 9)
	public void collectionstryeditor() {
		testwithEmptyTryEditor();
	}

	@Test(priority = 10, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void implementationusingcollectionspage_valid(String pythoncode) throws InterruptedException {
		queuepage_valid(pythoncode);

	}

	@Test(priority = 11, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void implementationusingcollectionspage_invalid(String pythoncode) throws InterruptedException {
		queuepage_invalid(pythoncode);
	}

	@Test(priority = 12)
	public void collectionspractice() {
		clickPracticequestion();
	}

	@Test(priority = 13)
	public void clickimplementationofarraypage() {

		queue.queueLinks("Implementation using array");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("implementationofarraysurl");
		assertion.assertEquals(currenturl, expectedurl);*/
	}

	@Test(priority = 14)
	public void arraystryhere() {
		clicktryherelink();
	}

	@Test(priority = 15)
	public void arraystryeditor() {
		testwithEmptyTryEditor();
	}

	@Test(priority = 16, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void implementationofarraypage_valid(String pythoncode) throws InterruptedException {
		queuepage_valid(pythoncode);

	}

	@Test(priority = 17, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void implementationofarraypage_invalid(String pythoncode) throws InterruptedException {
		queuepage_invalid(pythoncode);

	}

	@Test(priority = 18)
	public void implementationofarraypage_practice() {
		clickPracticequestion();

	}

	@Test(priority = 19)
	public void clickQueueOperationspage() {

		queue.queueLinks("Queue Operations");
		/*String currenturl = driverfactory.getDriver().getCurrentUrl();
		String expectedurl = ConfigReader.getConfig("queueopeartionsurl");
		assertion.assertEquals(currenturl, expectedurl);*/
	}

	@Test(priority = 20)
	public void QueueOperationstryhere() {
		clicktryherelink();
	}

	@Test(priority = 21)
	public void QueueOperationstryeditor() {
		testwithEmptyTryEditor();
	}

	@Test(priority = 22, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void QueueOperationspage_valid(String pythoncode) throws InterruptedException {
		queuepage_valid(pythoncode);

	}

	@Test(priority = 23, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void QueueOperationspage_invalid(String pythoncode) throws InterruptedException {
		queuepage_invalid(pythoncode);

	}

	@Test(priority = 24)
	public void QueueOperationspage_practice() {
		clickPracticequestion();
		queue.application();

	}
}
