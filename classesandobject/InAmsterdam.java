package classesandobject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InAmsterdam {
	
	public static int countAm(String str) {
		int result = 0;
		String count[] = str.split(" ");
		for(int i = 0; i < count.length; i++) {
			if(count[i].equalsIgnoreCase("am")) {
				result = result + 1;
			}
		}
		 return result;	
	}
	
	public class Source{
		public static void main(String[] args) throws Exception{
			BufferedReader sc = new BufferedReader(new InputStreamReader(null));
		}
	}

}
