package exceptionhandling;

public class BadFood {
	public static void checkFruit(String fruitname) throws BadFoodException {
		if(fruitname.equalsIgnoreCase("Mango")) {
			System.out.println("I like "+fruitname);
		}
		else {
			throw new BadFoodException("I don't like "+fruitname);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkFruit("Grapes");
		} catch (BadFoodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("rest of code...");
	}

}
