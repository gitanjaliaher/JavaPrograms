package codingchallenge;
/*  Distance Traveled */
import java.util.Scanner;

/* Created by Gitanjali Aher  */

public class DistCalculate {
	
	public void calculate(int t) {
		int u = 36;
		int a = 5;
		u = u*5/18;
		
		int d = u*t+((a*t*t)/2);
		System.out.println(d);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		
		DistCalculate dist = new DistCalculate();
		dist.calculate(t1);
		dist.calculate(t2);
	}
}

