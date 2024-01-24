package java8features;

import java.util.Scanner;

//Created bu Gitanjali Aher...

@FunctionalInterface
interface Square{
	int square(int n);
}
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. : ");
		int n = sc.nextInt();
		Square s = a -> a*a;
		System.out.println("Square : "+s.square(n));
		

	}

}
