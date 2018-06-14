package filehandle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
public static void main(String[] args) throws IOException
{
	String s = "Are you sure?";
	File nr = new File("/Users/shimeiblanco/Desktop/Verge.text"); //Specify the file path here
	FileOutputStream f = new FileOutputStream(nr);
	if(!nr.exists())
	{
		nr.createNewFile();
	}
	byte[] bytesArray = s.getBytes();
	f.write(bytesArray);
	f.flush();
	//System.out.println("File Written Successfully");
}
}
