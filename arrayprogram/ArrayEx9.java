package arrayprogram;

import java.util.Scanner;

public class ArrayEx9 {

	static void printOrder(int[] a, int n)
	   {
	     int temp;
	     for(int i=0;i < n-1;i++)
	     {
	        for(int j = 0;j < n/2; j++) 
	        { 
	        	if(a[j]>a[j+1])
	            {
	              temp=a[j];
	              a[j]=a[j+1];
	              a[j+1]=temp;
	            }
	        }

	        for(int j = n/2;j < n-1; j++)
	        {
	            if(a[j] < a[j+1])
	            {
	               temp=a[j];
	               a[j]=a[j+1];
	               a[j+1]=temp;
	            }
	         }
	      }

	      for(int i = 0; i < n; i++)
	         System.out.print(a[i] + " ");

	   }

 	    public static void main(String[] args) {
		int size,i,temp,j;
		Scanner sc=new Scanner(System.in);
		
		 System.out.print("Enter size of the array:");
	       int n = sc.nextInt();
	        int a[] = new int[n];
		System.out.println("Enter " +n+ " elements :");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Print 1st five in ascending order and remaining in descending order:");
		printOrder(a, n);

	}

}
