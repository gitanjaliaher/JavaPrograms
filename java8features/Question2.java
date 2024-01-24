package java8features;

import java.util.Scanner;

// Created by Gitanjali Aher...

@FunctionalInterface
interface Circle{
	float circle(float r);
}
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no : ");
		float n = sc.nextFloat();
		Circle c = x -> 2.14f * (x * x);
		System.out.println("Circle : "+c.circle(n));

	}

}
