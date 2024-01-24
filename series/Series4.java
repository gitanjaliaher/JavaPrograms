package series;

import java.util.Scanner;

public class Series4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double sum=0.00;
		
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		for (double i = 1; i <= n; i++) 
		{
			
			
			System.out.print( (int)i + "/" + (int)(i*i));
			sum = sum + (i / i*i);
			if (i < n) 
			{
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + sum);

	}

}
