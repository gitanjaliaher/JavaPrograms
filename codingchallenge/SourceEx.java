/*
Q. Your task here is to implement a Java code based on the following specifications. 
Note that your code should match the specifications in a precise manner.
Consider default visibility of classes, data fields and methods unless mentioned otherwise.
Specifications:
class definitions:class Source:
visibility: public
method definition:
validate(String username, String password): method to authenticate username and password(Use custom values for username and password for authentication)
return type: boolean

Task
Create a Source class and implement below given method:
• validate(String username, String password): Use lambda expression to authenticate
username and password(Use custom values "ABC" for username and "DEF" as password for
authentication). Return true if authentication is successful else return false.
Implement using Lambda expressions.

Sample Input:
Alexa coded123

Sample Output:
false
*/

package codingchallenge;

@FunctionalInterface
interface AuthFun{
	boolean authenticate(String username, String password);
	
}

public class SourceEx {
	public boolean validate(String username, String password)
	{
		AuthFun a1 = (user,pass) -> user.equals("ABC") && pass.equals("DEF");
		return a1.authenticate(username, password); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SourceEx s = new SourceEx();
		String username = "Alexa";
		String password = "coded123";
		boolean result = s.validate(username, password);
		System.out.println(result);
	
	}
}
