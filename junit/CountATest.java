package junit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		Square sq = new Square();
		int result = sq.countA("Gitanjali");
		assertEquals(2, result);
	}

}
