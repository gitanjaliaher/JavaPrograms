package switchcase;

import java.util.Scanner;

public class Vowelconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		Scanner sc = new Scanner (System.in);
		do {
			System.out.println("Enter Your choice : ");
			ch = sc.next().charAt(0);
			
			switch(ch) {
			
			case 'a','A' :
			case 'e','E' :
			case 'i','I' :
			case 'o','O' :
			case 'u','U' :
				System.out.println(ch+" is vowel");
				break;
				
			default:
				System.out.println(ch+" is consonant");
				break;
			
			}
			
			System.out.println("Enter y or Y to continue ");
			ch = sc.next().charAt(0);
			
		} while(ch=='y' || ch=='Y');

	}

}
