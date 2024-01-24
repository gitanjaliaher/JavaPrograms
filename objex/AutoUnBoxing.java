package objex;

public class AutoUnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer obj1 = new Integer(a);
		Integer obj2 = a;
		
		Integer obj3 = new Integer(20);
		int b = obj3;
		
		System.out.println(a+" "+obj2);
		System.out.println(b+" "+obj3);

	}

}
