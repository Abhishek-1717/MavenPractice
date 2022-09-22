package com.phoenix;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.com/");
	
		driver.manage().window().maximize();
		WebElement demo=driver.findElement(By.xpath("//html/body/header/div/nav/a[1]"));
	    //Perform Rightclick operation
		Actions ac=new Actions(driver);
		//ac.contextClick().build().perform();     //right click on page
		//Thread.sleep(2000);
		//ac.contextClick(demo).build().perform();   //right click on demo option
		Thread.sleep(2000);
		WebElement feature=driver.findElement(By.xpath("//span[string()='Features']"));
		ac.moveToElement(feature).build().perform(); //Move to element 
		
		TakesScreenshot tc=(TakesScreenshot)driver;
		tc.getScreenshotAs(OutputType.FILE);
		File src=tc.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\javafirstbit\\MavenProject\\feature.jpg");
		FileHandler.copy(src, dest);
		
        
	}

}
