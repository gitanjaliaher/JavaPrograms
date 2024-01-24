package java8features;

// Created by Gitanjali Aher...

@FunctionalInterface
interface Sayable{
	String sayHello();
}

public class LambdaNoPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s1 = () -> {
			return "Hello User";
		};
		System.out.println(s1.sayHello());
	}

}
