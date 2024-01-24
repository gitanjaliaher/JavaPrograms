package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Created by Gitanjali Aher
public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = Arrays.asList(23, 55, 67, 22, 90, 21, 46, 890, 565, 80, 42, 2, 7, 5, 4, 82);
		
		List<Integer> number = num.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		number.forEach(System.out::println);
	}

}
