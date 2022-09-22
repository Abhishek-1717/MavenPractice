package testNGPractice;

import org.testng.annotations.Test;

public class childAnnotation {
	
	
	@Test(priority = 2)
	public void data()
	{
		System.out.println("i am child");
	}

}
