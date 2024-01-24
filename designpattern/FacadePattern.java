package designpattern;

import java.util.Scanner;

interface MobileShop{
	void modelNo();
	void price();
}

class IPhone implements MobileShop{
	
	@Override
	public void modelNo() {
		System.out.println("IPhone6");
	}
	
	@Override
	public void price() {
		System.out.println("Rs.70000");
	}
}

class Samsung implements MobileShop{
	
	@Override
	public void modelNo() {
		System.out.println("Samsung Galaxy");
	}
	
	@Override
	public void price() {
		System.out.println("Rs.42000");
	}	
}

class Blackberry implements MobileShop{
	
	@Override
	public void modelNo() {
		System.out.println("Blackberry z10");
	}
	
	@Override
	public void price() {
		System.out.println("Rs.57000");
	}	
}

class ShopKeeper{
	private IPhone iphone;
	private Samsung samsung;
	private Blackberry blackberry;
	
	public ShopKeeper() {
		iphone = new IPhone();
		samsung = new Samsung();
		blackberry = new Blackberry();
	}
	
	public void salesIPhone() {
		iphone.modelNo();
		iphone.price();
	}
	
	public void salesSamsung() {
		samsung.modelNo();
		samsung.price();
	}
	
	public void salesBlackberry() {
		blackberry.modelNo();
		blackberry.price();
	}
}
//Gitanjali Aher..
public class FacadePattern {

	public static void main(String[] args) {
		int choice;
		
		ShopKeeper shopkeeper = new ShopKeeper();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your Choice. \n 1. IPhone \n 2. Samsung \n 3. Blackberry \n 4. Exit\n");
			choice = sc.nextInt();
			switch (choice) {
			case 1: 
				shopkeeper.salesIPhone();
				break;
			case 2: 
				shopkeeper.salesSamsung();
				break;
			case 3: 
				shopkeeper.salesBlackberry();
				break;
			default:
				 System.out.println("Invalid choice");
			}
			
		}while(choice!=4);
		

	}

}
