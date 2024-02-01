package introSeleniumTesting;


import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumIntro {
	

	public static void main(String[] args) {

	    
		System.setProperty("Webdriver.Chrome.driver", "C:/Users/Tazoh/eclipse-workspace/MyJavaProject/drivers/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://toolsqa.com/selenium-webdriver/c-sharp/pagefactory-in-c/");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		WebElement radioButtonElement = driver.findElement(By.cssSelector("input[value ='radio1']"));
		radioButtonElement.click();
		WebElement secondButtonSelect = driver.findElement(By.cssSelector("input#autocomplete"));
		secondButtonSelect.sendKeys("Tazoh Nana");
		secondButtonSelect.clear();
		secondButtonSelect.sendKeys("Hohohohohoho iam getting this");
		WebElement dropSelect = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(dropSelect);
		select.selectByValue("option3");
		
		WebElement enterNameField = driver.findElement(By.name("enter-name"));
		enterNameField.sendKeys("Tazoh again");
		
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		try {
			Thread.sleep(3000);
			Alert al = driver.switchTo().alert();
			al.accept();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Page Title: "+ driver.getTitle());
		System.out.println("Page Url: "+ driver.getCurrentUrl());
		
		WebElement h1Heading = driver.findElement(By.tagName("h1"));
		String headingTeString = h1Heading.getText();
		System.out.println(headingTeString);
		//Practice Page
		
		
		//Examples: 
		//Ref: https://www.selenium.dev/documentation/webdriver/waits/
		//Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	    //wait.until(d -> revealed.isDisplayed());
	    
		Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(8));
		//WebDriverWait wait = WebDriverWait(driver,);
		wait.until(ExpectedConditions.visibilityOf(h1Heading));
		
		System.out.println( headingTeString.equals("Practice Page"));
		AnotherClass anotherClass = new AnotherClass(driver);
		anotherClass.selectUserName();
		anotherClass.enterFathersName("This is the heading string to be decided");
		
		
		logingGroupPage logingGroupPage = new logingGroupPage(driver);
		
		logingGroupPage.samuelname("Tazoh");
		
		Trying trying = new Trying();
		trying.whatsMyName("studentes");
		
	
		
		
		driver.quit();

		

	}

	public static void closeDriver() {
		//driver.quit();
	}

	public String ToString(int enterTime, String personName){
		return "Hello we are Balling till "+ enterTime +". Thank you mr. "+personName ;
		
	}

}
