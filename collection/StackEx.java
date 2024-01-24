package collection;

import java.util.Stack;

//Created By Gitanjali Aher...

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<String>();
		stack.push("Gauva");
		stack.push("Mango");
		stack.push("Grapes");
		stack.push("Apple");
		stack.push("Banana");
		
		System.out.println("Stack : "+stack);
		System.out.println("Removing Elements : "+stack.pop());
		System.out.println("Stack after Removing elements : "+stack);
		System.out.println("Search Mango : "+stack.search("Mango"));
		System.out.println("Search watermelon : "+stack.search("Watermelon"));
		stack.remove(1);
		System.out.println("Stack"+stack);
		

	}

}
