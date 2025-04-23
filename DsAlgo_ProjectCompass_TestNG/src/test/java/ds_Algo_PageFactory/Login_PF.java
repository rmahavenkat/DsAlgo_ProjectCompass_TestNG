package ds_Algo_PageFactory;

import java.util.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_PF extends BasePageFactory {

	@FindBy(linkText = "Sign in")
	WebElement signin;
	@FindBy(id = "id_username")
	WebElement username;
	@FindBy(id = "id_password")
	WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement login;
	@FindBy(xpath = "//*[@class='alert alert-primary']")
	WebElement invalidCredErrormessage;
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement successLoginMessage;
	@FindBy(linkText = "Sign out")
	WebElement logoutButton;
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement successLogoutMesssage;

	// Method to click Signin
	public void clickSignin() {
		signin.click();
	}

	// Method to enter Username
	public void enterUsername(String usernamefield) {
		username.clear();
		username.sendKeys(usernamefield);
	}

	// Method to clear the Username textbox
	public void leaveUsernameBlank() {
		username.clear();
	}

	// Method to clear the Password textbox
	public void leavePasswordBlank() {
		password.clear();
	}

	// Method to enter password
	public void enterPassword(String passwordfield) {
		password.sendKeys(passwordfield);
	}

	// Method to Click Login button
	public void clickLogin() {
		login.click();
	}

	// Method to validate logged in message
	public String getValidationMessage(WebElement element) {

		return (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].validationMessage;", element);


	}

	// Method to get the error message when textbox left empty
	public WebElement getUsernameField() {
		return username;
	}

	// Method to get the error message when textbox left empty
	public WebElement getPasswordField() {
		return password;
	}

	// Method to get the error message when invalid credentials is entered
	public String invalidCredentialsErrorMessage() {
		return invalidCredErrormessage.getText();
	}

	// Method to get the login success message
	public String loginSuccessMessage() {
		return successLoginMessage.getText();
	}

	// Method to get verify logout button after signin
	public boolean isLogoutButtonVisible() {
		try {
			return logoutButton.isDisplayed(); // logoutButton is a WebElement
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// Method to click logout button
	public void clicklogout() {
		logoutButton.click();
	}

	// Method to get the logout message
	public String logoutSuccessMessage() {
		return successLogoutMesssage.getText();
	}

}
