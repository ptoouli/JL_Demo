package utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.BasePage;
import utilities.ConfigFileReader;
import utilities.DriverFactory;
import utilities.WaitForElement;



public class Hook {

	public static WebDriver driver;
	public static pages.BasePage basepage;
	public static String environment;
	
	@Before("@firefox")
	public void setUpFirefox()
	{
		String browserType = "firefox";
		Boolean runHeadless = false;
		String windowSize = "defaultScreenSize";
		environment = "prodURL";
		
		DriverFactory.open(browserType, runHeadless, windowSize);
		driver = DriverFactory.driver;
		String url = ConfigFileReader.getEnvironmentURL(environment);
		driver.get(url);
		//WaitForElement.xpath("//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[1]", driver);
		BasePage basepage = new BasePage(driver);
	}
	
	@Before("@chrome")
	public void setUpChrome()
	{
		String browserType = "chrome";
		Boolean runHeadless = false;
		String windowSize = "defaultScreenSize";
		environment = "prodURL";
		
		DriverFactory.open(browserType, runHeadless, windowSize);
		driver = DriverFactory.driver;
		String url = ConfigFileReader.getEnvironmentURL(environment);
		driver.get(url);
		//WaitForElement.xpath("//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[1]", driver);
		BasePage basepage = new BasePage(driver);
	}
	
	@Before("@iPad")
	public void setUpiPhone()
	{
		String browserType = "chrome";
		Boolean runHeadless = false;
		String windowSize = "iPadLandscapeScreenSize";
		environment = "prodURL";
		
		DriverFactory.open(browserType, runHeadless, windowSize);
		driver = DriverFactory.driver;
		String url = ConfigFileReader.getEnvironmentURL(environment);
		driver.get(url);
		BasePage basepage = new BasePage(driver);
	}
	
	@Before("@headless")
	public void setUpHeadless()
	{
		String browserType = "chrome";
		Boolean runHeadless = true;
		String windowSize = "defaultScreenSize";
		environment = "prodURL";
		
		DriverFactory.open(browserType, runHeadless, windowSize);
		driver = DriverFactory.driver;
		String url = ConfigFileReader.getEnvironmentURL(environment);
		driver.get(url);
		//WaitForElement.xpath("//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[1]", driver);
		BasePage basepage = new BasePage(driver);
	}
	
	@Before("@edge")
	public void setUpEdge()
	{
		String browserType = "edge";
		Boolean runHeadless = false;
		String windowSize = "defaultScreenSize";
		environment = "prodURL";
		
		DriverFactory.open(browserType, runHeadless, windowSize);
		driver = DriverFactory.driver;
		String url = ConfigFileReader.getEnvironmentURL(environment);
		driver.get(url);
		//WaitForElement.xpath("//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[1]", driver);
		BasePage basepage = new BasePage(driver);
	}
	

	@After
	public void tearDown(Scenario scenario)
	{
		if (scenario.isFailed()) 
		{
	        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	        scenario.embed(screenshot, "image/png");
		}
		driver.quit();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
