package codingchallenge;

import codingchallenge.MySource;

/*   Created by Gitanjali Aher   */

public class MySource {
	
	public void checkAge(int age) throws MyException {
		if(age<15) {
			throw new MyException("Invalid");
		}
		else {
			System.out.println("Valid");
		}
	}

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		MySource s1 = new MySource();
		/*Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();*/
		s1.checkAge(22);
	}
}