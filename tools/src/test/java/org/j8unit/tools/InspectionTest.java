package org.j8unit.tools;

import static org.junit.Assert.assertNotNull;
import java.lang.reflect.Method;
import org.junit.Test;

public class InspectionTest {

    static abstract interface FooInterface {
        public default void foobar() {};
    }
    static abstract class Foo {
        protected abstract void foobar();
    }
    static abstract class Bar extends Foo implements FooInterface {
    }

    @Test
    public void testViaFoo()
    throws Exception {
        final Method method = Foo.class.getDeclaredMethod("foobar");
        assertNotNull(method);
    }

    @Test
    public void testDeclaredViaBar()
    throws Exception {
        final Method method = Bar.class.getDeclaredMethod("foobar");
        assertNotNull(method);
    }

    @Test
    public void testViaBar()
    throws Exception {
        final Method method = Bar.class.getMethod("foobar");
        assertNotNull(method);
    }

}
