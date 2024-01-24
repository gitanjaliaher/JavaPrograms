package abstraction;

public class Circle extends Drawable {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Inside overriden method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable c = new Circle();
		c.area();
		c.print();

	}

}
