package arrayprogram;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		 int positiveCount=0;
		 int negativeCount=0;
		 int zeroCount=0;
	     
       Scanner s = new Scanner(System.in);
       System.out.print("Enter size of the array:");
       n = s.nextInt();
       int arr[] = new int[n];
       System.out.println("Enter array elements:");
       for(int i = 0; i <n; i++)
       {
       	 arr[i] = s.nextInt();
       }
       for(int i = 0; i <n; i++)
       {
       	 if(arr[i] > 0)
                positiveCount++;
                
             //check negative number
             else if(arr[i] < 0)
                negativeCount++;
                
             //check zero
             else
                zeroCount++;
       }
       System.out.println("Frequency of positive numbers in array: "+positiveCount);
       System.out.println("Frequency of negative numbers in array: "+negativeCount);
       System.out.println("Frequency of zeroes in array: "+zeroCount);

	}

}
