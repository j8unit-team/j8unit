package org.j8unit.showcase.jm;

import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Test1
implements ITest1 {

    @Test
    public void testFoobar3() {
        final Foobar sut = new Foobar();
        // ...
        Assert.assertTrue(true);
    }

}
