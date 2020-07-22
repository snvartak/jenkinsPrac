package qa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import qa.base.TestBase;

public class LandingPage extends TestBase{

	WebDriver driver ;
	@Test
	public void testTitle() throws IOException
	{
		driver = initializeDriver();
		System.out.println(driver.getTitle());	
	}
}
