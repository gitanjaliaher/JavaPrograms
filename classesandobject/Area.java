package classesandobject;

import java.util.Scanner;

public class Area {
	float area;	
	 Scanner sc = new Scanner(System.in);
	
	 public void circle() {
		 float r;
		 System.out.println("Enter Radius : ");
		 r = sc.nextFloat();
		 area = 3.14f * r* r;
		 System.out.println("Area of Circle : " +area);
	 }
	 
	 public int square() {
		 int side;
		 System.out.println("Enter Side : ");
		 side = sc.nextInt();
		 return side * side;
	 }
	 
	 public void rectangle(float l, float b){
		 System.out.println("Area of Rectangle  : "+(l*b));
	 }
	 
	 public float triangle(float base, float height) {
		 area = 0.5f * base * height;
		 return area;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area = new Area();
		area.circle();
		
		int a = area.square();
		System.out.println("Area of Square  : " +a);
		
		float l, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth : ");
		l = sc.nextFloat();
		b = sc.nextFloat();
		area.rectangle(l, b);
		
		float t = area.triangle(4.5f, 2.6f);
		System.out.println("Area of Triangle : "  +t);
	}

}
