package classesandobject;

public class Amount {

	String dName;
	float p, r, a;
	int n;
	
	public Amount() {
		dName = "Gita";
		p = 10000;
		n = 6;
	}
	
	public void calculate() {
		
		if(n < 1) {
			r = 9;	
		}
		
		else if((n >= 1) && (n <= 3)){
			r = 9.25f;
		}
		
		else if((n > 3) && (n <= 5)){
			r = 9.5f;
		}
		
		else {
			r = 9.75f;
		}
		
		
		a = (float) (p * (Math.pow((1 + r / 100), n))); 
		
	}
	
	void display() {
		System.out.println("Depositor Name : "+dName);
		System.out.println("Principle Amount : "+p);
		System.out.println("Number of years : "+n);
		System.out.println("Rate of Interest : "+r);
		System.out.println("Accumulated Amount : "+a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amount amt = new Amount();
		amt.calculate();
		amt.display();
	}

}
