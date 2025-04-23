package ds_Algo_PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.Assertion;

public class LinkedList_PF extends BasePageFactory {

	@FindBy(xpath = "//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[3]/div/div/a[text()='Get Started']")
	WebElement getstartedbutton;
	@FindBy(linkText = "Introduction")
	WebElement introductionButton;
	@FindBy(xpath = "//a[contains(text(), 'Practice Questions')]")
	WebElement practiceQuestionsbutton;
	@FindBy(linkText = "Try here>>>")
	WebElement tryherebutton;
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
		String currenturl = driver.getCurrentUrl();
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
			driver.navigate().to(Expectedurl);
		}
		currenturl = driver.getCurrentUrl();
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);
	}

}
