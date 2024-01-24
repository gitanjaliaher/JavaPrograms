package codingchallenge;

import java.util.Scanner;

public class WithoutUsingLmbda {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String str = String.join(" ",s.split(""));
		System.out.println(str);
		sc.close();

	}

}
