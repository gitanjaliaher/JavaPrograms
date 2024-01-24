package junit;

public class Square {
	
	public int square(int a) {
		return a*a;
	}
	
	public int countA(String s) {
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'A') {
				count++;
			}
		}
		return count;
	}
}
