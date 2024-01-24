package classesandobject;

import java.util.Scanner;

public class Pattern {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k, n1, n2, n3;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		
		for(i=1;i<=n1;i++) {
			for(j=1;j<=n1-i;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(i=1;i<=n2;i++) {
			for(j=1;j<=n2-i;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(i=1;i<=n3;i++) {
			for(j=1;j<=n3-i;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
