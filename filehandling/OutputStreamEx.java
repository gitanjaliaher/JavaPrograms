package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream outputstream = new FileOutputStream("c:\\Java\\abc.txt",true);
		String str = " Welcome to Edubridge";
		byte bArray[] = str.getBytes();
		outputstream.write(bArray);
		outputstream.close();
		System.out.println("File Created");
	}

}
