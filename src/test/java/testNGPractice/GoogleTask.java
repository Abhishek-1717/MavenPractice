package testNGPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTask {

	
	@Test
	public void demo() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement Searchbar=driver.findElement(By.name("q"));
		Searchbar.sendKeys("Selenium");
	    
	    
		List<WebElement> alldata=driver.findElements(By.xpath("//ul[@role='listbox']"));
		
		//System.out.println(alldata);
		Thread.sleep(5000);
		for (WebElement n : alldata) {
			System.out.println(n.getText());
		}
		Thread.sleep(5000);
	     for (WebElement n : alldata) {
	    	 String click=n.getText();
			if(click.equalsIgnoreCase("selenium webdriver"))
			{
				n.click();	
				System.out.println("click");
			}
		}
	
		
		
	}
}
