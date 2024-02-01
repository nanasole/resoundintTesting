package introSeleniumTesting;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AnotherClass {
	private WebDriver driver;
	public AnotherClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID, using = "userName")
	private WebElement username;
	@FindBy(how = How.CSS, using = "#item.name")
	private WebElement productItems;
	@FindBy(how = How.XPATH,using = "//input[@id='studentID']")
	private WebElement studentId;
	@FindBy(how = How.NAME, using = "father")
	 private WebElement FathersName;
	
	

	public void selectUserName() {
		username.click();
	}
	public void selectProductItemFromDropdownList() {
		Select select = new Select(productItems);
		List<WebElement> allSelectedItems = select.getAllSelectedOptions();
		for (WebElement selectedItems : allSelectedItems) {
			
			if (selectedItems.isSelected()) {
				System.out.println(selectedItems);
			}
			
		}
		
	}
	public void getStudentsId(String studtId) {
		studentId.sendKeys(studtId);
	}
	
	public logingGroupPage enterFathersName(String name) {
		FathersName.sendKeys(name);
		return new logingGroupPage(driver);
	}

}
