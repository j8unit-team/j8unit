package org.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class VerifySimilarFailMessageFormattingTest {

    private static final String message = "Ups! This went wrong...";

    private static final Object foo = new Object();

    private static final Object bar = new Object();

    private static final double foz = 3.1;

    private static final double baz = 3.14;

    private static final double withDelta = 0.1;

    private static final double withoutDelta = 0.0;

    private static final String pi = "3.14";

    private static final String nothing = "null";

    @Test
    public void testMessageFormatting_Fail_1()
    throws Exception {
        try {
            Assert.fail(null);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.fail(() -> null);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_Fail_2()
    throws Exception {
        try {
            Assert.fail(message);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.fail(message::toString);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotNull_1()
    throws Exception {
        try {
            Assert.assertNull(null, foo);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertNull(() -> null, foo);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotNull_2()
    throws Exception {
        try {
            Assert.assertNull(message, foo);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertNull(message::toString, foo);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailSame_1()
    throws Exception {
        try {
            Assert.assertNotSame(null, foo, foo);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertNotSame(() -> null, foo, foo);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailSame_2()
    throws Exception {
        try {
            Assert.assertNotSame(message, foo, foo);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertNotSame(message::toString, foo, foo);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotSame_1()
    throws Exception {
        try {
            Assert.assertSame(null, foo, bar);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertSame(() -> null, foo, bar);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotSame_2()
    throws Exception {
        try {
            Assert.assertSame(message, foo, bar);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertSame(message::toString, foo, bar);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailEquals_1()
    throws Exception {
        try {
            Assert.assertNotEquals(null, foo, foo);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertNotEquals(() -> null, foo, foo);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailEquals_2()
    throws Exception {
        try {
            Assert.assertNotEquals(message, foo, foo);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertNotEquals(message::toString, foo, foo);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailEquals_3()
    throws Exception {
        try {
            Assert.assertNotEquals(null, foz, foz, withoutDelta);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertNotEquals(() -> null, foz, foz, withoutDelta);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailEquals_4()
    throws Exception {
        try {
            Assert.assertNotEquals(message, foz, foz, withoutDelta);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertNotEquals(message::toString, foz, foz, withoutDelta);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailEquals_5()
    throws Exception {
        try {
            Assert.assertNotEquals(null, foz, baz, withDelta);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertNotEquals(() -> null, foz, baz, withDelta);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailEquals_6()
    throws Exception {
        try {
            Assert.assertNotEquals(message, foz, baz, withDelta);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertNotEquals(message::toString, foz, baz, withDelta);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotEquals_1()
    throws Exception {
        try {
            Assert.assertEquals(null, foo, bar);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertEquals(() -> null, foo, bar);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotEquals_2()
    throws Exception {
        try {
            Assert.assertEquals(message, foo, bar);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertEquals(message::toString, foo, bar);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotEquals_3()
    throws Exception {
        try {
            Assert.assertEquals(null, foz, baz, withoutDelta);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertEquals(() -> null, foz, baz, withoutDelta);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotEquals_4()
    throws Exception {
        try {
            Assert.assertEquals(message, foz, baz, withoutDelta);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertEquals(message::toString, foz, baz, withoutDelta);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotEquals_5()
    throws Exception {
        try {
            Assert.assertEquals(null, baz, pi);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertEquals(() -> null, baz, pi);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotEquals_6()
    throws Exception {
        try {
            Assert.assertEquals(message, baz, pi);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertEquals(message::toString, baz, pi);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotEquals_7()
    throws Exception {
        try {
            Assert.assertEquals(null, null, nothing);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertEquals(() -> null, null, nothing);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

    @Test
    public void testMessageFormatting_FailNotEquals_8()
    throws Exception {
        try {
            Assert.assertEquals(message, null, nothing);
        } catch (final AssertionError junit) {
            try {
                SupplierBasedAssert.assertEquals(message::toString, null, nothing);
            } catch (final AssertionError j8unit) {
                assertEquals(junit.getMessage(), j8unit.getMessage());
                return;
            }
        }
        fail();
    }

}
