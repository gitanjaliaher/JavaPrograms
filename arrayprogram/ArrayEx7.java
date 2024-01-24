package arrayprogram;

import java.util.Scanner;

public class ArrayEx7 {

		public int getLowest(int[] arr) {
			
			int low=arr[0];
			for(int i = 0; i < arr.length; i++)
			{
				if(arr[i] < low)
				{
					low = arr[i];
				}
				
				
			}
			return low;
		}

		public int getHighest(int[] arr) {
			int high =arr[0];
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > high)
				{
					high = arr[i];
				}
				
			}
			return high;
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayEx7 ex = new ArrayEx7();
			int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter size of the array:");
	        n = s.nextInt();
	        int array[] = new int[n];
	        System.out.println("Enter array elements:");
	        for(int i = 0; i <n; i++)
	        {
	        	 array[i] = s.nextInt();
	        }
			
			int Lowest = ex.getLowest(array);
			System.out.println("Lowest Element in array : " +Lowest);
			
			int Highest = ex.getHighest(array);
			System.out.println("Highest Element in array : "+Highest);

	}

}
