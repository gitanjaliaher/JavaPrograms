package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Created by Gitanjali Aher...
class Employee{
	int id, Salary;
	String Name;
	
	public Employee(int id, int salary, String name) {
		super();
		this.id = id;
		Salary = salary;
		Name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Salary=" + Salary + ", Name=" + Name + "]";
	}
	
}

class SalaryComp implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.Salary == e2.Salary)
			return 0;
		else if(e1.Salary > e2.Salary)
			return 1;
		else
			return -1;
	}
	
}

class NameComp implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.Name.compareToIgnoreCase(e2.Name);
		
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, 25000, "Rishi"));
		list.add(new Employee(102, 35000, "Jaya"));
		list.add(new Employee(103, 20000, "Raj"));
		list.add(new Employee(104, 42500, "Gitanjali"));
		list.add(new Employee(105, 15500, "Disha"));
		
		System.out.println("Sorting on the basis of Salary : ");
		Collections.sort(list, new SalaryComp());
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		System.out.println("\nSorting on the basis of Name : ");
		Collections.sort(list, new NameComp());
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}

}
