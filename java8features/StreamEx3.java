package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class EmployeeEx{
	int id, age, salary;
	String Name;
	
	public EmployeeEx(int id, int age, String name, int salary) {
		super();
		this.id = id;
		this.age = age;
		Name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "EmployeeEx [id=" + id + ", age=" + age + ", salary=" + salary + ", Name=" + Name + "]";
	}
	public static List<EmployeeEx> empList() {
		ArrayList<EmployeeEx> list = new ArrayList<>();
		list.add(new EmployeeEx(101, 23, "Gitanjali", 65000));
		list.add(new  EmployeeEx(102, 22, "Swati", 30000));
		list.add(new  EmployeeEx(103, 33, "Rushikesh", 70000));
		list.add(new  EmployeeEx(104, 25, "Ravi", 50000));
		list.add(new  EmployeeEx(105, 35, "Meena", 20000));
		list.add(new  EmployeeEx(106, 28, "Paras", 45000));
		list.add(new  EmployeeEx(107, 30, "Jyothi", 60000));
		list.add(new  EmployeeEx(108, 32, "Ram", 80000));
		list.add(new  EmployeeEx(109, 27, "Riya", 22000));
		return list;
	}

}
//Created by Gitanjali Aher 
public class StreamEx3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeEx> list = EmployeeEx.empList();
		
		System.out.println("Employee list whose salary is greater than 50000");
		List<String> emp = list.stream().filter(s -> s.getSalary()>50000).map(i -> i.getName()).collect(Collectors.toList());
		emp.forEach(System.out::println);
		
		System.out.println("\nUpdated Salary :");
		List<Integer> updatedSalary = list.stream().filter(s -> s.getSalary()<30000).map(i -> i.getSalary() + 5000).collect(Collectors.toList());
		updatedSalary.forEach(System.out::println);
	}

}
