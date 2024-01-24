package codingchallenge;

import java.util.Scanner;
import java.util.stream.Collectors;

//Created by Gitanjali Aher...
@FunctionalInterface
interface Space{
	String insertSpace(String s);
	
}
public class Source2 {
	public String insertSpace(String s) {
		return s.chars().mapToObj(ch -> (char)ch + " ").collect(Collectors.joining()); //using Stream API
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//using Lambda Expression
		Space s = s1 -> {
			return String.join(" ",s1.split(""));
		};
		
		System.out.println(s.insertSpace(str));
		
		
		String input = sc.nextLine();
		Source2 s2 = new Source2();
		String result =  s2.insertSpace(input);
		System.out.println(result);
		
	}

}
