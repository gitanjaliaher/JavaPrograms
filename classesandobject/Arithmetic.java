package classesandobject;

public class Arithmetic {
	int a, b, add,sub, mul, div, mod;
	
	public Arithmetic(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void addition() {
		add = a + b;
	}
	
	public void subtraction() {
		sub = a - b;
	}
	
	public void multiplication() {
		mul = a * b;
	}
	
	public void division() {
		div = a / b;
	}
	
	public void modulus() {
		mod = a % b;
	}
	
	public void display() {
		System.out.println("Addition of two numbers : " +add);
		System.out.println("Subtraction of two numbers : " +sub);
		System.out.println("Multiplication of two numbers : " +mul);
		System.out.println("Division of two numbers : " +div);
		System.out.println("Modulus of two numbers : " +mod);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic Arithmetic1 = new Arithmetic(700, 300);
		Arithmetic1.addition();
		Arithmetic1.subtraction();
		Arithmetic1.multiplication();
		Arithmetic1.division();
		Arithmetic1.modulus();
		Arithmetic1.display();

	}

}
