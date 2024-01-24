package classesandobject;

import java.util.Scanner;

public class Best {
	String custName;
	String PhoneNo;
	int NofCalls;
	float tax, bill;
	
	 Scanner sc = new Scanner(System.in);
	 
   	public void accept() {
		 System.out.println("Enter Customer Name : ");
		 custName = sc.nextLine();
		 System.out.println("Enter Phone Number : ");
		 PhoneNo = sc.nextLine();
		 System.out.println("Enter number of Calls from User : ");
		 NofCalls = sc.nextInt();
	}
   	
   	public void billing() {
   		float rate;
   		if(NofCalls <= 100) {
   			rate = 0;
   		}
   		else if((NofCalls <= 200) && (NofCalls >= 100)) {
   			rate = 0.80f;
   		}
   		else if((NofCalls <= 400) && (NofCalls >= 200)) {
   			rate = 1.25f;
   		}
   		else if(NofCalls >= 500){
   			rate = 2.50f;
   		}
   		
   	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Best b1 = new Best();
		b1.accept();
		b1.billing();

	}

}
