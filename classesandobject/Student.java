package classesandobject;

	public class Student extends Person{
		float Python, Java, PHP, Total, Percentage;
		
		public Student() {
			super();
			Python = 78;
			Java = 98;
			PHP = 77;	 
		}
		
		public Student(int id, String name, MyDate dob, float Python, float Java, float PHP ) {
			super(id, name, dob);
			this.Python = Python;
			this.PHP = PHP;
		}
		
		 public void calculate() {
			 Total = Python+Java+PHP; 
			 Percentage = Total/3; 
		 }
		
		 @Override
		public void display() {
			// TODO Auto-generated method stub
			super.display();
			System.out.println("Total Marks : "+Total);
			System.out.println("Percentage : "+Percentage);
		}
	
}
