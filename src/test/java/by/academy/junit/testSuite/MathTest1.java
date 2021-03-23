package by.academy.junit.testSuite;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MathTest1 extends Assert {

	private double valueA;
	private double expected;

	public MathTest1(double valueA, double expected) {
		this.expected = expected;
		this.valueA = valueA;
	}

	@Parameterized.Parameters(name = "{index}:Math.abs({0})={1}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { -5, 5 }, { 3, 3 }, { -11, 11 } });
	}

	@Test
	public void testMathAbs() {
		assertEquals(expected, Math.abs(valueA), 0);
	}
}
