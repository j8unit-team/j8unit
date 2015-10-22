package org.j8unit.showcase.jm;

import java.util.List;
import org.j8unit.J8UnitTest;
import org.junit.Assert;
import org.junit.Test;

public interface ITest2
extends J8UnitTest<List<String>> {

    @Test
    public default void testConcat() {
        final List<String> sut = createNewSUT();
        assert sut != null;
        final int before = sut.size();
        sut.add("foobar");
        final int after = sut.size();
        Assert.assertEquals(before + 1, after);
        Assert.assertTrue(sut.contains("foobar"));
    }

    @Test
    public default void testClear() {
        final List<String> sut = createNewSUT();
        assert sut != null;
        sut.clear();
        Assert.assertEquals(0, sut.size());
        Assert.assertTrue(sut.isEmpty());
    }

}
