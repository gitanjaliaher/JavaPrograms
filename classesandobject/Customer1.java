package classesandobject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int id;
		String name;
		double PA, rate, noYears,SI;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Id : ");
		id = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter Customer Name : ");
		name = (reader.readLine());
		
		System.out.println("Enter Principle Amount : ");
		PA = Double.parseDouble(reader.readLine());
		
		System.out.println("Enter Rate : ");
		rate = Double.parseDouble(reader.readLine());

		System.out.println("Enter No of Years : ");
		noYears = Double.parseDouble(reader.readLine());
		
		SI = (rate * noYears * PA)/100;
		System.out.println("Simple Interest : "+SI);
		
	}

}
