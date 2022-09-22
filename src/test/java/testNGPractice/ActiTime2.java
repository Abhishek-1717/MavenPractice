package testNGPractice;


import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
public class ActiTime2 implements ITestListener{



	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("********Test Case Success*********");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot tc=(TakesScreenshot)ActiTime.driver;
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		Date date=new Date(0);
		String actualDate=format.format(date);	
		 File source=tc.getScreenshotAs(OutputType.FILE); 
		 File des=new File("F:\\javafirstbit\\MavenProject\\src\\test\\java\\testNGPractice\\demo\\"+actualDate+".png");
		 
		 try {
			FileUtils.copyFile(source, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 	
	}

	@Override
	public void onStart(ITestContext context) {
		
	}
	
	

}
