package conditionalState;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		num = sc.nextFloat();
		
		if(num>0) {
			System.out.println("Number is Positive");
		}
		else if(num<0) {
			System.out.println("Number is Negative");
		}
		else {
			System.out.println("Number is Zero");
		}

	}

}
