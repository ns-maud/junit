package by.academy.junit.testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class TestSite {

	@RunWith(Suite.class)
	@Suite.SuiteClasses({ MathTest1.class, MathTest2.class })
	public class SuiteTestDemo {

	}
}
