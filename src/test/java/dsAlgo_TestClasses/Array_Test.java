package dsAlgo_TestClasses;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import dsAlgo_Base.Base_class;
import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ExcelReader;
import dsAlgo_Utilities.LoggerReader;
import ds_Algo_PageFactory.Array_PF;

@Test(groups = "array", dependsOnGroups = "tree", alwaysRun = true)
public class Array_Test extends Base_class {

	Array_PF Array;
	Assertion assertion = new Assertion();

	@BeforeMethod()
	public void setup() {

		Array = new Array_PF();
	}

	@Test(priority = 1)
	public void clickgetstartbtn() {
		Array.clickArrayGetStartBtn();

	}

	@Test(priority = 2)
	public void arrayInPythonpage() {
		Array.clickArrayInpython();

	}

	@Test(priority = 3)
	public void arrayInPemptypage() {
		Array.clickArrayInpythonTryHere();
		Array.click_runBtn();
		Array.alertmessage();
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 4, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void testinvalidcode(String invalid) throws InterruptedException {
		Array.clickArrayInpythonTryHere();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 5, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void testvalidcode(String valid) throws InterruptedException {
		Array.clickArrayInpythonTryHere();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.seeoutput();
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 6)
	public void arrayUsingListpage() {
		Array.clickArrayUsingList();

	}

	@Test(priority = 7)
	public void arrayUsingListemptypage() {
		Array.clickArrayInpythonTryHere();
		Array.click_runBtn();
		Array.alertmessage();
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 8, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalid4ArrayUsingEditor(String invalid) throws InterruptedException {
		Array.clickArrayInpythonTryHere();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		driverfactory.getDriver().navigate().back();

	}

	@Test(priority = 9, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void valid4ArrayUsingEditor(String valid) throws InterruptedException {
		Array.clickArrayInpythonTryHere();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.alertmessage();
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 10)
	public void BasicOperListpage() {
		Array.clickBasicOperation();

	}

	@Test(priority = 11)
	public void BasicOperemptypage() {
		Array.clickArrayInpythonTryHere();
		Array.click_runBtn();
		Array.alertmessage();
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 12, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalid4BasicOperemptypageEditor(String invalid) throws InterruptedException {
		Array.clickArrayInpythonTryHere();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		driverfactory.getDriver().navigate().back();

	}

	@Test(priority = 13, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void valid4BasicOperemptypageEditor(String valid) throws InterruptedException {
		Array.clickArrayInpythonTryHere();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.alertmessage();
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 14)
	public void AppOfArraypage() {
		Array.clickAppOfArray();

	}

	@Test(priority = 15)
	public void AppOfArraypagepage() {
		Array.clickArrayInpythonTryHere();
		Array.click_runBtn();
		Array.alertmessage();
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 16, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalid4AppOfArraypageEditor(String invalid) throws InterruptedException {
		Array.clickArrayInpythonTryHere();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		driverfactory.getDriver().navigate().back();

	}

	@Test(priority = 17, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void valid4AppOfArraypageEditor(String valid) throws InterruptedException {
		Array.clickArrayInpythonTryHere();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.alertmessage();
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 18, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidSearcharray(String invalid) throws InterruptedException {
		Array.clickPracticeQues();
		Array.clickSearchTheArray();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 19, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validSearcharray(String valid) throws InterruptedException {
		Array.clickSearchTheArray();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);

		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 20, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidMax(String invalid) throws InterruptedException {
		Array.clickMax();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);

		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 21, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validMax(String valid) throws InterruptedException {
		Array.clickMax();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);

		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 22, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidFindNum(String invalid) throws InterruptedException {
		Array.clickfindNum();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 23, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validFindNum(String valid) throws InterruptedException {
		Array.clickfindNum();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 24, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidSorted(String invalid) throws InterruptedException {
		Array.clicksortedArray();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 25, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validSorted(String valid) throws InterruptedException {
		Array.clicksortedArray();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 26, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidSearcharray2(String invalid) throws InterruptedException {
		driverfactory.getDriver().navigate().back();
		Array.clickArrayUsingList();
		Array.clickPracticeQues();
		Array.clickSearchTheArray();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 27, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validSearcharray2(String valid) throws InterruptedException {
		Array.clickSearchTheArray();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 28, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidMax2(String invalid) throws InterruptedException {
		Array.clickMax();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 29, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validMax2(String valid) throws InterruptedException {
		Array.clickMax();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 30, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidFindNum2(String invalid) throws InterruptedException {
		Array.clickfindNum();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 31, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validFindNum2(String valid) throws InterruptedException {
		Array.clickfindNum();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 32, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidSorted2(String invalid) throws InterruptedException {
		Array.clicksortedArray();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 33, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validSorted2(String valid) throws InterruptedException {
		Array.clicksortedArray();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 34, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidSearcharray3(String invalid) throws InterruptedException {
		driverfactory.getDriver().navigate().back();
		Array.clickBasicOperation();
		Array.clickPracticeQues();
		Array.clickSearchTheArray();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 35, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validSearcharray3(String valid) throws InterruptedException {
		Array.clickSearchTheArray();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 36, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidMax3(String invalid) throws InterruptedException {
		Array.clickMax();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 37, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validMax3(String valid) throws InterruptedException {
		Array.clickMax();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 38, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidFindNum3(String invalid) throws InterruptedException {
		Array.clickfindNum();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 39, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validFindNum3(String valid) throws InterruptedException {
		Array.clickfindNum();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 40, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidSorted3(String invalid) throws InterruptedException {
		Array.clicksortedArray();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 41, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validSorted3(String valid) throws InterruptedException {
		Array.clicksortedArray();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 42, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidSearcharray4(String invalid) throws InterruptedException {
		driverfactory.getDriver().navigate().back();
		Array.clickAppOfArray();
		Array.clickPracticeQues();
		Array.clickSearchTheArray();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 43, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validSearcharray4(String valid) throws InterruptedException {
		Array.clickSearchTheArray();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 44, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidMax4(String invalid) throws InterruptedException {
		Array.clickMax();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 45, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validMax4(String valid) throws InterruptedException {
		Array.clickMax();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 46, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidFindNum4(String invalid) throws InterruptedException {
		Array.clickfindNum();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 47, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validFindNum4(String valid) throws InterruptedException {
		Array.clickfindNum();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 48, dataProvider = "invalidpythonCode", dataProviderClass = ExcelReader.class)
	public void invalidSorted4(String invalid) throws InterruptedException {
		Array.clicksortedArray();
		Array.clearCodeEditor();
		Array.enterText(invalid);
		Array.click_runBtn();
		Array.alertmessage();
		Array.click_submitBtn();
		String actualMsg = Array.getErrorMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

	@Test(priority = 49, dataProvider = "validpythonCode", dataProviderClass = ExcelReader.class)
	public void validSorted4(String valid) throws InterruptedException {
		Array.clicksortedArray();
		Array.clearCodeEditor();
		Array.enterText(valid);
		Array.click_runBtn();
		Array.seeoutput();
		Array.click_submitBtn();
		String actualMsg = Array.getSuccessMsg();
		String expectedMsg = "Submission successful";
		assertion.assertEquals(actualMsg, expectedMsg);
		driverfactory.getDriver().navigate().back();
	}

}
