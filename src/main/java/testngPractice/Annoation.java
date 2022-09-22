package testngPractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(testngPractice.ListDemo.class)
public class Annoation extends ListDemo {
	
	static WebDriver driver;	
	@BeforeSuite(alwaysRun =true)
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  //implicit wait
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.manage().window().maximize();
	}
	@Test(description = "get title",invocationCount = 3, priority = 0,groups = "sanity test")
	public void title()
	{
		String actual=driver.getTitle();
		System.out.println(actual);
		String expected="W3Schools Online  Tutorials";    //assert equal method
//		Assert.assertEquals(actual, expected);
		SoftAssert  as=new SoftAssert();
		as.assertEquals(actual, expected ,"case pass");
		
	}
	@Test(description = "click on Home LoginPage Btn",priority = 1,groups = "sanity test")
	public void logbtn() 
	{
		
		WebElement btn=driver.findElement(By.id("w3loginbtn"));
		btn.click();
	}
	@Test(description = "Enter valid id and Pass", priority = 2,dependsOnMethods = "logbtn",groups = "functional test")
	public void enterCredential() 
	{
		
		WebElement email=driver.findElement(By.id("modalusername"));
		WebElement pass=driver.findElement(By.id("current-password"));
		email.sendKeys("abhisheksaykar997@gmail.com");
		pass.sendKeys("Abhi@1234");
	}
	@Test(priority = 3,groups = "functional test")
	public void logInbtn() 
	{
		
		WebElement btn=driver.findElement(By.xpath("//span[string()='Log in']"));
		btn.click();
	}
	@Test(priority = 4,groups = "sanity test")
	public void logout()
	{
		WebElement logout=driver.findElement(By.xpath("//button[@title='Log out']"));
		
		logout.click();
	}
	
	@AfterSuite(alwaysRun =true)
	public void close()
	{
		
		driver.close();
		
		
	}
	

}
