import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
//https://stackoverflow.com/questions/17991470/how-to-read-until-end-of-file-eof-using-bufferedreader-in-java
//https://stackoverflow.com/questions/22741638/properly-reading-files-with-filereader-and-bufferedreader-in-java
public class Reader {
static BufferedReader buffer;
static FileReader fr;

public static void main(String[] arg)
{
	TreeSet<String> names = new TreeSet<>();
	File file = new File("Assignment4.txt");
	System.out.println("File directory is "+ new File(".").getAbsoluteFile()); //get your file directory
	

	try
	{
		fr= new FileReader(file);
		buffer = new BufferedReader(fr);
		
			
		String current_Name;
		while ((current_Name = buffer.readLine())!=null)//current_Name recieves entine TXT as one word, needs to be split
		{      
//Foreach Checks if Name is in Text, If it not add the name to the TextArray Names
 //https://www.digitalocean.com/community/tutorials/java-array-contains-value
			for (String Name : current_Name.split("\\s+")) 
			{
				
				if(!names.contains(Name))
				{
					names.add(Name);
					System.out.println(names);
				}
				else
				{
					System.out.println(names);
					System.out.print("Repeat word "+Name + " Word will not be added, it remains ");
				}
	                    
			}
				
		}
			
	}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.out.println(new File(".").getAbsoluteFile());//  If you need to find the path 
			
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fr.close();
				buffer.close();
				
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		
		}
		
	}

}
