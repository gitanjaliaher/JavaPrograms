package conditionalState;

import java.util.Scanner;

public class Age {
		
		public void checkAge(int age) {
			if(age>18) {
				System.out.println("He/She eligible for License");
			}
			else {
				System.out.println("He/She not eligible for License");
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Age a1 = new Age();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter age : ");
			int age = sc.nextInt();
			a1.checkAge(age);
	
		}

}
