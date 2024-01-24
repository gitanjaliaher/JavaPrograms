package arrayprogram;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i <n; i++)
        {
        	 a[i] = s.nextInt();
        }
       
        System.out.print("Even numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+" ");
            }
        }

	}

}
