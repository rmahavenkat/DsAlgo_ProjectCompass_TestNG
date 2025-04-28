package ds_Algo_PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import dsAlgo_DriverFactory.driverfactory;
import dsAlgo_Utilities.ConfigReader;

public class Queue_PF {
	WebDriver driver = driverfactory.getDriver();

	public Queue_PF() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(), 'Data')]")
	WebElement datastdrdown;

	@FindBy(xpath = "//a[contains(@href, 'queue')]")
	WebElement Queuedropdown;

	@FindBy(xpath = "//a[contains(text(), 'Implementation of Queue in Python')]")
	WebElement implementaionofqueue;

	@FindBy(xpath = "//a[contains(text(), 'Implementation using collections.deque')]")
	WebElement implementaionofcollections;

	@FindBy(xpath = "//a[contains(text(), 'Implementation using array')]")
	WebElement implementaionofarray;

	@FindBy(xpath = "//a[contains(text(), 'Queue Operations')]")
	WebElement queueoperations;

	@FindBy(xpath = "//a[contains(text(), 'Practice Questions')]")
	WebElement practice;

	@FindBy(xpath = "//a[contains(@href, 'try')]")
	WebElement tryhere;

	@FindBy(xpath = "//*[@id='answer_form']/div/div/div[1]/textarea")
	WebElement editor;

	@FindBy(xpath = "//button[contains(text(), 'Run')]")
	WebElement runbtn;

	@FindBy(id = "output")
	WebElement validoutputmsg;

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

	public void clickdata() {
		datastdrdown.click();
	}

	public void clickqueue() {
		Queuedropdown.click();
	}

	public void implementationofqueuepage() {
		// Thread.sleep(100);
		implementaionofqueue.click();
	}

	public void implementaionofcollections() {
		implementaionofcollections.click();
	}

	public void implementaionofarray() {
		implementaionofarray.click();
	}

	public void queueoperations() {
		queueoperations.click();
	}

	public void tryeditorpage() {
		tryhere.click();
	}

	public void texteditor(String edit) throws InterruptedException {
		editor.sendKeys(edit);
	}

	public void runbtntest() {
		runbtn.click();
	}

	public void practicequestionspage() {
		practice.click();
	}

	public void application() {
		String url = ConfigReader.getConfig("homepageurl");
		driver.navigate().to(url);
	}

	public void queueLinks(String string) {
		switch (string) {
		case "Implementation of Queue in Python":
			implementationofqueuepage();
			break;
		case "Implementation using collections.deque":
			implementaionofcollections();
			break;
		case "Implementation using array":
			implementaionofarray();
			break;
		case "Queue Operations":
			queueoperations();
			break;
		case "Practice Questions":
			practicequestionspage();
			break;
		}
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public void getoutput() {
		System.out.println(validoutputmsg.getText());
	}
}
