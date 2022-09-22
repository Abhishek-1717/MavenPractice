package com.phoenix;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableHandler {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();
        
        WebElement table=driver.findElement(By.id("customers"));    //tablepath
        System.out.println(table);
        
      List<WebElement>rows=driver.findElements(By.xpath("//table[@id='customers']//tr")); //total rows
       for (WebElement webElement : rows) {
		System.out.println(webElement.getText());
	     }
        //System.out.println(rows);
        System.out.println(rows.size());
       
       List<WebElement>col=driver.findElements(By.xpath("//table[@id='customers']//th")); //col path
       //System.out.println(col);
       for (WebElement webElement : col) {
    	   System.out.println(webElement.getText());
		
	       }
       System.out.println(col.size());
       
       List<WebElement>data=driver.findElements(By.xpath("//table[@id='customers']//td"));  //table data
       //System.out.println(data);
       for (WebElement webElement : data) {
    	   System.out.println(webElement.getText());
		
	}
       System.out.println(data.size());
       driver.close();
	}

}
