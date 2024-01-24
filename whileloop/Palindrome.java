package whileloop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
	    int num = scanner.nextInt();
	   int m=num;
	    int rev=0;
	    while(num>0)
	    {
	    	rev=rev*10+num%10;
	    	num=num/10;
	    }
	   if(rev==m)
	   {
		   System.out.println("Number is Palindrome");
	   }
	   else
	   {
		   System.out.println("Number is not Palindrome");
	   } 
	}

}
