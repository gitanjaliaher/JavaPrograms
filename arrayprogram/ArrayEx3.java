package arrayprogram;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,mul=1,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        n = s.nextInt();
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
            	 sum = sum + a[i];
       
            }
        }
        System.out.println("Sum of even element of array is:"+sum);
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 != 0)
            {
            	 mul = mul * a[i];
       
            }
        }
        System.out.println("Multiplication of odd element of array is:"+mul);

	}

}
