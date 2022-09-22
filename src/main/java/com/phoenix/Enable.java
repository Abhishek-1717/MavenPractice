package com.phoenix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Enable {

	public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	 WebElement btn=driver.findElement(By.name("btnK"));
	 boolean ans=btn.isEnabled();
	 System.out.println(ans);
	 
	 WebElement sign=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a"));
	 boolean ans1=sign.isDisplayed();
	 System.out.println(ans1);

	}

}
