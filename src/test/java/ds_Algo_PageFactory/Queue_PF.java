package ds_Algo_PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.Assertion;


public class Queue_PF extends BasePageFactory {

	@FindBy(xpath = "//a[contains(text(), 'Data')]")
	WebElement datastdrdown;
	@FindBy(xpath = "//a[contains(@href, 'queue')]")
	WebElement Queuedropdown;
	@FindBy(xpath = "//a[contains(text(), 'Implementation of Queue in Python')]")
	WebElement implementaionofqueue;
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
		implementaionofqueue.click();
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
	public void queueLinks(String string) {
		String currenturl = driver.getCurrentUrl();
		String url = "";
		switch (string) {
		case "Implementation of Queue in Python":
			url = "implementation-lists/";
			break;
		case "Implementation using collections.deque":
			url = "implementation-collections/";
			break;
		case "Implementation using array":
			url = "Implementation-array/";
			break;
		case "Queue Operations":
			url = "QueueOp/";
			break;
		case "Practice Questions":
			url = "practice";
			break;
		}
		String Expectedurl = "https://dsportalapp.herokuapp.com/queue/" + url;
		if (url != Expectedurl) {
			driver.navigate().to(Expectedurl);
		}
		currenturl = driver.getCurrentUrl();
		Assertion assertion = new Assertion();
		assertion.assertEquals(currenturl, Expectedurl);
	}

	public void getoutput() {
		System.out.println(validoutputmsg.getText());
	}
}
