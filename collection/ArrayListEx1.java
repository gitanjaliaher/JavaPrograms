package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Created by Gitanjali Aher..

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList List1 = new ArrayList();
		List1.add(101);
		List1.add("Gitanjali");
		List1.add(76.80);
		List1.add(true);
		List1.add(null);
		List1.add("Gitanjali");
	
		System.out.println("Non-Generic List : "+List1);
		
		ArrayList<String> List2 = new ArrayList<>();
		List2.add("Jasmin");
		List2.add("Lilly");
		List2.add("Mogra");
		List2.add("Rose");
		List2.add("Lotus");
		List2.add("Lilly");
	
		System.out.println("Generic List : "+List1);
		
		System.out.println("Iterating list using Iterator Interface : ");
		Iterator<String> iterator = List2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Iterating List using for each loop : ");
		for(String string : List2) {
			System.out.println(string);
		}
		
		System.out.println("\nAfter Sorting : ");
		Collections.sort(List2);
		for (String string : List2) {
			System.out.println(string);
		}
	}

}
