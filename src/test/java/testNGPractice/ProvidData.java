package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProvidData {
	
	
	@Test(dataProvider = "data")
	public void w3school(String user,String pass)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("w3loginbtn")).click();
		WebElement username=driver.findElement(By.id("modalusername"));
		username.sendKeys(user);
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(pass);
	}
    @DataProvider(name="data")
    public Object[][] browserdata()
    {
    	Object[][] browser=new Object[3][2];
    	browser[0][0]="Abhishek";
    	browser[0][1]="saykar";
    	browser[1][0]="sonal";
    	browser[1][1]="jadhav";
    	browser[2][0]="dudu";
    	browser[2][1]="bubu";
		return browser;
    	
    }
    
}
