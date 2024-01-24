package classesandobject;

import java.util.Scanner;

public class Prime {
	
	static boolean Prime(int num)
	{
		if(num <= 1)
		{
			return false;
		}
		
		for(int i = 2; i <= num/2; i++)
		{
			if((num % i) == 0)
				return  false;
		}
		return true;
	}
	
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a number : ");
			int number= sc.nextInt();
			
			if(Prime(number)) {
				System.out.println(number + " is a prime number");
			}
			
			else{
				System.out.println(number + " is a not a prime number");
			}
		}
		
}

