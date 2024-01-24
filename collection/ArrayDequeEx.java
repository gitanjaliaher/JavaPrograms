package collection;

import java.util.ArrayDeque;
import java.util.Deque;

//  Created by Gitanjali Aher...

public class ArrayDequeEx {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.add("Burger");	
		deque.offer("Pizza");
		deque.offer("Coffee");
		deque.offerLast("Ice-Cream");
		deque.offerFirst("Sandwitch");
			
		System.out.println("Deque : "+deque);
		System.out.println("Remove elements : "+deque.removeFirst());
		System.out.println("After Removing element : "+deque);
		System.out.println("Remove last element: "+deque.pollLast());
		System.out.println("After Removing elements : "+deque);
		System.out.println("Retrive using peek : "+deque.peekFirst());
	}


}
