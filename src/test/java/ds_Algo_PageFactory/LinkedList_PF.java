package ds_Algo_PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.Assertion;

import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ConfigReader;

public class LinkedList_PF {
	

	public LinkedList_PF() {
		PageFactory.initElements(driverfactory.getDriver(), this);
	}

	@FindBy(xpath = "//a[@href='linked-list' and text()='Get Started']")
	WebElement getstartedbutton;
	@FindBy(xpath = "//*[@id='output']")
	WebElement output;
	@FindBy(linkText = "Introduction")
	WebElement introductionButton;
	@FindBy(xpath = "//a[contains(text(), 'Practice Questions')]")
	WebElement practiceQuestionsbutton;
	@FindBy(linkText = "Try here>>>")
	WebElement tryherebutton;
	@FindBy(xpath = "//form[@id=\"answer_form\"]/div/div/div/textarea")
	WebElement textboxInTryEditor;
	@FindBy(xpath = "//*[text()='Run']")
	WebElement runButton;
	@FindBy(linkText = "Creating Linked LIst")
	WebElement creatinglinkedlistButton;
	@FindBy(linkText = "Types of Linked List")
	WebElement typesoflinkedlistButton;
	@FindBy(linkText = "Implement Linked List in Python")
	WebElement ImplementLinkedListinPythonButton;
	@FindBy(linkText = "Traversal")
	WebElement traversalButton;
	@FindBy(linkText = "Insertion")
	WebElement insertionButton;
	@FindBy(linkText = "Deletion")
	WebElement deletionButton;
	

	public void clickGetStartedButton() {
		getstartedbutton.click();
	}

	public void getOutputText() {
		System.out.println(output.getText());
	}
	public void clickRunButton() {
		runButton.click();
	}

	public void enterText(String userTextfield) throws InterruptedException {
		textboxInTryEditor.sendKeys(userTextfield);
	}

	public void alertmessage() {

		try {
			Alert confirmation = driverfactory.getDriver().switchTo().alert();
			String alerttext = confirmation.getText();
			System.out.println(alerttext);
			confirmation.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Bug:user should be able to see an alert messge but showing No alert");
		}
	}

	public void navigateBack() {
		driverfactory.getDriver().navigate().back();
	}

	public void homeurl() {
		String url = ConfigReader.getConfig("homepageurl");
		driverfactory.getDriver().navigate().to(url);
	}

	public void clickIntroduction() {
		introductionButton.click();
	}

	public void clickpracticeQuestion() {
		practiceQuestionsbutton.click();
	}

	public void clicktryhereButton() {
		tryherebutton.click();
	}

	public void clickcreatingLinkedListButton() {
		creatinglinkedlistButton.click();
	}

	public void clickTypesOfLinkedListButton() {
		typesoflinkedlistButton.click();
	}

	public void clickImplementLinkedListInPythonButton() {
		ImplementLinkedListinPythonButton.click();
	}

	public void clickTraversalButton() {
		traversalButton.click();
	}

	public void clickInsertionButton() {
		insertionButton.click();
	}

	public void clickDeletionButton() {
		deletionButton.click();
	}

	public void urlIterate(String string) {
		String currenturl = driverfactory.getDriver().getCurrentUrl();
		System.out.println(currenturl);
		String url = "";
		switch (string) {
		case "Introduction":
			url = "introduction/";
			break;
		case "creating Linked List":
			url = "creating-linked-list/";
			break;
		case "Types of Linked List":
			url = "types-of-linked-list/";
			break;
		case "Implement Linked List in phyton":
			url = "implement-linked-list-in-python/";
			break;
		case "Traversal":
			url = "traversal/";
			break;
		case "Insertion":
			url = "insertion-in-linked-list/";
			break;
		case "Deletion":
			url = "deletion-in-linked-list/";
			break;
		case "Practice Questions":
			url = "practice";
			break;

		}
		System.out.println("before");
		String Expectedurl = "https://dsportalapp.herokuapp.com/linked-list/" + url;

		if (!currenturl.equals(Expectedurl)) {
			driverfactory.getDriver().navigate().to(Expectedurl);
		}
		currenturl = driverfactory.getDriver().getCurrentUrl();
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);
	}

}
