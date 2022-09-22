package MavenBatch42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopHandler {

	public static void main(String[] args) throws InterruptedException {
       WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement alert=driver.findElement(By.name("alert"));
		alert.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement confirm=driver.findElement(By.name("confirmation"));
		confirm.click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		WebElement inputxt=driver.findElement(By.xpath("//input[@value='Prompt']"));
		inputxt.click();
		driver.switchTo().alert().sendKeys("Hello");
		//driver.switchTo().alert().getText();
            driver.close();
	}

}
