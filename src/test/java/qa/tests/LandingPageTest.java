package qa.tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.LandingPage;
import util.ExtentReportListener;

public class LandingPageTest extends TestBase{

	LandingPage l = new LandingPage();
	ExtentReportListener e = new ExtentReportListener();
	
	@BeforeClass
	public void setUp() throws IOException
	{
		initializeDriver();	
	}
	
	@Test(priority=1)
	public void testTitle() throws IOException
	{
		String title = l.titleGetter();
		if(title.equalsIgnoreCase("Practice Page"))
		{
			e.test.log(LogStatus.PASS, "Title is correct!!" );
			AssertJUnit.assertTrue(true);
		}
		else
		{
			//System.out.println("Title : " + title + " is not correct!!");
			e.test.log(LogStatus.FAIL, "Title is not correct");
			AssertJUnit.assertTrue(false);
		}
	}
	
	@Test(priority=2)
	public void getIndiaSuggestion()
	{
		WebElement s = l.getSugesstionBox();
		l.enterValueInSuggestion("Ind", s);
		l.verifyIfSuggestionsReturned(s);
		e.test.addScreenCapture(System.getProperty("user.dir") + "\\Screenshot");
	
	}
	
}
