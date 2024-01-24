package conditionalState;

import java.util.Scanner;

public class Conditional7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float PurchaseAmt, DiscAmt, Discount;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Purchase Amount : ");
		PurchaseAmt = sc.nextFloat();
		
		if(PurchaseAmt >= 10000) {
			Discount = PurchaseAmt * 0.1f;
			DiscAmt = PurchaseAmt - Discount;
		}
		else {
			Discount = PurchaseAmt * 0.02f;
			DiscAmt = PurchaseAmt - Discount;
		}
		System.out.println("Discount Amount : "+DiscAmt);

	}

}
