package abstraction;

import java.util.Scanner;

abstract class Bank{
	 
	public abstract float getRateOfInterest();
	
 }
 
 class BOI extends Bank {

	@Override
	public float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8.7f;
	}
 }
 
 class TJSB extends Bank {

	@Override
	public float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6.6f;
	}
	 
 }
 public abstract class BankAbstraction {
 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float principleAmt, years, rateBOI, rateTJSB;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount :  ");
		principleAmt = sc.nextFloat();
		System.out.println("Enter Number of years : ");
		years = sc.nextFloat();
		
		Bank bBOI = new BOI();
		rateBOI = bBOI.getRateOfInterest();
		
		Bank bTJSB = new TJSB();
		rateTJSB = bTJSB.getRateOfInterest();
		
		float interestBOI = (principleAmt * years * rateBOI) / 100;
		float interestTJSB = (principleAmt * years * rateTJSB) / 100;
		
		System.out.println("Simple interset of BOI : "+interestBOI);
		System.out.println("Simple interset of TJSB : "+interestTJSB);	

	}

}
