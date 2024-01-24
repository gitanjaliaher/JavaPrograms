package classesandobject;

import java.util.Arrays;
import java.util.Scanner;

public class StringEx1 {
	
	String s1 = "Madam";
	String s2 = "Hello Everyone";
	String s3 = "My name is Gitanjali Aher. I have done my Master Degree in Computer Science.";
	String reverseStr = "";
	String s6 = "Pqrs";
	String s7 = "rspq";
	
	public void palindrome() {
		for(int i = s1.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + s1.charAt(i);
		}
		if(s1.equalsIgnoreCase(reverseStr)) {
			System.out.println("1) "+s1+" String is Palindrome String");
		}
		else {
			System.out.println("1) "+s1+" String is not Palindrome String.");
		}
	}
	
	public void remove() {
		s2 = s2.replace("e","");
		System.out.println("2) Remove Character from String Hello Everyone :  "+s2);
		
	}
	
	public void countWord() {
		String splitedString[] = s3.split(" ");
		System.out.println("3) Count number of Words in String : "+splitedString.length);
		
	}
	
	public void vowelConsonent() {
		
		int vowel = 0, consonent = 0;
		s3 = s3.toLowerCase();
		
		for(int i = 0; i < s3.length(); i++) {
			if(s3.charAt(i) ==  'a' || s3.charAt(i) == 'e' || s3.charAt(i) == 'i' || s3.charAt(i) == 'o' || s3.charAt(i) == 'u') {
				vowel++;
			}
			
			else if(s3.charAt(i) >= 'a' && s3.charAt(i) <= 'z') {
				consonent++;
			}
		}
		System.out.println("4) No of Vowels : "+vowel);
		System.out.println("   No of Consonents : "+consonent);
	}
	
	public void largeSmall() {
		String word = "", small = "", large = "";
		String[] words = new String[100];
		int len = 0;
		
		s3 = s3 + "";
		
		for(int i = 0; i < s3.length(); i++) {
			if(s3.charAt(i) != ' ') {
				word = word +s3.charAt(i);
			}
			
			else {
				words[len] = word;
				len++;
				word = "";
			}
		}
		
		small = large = words[0];
		
		for(int j = 0; j < len; j++) {
			if(small.length() > words[j].length()) {
				small = words[j];
			}
			if(large.length() < words[j].length()) {
				large = words[j];
			}
			
		}
		
		System.out.println("5) Largest words from given String : "+large);
		System.out.println("   Smallest words from given String : "+small);
		
	}
	
	public void frequency(String s4, char character) {
		int count = 0;
        String s5=s4.toLowerCase();
	      for (int i=0; i<s5.length(); i++){
	         if(character == s5.charAt(i)){
	            count++;
	         }
	      }
	      System.out.println("Frequency of given character is : "+count);
		
	}

	public void anagram() {
		 if(s6.length() == s7.length()) {

		      // convert strings to char array
		      char[] charArray1 = s6.toLowerCase().toCharArray();
		      char[] charArray2 = s7.toLowerCase().toCharArray();

		      // sort the char array
		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);

		      // if sorted char arrays are same
		      // then the string is anagram
		      boolean result = Arrays.equals(charArray1, charArray2);
		      if(result) {
		          System.out.println(s6 + " and " + s7 + " are anagram.");
		        }
		        else {
		          System.out.println(s6 + " and " + s7 + " are not anagram.");
		        }
		      }
		      else {
		        System.out.println(s6 + " and " + s7 + " are not anagram.");
		      }
		 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringEx1 str = new StringEx1();
		Scanner sc=new Scanner(System.in);
		str.palindrome();
		str.remove();
		str.countWord();
		str.vowelConsonent();
		str.largeSmall();
		System.out.println("6) frequency of characters : ");
		System.out.println("Enter the String: ");
	    String s4 = sc.nextLine();
		System.out.println("Enter the character : ");
	    char character = sc.nextLine().charAt(0);	
		str.frequency(s4, character);
		System.out.println("7) frequency of characters : ");
		str.anagram();
		
	}
}
