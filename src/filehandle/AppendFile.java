package filehandle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
public static void main(String[] args) throws IOException
{
	try
	{
		String app = "Why not?";
		File nr = new File("/Users/shimeiblanco/Desktop/Verge.text");
		if(!nr.exists())
		{
			nr.createNewFile();
		}
		//Here true is to append the content to file
		FileWriter fw = new FileWriter(nr, true);
		//BufferedWriter writer give better performance
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(app);
		bw.close();
		System.out.println("Data successfully appended at the end of file");
		
	}
	catch(IOException e)
	{
		System.out.println("Exception occurred:");
		e.printStackTrace();
	}
	
	
}
}
