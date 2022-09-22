package MavenBatch42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JScriptMethods {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicitly wait
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver; //JavaScript Interface
		js.executeScript("history.go(0)"); //    refresh
		WebElement login=driver.findElement(By.id("w3loginbtn"));
		String title=js.executeScript("return document.title;").toString();   //title of page
		System.out.println(title);
		js.executeScript("arguments[0].click()", login);     //click method
		WebElement id=driver.findElement(By.id("modalusername"));
		js.executeScript("arguments[0].value='Abhishek'", id);  //Send keys
		
      	String Domainname=js.executeScript("return document.title;").toString();
		System.out.println(Domainname);
		
		
	}

}
