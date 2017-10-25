package org.j8unit.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.j8unit.util.helper.FailMessages;

@RunWith(Parameterized.class)
public class ToStringBasedCharSequenceTests {

    @Parameters(name = "{index}: {0}")
    public static ToStringBasedCharSequence[] testParameters() {
        return FailMessages.values();
    }

    @Parameter(0)
    public ToStringBasedCharSequence seq;

    @Test
    public void testSubSequence()
    throws Exception {
        final String string = this.seq.toString();
        assertEquals(string, this.seq.subSequence(0, string.length()));
    }

    @Test
    public void testLength()
    throws Exception {
        final String string = this.seq.toString();
        assertEquals(string.length(), this.seq.length());
    }

    @Test
    public void testCharAt()
    throws Exception {
        final String string = this.seq.toString();
        assertEquals(string.charAt(0), this.seq.charAt(0));
    }

}
