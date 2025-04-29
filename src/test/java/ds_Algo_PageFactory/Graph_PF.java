package ds_Algo_PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ConfigReader;

public class Graph_PF {
	WebDriver driver = driverfactory.getDriver();

	public Graph_PF() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[7]/div/div/a[text()='Get Started']")
	WebElement getStartButton;
	@FindBy(xpath = "//div/ul/a[text()='Graph']")
	WebElement graphlink;
	@FindBy(linkText = "Try here>>>")
	WebElement tryhereButton;
	@FindBy(xpath = "//form[@id=\"answer_form\"]/div/div/div/textarea")
	WebElement textboxInTryEditor;
	@FindBy(linkText = "Practice Questions")
	WebElement practiceQuesButton;
	@FindBy(xpath = "//*[text()='Run']")
	WebElement runButton;
	@FindBy(xpath = "//div/li/a[text()='Graph Representations']")
	WebElement graphRepresentationlink;
	@FindBy(xpath = "//*[@id='output']")
	WebElement output;

	public void clickGetStartButton() {
		getStartButton.click();
	}

	public void clickgraph() {
		graphlink.click();
	}

	public void clickTryHereButton() {
		tryhereButton.click();
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
	public void navigateBack() {
		driver.navigate().back();
	}


	public void clickPracticeQues() {
		practiceQuesButton.click();
	}

	public void clickGraphRepresentaion() {
		graphRepresentationlink.click();
	}

	public void getOutputText() {
		System.out.println(output.getText());
	}
	public void homeurl() {
		String url = ConfigReader.getConfig("homepageurl");
		driver.navigate().to(url);
	}

}
