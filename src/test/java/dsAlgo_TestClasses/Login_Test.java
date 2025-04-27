package dsAlgo_TestClasses;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import dsAlgo_Base.Base_class;
import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ExcelReader;
import dsAlgo_Utilities.LoggerReader;
import ds_Algo_PageFactory.Login_PF;

public class Login_Test extends Base_class {

	Login_PF login;
	Assertion assertion = new Assertion();

	@BeforeMethod
	public void setUpPage() {
		 login = new Login_PF();
	}

	@Test(priority = 0,groups = "login",alwaysRun=true)
	public void clickSignin() {
		login.clickSignin();

	}

	@Test(priority = 1, dataProvider = "passwordEmpty", dataProviderClass = ExcelReader.class,groups = "login",alwaysRun=true)
	public void testpasswordEmptyLogin(String username, String password) {
		login.enterUsername(username);
		LoggerReader.info(username);
		login.enterPassword(password);
		LoggerReader.info(password);
		login.clickLogin();
		String actualMessage = login.getValidationMessage(login.getPasswordField());
		System.out.println(actualMessage);
		String expectedMessage = "Please fill out this field.";
		assertion.assertEquals(actualMessage, expectedMessage);

	}

	@Test(priority = 2, dataProvider = "usernameEmpty", dataProviderClass = ExcelReader.class,groups = "login",alwaysRun=true)
	public void testusernameEmptyLogin(String username, String password) {
		login.enterUsername(username);
		LoggerReader.info(username);
		login.enterPassword(password);
		LoggerReader.info(password);
		login.clickLogin();
		String actualMessage = login.getValidationMessage(login.getUsernameField());
		System.out.println(actualMessage);
		String expectedMessage = "Please fill out this field.";
		assertion.assertEquals(actualMessage, expectedMessage);

	}

	@Test(priority = 3, dataProvider = "invalidLoginData", dataProviderClass = ExcelReader.class,groups = "login",alwaysRun=true)
	public void testinvalidLogin(String username, String password) {
		login.enterUsername(username);
		LoggerReader.info(username);
		login.enterPassword(password);
		LoggerReader.info(password);
		login.clickLogin();
		String actualMessage = login.invalidCredentialsErrorMessage();
		System.out.println(actualMessage);
		String expectedMessage = "Invalid Username and Password";
		assertion.assertEquals(actualMessage, expectedMessage);

	}

	@Test(priority = 4, dataProvider = "validLoginData", dataProviderClass = ExcelReader.class,groups = "login",alwaysRun=true)
	public void testvalidLogin(String username, String password) {
		login.enterUsername(username);
		LoggerReader.info(username);
		login.enterPassword(password);
		LoggerReader.info(password);
		login.clickLogin();
		String messageText = login.loginSuccessMessage();
		Assert.assertEquals(messageText, "You are logged in");

	}

}
