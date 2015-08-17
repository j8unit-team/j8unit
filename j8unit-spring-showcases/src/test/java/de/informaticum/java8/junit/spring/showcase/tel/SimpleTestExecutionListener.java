package de.informaticum.java8.junit.spring.showcase.tel;

import org.springframework.test.context.TestContext;
import org.springframework.test.context.TestExecutionListener;

public class SimpleTestExecutionListener implements TestExecutionListener {

	@Override
	public void beforeTestClass(TestContext testContext) throws Exception {
		System.out.println("beforeTestClass(" + testContext.getTestClass().getName() + ")");

	}

	@Override
	public void prepareTestInstance(TestContext testContext) throws Exception {
		System.out.println("prepareTestInstance(" + testContext.getTestInstance() + ")");
	}

	@Override
	public void beforeTestMethod(TestContext testContext) throws Exception {
		System.out.println("beforeTestMethod(" + testContext.getTestMethod() + ")");
	}

	@Override
	public void afterTestMethod(TestContext testContext) throws Exception {
		System.out.println("afterTestMethod(" + testContext.getTestMethod() + ")");
	}

	@Override
	public void afterTestClass(TestContext testContext) throws Exception {
		System.out.println("afterTestClass(" + testContext.getTestClass().getName() + ")");
	}

}
