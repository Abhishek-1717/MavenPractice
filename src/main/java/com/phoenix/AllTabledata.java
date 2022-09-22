package com.phoenix;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllTabledata {

	public static void main(String[] args) {
		//first scrollPage by using jsmethod and getAll tabledata
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();
        
        JavascriptExecutor js=(JavascriptExecutor)driver;     //Scroll
        js.executeScript("window.scrollBy(0,500)");
        
        WebElement table=driver.findElement(By.id("customers"));    //tableXpath
       
       String txt= table.getText();
        System.out.print(txt+ " ");
       

	}

}
