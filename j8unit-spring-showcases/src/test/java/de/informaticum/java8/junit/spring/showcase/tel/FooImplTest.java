package de.informaticum.java8.junit.spring.showcase.tel;

import java.util.function.Supplier;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import de.informaticum.j8unit.spring.runners.J8SpringJUnit4ClassRunner;
import de.informaticum.java8.junit.spring.showcase.di.Foo;
import de.informaticum.java8.junit.spring.showcase.di.FooTest;
import de.informaticum.java8.junit.spring.showcase.di.SpringContext;


@RunWith(J8SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={SpringContext.class})
@TestExecutionListeners(listeners={SimpleTestExecutionListener.class})
public class FooImplTest implements FooTest {
	
	@Resource(name="fooImpl")
	private Foo subjectUnderTest;

	@Override
	public Supplier<Foo> subjectUnderTestFactory() {
		return () -> subjectUnderTest;
	}

	@Test
	public void testAsStringNotEmpty() {
		Assert.assertTrue(!subjectUnderTest.asString().isEmpty());
	}
}
