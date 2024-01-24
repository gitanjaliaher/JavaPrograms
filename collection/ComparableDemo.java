package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//   Created by Gitanjali Aher...

class Student implements Comparable<Student>{
	int rollNo, age;
	String Name;
	
	public Student(int rollNo, int age, String name) {
		super();
		this.rollNo = rollNo;
		this.age = age;
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", age=" + age + ", Name=" + Name + "]";
	}

	@Override
	public int compareTo(Student st) {
	
		if(age == st.age)
			return 0;
		else if(age > st.age)
			return 1;
		else
			return -1;
	}

}

public class ComparableDemo {

	public static void main(String[] args) {
	
		List<Student> list1 = new ArrayList<Student>();
		list1.add(new Student(101, 23, "Ram"));
		list1.add(new Student(102, 21, "Jay"));
		list1.add(new Student(103, 25, "Disha"));
		list1.add(new Student(104, 19, "Gita"));
		list1.add(new Student(105, 24, "Riya"));
		
		Collections.sort(list1);
		System.out.println("List after Sorting :  ");
		for (Student student : list1) {
			System.out.println(student);
		}
	}

}
