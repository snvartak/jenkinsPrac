package qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop; 
	
	public static void loadConfig() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("/var/lib/jenkins/workspace/JenPrac/src/main/java/config/config.properties");
		prop.load(fis);
	}
	
	public static void initializeDriver() throws IOException
	{
		loadConfig();
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//return driver;
	}
	
}
