package com.phoenix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://phptravels.com/demo");;
		driver.manage().window().maximize();
	   	Actions ac=new Actions(driver);
		//WebElement flag=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[1]/span/span[2]/span[1]"));
		WebElement feature=driver.findElement(By.xpath("//span[text()='Features']"));
		//ac.moveToElement(flag).build().perform();
		ac.moveToElement(feature).build().perform();
		
		

	}

}
