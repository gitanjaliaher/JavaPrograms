package abstraction;

abstract class Bank1 {
	
	public abstract int getBalance();

}

class BankA extends Bank1 {

	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return 100;
	}

}

class BankB extends Bank1{

	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return 200;
	}
	
}

class BankC extends Bank1{

	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return 300;
	}
	
}

public abstract class BankAbstraction1 {
	 
	public static void main(String[] args) {
		int balanceA, balanceB, balanceC;
		Bank1 bankA = new BankA();
		balanceA = bankA.getBalance();

		Bank1 bankB = new BankB();
		balanceB = bankB.getBalance();
		
		Bank1 bankC = new BankC();
		balanceC = bankC.getBalance();
		
		System.out.println("Balance Deposited in BankA "+balanceA);
		System.out.println("Balance Deposited in BankB "+balanceB);
		System.out.println("Balance Deposited in BankC "+balanceC);
	
	}

}
