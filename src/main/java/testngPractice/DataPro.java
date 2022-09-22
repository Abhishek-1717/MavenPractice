package testngPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPro {
	WebDriver driver;
	
	@Test(dataProvider = "abc")
	public void seach(String place,String city)
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys(place+" "+city);
		WebElement btn=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		btn.click();
		
	}
	
	@DataProvider(name = "abc")
	public Object[][]getData()
	{
		Object[][] searchWord=new Object[2][2];
		searchWord[0][0]="delhi";
		searchWord[0][1]="mumbai";
		searchWord[1][0]="pune";
		searchWord[1][1]="goa";
		
		return searchWord;
	}
	

}
