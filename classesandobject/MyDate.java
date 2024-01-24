package classesandobject;

public class MyDate {
	int dd, mm, yyyy;
	public MyDate() {
		dd = 19;
		mm = 07;
		yyyy = 2000;
	}
	
	public MyDate(int dd, int mm, int yyyy) {
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;		
	}
	
	public void display() {
		System.out.println("Date : "+dd+"-"+mm+"-"+yyyy);
	}

}
