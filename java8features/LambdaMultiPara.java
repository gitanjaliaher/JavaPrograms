package java8features;

import java.util.Scanner;

// Cretaed by Gitanjali Aher...

@FunctionalInterface
interface Addable{
	int add(int a, int b);
}

public class LambdaMultiPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addable a1 = (x,y) -> x+y;
		System.out.println("Addition : "+a1.add(23,45));
		
		Addable a2 = (int a, int b) ->{
			return a+b;
		};
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition : "+a2.add(a, b));

	}

}
