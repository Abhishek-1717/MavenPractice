package com.phoenix;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksStore {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement username=driver.findElement(By.id("login1"));
		username.sendKeys("abhishek");
		WebElement pass=driver.findElement(By.xpath("//input[@name='passwd']"));
		pass.sendKeys("12345");
		//TakeScreenShot
		TakesScreenshot tc=(TakesScreenshot)driver;
		tc.getScreenshotAs(OutputType.FILE);
		File src=tc.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\javafirstbit\\MavenProject\\rediff.jpg");
		
		FileHandler.copy(src, dest);
		WebElement signin=driver.findElement(By.xpath("//input[@type='submit']"));
		signin.click();
		Thread.sleep(2000);
	
	   List<WebElement>allLinks= driver.findElements(By.xpath("//u"));
	   System.out.println(allLinks);
		
		driver.close();

	}

}
