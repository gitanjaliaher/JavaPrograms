package multithreading;

class Customer{
	
	private int balance = 10000;
	
	synchronized void withdraw(int amt) {
		System.out.println("Going to withdraw Rs. "+amt);
		if(balance<amt) {
			System.out.println("Not enough balance in your account. waiting for deposite...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance = balance - amt;
		System.out.println("Rs. "+amt+" withdraw. balance : "+balance);
	}
	
	synchronized void deposite(int amt) {
		System.out.println("going to deposite Rs. "+amt);
		balance = balance + amt;
		System.out.println("deposited Rs. "+amt+" Balance : "+balance);
		notify();
	}
	
}

public class InterThreadCommu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cust = new Customer();
		new Thread("paras") {
			public void run() {
				cust.withdraw(15000);
			};
		}.start();
		
		new Thread("manas") {
			public void run() {
				cust.deposite(20000);
			};
		}.start();
	}

}
