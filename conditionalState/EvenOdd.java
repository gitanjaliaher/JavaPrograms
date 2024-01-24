package conditionalState;

import java.util.Scanner;

public class EvenOdd {
	
	public static void checkEvenOdd(int a) {
		
		if(a %2 == 0) {
			System.out.println(a+ " is a even number.");
		}
		else {
			System.out.println(a+ " is odd number.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd e1 = new EvenOdd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int a = sc.nextInt();
		e1.checkEvenOdd(a);

	}

}
