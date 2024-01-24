package collection;

import java.util.PriorityQueue;
import java.util.Queue;

//  Created by Gitanjali Aher...

public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("Jasmin");
		queue.offer("Lilly");
		queue.offer("Mogra");
		queue.offer("Rose");
		queue.offer("Lotus");
		
		System.out.println("Queue : "+queue);
		System.out.println("Head of Queue : "+queue.element());
		System.out.println("Remove elements : "+queue.remove());
		System.out.println("After Removing element : "+queue);
		System.out.println("Remove element using Queue: "+queue.poll());
		System.out.println("After Removing elements : "+queue);
		System.out.println("Size of queue : "+queue.size());
		
	}

}
