package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

//  Created by Gitanjali Aher...

public class MapImpleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("In", "India");
		map.put("Br", "Brazil");
		map.put("De", "Germany");
		map.put("Fr", "France");
		map.put(null, null);
		map.put(null, null);
		
		System.out.println("Implementing HashMap : ");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Country Code : "+key+", Country : "+val);
		}
		
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("B102", "Coffee");
		treeMap.put("L207", "Pizza");
		treeMap.put("D304", "Burger");
		treeMap.put("D106", "Sandwitch");
		treeMap.put("N902", null);
		treeMap.put("C105", null);
		//treeMap.put(null, null);
		
		System.out.println("\nImplementing TreeMap : ");
		for (Map.Entry<String, String> entry : treeMap.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Code : "+key+" - Menu : "+val);
		}
		
		Map<String, String> hashTable = new Hashtable<>();
		hashTable.put("B102", "Coffee");
		hashTable.put("L207", "Pizza");
		hashTable.put("D304", "Burger");
		hashTable.put("D106", "Sandwitch");
//		hashTable.put("N902", null);
//		hashTable.put("C105", null);
//		treeMap.put(null, null);
		
		System.out.println("\nImplementing HashTable : ");
		for (Map.Entry<String, String> entry : hashTable.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Code : "+key+" - Menu : "+val);
		}
	}

}
