package testNGPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Prop {
	
	Properties pro;
	String path="F:\\javafirstbit\\MavenProject\\src\\test\\resources\\Data.properties";
	@Test
	public void test() throws IOException
	{
		FileInputStream ip=new FileInputStream(path);
		pro=new Properties();
		pro.load(ip);
		System.out.println(pro.getProperty("url"));
		System.out.println(pro.getProperty("pass"));
		
	}

}
