package testngPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPara {
	
	WebDriver driver;
	@Test
	@Parameters({"keyword","browser"})
	public void para(@Optional String keyword,String browser  ) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.get("https://www.google.co.in/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		WebElement txt=driver.findElement(By.name("q"));
		txt.sendKeys(keyword);
		Thread.sleep(5000);
		driver.close();
		
	
	}

}
