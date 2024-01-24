package exceptionhandling;

public class TryCatchExample {
	
	public static void main(String[] args) {
		
		try {
			
			int a[] = new int[10];
			a[12] = 25/0;
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		//java 7
		try {
			
			int b[]  = new int[20];
			b[25] = 30/0;
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Reset of code...");
	}

}
