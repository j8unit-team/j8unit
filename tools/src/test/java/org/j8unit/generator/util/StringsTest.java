package org.j8unit.generator.util;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singleton;
import static org.j8unit.generator.util.Strings.capFirst;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringsTest {

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

    @Test
    public void test_csv()
    throws Exception {
        assertEquals("", Strings.csv(emptyList()));
        assertEquals("Foo", Strings.csv(singleton("Foo")));
        assertEquals("Foo, Bar", Strings.csv(asList("Foo", "Bar")));
    }

    @Test
    public void test_bscv()
    throws Exception {
        assertEquals("", Java.diamond(emptyList()));
        assertEquals("<Foo>", Java.diamond(singleton("Foo")));
        assertEquals("<Foo, Bar>", Java.diamond(asList("Foo", "Bar")));
    }

}
