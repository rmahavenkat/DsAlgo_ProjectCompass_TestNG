package ds_Algo_PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ConfigReader;

public class DataStructure_PF {

	WebDriver driver = driverfactory.getDriver();

	public DataStructure_PF() {
		PageFactory.initElements(driver, this);
	}

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
			System.out.println("Bug:user should be able to see an alert messge but showing No alert");
		}
	}

	public void getOutputText() {
		System.out.println(output.getText());
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public void homeurl() {
		String url = ConfigReader.getConfig("homepageurl");
		driver.navigate().to(url);
	}

}
