package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Created by Gitanjali Aher...

class Product{
	int id;
	String Name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		Name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + ", price=" + price + "]";
	}
	
}

public class LmbdaWithComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();
		list.add(new Product(101,"NoteBook",1200));
		list.add(new Product(102,"Laptop",70000));
		list.add(new Product(103,"Mobile",35000));
		list.add(new Product(104,"Mouse",2000));
		list.add(new Product(105,"Monitor",1500));
		
		Collections.sort(list, (p1,p2)->{
			return p1.Name.compareTo(p2.Name);
		});
		
		//forEach Method
		
		list.forEach(p -> System.out.println(p));
	}

}
