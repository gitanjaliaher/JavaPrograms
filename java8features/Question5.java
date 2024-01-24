package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Created by Gitanjali Aher...
class Employee{
	int id, age;
	String name;
	
	public Employee(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
}

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, 23, "Gitanjali"));
		list.add(new Employee(102, 30, "Ram"));
		list.add(new Employee(103, 27, "Jaya"));
		list.add(new Employee(104, 34, "Riya"));
		list.add(new Employee(105, 22, "Siya"));
		
		Collections.sort(list, (e1,e2)->{
			return e1.name.compareTo(e2.name);
		});
		
		list.forEach(e -> System.out.println(e));
	}

}
