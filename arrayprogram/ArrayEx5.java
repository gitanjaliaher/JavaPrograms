package arrayprogram;

import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenCount=0,oddCount=0; 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of the array:");
       int  n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i <n; i++)
        {
        	 a[i] = s.nextInt();
        }
       
      
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 == 0)
            {
            	
            	evenCount++;
       
            }
            else
            {
            
            	oddCount++;
            }
        }
       
       
        System.out.println("\nFrequency of even numbers are: "+evenCount); 
        System.out.println("\nFrequency of odd numbers are: "+oddCount);
     

	}

}
