package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//   Created by Gitanjali Aher...

public class SetImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Gitanjali");
		hashSet.add("Riya");
		hashSet.add("Raj");
		hashSet.add("Jaya");
		hashSet.add("Gitanjali");
		hashSet.add(null);
		
		System.out.println("Implementing HashSet : ");
		for (String string : hashSet) {
			System.out.println(string);
		}
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Mango");
		linkedHashSet.add("Grapes");
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add(null);
		
		System.out.println("\n Implementing LinkedHashSet : \n"+linkedHashSet);
		
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Pizza");
		treeSet.add("Burger");
		treeSet.add("Coffee");
		treeSet.add("Pizza");
		
		System.out.println("\n Implementing TreeSet : \n"+treeSet);
	}

}
