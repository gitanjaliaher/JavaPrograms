package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppleTest {

	@Test
	public void testCorrectColor() {
		Apple a = new Apple();
		a.setColor("green");
		assertTrue(a.checkColor());
	}
	
	@Test
	public void testWrongColor() {
		Apple a = new Apple();
		a.setColor("blue");
		assertFalse(a.checkColor());
	}

}
