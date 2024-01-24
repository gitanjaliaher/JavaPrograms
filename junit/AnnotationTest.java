package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationTest {

	@Test
	public void test1() {
		System.out.println("Test case 1 : inside test case");
	}
	
	@Test
	public void test2() {
		System.out.println("Test case 2 : inside test case");
	}
	
	@Before
	public void before() {
		System.out.println("inside before");
	}
	
	@After
	public void after() {
		System.out.println("inside after");
	}
	
	@Test
//	@org.junit.Ignore
	public void Ignore() {
		System.out.println("inside Ignore, i will not execute");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("inside before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("inside After class");
	}

}
