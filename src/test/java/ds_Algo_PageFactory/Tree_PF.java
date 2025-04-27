package ds_Algo_PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import dsAlgo_Base.Base_class;
import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ConfigReader;

public class Tree_PF extends Base_class  {
	WebDriver driver = driverfactory.getDriver();

	public Tree_PF() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[6]/div/div/a[text()='Get Started']")
	WebElement getstartbutton;
	@FindBy(linkText = "Overview of Trees")
	WebElement overviewoftreeButton;
	@FindBy(linkText = "Practice Questions")
	WebElement practicequestions;
	@FindBy(xpath = "//*[@id='output']")
	WebElement output;
	@FindBy(xpath = "//a[text()='Terminologies']")
	WebElement terminologiesbutton;
	@FindBy(xpath = "//a[text()='Types of Trees']")
	WebElement typesoftreebutton;
	@FindBy(xpath = "//a[text()='Tree Traversals']")
	WebElement treetraversalbutton;
	@FindBy(xpath = "//a[text()='Traversals-Illustration']")
	WebElement travelIllustrationbutton;
	@FindBy(xpath = "//a[text()='Binary Trees']")
	WebElement binarytreesbutton;
	@FindBy(xpath = "//a[text()='Types of Binary Trees']")
	WebElement typesofbinarytreebutton;
	@FindBy(xpath = "//a[text()='Implementation in Python']")
	WebElement implementationinpythonbutton;
	@FindBy(xpath = "//a[text()='Binary Tree Traversals']")
	WebElement binarytreetraversalbutton;
	@FindBy(xpath = "//a[text()='Implementation of Binary Trees']")
	WebElement implementationofbinarytreebutton;
	@FindBy(xpath = "//a[text()='Applications of Binary trees']")
	WebElement applicationofbinarytreebutton;
	@FindBy(xpath = "//a[text()='Binary Search Trees']")
	WebElement binarysearchtreebutton;
	@FindBy(xpath = "//a[text()='Implementation Of BST']")
	WebElement implementationofbstbutton;
	WebElement graphlink;
	@FindBy(linkText = "Try here>>>")
	WebElement tryhereButton;
	@FindBy(xpath = "//form[@id=\"answer_form\"]/div/div/div/textarea")
	WebElement textboxInTryEditor;
	@FindBy(xpath = "//*[text()='Run']")
	WebElement runButton;

	public void clickGetStartButton() {
		getstartbutton.click();
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
	public void getOutputText() {
		System.out.println(output.getText());
	}


	public void clickthelink(String string) {
		switch (string) {
		case "Overview Of Tree":
			overviewoftreeButton.click();
			break;
		case "Practice Question":
			practicequestions.click();
			break;
		case "Terminologies":
			terminologiesbutton.click();
			break;
		case "Types Of Tree":
			typesoftreebutton.click();
			break;
		case "Tree Traversals":
			treetraversalbutton.click();
			break;
		case "Traversals-Illustration":
			travelIllustrationbutton.click();
			break;
		case "Binary Trees":
			binarytreesbutton.click();
			break;
		case "Types Of Binary Trees":
			typesofbinarytreebutton.click();
			break;
		case "Implementation in Python":
			implementationinpythonbutton.click();
			break;
		case "Binary Tree Traversals":
			binarytreetraversalbutton.click();
			break;
		case "Implementation Of Binary Trees":
			implementationofbinarytreebutton.click();
			break;
		case "Applications Of Binary Trees":
			applicationofbinarytreebutton.click();
			break;
		case "Binary Search Trees":
			binarysearchtreebutton.click();
			break;
		case "Implementation Of BST":
			implementationofbstbutton.click();
			break;

		default:
			throw new IllegalArgumentException("No such button: " + string);
		}
		
	
	}
	public void homeurl() {
		String url = ConfigReader.getConfig("homepageurl");
		driver.navigate().to(url);
	}

	
	
}
