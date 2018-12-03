package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
 
public class ConfigFileReader 
{
	
	private static Properties properties;
	private final String propertyFilePath= "src/main/resources/Files/config.properties";
 

	public static String getDefectScreenshot() 
	{
		String omsProducts = properties.getProperty("defectScreenshotPath");
		return omsProducts;
	}
	

	public static String getEnvironmentURL(String environment) 
	{
		String envURL = properties.getProperty(environment);
		return envURL;
	}
	
	public String getWindowSize(String windowSize) 
	{
		String wSize = properties.getProperty(windowSize);
		return wSize;
	}
	

	public ConfigFileReader()
	{
		BufferedReader reader;
		try 
		{
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try 
			{
				properties.load(reader);
				reader.close();
			} 
			
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		} 
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			throw new RuntimeException("config.properties not found at " + propertyFilePath);
		}		
	}
	
}