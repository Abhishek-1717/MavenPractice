package MavenBatch42;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandler {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		driver.switchTo().frame("iamframe");         //by name
		WebElement input=driver.findElement(By.xpath("/html/body/input"));
		input.sendKeys("hello");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(frame);                                             //by webelement
	
		WebElement checkbox=driver.findElement(By.cssSelector("input[type=\"checkbox\"]"));
		checkbox.click();
		
//		WebElement frame2=driver.findElement(By.xpath("/html/body/div/div/div/div/div/iframe[2]"));
//		driver.switchTo().frame(frame2);
//		WebElement drop=driver.findElement(By.id("animals"));
//		Select sc=new Select(drop);
//		sc.selectByIndex(3);
//		
		
  

		TakesScreenshot ts=(TakesScreenshot)driver;  //interface declare
		
//		 TakesScreenshot ts=new ChromeDriver();
		
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		Date date=new Date();
		String actualDate=format.format(date);	
		
		 File source=ts.getScreenshotAs(OutputType.FILE);
		 
		 File des=new File("F:\\javafirstbit\\MavenProject\\src\\main\\java\\MavenBatch42\\Screenshots\\"+actualDate+".png");
		 
		 FileUtils.copyFile(source, des);
		
		
		
		
	}

}
