package collection;

import java.util.ArrayList;
import java.util.LinkedList;

//   Created by Gitanjali Aher..

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> LinkedList1 = new LinkedList<>();
		LinkedList1.add("Jasmin");
		LinkedList1.add("Lilly");
		LinkedList1.add("Mogra");
		LinkedList1.add(1, "Rose");
		LinkedList1.add("Lotus");
		LinkedList1.add("Lilly");
		LinkedList1.add(null);
	
		for(String string : LinkedList1) {
			System.out.println(string);
		}
		
		LinkedList<String> LinkedList2 = new LinkedList<>();
		LinkedList2.add("Apple");
		LinkedList2.add("Grapes");
		
		LinkedList1.addAll(LinkedList2);
		System.out.println("Adding a Elements in Linked List 1 : "+LinkedList1);
		

	}

}
