//1-2 + 3-4 + 5-6 .... n = ?

package series;

import java.util.Scanner;

public class Series9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		for(i = 0; i < n; i++) {
			i=i+1;
			System.out.print(i+"-"+(i+1));
			sum = sum+(i-(i+1));
			
			if((i+1)<n) {
				System.out.print(" + ");	
			}
		}
		System.out.println(" = "+sum);
	}

}
