package testNGPractice;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertMethod {
	WebDriver driver;
	SoftAssert soft=new SoftAssert();
	@BeforeTest
	public void assertdemo() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
	}
	
	@Test
	public void title()
	{
        String title=driver.getTitle();
        System.out.println(title);
        String expected="OrangeHRM";
        Assert.assertEquals(title, expected);            //assertEquals method
	}
	@Test
	public void credential()
	{
      WebElement username=  driver.findElement(By.name("username"));
      username.sendKeys("Admin");
      
      WebElement pass=driver.findElement(By.name("password"));
      pass.sendKeys("admin123");
	}
	
	@Test
	public void logbtn()
	{
      WebElement logbtn=driver.findElement(By.xpath("//button[text()=' Login ']"));
    Assert.assertTrue(logbtn.isDisplayed());                       //assertTrue method
     // Assert.assertFalse(logbtn.isDisplayed());                 
      logbtn.click();
	}
	
	@Test
	public void errorHandling()
	{
      //When i enter invalid credential errorHandling coverage testing
      WebElement invalid=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"));
     String sms= invalid.getText();                  
     String expected1="Invalid credentials";
     System.out.println(sms);
    // Assert.assertNotEquals(invalid, expected1);           //assertNotEqual method
    // Assert.assertFalse(logbtn.isDisplayed());           //assertFalse method
     soft.assertNotEquals(invalid,expected1 );
	}
	@Test
	public void pmitab()
	{
     WebElement pim=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
      pim.click();
	}
	
	@Test
	public void dropdown()
	{
		WebElement drop=driver.findElement(By.className("oxd-userdropdown-name"));
		drop.click();
	}
      @AfterTest
      public void TearUp()
      {
        driver.close();
	  }
	

}
