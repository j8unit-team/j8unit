package org.junit;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class VerifySimilarFailMessageFormattingTest {

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

    private static final double withDelta = 0.1;

    private static final double withoutDelta = 0.0;

    private static final String pi = "3.14";

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
        final AssertionError junit = crash(() -> Assert.fail(this.message));
        final AssertionError j8unit = crash(() -> SupplierBasedAssert.fail(() -> this.message));
        assertEquals(junit.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailNotNullViaAssertNull()
    throws Exception {
        final AssertionError junit = crash(() -> Assert.assertNull(this.message, foo));
        final AssertionError j8unit = crash(() -> SupplierBasedAssert.assertNull(() -> this.message, foo));
        assertEquals(junit.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailSameViaAssertNotSame()
    throws Exception {
        final AssertionError junit = crash(() -> Assert.assertNotSame(this.message, foo, foo));
        final AssertionError j8unit = crash(() -> SupplierBasedAssert.assertNotSame(() -> this.message, foo, foo));
        assertEquals(junit.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailNotSameViaAssertSame()
    throws Exception {
        final AssertionError junit = crash(() -> Assert.assertSame(this.message, foo, bar));
        final AssertionError j8unit = crash(() -> SupplierBasedAssert.assertSame(() -> this.message, foo, bar));
        assertEquals(junit.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailEqualsViaAssertNotEquals()
    throws Exception {
        final AssertionError junit = crash(() -> Assert.assertNotEquals(this.message, foo, foo));
        final AssertionError j8unit = crash(() -> SupplierBasedAssert.assertNotEquals(() -> this.message, foo, foo));
        assertEquals(junit.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailEqualsViaAssertNotEqualsWithoutDelta()
    throws Exception {
        final AssertionError junit = crash(() -> Assert.assertNotEquals(this.message, foz, foz, withoutDelta));
        final AssertionError j8unit = crash(() -> SupplierBasedAssert.assertNotEquals(() -> this.message, foz, foz, withoutDelta));
        assertEquals(junit.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailEqualsViaAssertNotEqualsWithDelta()
    throws Exception {
        final AssertionError junit = crash(() -> Assert.assertNotEquals(this.message, foz, baz, withDelta));
        final AssertionError j8unit = crash(() -> SupplierBasedAssert.assertNotEquals(() -> this.message, foz, baz, withDelta));
        assertEquals(junit.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailNotEqualsViaAssertEquals()
    throws Exception {
        final AssertionError junit = crash(() -> Assert.assertEquals(this.message, foo, bar));
        final AssertionError j8unit = crash(() -> SupplierBasedAssert.assertEquals(() -> this.message, foo, bar));
        assertEquals(junit.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailNotEqualsViaAssertEqualsWithoutDelta()
    throws Exception {
        final AssertionError junit = crash(() -> Assert.assertEquals(this.message, foz, baz, withoutDelta));
        final AssertionError j8unit = crash(() -> SupplierBasedAssert.assertEquals(() -> this.message, foz, baz, withoutDelta));
        assertEquals(junit.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailNotEqualsViaAssertEquals_DoubleVersusString()
    throws Exception {
        final AssertionError junit = crash(() -> Assert.assertEquals(this.message, baz, pi));
        final AssertionError j8unit = crash(() -> SupplierBasedAssert.assertEquals(() -> this.message, baz, pi));
        assertEquals(junit.getMessage(), j8unit.getMessage());
    }

    @Test
    public void testEqualMessageFormattingOfFailNotEquals_NullVersusStringNull()
    throws Exception {
        final AssertionError junit = crash(() -> Assert.assertEquals(this.message, null, nothing));
        final AssertionError j8unit = crash(() -> SupplierBasedAssert.assertEquals(() -> this.message, null, nothing));
        assertEquals(junit.getMessage(), j8unit.getMessage());
    }

}
