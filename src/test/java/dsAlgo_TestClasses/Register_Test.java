package dsAlgo_TestClasses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import dsAlgo_Base.Base_class;
import dsAlgo_Utilities.ExcelReader;
import dsAlgo_Utilities.LoggerReader;
import ds_Algo_PageFactory.Register_PF;

public class Register_Test extends Base_class {

	Register_PF register;
	Assertion assertion = new Assertion();

	@BeforeMethod
	public void setup() {
		register = new Register_PF();
	}

	@Test(priority = 0, groups = "register",dependsOnGroups = "home",alwaysRun=true)
	public void register() {
		register.clickRegister();
		register.register1();
		register.validationmessage();
	}

	@Test(priority = 1, dataProvider = "Emptypassword", dataProviderClass = ExcelReader.class, groups = "register",dependsOnGroups = "home",alwaysRun=true)

	public void testpasswordEmptyRegister(String username, String password, String Password1) {
		register.setUserName(username);
		LoggerReader.info(username);
		register.setPassword(password);
		LoggerReader.info(password);
		register.setPasswordConfirm(Password1);
		LoggerReader.info(Password1);
		register.register1();
		String actualMessage = register.getValidationMessage(register.getPasswordField());
		System.out.println(actualMessage + "message will come in password textbox");
		String expectedMessage = "Please fill out this field.";
		assertion.assertEquals(actualMessage, expectedMessage);

	}

	@Test(priority = 2, dataProvider = "Emptyusername", dataProviderClass = ExcelReader.class, groups = "register",dependsOnGroups = "home",alwaysRun=true)

	public void testonlypasswordRegister(String username, String password, String Password1) {
		register.clearusername();
		register.setUserName(username);
		LoggerReader.info(username);
		register.setPassword(password);
		LoggerReader.info(password);
		register.setPasswordConfirm(Password1);
		LoggerReader.info(Password1);
		register.register1();
		String actualMessage = register.getValidationMessage(register.getUsernameField());
		System.out.println(actualMessage + "message will come in username textbox");
		String expectedMessage = "Please fill out this field.";
		assertion.assertEquals(actualMessage, expectedMessage);

	}

	@Test(priority = 3, dataProvider = "Emptypasswordconfirm", dataProviderClass = ExcelReader.class, groups = "register",dependsOnGroups = "home",alwaysRun=true)

	public void testonlypasswordconfirmRegister(String username, String password, String Password1) {
		register.clearusername();
		register.clearpwd();
		register.setUserName(username);
		LoggerReader.info(username);
		register.setPassword(password);
		LoggerReader.info(password);
		register.setPasswordConfirm(Password1);
		LoggerReader.info(Password1);
		register.register1();
		String actualMessage = register.getValidationMessage(register.getUsernameField());
		System.out.println(actualMessage + "message will come in username textbox");
		String expectedMessage = "Please fill out this field.";
		assertion.assertEquals(actualMessage, expectedMessage);

	}

	@Test(priority = 4, dataProvider = "passwordandpwdconfirm", dataProviderClass = ExcelReader.class, groups = "register",dependsOnGroups = "home",alwaysRun=true)

	public void testonlypasswordandconfirmRegister(String username, String password, String Password1) {
		register.clearusername();
		register.clearpwd();
		register.clearpwdconfirm();
		register.setUserName(username);
		LoggerReader.info(username);
		register.setPassword(password);
		LoggerReader.info(password);
		register.setPasswordConfirm(Password1);
		LoggerReader.info(Password1);
		register.register1();
		String actualMessage = register.getValidationMessage(register.getUsernameField());
		System.out.println(actualMessage + "message will come in username textbox");
		String expectedMessage = "Please fill out this field.";
		assertion.assertEquals(actualMessage, expectedMessage);

	}

	@Test(priority = 5, dataProvider = "invalidpasswordconfirm", dataProviderClass = ExcelReader.class, groups = "register",dependsOnGroups = "home",alwaysRun=true)

	public void testinvalidpasswordconfirmRegister(String username, String password, String Password1) {

		register.clearpwd();
		register.clearpwdconfirm();
		register.setUserName(username);
		LoggerReader.info(username);
		register.setPassword(password);
		LoggerReader.info(password);
		register.setPasswordConfirm(Password1);
		LoggerReader.info(Password1);
		register.register1();
		String ErrorMessage = register.ErrorMessage();
		System.out.println(ErrorMessage);

	}

	@Test(priority = 6, dataProvider = "numericpassword", dataProviderClass = ExcelReader.class,dependsOnGroups = "home",alwaysRun=true)

	public void testnumericpasswordRegister(String username, String password, String Password1) {

		register.setUserName(username);
		LoggerReader.info(username);
		register.setPassword(password);
		LoggerReader.info(password);
		register.setPasswordConfirm(Password1);
		LoggerReader.info(Password1);
		register.register1();
		String actualMessage = register.ErrorMessage();
		System.out.println(actualMessage);
		String expectedMessage = "Invalid Password";
		assertion.assertEquals(actualMessage, expectedMessage);

	}

	@Test(priority = 7, dataProvider = "invalidregisterData", dataProviderClass = ExcelReader.class,dependsOnGroups = "home",alwaysRun=true)

	public void testusernamewithspaceRegister(String username, String password, String Password1) {

		register.setUserName(username);
		LoggerReader.info(username);
		register.setPassword(password);
		LoggerReader.info(password);
		register.setPasswordConfirm(Password1);
		LoggerReader.info(Password1);
		register.register1();
		String actualMessage = register.ErrorMessage();
		System.out.println(actualMessage);
		String expectedMessage = "Invalid username";
		assertion.assertEquals(actualMessage, expectedMessage);

	}

	@Test(priority = 8, dataProvider = "validregisterData", dataProviderClass = ExcelReader.class, groups = "register",dependsOnGroups = "home",alwaysRun=true)

	public void testvalidRegister(String username, String password, String Password1) {

		String name = register.setUserName(username) + "." + System.currentTimeMillis();
		register.setUserName(name);
		LoggerReader.info(username);
		register.setPassword(password);
		LoggerReader.info(password);
		register.setPasswordConfirm(Password1);
		LoggerReader.info(Password1);
		register.register1();
		String actualMessage = register.acccreatedmessage();
		System.out.println(actualMessage);
		register.signout();

	}
	
	

}
