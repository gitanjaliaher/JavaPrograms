package series;

import java.util.Scanner;

public class Series1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		 for(i=1;i<=n;i++)
		    {
		    	if(i%2!=0)
		    	{
		    		System.out.print(i);
		    
		    	}
		    	
		    	
		    	if((i+1)<=n)
		    	{
		    		System.out.print(" ");
		    	}
		    }		
    }

}
