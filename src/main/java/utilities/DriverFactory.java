package utilities;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory 
{
	
	public static WebDriver driver;
	
	public static void open(String browserType, Boolean runHeadless, String windowSize) 
	{
		ConfigFileReader configFileReader = new ConfigFileReader();
		String wSize = configFileReader.getWindowSize(windowSize);

		String basePath = "src/main/resources/drivers/";
		
		browserType = browserType.toLowerCase();
		
		switch (browserType) 
		{
		
			case "firefox":	
				System.setProperty("webdriver.gecko.driver", basePath + "geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get("https://www.google.com");
			/*	FirefoxOptions fOptions = new FirefoxOptions();
				
				if(runHeadless)
	            {
						fOptions.addArguments("--headless");
	            }*/

			break;
				
				
			case "edge":
				System.setProperty("webdriver.edge.driver", basePath + "MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
			break;
				
				
			case "opera":
				System.setProperty("webdriver.opera.driver", basePath + "operadriver.exe");
				driver = new OperaDriver();
			break;
				
				
			case "chrome":
				System.setProperty("webdriver.chrome.driver", basePath + "chromedriver.exe");
				ChromeOptions cOptions = new ChromeOptions();	            
	            if(runHeadless)
	            {
	    			cOptions.addArguments("headless");
	    		}
	
/*	            Map<String, String> mobileEmulation = new HashMap<>();
	            mobileEmulation.put("deviceName", "iPhone X");
	            cOptions.setExperimentalOption("mobileEmulation", mobileEmulation);*/
	            
	            
	            driver = new ChromeDriver(cOptions);
	        break;
	        
	       default:
	            System.out.println("No Driver has been selected");
		}
		
	}

}
