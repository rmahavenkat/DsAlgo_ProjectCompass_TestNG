package ds_Algo_PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataStructure_PF extends BasePageFactory {

	@FindBy(xpath = "//*[text()='Data Structures-Introduction']/../a")
	WebElement getstartedbutton;
	@FindBy(linkText = "Time Complexity")
	WebElement timeComplexitybutton;
	@FindBy(partialLinkText = "Try here")
	WebElement tryhereButton;
	@FindBy(linkText = "Practice Questions")
	WebElement practiceQuesButton;
	@FindBy(linkText = "Get Started")
	WebElement getstartedbutton1;// button in this page https://dsportalapp.herokuapp.com/
	@FindBy(xpath = "//form[@id=\"answer_form\"]/div/div/div/textarea")
	WebElement textboxInTryEditor;
	@FindBy(xpath = "//*[text()='Run']")
	WebElement runButton;
	@FindBy(id = "output")
	WebElement output;

	public void clickGetStartedButton() {
		getstartedbutton.click();
	}

	public void clickTimeComplexityButton() {
		timeComplexitybutton.click();
	}

	public void clickTryHereButton() {
		tryhereButton.click();
	}

	public void clickPracticeQues() {
		practiceQuesButton.click();
	}

	public void enterText(String userTextfield) throws InterruptedException {
		textboxInTryEditor.sendKeys(userTextfield);
	}

	public void clickRunButton() {
		runButton.click();
	}

	public void alertmessage() {

		try {
			Alert confirmation = driver.switchTo().alert();
			String alerttext = confirmation.getText();
			System.out.println(alerttext);
			confirmation.accept();
		} catch (NoAlertPresentException e) {
			// No alert
		}
	}

	public void getOutputText() {
		System.out.println(output.getText());
	}

}
