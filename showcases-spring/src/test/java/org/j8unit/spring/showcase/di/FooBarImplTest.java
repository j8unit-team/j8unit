package org.j8unit.spring.showcase.di;

import javax.annotation.Resource;
import org.j8unit.spring.runners.J8SpringJUnit4;
import org.j8unit.spring.showcase.Buggy;
import org.j8unit.spring.showcase.TestContext;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@Category(Buggy.class)
@RunWith(J8SpringJUnit4.class)
@ContextConfiguration(classes = { TestContext.class })
public class FooBarImplTest
implements FooTest {

    @Resource(name = "foobarImpl")
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
