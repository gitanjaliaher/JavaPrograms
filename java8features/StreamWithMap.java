package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Created b Gitanjali Aher

public class StreamWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> marks = new ArrayList<>();
		marks.add(67);
		marks.add(78);
		marks.add(77);
		marks.add(86);
		marks.add(89);
		
		System.out.println("Marks before grace : "+marks);
		
		List<Integer> updatedMarks = marks.stream().map(i -> i + 10).collect(Collectors.toList());
		System.out.println("Marks after grace : "+updatedMarks);

	}

}
