package series;

import java.util.Scanner;

public class Series7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
	    int n = scanner.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	    	int result=i*i;
	    	System.out.print(result);
	    	if((i+1)<=n)
	    	{
	    		System.out.print(" ");
	    	}
	    }
	}
}
