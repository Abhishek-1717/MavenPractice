package MavenBatch42;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompareText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Implicit wait
		String title=driver.getTitle();
		System.out.println(title);
		
		if(driver.getTitle().equals("Google"))    //compare title
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
		driver.close();

	}

}
