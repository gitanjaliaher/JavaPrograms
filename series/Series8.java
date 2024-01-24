package series;

import java.util.Scanner;

public class Series8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, n, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		for(i = 1; i <= n; i++) {
			System.out.print(i+"*"+(i+1));
			sum = sum+(i*(i+1));
			
			if(i<n) {
				System.out.print(" + ");	
			}
		}
		System.out.println(" = "+sum);

	}

}
