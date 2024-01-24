package java8features;

import java.util.ArrayList;
import java.util.List;

//Created by Gitanjali Aher...

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Gitanjali");
		list.add("Sakshi");
		list.add("Swati");
		list.add("Sneha");
		list.add("Rincy");
		list.add("Hemlata");
		
		//count names with length less than 7
		//without using Stream API
		int c = 0;
		for (String string : list) {
			if(string.length()<7) {
				c++;
			}
		}
		System.out.println("There are "+c+" string with length less than 7");
		
		//with Stream API
		
		long count = list.stream().filter(str -> str.length()<7).count();
		System.out.println("There are "+count+" string with length less than 7");
		
	}

}
