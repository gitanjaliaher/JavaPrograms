package abstraction;

public abstract class Parent {
	
	public abstract void message();	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent fclass = new FirstSubclass();
		fclass.message();
		
		Parent sclass = new SecondSubclass();
		sclass.message();		
	}
}

class FirstSubclass extends Parent{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is First Subclass");		
	}
	
}

class SecondSubclass extends Parent{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is Second Subclass");	
	}
	
}
