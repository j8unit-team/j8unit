package org.j8unit.showcase.jm;

import org.junit.Assert;
import org.junit.Test;

public abstract class ExtendableTests {

    protected abstract Foobar createNewSUT();

    @Test
    public void testFoobar1() {
        final Foobar sut = this.createNewSUT();
        assert sut != null;
        // ...
        Assert.assertTrue(true);
    }

    @Test
    public void testFoobar2() {
        final Foobar sut = this.createNewSUT();
        assert sut != null;
        // ...
        Assert.assertTrue(true);
    }

}
