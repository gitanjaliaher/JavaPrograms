package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Created by Gitanjali Aher
public class StreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Gitanjali", "Swati", "Supriya", "Dhanashri", "Rushikesh", "Ram", "Sushma", "Sagar");
		
		List<String> namesCollect = names.stream().filter(str -> str.startsWith("S")).collect(Collectors.toList());
		namesCollect.forEach(System.out::println);
	}

}
