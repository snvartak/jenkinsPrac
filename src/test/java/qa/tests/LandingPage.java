package qa.tests;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import qa.base.TestBase;

public class LandingPage extends TestBase{

	@Test
	public void testTitle() throws IOException
	{
		initializeDriver();
		System.out.println(driver.getTitle());	
	}
}
