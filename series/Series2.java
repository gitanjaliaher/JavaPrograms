package series;

import java.util.Scanner;

public class Series2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double sum=0.00;
		
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		for (double i = 1; i <= n; i++) 
		{
	
			System.out.print( 1 + "/" + (int)i);
			sum = sum + (1 / i);
			if (i < n) 
			{
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + sum);

	}

}

