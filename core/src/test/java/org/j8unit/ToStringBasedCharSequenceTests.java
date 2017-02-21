package org.j8unit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ToStringBasedCharSequenceTests {

    @Parameters(name = "{index}: {0}")
    public static Object[] data() {
        return FailMessages.values();
    }

    @Parameter(0)
    public FailMessages fm;

    @Test
    public void testSubSequence()
    throws Exception {
        final String string = this.fm.toString();
        assertEquals(string, this.fm.subSequence(0, string.length()));
    }

    @Test
    public void testLength()
    throws Exception {
        final String string = this.fm.toString();
        assertEquals(string.length(), this.fm.length());
    }

    @Test
    public void testCharAt()
    throws Exception {
        final String string = this.fm.toString();
        assertEquals(string.charAt(0), this.fm.charAt(0));
    }

}
