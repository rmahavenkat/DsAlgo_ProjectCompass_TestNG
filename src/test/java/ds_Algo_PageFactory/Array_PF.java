package ds_Algo_PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo_DriverFactory.driverfactory;

public class Array_PF {
	WebDriver driver = driverfactory.getDriver();
	 public Array_PF() {
		// this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }

	@FindBy(linkText = "Sign in")
	WebElement signBtn;
	@FindBy(id = "id_username")
	WebElement username;
	@FindBy(id = "id_password")
	WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginBtn;
	@FindBy(xpath = "//a[@href='array' and text()='Get Started']")
	WebElement A_getstartedBtn;
	@FindBy(xpath = "//a[contains(text(),'Data')]")
	WebElement dropdown;
	@FindBy(xpath = "//a[normalize-space()='Arrays']")
	WebElement arrays;
	@FindBy(xpath = "//a[normalize-space()='Arrays in Python']")
	WebElement arrayInpython;
	@FindBy(xpath = "//a[normalize-space()='Arrays Using List']")
	WebElement arrayUsingList;
	@FindBy(xpath = "//a[normalize-space()='Basic Operations in Lists']")
	WebElement basicOperation;
	@FindBy(xpath = "//a[normalize-space()='Applications of Array']")
	WebElement applicationOfArray;
	@FindBy(xpath = "//a[contains(@href, 'try')]")
	WebElement arrayInpythonTryHere;
	@FindBy(xpath = "//*[@id='answer_form']/button")
	WebElement runBtn;
	@FindBy(xpath = "//form[@id=\"answer_form\"]/div/div/div/textarea")
	WebElement textboxInTryEditor; 
	@FindBy(xpath = "//*[@id='answer_form']/input[2]")
	WebElement submitBtn;
	@FindBy(id = "output")
	WebElement validoutputmsg;
	@FindBy(linkText = "Practice Questions")
	WebElement practiceQuesButton;
	@FindBy(xpath = "//*[@id='output']")
	WebElement errorMsg;
	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement arrayUsingListTryHere;
	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement basictryhere;
	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement applicationtryhere;
	@FindBy(xpath = "//a[normalize-space()='Search the array']")
	WebElement searchTheArray;
	@FindBy(xpath = "//a[normalize-space()='Max Consecutive Ones']")
	WebElement Max;
	@FindBy(xpath = "//a[normalize-space()='Find Numbers with Even Number of Digits']")
	WebElement findNum;
	@FindBy(xpath = "//a[contains(text(),'Squares of')]")
	WebElement sortedArray;
	@FindBy(xpath = "//*[@id='output']")
	WebElement successMsg;

	public void clicksigninBtn() {
		signBtn.click();
	}
	public void enterusername(String user) {
		username.sendKeys(user);
	}

	public void enterpassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickloginBtn() {
		loginBtn.click();
	}

	public void clickArrayGetStartBtn() {
		A_getstartedBtn.click();
	}
	public void clickdropdown() {
		dropdown.click();
	}
	public void clickarrays() {
		arrays.click();
	}
	public void clickArrayInpython() {
		arrayInpython.click();
	}
	public void clickArrayUsingList() {
		arrayUsingList.click();
	}
	public void clickBasicOperation() {
		basicOperation.click();
	}
	public void clickAppOfArray() {
		applicationOfArray.click();
	}
	public void clickArrayInpythonTryHere() {
		arrayInpythonTryHere.click();

	}
	public void click_runBtn() {
		runBtn.click();
	}
	public void enterText(String userTextfield) throws InterruptedException {
		textboxInTryEditor.sendKeys(userTextfield);
		} 

	public void seeoutput() {
		System.out.println(validoutputmsg.getText());
	}

	public void clearCodeEditor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.CodeMirror').CodeMirror.setValue('');");
	}
	public void click_submitBtn() {
		submitBtn.click();
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
	public String getoutput() {
		return validoutputmsg.getText();
	}
	public void clickPracticeQues() {
		practiceQuesButton.click();
		}
	public String getErrorMsg() {
		return errorMsg.getText();
	}
	public void clickArrayUsingListTryHere() {
		arrayUsingListTryHere.click();

	}
	public void clickbasictryhere() {
		basictryhere.click();
	}
	public void clickapplicationtryhere() {
		applicationtryhere.click();
	}

	public void enterCodeInEditor(String code) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.CodeMirror').CodeMirror.setValue(arguments[0]);", code);
	}
	public void clickSearchTheArray() {
		searchTheArray.click();
	}
	public void clickMax() {
		Max.click();
	}
	public void clickfindNum() {
		findNum.click();
	}
	public void clicksortedArray() {
		sortedArray.click();
	}
	public String getSuccessMsg() {
		return successMsg.getText();
	}

	public String getValidationMessage(WebElement element) {
		return (String) ((org.openqa.selenium.JavascriptExecutor) driver)
				.executeScript("return arguments[0].validationMessage;", element);
	}
	
}