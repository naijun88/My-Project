package filehandle;

import java.io.File;
import java.io.IOException;

public class FileHandle {
	public static void main(String[] args) throws IOException
	{
		//create a folder
		File nr = new File("/Users/shimeiblanco/Desktop/Verge");
		nr.mkdir();
		
		//Check existence of Verge folder
		File nr1 = new File("/Users/shimeiblanco/Desktop/Verge");
		boolean a = nr1.exists();
		if(a==true)
			System.out.println("Verge folder is existing");
		else
			System.out.println("Verge folder is not existence");
		
		//Delete a folder
		File nr2 = new File("/Users/shimeiblanco/Desktop/Verge");
		nr2.delete();
		
		//create a text file
		File nr3 = new File("/Users/shimeiblanco/Desktop/Verge.text");
		nr3.createNewFile();
		//delete a file
		nr.delete();
		
	}
}
