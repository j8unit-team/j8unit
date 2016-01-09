package org.j8unit.tools.util;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.toList;
import static org.j8unit.tools.util.Utilities.capFirst;
import static org.j8unit.tools.util.Utilities.optionalise;
import static org.j8unit.tools.util.Utilities.runtimed;
import static org.j8unit.tools.util.Utilities.runtimify;
import static org.j8unit.tools.util.Utilities.toStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;
import javax.xml.ws.Holder;
import org.junit.Test;

public class UtilitiesTest {

    @Test(expected = NullPointerException.class)
    public void test_capFirst_null()
    throws Exception {
        capFirst(null);
    }

    @Test
    public void test_capFirst()
    throws Exception {
        assertEquals("", capFirst(""));
        assertEquals("Hello world!", capFirst("hello world!"));
        assertEquals("Hello world!", capFirst("Hello world!"));
        assertEquals(" hello world!", capFirst(" hello world!"));
    }

    @Test(expected = NullPointerException.class)
    public void testOptionalise_null_null()
    throws Exception {
        optionalise(null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testOptionalise_null_valid()
    throws Exception {
        optionalise(null, e -> {});
    }

    @Test(expected = NullPointerException.class)
    public void testOptionalise_valid_null()
    throws Exception {
        optionalise(String::new, null);
    }

    @Test
    public void testOptionalise()
    throws Exception {
        final Holder<Exception> holder = new Holder<>(null);
        assert holder.value == null;

        final Optional<String> o1 = optionalise(String::new, e -> holder.value = e);
        assertNotNull(o1);
        assertTrue(o1.isPresent());
        assertEquals(new String(), o1.get());
        assertNull(holder.value);

        final Optional<Integer> o2 = optionalise(() -> Integer.parseInt("x"), e -> holder.value = e);
        assertNotNull(o2);
        assertFalse(o2.isPresent());
        assertNotNull(holder.value);
        assertTrue(holder.value instanceof NumberFormatException);
    }

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

    @Test
    @SuppressWarnings("deprecation")
    public void testToStream()
    throws Exception {
        final Stream<Object> s1 = toStream(Optional.empty());
        assertNotNull(s1);
        assertEquals(emptyList(), s1.collect(toList()));

        final Stream<Object> s2 = toStream(Optional.ofNullable(null));
        assertNotNull(s2);
        assertEquals(emptyList(), s2.collect(toList()));

        final Stream<Object> s3 = toStream(Optional.of("Hello"));
        assertNotNull(s3);
        assertEquals(singletonList("Hello"), s3.collect(toList()));
    }

}
