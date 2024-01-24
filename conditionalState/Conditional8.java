package conditionalState;

import java.util.Scanner;

public class Conditional8 {

	public static void main(String[] args) {

		int NoOfCalls, BillAmt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Calls : ");
		NoOfCalls = sc.nextInt();
		
		if(NoOfCalls < 200) {
		 
			BillAmt = 1 * NoOfCalls;		
		}
		
		else {
			BillAmt = 3 * NoOfCalls;
		}
		
		System.out.println("Total BillAmount of Calls : "+BillAmt);
		
	}

}
