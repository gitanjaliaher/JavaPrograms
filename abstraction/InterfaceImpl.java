package abstraction;

public class InterfaceImpl implements Addable, Printable{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImpl imp = new InterfaceImpl();
		imp.print();
		Addable.add(12, 5);
		imp.div(45.5, 4);
		imp.mul(5, 8);
		imp.show();
	}

	@Override
	public void div(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("Division : "+(a/b));
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		float r = 10;
		System.out.println("Area : "+(PI*r*r));
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Addable.super.show();
	}

}
