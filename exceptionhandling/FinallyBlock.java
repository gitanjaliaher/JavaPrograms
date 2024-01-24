package exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("case 1 : where exception doesn't occurs");
		
		try {
			
			int a = 25/5;
			System.out.println("Div : "+a);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("case 1 : Finally block always execute");
		}
		System.out.println("rest of code...");
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("case 2 : where exception occurs and handled");
		
		try {
			
			String s = null;
			System.out.println(s.length());
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("case 2 : Finally block always execute");
		}
		System.out.println("rest of code...");
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("case 3 : where exception occurs but doesn't handled");
		
		try {
			
			int b = 25/0;
			System.out.println("Div : "+b);
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("case 3 : Finally block always execute");
		}
		System.out.println("rest of code...");
		System.out.println("------------------------------------------------------------------");
	}

}
