package MavenBatch42;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow 
    {
	
	public static void main(String[] args) throws InterruptedException
{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://in.bookmyshow.com/explore/home/pune");
	WebElement search=driver.findElement(By.xpath("//span[@id=\"4\"]"));
	search.click();
	WebElement movie=driver.findElement(By.xpath("//input[@type='text']"));
	movie.sendKeys("sita");
   
	List<WebElement>suggest=driver.findElements(By.xpath("//ul[@class='sc-cCbXAZ hIUlpm']"));
	Thread.sleep(3000);
	for (WebElement nm : suggest) {
		System.out.println(nm.getText());
		
	}
	suggest.get(1).click();
	
}
}