package by.academy.junit.testSuite;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

	@RunWith(Parameterized.class)
	public class MathTest2 extends Assert {

		private double expected;
		private double valueA;

		public MathTest2(double valueA, double expected) {
			this.expected = expected;
			this.valueA = valueA;
		}

		@Parameterized.Parameters(name = "{index}:log({0})={1}")
		public static Iterable<Object[]> dataForTest() {
			return Arrays.asList(new Object[][] { {5, 1.609}, { 10, 2.302}, { 15, 2.708} });
		}

		@Test
		public void testMathLog() {
			assertEquals(expected, Math.log(valueA), 0.001);
		}
	}

