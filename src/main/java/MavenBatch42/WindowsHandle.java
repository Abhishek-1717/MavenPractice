package MavenBatch42;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String parentwindo=driver.getWindowHandle();  //unique windowId
		System.out.println(parentwindo);
		
		WebElement email=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a"));
		Actions ac=new Actions(driver);
		ac.moveToElement(email).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		WebElement img=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/a"));
		ac.moveToElement(img).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
	
         Set<String> allWind=driver.getWindowHandles();
        System.out.println(allWind);
         
         
//         for (String string : allWind) {
//        	 
//        	 {
//       	        driver.switchTo().window(string);
//        	 }
//			
	//	}
	
        int counter=3;
        
        Object arr1[] = allWind.toArray();
        String i=arr1[counter].toString();
        driver.switchTo().window(i);
        
        //Thread.sleep(3000);
         
        // driver.switchTo().window(parentwindo);
		}

}
