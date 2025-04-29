package ds_Algo_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo_DriverFactory.driverfactory;

public class Register_PF {

	WebDriver driver = driverfactory.getDriver();

	public Register_PF() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_username")
	WebElement username;
	@FindBy(id = "id_password1")
	WebElement password;
	@FindBy(id = "id_password2")
	WebElement passwordconfirm;
	@FindBy(linkText = "Register")
	WebElement register;
	@FindBy(xpath = "//input[@value='Register']")
	WebElement register1;
	@FindBy(xpath = "//*[@class='alert alert-primary']")
	WebElement Errormessage;
	@FindBy(xpath = "//div[contains(text(), 'Account')]")
	WebElement acccreatedmessage;
	@FindBy(xpath = "//a[contains(text(), 'Sign out')]")
	WebElement signout;
	@FindBy(xpath = "//div[contains(text(), 'Logged ')]")
	WebElement logoutmessage;

	// Going into the Register form
	public void clickRegister() {
		register.click();
	}

	// Clicking Register button after entering all details
	public void register1() {
		register1.click();

	}

	// Sending user name details from config properties
	public String setUserName(String uname) {

		username.sendKeys(uname);
		return uname;

	}

	// Clearing user name details
	public void clearusername() {
		username.clear();

	}

	// Clearing password and password confirmation details
	public void clearpwd() {
		password.clear();

	}

	public void clearpwdconfirm() {

		passwordconfirm.clear();

	}

	// Getting "Please fill out this field" message from
	public void validationmessage() {
		WebElement inputField = driver.findElement(By.cssSelector("input[required]"));
		// Use JavaScript to get the validation message
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String validationMessage = (String) js.executeScript("return arguments[0].validationMessage;", inputField);
		System.out.println("Validation Message: " + validationMessage); // Expected output: "Please fill out this
																		// field."
	}

	public String getValidationMessage(WebElement element) {

		return (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].validationMessage;", element);

	}

	public WebElement getUsernameField() {
		return username;
	}

	// Method to get the error message when textbox left empty
	public WebElement getPasswordField() {
		return password;
	}

	public WebElement getPasswordconfirmField() {
		return passwordconfirm;
	}

	// Sending password details from config properties
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}

	// Sending password confirmation details from config properties
	public void setPasswordConfirm(String pwd) {
		passwordconfirm.sendKeys(pwd);
	}

	// "password mismatch" message from portal
	public String ErrorMessage() {
		return Errormessage.getText();
	}

	// "logged in" message from portal
	public String acccreatedmessage() {
		return acccreatedmessage.getText();
	}

	// signing out from portal
	public void signout() {
		signout.click();
	}

	// log out message in the portal
	public String logoutmessage() {

		return logoutmessage.getText();

	}

}
