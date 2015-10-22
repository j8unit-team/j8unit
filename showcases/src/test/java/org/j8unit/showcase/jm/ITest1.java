package org.j8unit.showcase.jm;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public interface ITest1 {

    @Test
    public default void testConcat() {
        final List<String> sut = new ArrayList<>();
        final int before = sut.size();
        sut.add("foobar");
        final int after = sut.size();
        Assert.assertEquals(before + 1, after);
        Assert.assertTrue(sut.contains("foobar"));
    }

    @Test
    public default void testClear() {
        final List<String> sut = new ArrayList<>();
        sut.clear();
        Assert.assertEquals(0, sut.size());
        Assert.assertTrue(sut.isEmpty());
    }

}
