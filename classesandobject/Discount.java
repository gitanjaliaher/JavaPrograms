package classesandobject;

public class Discount extends Customer {
	float finalBill;
	float discount;
	
	public Discount() {
		super();
	}
	
	public Discount(int id, String name, MyDate dob, String productName, int Quantity, float price) {
		super(id, name, dob, productName, Quantity, price);
	}
	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		
		if(billAmt >= 20000) {
			discount = (20000 * 0.15f);
		}
		
		else if(billAmt >= 15000) {
			discount = (15000 * 0.1f);
		}
		
		else if(billAmt >= 10000) {
			discount = (10000 * 0.07f);
		}
		
		else {
			discount = 0.0f;
		}
		
		finalBill = (billAmt - discount);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		
		System.out.println("Discount : "+discount);
		System.out.println("Final Bill : "+finalBill);
		
	}
}
