package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/* Created by Gitanjali Aher */

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream objinputstream = new ObjectInputStream( new FileInputStream("c://Java//serialization.txt"));
		Employee emp = (Employee) objinputstream.readObject();
		System.out.println(emp);
		objinputstream.close();
		
	}

}
