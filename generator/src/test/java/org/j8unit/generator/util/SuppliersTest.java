package org.j8unit.generator.util;

import static org.j8unit.generator.util.Suppliers.runtimed;
import static org.j8unit.generator.util.Suppliers.runtimify;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.io.IOException;
import org.junit.Test;

public class SuppliersTest {

    @Test(expected = NullPointerException.class)
    public void test_runtimify_null()
    throws Exception {
        runtimify(null);
    }

    @Test(expected = NullPointerException.class)
    public void test_runtimed_null()
    throws Exception {
        runtimed(null);
    }

    @Test
    public void test_runtimed_RE()
    throws Exception {
        try {
            runtimed(() -> Integer.parseInt("x"));
            fail("No RuntimeException was thrown!");
        } catch (final RuntimeException cause) {
            assertTrue(cause instanceof NumberFormatException);
        }
    }

    @Test
    public void test_runtimed_CE()
    throws Exception {
        try {
            runtimed(() -> {
                throw new IOException();
            });
            fail("No RuntimeException was thrown!");
        } catch (final RuntimeException re) {
            assertTrue(re.getCause() instanceof IOException);
        }
    }

}
