package conditionalState;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Java=92, Python=87, PHP=77;
		int Total;
		Float Percent;
		String grade;
		Total = Java + Python + PHP;
		System.out.println("Total : "+Total);
		Percent = (float) (Total / 3);
		System.out.println("Percentage : "+Percent);
		
		if(Percent >= 75) {
			grade = "O";
		}
		
		else if(Percent >= 60) {
			grade = "A";
		}
		
		else if(Percent >= 45) {
			grade = "B";
		}
		
		else if(Percent >= 35) {
			grade = "c";
		}
		
		else {
			grade = "D";
		}
		
		System.out.println("Grade : "+grade);

	}

}
