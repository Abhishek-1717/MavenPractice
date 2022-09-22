package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(testNGPractice.ActiTime2.class)
public class ActiTime {
    
	static WebDriver driver;
	@BeforeTest
	public void browserSet()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void credential()
	{
		WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='pwd']"));
		user.sendKeys("admin");
		pass.sendKeys("manager");
	}
	@Test(priority = 2)
	public void loginbtn()
	{
		WebElement log=driver.findElement(By.xpath("//div[text()='Login ']"));
		log.click();
	}
	@Test(priority = 3)
	public void timetrack()
	{
		WebElement timetab=driver.findElement(By.xpath("//a[text()='View Time-Track']"));
		timetab.click();
	}
	 
	@Test(priority = 4)
	public void pagescroll()
	{
		  JavascriptExecutor js=(JavascriptExecutor)driver;     //Scroll
	        js.executeScript("window.scrollBy(0,500)");
	}
	
	@Test(priority = 5)
	public void timedata()
	{
	
	        
		WebElement alldata=driver.findElement(By.xpath("/html/body/div[13]/div/div[4]/div"));
		String text=alldata.getText();
		System.out.println(text);
	}
}
