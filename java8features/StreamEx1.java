package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Created by Gitanjali Aher

public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Gitanjali", "Swati", "Supriya", "Dhanashri", "Rushikesh", "Ram");
		
		//1. Create Stream
		Stream<String> allNames = names.stream();
		
		//2. Perform intermediate operation
		Stream<String> longNames = allNames.filter(str -> str.length()>7);
		
		//3. Perform Terminal operation
		System.out.println("Using forEach() ");
		longNames.forEach(str -> System.out.println(str));
		
		//In single line
		//collect(Collectors.toList()) : used to conver stream into list
		List<String> namesCollect = names.stream().filter(str -> str.length()>7).collect(Collectors.toList());
		System.out.println("\nUsing collect() ");
		
		namesCollect.forEach(System.out::println);
	}

}
