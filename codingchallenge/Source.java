package codingchallenge;

import java.util.Scanner;

public class Source {
	
	public int getSecondSmallest(int[] arr) {
		int temp, i, j;
		for(i = 0; i < arr.length; i++) {
			for(j = i + 1; j < arr.length; j++ ) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source source = new Source();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int a[] = new int[n];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int output = source.getSecondSmallest(a);
		System.out.println(output);
		sc.close();
	}

}

