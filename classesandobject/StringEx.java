package classesandobject;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("Hello Everyone");
		System.out.println(s1);
		
		String s2 = "Welcome";
		System.out.println(s2);
		
		String s3 = "WELCOME";
		
		String s4 = "                 Hello Good Morning                  ";
		
		String s5 = "This is the example of split function";
		
		//String Methods or functions
		System.out.println("Length : "+s2.length());
		
		System.out.println("charAt(3) : "+s2.charAt(3));
		
		System.out.println("Substring : "+s2.substring(3));
		
		System.out.println("Substring : "+s2.substring(0, 3));
		
		System.out.println("Contains c : "+s2.contains("c"));
		
		System.out.println("contains x : "+s2.contains("x"));
		
		System.out.println("String is Empty : "+s2.isEmpty());
		
		System.out.println("isBlank : "+s2.isBlank());
				
		System.out.println("indexOf e : "+s2.indexOf("e"));
		
		System.out.println("indexOf e from 3rd char : "+s2.indexOf("e", 3));
		
		System.out.println("lastIndexOf : "+s2.lastIndexOf("e"));
		
		System.out.println("two string are equal or not : "+s2.equals(s1));
		
		System.out.println("two string are equal or not : "+s2.equals(s3));
		
		System.out.println("two string are equal or not using equalIgnoreCase : "+s2.equalsIgnoreCase(s3));
		
		System.out.println("Concatinate : "+s2.concat(" User"));
		
		System.out.println(s2);   //string is immutable cannot change
		
		s2 = s2.concat(" User");   //but using replacing string we can change string
		
		System.out.println(s2);
		
		System.out.println("Replace Character : "+s2.replace("e", "a"));
		
		System.out.println("Upper Case : "+s2.toUpperCase());
		
		System.out.println("Lower Case : "+s3.toLowerCase());
		
		System.out.println("String before Trim() : "+s4.length());
		
		s4 = s4.trim();//remove leading and trailing spaces
		
		System.out.println("String after Trim() : "+s4.length());
		
		String splitedString[] = s5.split(" ");
		System.out.println("Count of Words : "+splitedString.length);
		
		//String Buffer
		StringBuffer buffer = new StringBuffer("String Buffer Example");
		System.out.println(buffer);
		
		//String Builder
		StringBuilder builder = new StringBuilder("String Biulder Example");
		System.out.println(builder);

	}

}
