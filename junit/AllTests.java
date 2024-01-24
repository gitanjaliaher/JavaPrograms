package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CountATest.class, SquareTest.class })
public class AllTests {
	public void test() {
		Square sq = new Square();
		int result = sq.square(3);
		assertEquals(9, result);
	}
	public void test1() {
		Square c = new Square();
		int result = c.countA("Gitanjali");
		assertEquals(2, result);
	}

}
