package by.academy.junit;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class TestRunner extends BlockJUnit4ClassRunner {

	private CalculatorTestListener testListener;

	public TestRunner(Class<CalculatorTestListener> clz) throws InitializationError {
		super(clz);
		testListener = new CalculatorTestListener();
	}

	@Override
	public void run(final RunNotifier notifier) {
		notifier.addListener(testListener);
		super.run(notifier);
	}
}
