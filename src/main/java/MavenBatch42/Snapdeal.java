package MavenBatch42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.snapdeal.com/");
		System.out.println("URL Lounch");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement Signinlogo = driver.findElement(By.xpath("//div[@class='accountInner']"));
		Signinlogo.click(); 
		System.out.println("signin option");
		
		WebElement RegisterBtn = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		RegisterBtn.click();  
		System.out.println("Register");
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='loginIframe']"));
		driver.switchTo().frame(frame);
		WebElement EnterCell = driver.findElement(By.xpath("/html/body/div/div/div/div[6]/form/div/input"));
		EnterCell.click(); 
		EnterCell.sendKeys("7066");
		System.out.println("Enter Mob no");
    	WebElement conti=driver.findElement(By.xpath("/html/body/div/div/div/div[6]/form/button"));
		conti.click();
		Thread.sleep(4000);
		System.out.println("continue tab");
		

        
		WebElement mail=driver.findElement(By.xpath("//input[@id='j_username_new']"));
		mail.sendKeys("abhisheksaykar997@gmail.com");
		
		System.out.println("enter mail");
		
		Thread.sleep(3000);
		WebElement name=driver.findElement(By.xpath("//input[@id='j_name']"));
		name.click();
		name.sendKeys("Abhishek");
		System.out.println("Enter name");
		Thread.sleep(2000);
		
		WebElement dob=driver.findElement(By.xpath("//input[@id='j_dob']"));
		dob.clear();
		dob.sendKeys("02/07/1999");
		System.out.println("enter dob");
		Thread.sleep(2000);
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='j_password']"));
		pass.sendKeys("123657895");
		System.out.println("Enter Password");
    	WebElement check=driver.findElement(By.xpath("//label[@for='keepLoginSignUp']"));
		check.submit();
		System.out.println("submit");
		
		}

}
