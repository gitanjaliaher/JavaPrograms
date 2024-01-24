package java8features;

import java.util.Scanner;

//Created by Gitanjali Aher...
@FunctionalInterface
interface CalSimpleInterest{
	float simpleInterest(float p, float n, float r);
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle Amount : ");
		float  PA = sc.nextFloat();
		System.out.println("Enter Time : ");
		float time = sc.nextFloat();
		System.out.println("Enter Rate : ");
		float rate = sc.nextFloat();
		
		CalSimpleInterest SI = (p, n, r) -> (p * n * r)/100;
		System.out.println("Simple Interest : "+SI.simpleInterest(PA, time, rate));

	}

}
