package conditionalState;

import java.util.Scanner;

public class GreatestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number : ");
		a = sc.nextInt();
		System.out.println("Enter the second Number : ");
		b = sc.nextInt();
		System.out.println("Enter the third Number : ");
		c = sc.nextInt();
		
		if(a >= b && a >= c) {
			System.out.println(a+" is the largest number");
		}
		else if(b >= a && b >= c) {
			System.out.println(b+" is the largest number");
		}
		else {
			System.out.println(c+" is the largest number");
		}

	}

}
