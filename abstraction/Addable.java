package abstraction;

public interface Addable {
	float PI = 3.14f;
	
	void print();
	
	static void add(int a, int b) {
		System.out.println("Addition : "+(a+b));
	}
	
	default void mul(int a, int b) {
		System.out.println("Multiplication : "+(a*b));
	}
	
	default void show() {
		System.out.println("Inside show : Addable")	;
		}
}
