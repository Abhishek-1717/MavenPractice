package MavenBatch42;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.SimpleTimeZone;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.util.concurrent.SimpleTimeLimiter;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy.Simple;

public class ThirdDay {

	private static final String Format = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		//Actions ac=new Actions(driver);
		//ac.contextClick().build().perform();
		//Thread.sleep(2000);
		
		//WebElement email=driver.findElement(By.xpath("(//a[@class='gb_d'])[1]"));
		//ac.contextClick(email).build().perform();
		//ac.moveToElement(email).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		//Thread.sleep(4000);
		//driver.navigate().forward();
		//Thread.sleep(4000);
		//driver.navigate().back();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement product=driver.findElement(By.cssSelector("select[id=\"first\"]"));
		Select sc=new Select(product);
		sc.selectByIndex(2);
		Thread.sleep(2000);
		sc.selectByValue("Yahoo");
		Thread.sleep(2000);
		sc.selectByVisibleText("Google");
		
		TakesScreenshot ts=(TakesScreenshot)driver;  //interface declare
		
		driver.close();
		
//		 TakesScreenshot ts=new ChromeDriver();
	 	SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		Date date=new Date(0);
		String actualDate=format.format(date);	
		 File source=ts.getScreenshotAs(OutputType.FILE); 
		 File des=new File("F:\\javafirstbit\\MavenProject\\src\\main\\java\\MavenBatch42\\"+actualDate+".png"); 
		 FileUtils.copyFile(source, des);
		 	

	}

}
