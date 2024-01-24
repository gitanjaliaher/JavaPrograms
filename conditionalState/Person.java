package conditionalState;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salary, taxAmt;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary : ");
		salary = sc.nextFloat();
		
		if(salary<25000) {
			taxAmt = salary - 0.1f;
		}
		else {
			taxAmt = salary - 0.15f;
		}
		System.out.println("Tax : "+taxAmt);

	}

}
