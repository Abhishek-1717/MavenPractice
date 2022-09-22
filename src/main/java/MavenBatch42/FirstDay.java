package MavenBatch42;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FirstDay {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.navigate().to("https://www.google.com/");
		//driver.manage().window().maximize();
		//String title=driver.getTitle();
		//System.out.println(title);
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		//Thread.sleep(5000);
		driver.get("https://www.w3schools.com/");
		//Thread.sleep(5000);
		//driver.navigate().back();
		//Thread.sleep(4000);
		//driver.navigate().forward();
		//Thread.sleep(3000);
		//driver.close();
		WebElement login=driver.findElement(By.id("w3loginbtn"));
		login.click();
		//Thread.sleep(3000);
		WebElement email=driver.findElement(By.id("modalusername"));
		email.sendKeys("Abhishek");
		WebElement pass=driver.findElement(By.id("current-password"));
		pass.sendKeys("1234");
		WebElement login1=driver.findElement(By.xpath("//span[text()='Log in']"));
		login1.click();
		driver.navigate().back();
	}
}
