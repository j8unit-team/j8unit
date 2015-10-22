package org.j8unit.spring.showcase.di;

import javax.annotation.Resource;
import org.j8unit.spring.runners.J8SpringJUnit4ClassRunner;
import org.j8unit.spring.showcase.SpringContext;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@RunWith(J8SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringContext.class })
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
