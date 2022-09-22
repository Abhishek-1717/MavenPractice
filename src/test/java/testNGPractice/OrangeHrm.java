package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {
	
	WebDriver driver;
	@BeforeTest(alwaysRun = true)
	public void BrowserSet()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().refresh();
		driver.manage().window().maximize();
	}
	@Test(description = "Enter valid userName",priority =1,groups = "Tab Validation")
	public void userName()
	{
		WebElement id = driver.findElement(By.name("username"));
		id.sendKeys("Admin");
	}
	@Test(description = "Enter valid password",priority = 2,groups = "Tab Validation")
	public void passWord()
	{
		WebElement passWord=driver.findElement(By.xpath("//input[@name='password']"));
		passWord.sendKeys("admin123");
	}
	
	@Test(description = "click on loginbtn",priority = 3,groups = "Sanity Testing")
	public void login()
	{

		WebElement login = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
	}
	@Test(description = "click on myinfo tab",priority = 4,groups = "Sanity Testing")
	public void myinfo()
	{
		WebElement tab=driver.findElement(By.xpath("//span[text()='My Info']"));
		tab.click();
	}
	
//	@Test(description = "get text",priority = 5)
//	public void getInfo() {
//		WebElement title= driver.findElement(By.xpath("//h6[text()='Paul Collings']"));
//		String s=title.getText();
//		System.out.println("heading is "+s);
//	}
	@Test(description = "dropdown",priority = 5)
	public void dropdown()
	{
		WebElement drop=driver.findElement(By.className("@Test(description = \"get text\",priority = 5)"));
		drop.click();
	}
	@AfterTest
	public void TearUp()
	{
		//driver.close();
	}
    
}
