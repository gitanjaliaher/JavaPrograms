package arrayprogram;

import java.util.Scanner;

public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oddSum=0,evenSum=0,evenCount=0,oddCount=0; 
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
            	evenSum=evenSum+a[i];
            	evenCount++;
       
            }
            else
            {
            	oddSum=oddSum+a[i];
            	oddCount++;
            }
        }
       
        double avgOdd=oddSum/oddCount; 
        double avgEven=evenSum/evenCount;
        System.out.println("\nAverage of even numbers are: "+avgEven);  
        System.out.println("\nAverage of odd numbers are: "+avgOdd);

	}

}
