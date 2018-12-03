package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
 
public class ConfigFileReader 
{
	
	private static Properties properties;
	private final String propertyFilePath= "src/main/resources/Files/config.properties";
 

	public static String getDefectScreenshot() 
	{
		return properties.getProperty("defectScreenshotPath");
	}
	

	public static String getEnvironmentURL(String environment) 
	{
		return properties.getProperty(environment);
	}
	
	public String getWindowSize(String windowSize) 
	{
		return properties.getProperty(windowSize);
	}
	
	public static String getRandomPostcode() 
	{
		Random random = new Random();
		int pstcd = random.nextInt(39);
		String postcode = "ptcd" + pstcd;
		return properties.getProperty(postcode);
	}
	
	public static String getRandomFirstName() 
	{
		Random random = new Random();
		int fname = random.nextInt(19);
		String firstname = "fname" + fname;
		return properties.getProperty(firstname);
	}
	
	public static String getRandomSurname() 
	{
		Random random = new Random();
		int sname = random.nextInt(19);
		String surname = "sname" + sname;
		return properties.getProperty(surname);
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