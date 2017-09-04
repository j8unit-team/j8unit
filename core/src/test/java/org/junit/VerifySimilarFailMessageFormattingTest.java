package org.junit;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class VerifySimilarFailMessageFormattingTest {

    @Parameters(name = "message: <{0}>")
    public static Iterable<String> data() {
        return asList("Ups! This went wrong...", " Ups! This went wrong...", "Ups! This went wrong... ", "", " ", "null", null);
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

    @Test
    public void testMessageFormatting_Fail()
    throws Exception {
        try {
            Assert.fail(this.message);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.fail(() -> this.message);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotNull()
    throws Exception {
        try {
            Assert.assertNull(this.message, foo);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertNull(() -> this.message, foo);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailSame()
    throws Exception {
        try {
            Assert.assertNotSame(this.message, foo, foo);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertNotSame(() -> this.message, foo, foo);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotSame()
    throws Exception {
        try {
            Assert.assertSame(this.message, foo, bar);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertSame(() -> this.message, foo, bar);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailEquals()
    throws Exception {
        try {
            Assert.assertNotEquals(this.message, foo, foo);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertNotEquals(() -> this.message, foo, foo);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailEqualsWithoutDelta()
    throws Exception {
        try {
            Assert.assertNotEquals(this.message, foz, foz, withoutDelta);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertNotEquals(() -> this.message, foz, foz, withoutDelta);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailEqualsWithDelta()
    throws Exception {
        try {
            Assert.assertNotEquals(this.message, foz, baz, withDelta);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertNotEquals(() -> this.message, foz, baz, withDelta);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotEquals()
    throws Exception {
        try {
            Assert.assertEquals(this.message, foo, bar);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertEquals(() -> this.message, foo, bar);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotEqualsWithoutDelta()
    throws Exception {
        try {
            Assert.assertEquals(this.message, foz, baz, withoutDelta);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertEquals(() -> this.message, foz, baz, withoutDelta);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotEqualsWithDelta()
    throws Exception {
        try {
            Assert.assertEquals(this.message, baz, pi);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertEquals(() -> this.message, baz, pi);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotEquals_NullVersusStringNull()
    throws Exception {
        try {
            Assert.assertEquals(this.message, null, nothing);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertEquals(() -> this.message, null, nothing);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

}
