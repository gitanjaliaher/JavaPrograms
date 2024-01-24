package switchcase;

import java.util.Scanner;
public class Arithmetic {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, result;
		char choice;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number : ");
		a = sc.nextInt();
		System.out.println("Enter second Number : ");
		b = sc.nextInt();
		
		System.out.println("Choose operator : +, -, *, /");
		choice = sc.next().charAt(0);
		
		switch(choice) {
		case '+' : 
			result = a + b;
			System.out.println("Addition : "+result);
			break;
			
		case '-' : 
			result = a - b;
			System.out.println("Subtraction : "+result);
			break;
			
		case '*' : 
			result = a * b;
			System.out.println("Multiplication : "+result);
			break;
			
		case '/' : 
			result = a / b;
			System.out.println("Division : "+result);
			break;
			
		default : 
			System.out.println("Invalid Choice");
			break;
			
		}
																																																																																				
		System.out.println("Enter y or Y to continue ");
		choice = sc.next().charAt(0);
		} while(choice=='y' || choice=='Y');
		
	}

}
