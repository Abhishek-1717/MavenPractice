package com.phoenix;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.xpath("//select[@id='first']"));
		Select sc=new Select(drop);
		sc.selectByIndex(2);
		Thread.sleep(2000);
		//sc.selectByValue();
		//Thread.sleep(2000);
		//sc.selectByVisibleText("Yahoo");
		
		//ScreenShot method
		TakesScreenshot tc=(TakesScreenshot)driver;
		tc.getScreenshotAs(OutputType.FILE);
		
		File src=tc.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("F:\\javafirstbit\\MavenProject\\sona.jpg");
		
	    FileHandler.copy(src, dest);
	    
	    driver.close();
		

	}


}
