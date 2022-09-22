package com.phoenix;

import java.awt.Desktop.Action;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class GooglePage {

	public static void main(String[] args)throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.getWindowHandle();
		System.out.println(driver.getTitle());
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		//here we check multiple windows handling
		WebElement gmail=driver.findElement(By.xpath("//a[@target='_top']"));
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(gmail).keyUp(Keys.CONTROL).build().perform();
		Set<String>allWinId=driver.getWindowHandles();
		System.out.println(allWinId);
		
		for(String a:allWinId)
		{
			
			driver.switchTo().window(a);
		
		}
		Thread.sleep(2000);
		//driver.switchTo().defaultContent();
        driver.close();        
	}

}
