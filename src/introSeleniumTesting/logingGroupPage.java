package introSeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class logingGroupPage {
	WebDriver driver;
	public logingGroupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID, using = "funy")
	private WebElement sam;
	@FindBy(how = How.CSS, using = ".name")
	private WebElement productItems;
	@FindBy(how = How.XPATH,using = "studentID']")
	private WebElement studentId;
	@FindBy(how = How.NAME, using = "Grant")
	private WebElement FathersName;

	
	public void samuelname(String firstName) {
		sam.sendKeys("firstName");
	}
}
