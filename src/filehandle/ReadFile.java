package filehandle;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
public static void main(String[] args) throws IOException
{
	try
	{
		File f = new File("/Users/shimeiblanco/Desktop/Verge.text");
		f.createNewFile();//create a file
		FileInputStream nr = new FileInputStream(f);//FileInputStream to read the file
		 /*Passed the FileInputStream to BufferedInputStream
	     *For Fast read using the buffer array.*/
		BufferedInputStream b = new BufferedInputStream(nr);
		while(b.available()>0)
		{
			System.out.print((char)b.read());
		}
		
	}
	catch(FileNotFoundException e1)
	{
		 System.out.println("The specified file not found" + e1); 
	}
	catch(IOException e2)
	{
		System.out.println("I/O Exception: " + e2); 
	}
	
	
}
}
