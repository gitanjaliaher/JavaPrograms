package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee(101, "Riya","Programmer");
		
		FileOutputStream outputstream = new FileOutputStream("c://Java//serialization.txt");
		ObjectOutputStream objoutputsream = new ObjectOutputStream(outputstream);
		objoutputsream.writeObject(emp);
		objoutputsream.flush();
		System.out.println("convert emp obj into byte stream");

	}

}
