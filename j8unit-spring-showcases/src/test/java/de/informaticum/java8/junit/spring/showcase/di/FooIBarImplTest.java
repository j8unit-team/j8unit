package de.informaticum.java8.junit.spring.showcase.di;

import java.util.function.Supplier;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import de.informaticum.j8unit.spring.runners.J8SpringJUnit4ClassRunner;
import de.informaticum.java8.junit.spring.showcase.di.Foo;


@RunWith(J8SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={SpringContext.class})
public class FooIBarImplTest implements FooTest {
	
	@Resource(name="foobarImpl")
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
