package classesandobject;

public class Customer extends Person {
	String productName;
	int Quantity;
	float price, billAmt;
	
	public Customer() {
		super();
		productName = "Lehenga";
		Quantity = 5;
		price = 25000;
		billAmt = 25000;
	}
	public Customer(int id, String name, MyDate dob, String productName, int Quantity, float price) {
		super(id, name, dob);
		this.productName = productName;
		this.Quantity  = Quantity;
		this.price = price;
	}
	public void calculate() {
		billAmt = Quantity * price;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Product Name : "+productName);
		System.out.println("Quantity : "+Quantity);
		System.out.println("Price of Product : "+price);
		System.out.println("Total Bill Amount : "+billAmt);
	}
	
	
}
