package filehandle;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Multiple {
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("/Users/shimeiblanco/Desktop/verge.txt");
		f1.createNewFile();
		
		FileOutputStream f2 = new FileOutputStream(f1);
		String s = "Monday";
		byte[] b = s.getBytes();
		f2.write(b);
		f2.flush();
		
		FileInputStream f3 = new FileInputStream(f1);
		BufferedInputStream f4 = new BufferedInputStream(f3);
		while(f4.available()>0)
			System.out.print((char)f4.read());
		
		//if you do not to add, jusr replace put FileWriter fw = new FileWriter(f1)
		FileWriter fw = new FileWriter(f1, true);
		BufferedWriter bw = new BufferedWriter(fw);
		String app = "\nReally?";
		bw.write(app);
		bw.close();
	    		
		
	}
}
