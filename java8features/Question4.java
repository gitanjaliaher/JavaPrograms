package java8features;

//import java.util.Scanner;

//Created by Gitanjali Aher...
@FunctionalInterface
interface CalPercentage{
	double percentage(double m1, double m2, double m3);
}
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalPercentage p = (m1, m2, m3) -> (m1 + m2 + m3)/3;
		System.out.println("Percentage : "+p.percentage(88, 75, 68));
	}

}
