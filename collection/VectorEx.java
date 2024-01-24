package collection;

import java.util.Enumeration;
import java.util.Vector;

//    Created by Gitanjali Aher...

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vector = new Vector<>();
		vector.addElement("Jasmin");
		vector.addElement("Mogra");
		vector.addElement("Lotus");
		vector.addElement("Lilly");
		vector.addElement("Rose");
		vector.addElement("Jasmin");
		vector.addElement(null);
		
		Enumeration<String> e = vector.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
