package MavenBatch42;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondDay {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement email=driver.findElement(By.cssSelector("input[id=\"email\"]"));
		boolean ans=email.isDisplayed();
		System.out.println(ans);
		email.sendKeys("Hello");
		Thread.sleep(2000);
		//email.clear();
		String txt0=email.getText();
		System.out.println(txt0);
		WebElement pass=driver.findElement(By.cssSelector("input[type=\"password\"]"));
		pass.sendKeys("1717");
		boolean ans1=pass.isEnabled();
		System.out.println(ans1);
		WebElement login=driver.findElement(By.cssSelector("button[class=\"_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy\"]"));
		String txt=login.getAttribute("id");
		System.out.println(txt);
		String txt1=login.getCssValue("border-radius");
		System.out.println(txt1);
		login.submit();
		
		// Taking screenshot
		
		TakesScreenshot sc=(TakesScreenshot)driver;
		
		File Source =sc.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\javafirstbit\\MavenProject\\src\\main\\java\\MavenBatch42\\fb.png");
		//File dest=new File("F:\\javafirstbit\\MavenProject\\src\\main\\java\\MavenBatch42\\fb.png");
		FileUtils.copyFile(Source, dest);
		
		driver.close();
		//driver.quit();
		
	}

}
