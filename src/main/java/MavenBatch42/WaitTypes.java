package MavenBatch42;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTypes {

	private static final Duration Timeout = null;

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));     //Implicitly Wait
		driver.manage().window().maximize();
		
		WebElement loginbtn=driver.findElement(By.xpath("//a[@id='w3loginbtn']"));
		Duration driverDuration;                                                    //Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));            
		wait.until(ExpectedConditions.visibilityOf(loginbtn));
		loginbtn.click();
		
		WebElement log2=driver.findElement(By.xpath("//span[text()='Log in']"));
		log2.click();
//		FluentWait wait2=new FluentWait(log2);                                      //Fluent Wait
//		
//		FluentWait flwait=wait2.ignoring(NoSuchElementException.class);
//		
		
		

	}

}
