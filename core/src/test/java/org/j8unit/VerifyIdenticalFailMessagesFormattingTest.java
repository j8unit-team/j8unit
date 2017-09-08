package org.j8unit;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class VerifyIdenticalFailMessagesFormattingTest {

    @Parameters(name = "message: <{0}>")
    public static List<String> data() {
        return asList("Ups! This went wrong...", " Ups! This went wrong...", "Ups! This went wrong... ", " Ups! This went wrong... ", "", " ", "null", null);
    }

    @Parameter(0)
    public String message;

    private static final Object foo = new Object();

    private static final Object bar = new Object();

    private static final double foz = 3.1;

    private static final double baz = 3.14;

    private static final double withSufficientDelta = 0.1;

    private static final double withInsufficientDelta = 0.0;

    private static final String nothing = "null";

    private static AssertionError crash(final Runnable exec) {
        try {
            exec.run();
        } catch (final AssertionError expected) {
            return expected;
        }
        throw new AssertionError("This test failed by skipping some intended exceptional cases!");
    }

    @Test
    public void testEqualMessageFormattingOfFail()
    throws Exception {
        final AssertionError junit4 = crash(() -> org.junit.Assert.fail(this.message));
        final AssertionError j8unit = crash(() -> org.j8unit.Assert.fail(() -> this.message));
        assertEquals(junit4.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailNotNullViaAssertNull()
    throws Exception {
        final AssertionError junit4 = crash(() -> org.junit.Assert.assertNull(this.message, foo));
        final AssertionError j8unit = crash(() -> org.j8unit.Assert.assertNull(() -> this.message, foo));
        assertEquals(junit4.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailSameViaAssertNotSame()
    throws Exception {
        final AssertionError junit4 = crash(() -> org.junit.Assert.assertNotSame(this.message, foo, foo));
        final AssertionError j8unit = crash(() -> org.j8unit.Assert.assertNotSame(() -> this.message, foo, foo));
        assertEquals(junit4.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailNotSameViaAssertSame()
    throws Exception {
        final AssertionError junit4 = crash(() -> org.junit.Assert.assertEquals(this.message, foo, bar));
        final AssertionError j8unit = crash(() -> org.j8unit.Assert.assertEquals(() -> this.message, foo, bar));
        assertEquals(junit4.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailEqualsViaAssertNotEquals()
    throws Exception {
        final AssertionError junit4 = crash(() -> org.junit.Assert.assertNotEquals(this.message, foo, foo));
        final AssertionError j8unit = crash(() -> org.j8unit.Assert.assertNotEquals(() -> this.message, foo, foo));
        assertEquals(junit4.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailEqualsViaAssertNotEqualsWithInsufficientDelta()
    throws Exception {
        final AssertionError junit4 = crash(() -> org.junit.Assert.assertNotEquals(this.message, foz, foz, withInsufficientDelta));
        final AssertionError j8unit = crash(() -> org.j8unit.Assert.assertNotEquals(() -> this.message, foz, foz, withInsufficientDelta));
        assertEquals(junit4.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailEqualsViaAssertNotEqualsWithSufficientDelta()
    throws Exception {
        final AssertionError junit4 = crash(() -> org.junit.Assert.assertNotEquals(this.message, foz, baz, withSufficientDelta));
        final AssertionError j8unit = crash(() -> org.j8unit.Assert.assertNotEquals(() -> this.message, foz, baz, withSufficientDelta));
        assertEquals(junit4.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailNotEqualsViaAssertEquals()
    throws Exception {
        final AssertionError junit4 = crash(() -> org.junit.Assert.assertEquals(this.message, foo, bar));
        final AssertionError j8unit = crash(() -> org.j8unit.Assert.assertEquals(() -> this.message, foo, bar));
        assertEquals(junit4.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailNotEqualsViaAssertEqualsWithInsufficientDelta()
    throws Exception {
        final AssertionError junit4 = crash(() -> org.junit.Assert.assertEquals(this.message, foz, baz, withInsufficientDelta));
        final AssertionError j8unit = crash(() -> org.j8unit.Assert.assertEquals(() -> this.message, foz, baz, withInsufficientDelta));
        assertEquals(junit4.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailNotEqualsViaAssertEquals_DoubleVersusString()
    throws Exception {
        final AssertionError junit4 = crash(() -> org.junit.Assert.assertEquals(this.message, baz, Double.toString(baz)));
        final AssertionError j8unit = crash(() -> org.j8unit.Assert.assertEquals(() -> this.message, baz, Double.toString(baz)));
        assertEquals(junit4.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailNotEquals_NullVersusStringNull()
    throws Exception {
        final AssertionError junit4 = crash(() -> org.junit.Assert.assertEquals(this.message, null, nothing));
        final AssertionError j8unit = crash(() -> org.j8unit.Assert.assertEquals(() -> this.message, null, nothing));
        assertEquals(junit4.getMessage(), j8unit.getMessage());
    }

}
