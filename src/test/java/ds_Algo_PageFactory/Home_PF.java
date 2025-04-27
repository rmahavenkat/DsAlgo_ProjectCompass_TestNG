package ds_Algo_PageFactory;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo_DriverFactory.driverfactory;

public class Home_PF {
	WebDriver driver =  driverfactory.getDriver();
	 public Home_PF() {
		 PageFactory.initElements(driver, this);
	 }

	@FindBy(xpath = "//div[@class='content']/a/button[text()='Get Started']")
	WebElement getstartedBtn;
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
	WebElement dropdownBtn;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a")
	List<WebElement> dropdownoptions;
	@FindBy(xpath = "//a[normalize-space()='Arrays']")
	WebElement array;
	@FindBy(xpath = "//div[@role='alert']")
	WebElement warningMsg;

	
	public void clickBtn() {
		getstartedBtn.click();
	} 
	
	public void clickdropdown() {
		dropdownBtn.click();
	}

	public List<String> captureDropdownoOptions() {
		List<String> options = new ArrayList<>();// creating array for dropdown
		for (WebElement optiontext : dropdownoptions) {// using for each loop for iterating through list
			options.add(optiontext.getText()); // getting the text from dropdown
		}
		return options;
	}

	public void clickarray() {
		array.click();
	}

	public void warning_msg() {
		warningMsg.getText();
	}
}
