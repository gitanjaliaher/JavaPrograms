package series;

import java.util.Scanner;

public class Series10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n;
		double fact, i, j, sum = 0.00;
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		
		for(i = 1;i <= n; i++) {
			fact = 1;
			for(j = 1;j <= i; j++) {
				fact = fact * j;
			}
			
			sum = sum + (i / fact);
			System.out.print((int)i+"/"+(int)i+"!");
			
			if(i<n) {
				System.out.print(" + ");
			}
		}
		
		System.out.println(" = "+sum);
	}

}
