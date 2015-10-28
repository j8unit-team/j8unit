package org.j8unit.showcase.jm.spring;

import javax.annotation.Resource;
import org.j8unit.showcase.jm.Foobar;
import org.j8unit.showcase.jm.ITest2;
import org.j8unit.spring.runners.J8SpringJUnit4;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@RunWith(J8SpringJUnit4.class)
@ContextConfiguration(classes = { TestContext.class })
public class SpringTest implements ITest2 {

    @Resource
    private Foobar sut; // injected

    @Override
    public Foobar createNewSUT() {
        return sut;
    }

    @Test
    public void testFoobar3() {
        final Foobar sut = createNewSUT();
        // ...
        Assert.assertTrue(true);
    }
}
