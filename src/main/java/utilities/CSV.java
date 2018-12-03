package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class CSV {

	public static List<String[]> get(String filename) 
	{
		
		List<String[]> data = new ArrayList<String[]>();
		String testRow;
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			while ((testRow = br.readLine()) != null) 
			{
				String[] line = testRow.split(",");
				data.add(line);
			}
			br.close();
		} 
		
		catch (FileNotFoundException e) 
		{
			System.out.println("ERROR: File not found " + filename);
		} 
		
		catch (IOException e) 
		{
			System.out.println("ERROR: Could not read " + filename);
		}
		
		return data;
		
	}
	
	public static String[] selectRandomRow(String filename) 
	{
		List<String[]> csv = new ArrayList<String[]>();
		csv = get(filename);
		int itemCount = csv.size();
		
		Random rand = new Random();
		int  n = rand.nextInt(itemCount - 1) + 1;
		String[] row = csv.get(n);
		
		return row;
	}
	
	public static String[] selectSpecificRow(String filename, String skuSearch) 
	{
		List<String[]> csv = new ArrayList<String[]>();
		csv = get(filename);
		int itemCount = csv.size();
		String[] ln = null;
		String[] row = ln;
		
		for (int i=1; i<itemCount; i++) 
		{
			ln = csv.get(i);
			if (skuSearch.equalsIgnoreCase(ln[0])) 
			{
				row = ln;
			}
		}
		return row;
	}
}
