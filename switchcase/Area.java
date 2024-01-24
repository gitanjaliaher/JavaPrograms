package switchcase;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 float area;
		 String choice;
		 char ch;
		 
		 do {
	     Scanner sc = new Scanner(System.in);
		 System.out.println("Type Circle To calculate area of circle");
		 System.out.println("Type rect To calculate area of rectangle");
		 System.out.println("Type tri To calculate area of triangle");
		 choice = sc.nextLine();
		
		 switch(choice) {
		 
		 case "circle","Circle" : 
			 float r;
			 System.out.println("Enter Radius : ");
			 r = sc.nextFloat();
			 area = 3.14f * r* r;
			 System.out.println("Area of Circle : " +area);
			 break;
		 
		 case "rect","Rect" : 
			 float l, b;
			 
			 System.out.println("Enter length : ");
			 l = sc.nextFloat();
			 
			 System.out.println("Enter breadth : ");
			 b = sc.nextFloat();
			 
			 area = l * b;
			 System.out.println("Area of Rectangle  : "+area);
			 break;
		 
		 case "tri", "Tri" : 
			 float base, height;
			 System.out.println("Enter Base : ");
			 base = sc.nextFloat();
			 
			 System.out.println("Enter Height : ");
			 height = sc.nextFloat();
			 
			 area = 0.5f * base * height;
			 System.out.println("Area of Triangle : "+area);
			 break;
			 
		 default : 
				System.out.println("Invalid Choice");
				break;
				
		}
			System.out.println("Enter y or Y to continue ");
			ch = sc.next().charAt(0);
			
		} while(ch=='y' || ch=='Y');

	}

}
