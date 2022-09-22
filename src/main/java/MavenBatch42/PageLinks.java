package MavenBatch42;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class PageLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
     	WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//       //driver.findElements(By.xpath("//a"));
//       List<WebElement>pageLinks=driver.findElements(By.xpath("//a"));
//       
//       for(WebElement a:pageLinks)
//       {
//    	   System.out.println(a.getText());
//    	   System.out.println(a.getAttribute("href"));
//       }
//         driver.close();
	
	   driver.get("https://profile.w3schools.com/");
	   List<WebElement> Alllinks= driver.findElements(By.xpath("//a"));
	   
	   for(WebElement a:Alllinks)
	   {
		   System.out.println(a.getText());
		   System.out.println(a.getAttribute("href"));
	   }
		
		}

}
