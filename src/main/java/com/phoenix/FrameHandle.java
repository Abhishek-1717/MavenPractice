package com.phoenix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		//driver.switchTo().frame("frame2");
		//WebElement drop=driver.findElement(By.id("animals"));
		//Select sc=new Select(drop);
		//sc.selectByIndex(2);
		
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		WebElement radio=driver.findElement(By.xpath("//input[@id='a']"));
		radio.click();

	}

}
