package org.j8unit.spring.showcase.tel;

import javax.annotation.Resource;
import org.j8unit.spring.runners.J8SpringJUnit4;
import org.j8unit.spring.showcase.TestContext;
import org.j8unit.spring.showcase.di.Foo;
import org.j8unit.spring.showcase.di.FooTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(J8SpringJUnit4.class)
@ContextConfiguration(classes = { TestContext.class })
@TestExecutionListeners(listeners = { SimpleTestExecutionListener.class, DependencyInjectionTestExecutionListener.class })
public class FooImplTest
implements FooTest {

    @Resource(name = "fooImpl")
    private Foo subjectUnderTest;

    @Override
    public Foo createNewSUT() {
        return this.subjectUnderTest;
    }

    @Test
    public void testAsStringNotEmpty() {
        Assert.assertTrue(!this.subjectUnderTest.asString().isEmpty());
    }
}
