package com.phoenix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3School {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		//driver.manage().window().maximize();
		driver.findElement(By.id("w3loginbtn")).click();
		driver.findElement(By.id("modalusername")).sendKeys("abhisheksaykar997@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Abhi@1234");
		//driver.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")).click();
           driver.findElement(By.xpath("//span[text()='Log in']")).click();
           driver.get("https://www.w3schools.com/videos/index.php");
           driver.findElement(By.id("navbtn_tutorials")).click();
           driver.findElement(By.xpath("/html/body/nav[1]/div/div/div[3]/a[10]")).click();
          // driver.close();
	}

}
