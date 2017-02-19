package org.j8unit.runners;

import static org.junit.Assert.fail;
import static org.junit.Assume.assumeFalse;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class SomeIndependendTests {

    @Ignore
    @Test
    public void willBeIgnored()
    throws Exception {
        fail("FAILED!");
    }

    @Ignore("Explicitely ignored!")
    @Test
    public void willBeIgnoredToo()
    throws Exception {
        fail("FAILED!");
    }

    @Test
    public void willBeIgnoredIndirectly()
    throws Exception {
        assumeFalse("Indirectly ignored!", true);
    }

    @Test
    public void willFail()
    throws Exception {
        throw new UnsupportedOperationException();
    }

}
