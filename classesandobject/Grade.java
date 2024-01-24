package classesandobject;

public class Grade extends Student{
	String grade;
	
	public Grade() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Grade(int id, String name, MyDate dob, float Python, float Java, float PHP) {
		super(id, name, dob, Python, Java, PHP);	
	}
	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		
		if(Percentage >= 75) {
			grade = "O";
		}
		
		else if(Percentage >= 60) {
			grade = "A";
		}
		
		else if(Percentage >= 45) {
			grade = "B";
		}
		
		else if(Percentage >= 35) {
			grade = "c";
		}
		
		else {
			grade = "D";
		}
		
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Grade : "+grade);
	}

}
