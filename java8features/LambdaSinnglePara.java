package java8features;

import java.util.Scanner;

//Created by Gitanjali Aher...

@FunctionalInterface
interface Sayble{
	String sayHello(String name);
}

public class LambdaSinnglePara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayble s1 = name -> {
			return "Hello " +name;
		};
		
		System.out.println(s1.sayHello("Gita"));
	}

}
