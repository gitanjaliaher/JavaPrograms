package junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//Gitanjali Aher
public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Result result = JUnitCore.runClasses(SquareTest.class, CountATest.class, AppleTest.class);
		
		//Result result = JUnitCore.runClasses(AnnotationTest.class);
		
		//Result result = JUnitCore.runClasses(TestPerson.class);
		
		Result result = JUnitCore.runClasses(TestLogin.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure);
		}
		System.out.println("result is successful : "+result.wasSuccessful());

	}

}
