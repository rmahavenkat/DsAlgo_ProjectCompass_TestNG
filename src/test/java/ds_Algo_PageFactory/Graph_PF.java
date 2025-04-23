package ds_Algo_PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Graph_PF extends BasePageFactory {
	@FindBy(xpath = "//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[7]/div/div/a[text()='Get Started']")
	WebElement getStartButton;
	@FindBy(xpath = "//div/ul/a[text()='Graph']")
	WebElement graphlink;
	@FindBy(linkText = "Try here>>>")
	WebElement tryhereButton;
	@FindBy(linkText = "Practice Questions")
	WebElement practiceQuesButton;
	@FindBy(xpath = "//*[text()='Run']")
	WebElement runButton;
	@FindBy(xpath = "//div/ul/a[text()='Graph Representations']")
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

	public void clickRunButton() {
		runButton.click();
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

}
