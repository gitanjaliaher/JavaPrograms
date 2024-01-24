package junit;

import static org.junit.Assert.*;

import org.junit.Test;

//Gitanjali Aher...
public class TestPerson {

	@Test
	public void testCorrectAge() {
		Person p1 = new Person();
		p1.setAge(20);
		assertTrue(p1.checkAge());
		}
		
	@Test
	public void testWrongAge() {
		Person p1 = new Person();
		p1.setAge(15);
		assertFalse(p1.checkAge());
	}

}
