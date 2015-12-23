package org.j8unit.tools;

import static org.j8unit.tools.GeneratorSetup.baseComponentTypeOf;
import static org.j8unit.tools.GeneratorSetup.javadocNameOf;
import static org.j8unit.tools.GeneratorUtil.optionalise;
import static org.j8unit.tools.GeneratorUtil.tryLoadClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.junit.Test;

/**
 * @see org.j8unit.tools.CombinedTests
 * @see org.j8unit.tools.CombinedTests.Nested
 * @see org.j8unit.tools.CombinedTests.PrivateNested
 */
public class CombinedTests {

    @Test
    public void testTopLevelClass()
    throws Exception {
        final Class<?> clazz = CombinedTests.class;
        assertTrue(ClassKind.TOP_LEVEL.matches(clazz));
        assertFalse(ClassKind.NESTED.matches(clazz));
        assertFalse(ClassKind.INNER.matches(clazz));
        assertFalse(ClassKind.LOCAL.matches(clazz));
        assertFalse(ClassKind.ANONYMOUS.matches(clazz));
        assertEquals(ClassKind.TOP_LEVEL, ClassKind.kindOf(clazz));

        assertTrue(AccessLevel.PUBLIC.matches(clazz));
        assertFalse(AccessLevel.PACKAGE_PRIVATE.matches(clazz));
        assertFalse(AccessLevel.PROTECTED.matches(clazz));
        assertFalse(AccessLevel.PRIVATE.matches(clazz));
        assertEquals(AccessLevel.PUBLIC, AccessLevel.accessModifierOf(clazz));
    }

    static class Nested {
    }

    private static class PrivateNested {

        @Override
        public String toString() {
            return super.toString();
        }

        /**
         * @see #bar(X509Certificate[], String, java.util.Map.Entry...)
         */
        public <T, X extends X509Certificate> Map.Entry<T, List<byte[]>> foo(final X[] certs, final String foo, final String... bar) {
            return null;
        }

        @SuppressWarnings("unchecked")
        public <T, X extends X509Certificate> boolean bar(final X[] certs, final String foo, final Map.Entry<T, List<byte[]>>... bar) {
            return true;
        }
    }

    @Test
    public void testNestedClass()
    throws Exception {
        {
            final Class<?> clazz = Nested.class;
            assertFalse(ClassKind.TOP_LEVEL.matches(clazz));
            assertTrue(ClassKind.NESTED.matches(clazz));
            assertFalse(ClassKind.INNER.matches(clazz));
            assertFalse(ClassKind.LOCAL.matches(clazz));
            assertFalse(ClassKind.ANONYMOUS.matches(clazz));
            assertEquals(ClassKind.NESTED, ClassKind.kindOf(clazz));

            assertFalse(AccessLevel.PUBLIC.matches(clazz));
            assertTrue(AccessLevel.PACKAGE_PRIVATE.matches(clazz));
            assertFalse(AccessLevel.PROTECTED.matches(clazz));
            assertFalse(AccessLevel.PRIVATE.matches(clazz));
            assertEquals(AccessLevel.PACKAGE_PRIVATE, AccessLevel.accessModifierOf(clazz));
        }
        {
            final Class<?> clazz = PrivateNested.class;
            assertFalse(ClassKind.TOP_LEVEL.matches(clazz));
            assertTrue(ClassKind.NESTED.matches(clazz));
            assertFalse(ClassKind.INNER.matches(clazz));
            assertFalse(ClassKind.LOCAL.matches(clazz));
            assertFalse(ClassKind.ANONYMOUS.matches(clazz));
            assertEquals(ClassKind.NESTED, ClassKind.kindOf(clazz));

            assertFalse(AccessLevel.PUBLIC.matches(clazz));
            assertFalse(AccessLevel.PACKAGE_PRIVATE.matches(clazz));
            assertFalse(AccessLevel.PROTECTED.matches(clazz));
            assertTrue(AccessLevel.PRIVATE.matches(clazz));
            assertEquals(AccessLevel.PRIVATE, AccessLevel.accessModifierOf(clazz));
        }
    }

    protected abstract class Inner
    extends PrivateNested {

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }

    @Test
    public void testInnerClass()
    throws Exception {
        final Class<?> clazz = Inner.class;
        assertFalse(ClassKind.TOP_LEVEL.matches(clazz));
        assertFalse(ClassKind.NESTED.matches(clazz));
        assertTrue(ClassKind.INNER.matches(clazz));
        assertFalse(ClassKind.LOCAL.matches(clazz));
        assertFalse(ClassKind.ANONYMOUS.matches(clazz));
        assertEquals(ClassKind.INNER, ClassKind.kindOf(clazz));

        assertFalse(AccessLevel.PUBLIC.matches(clazz));
        assertFalse(AccessLevel.PACKAGE_PRIVATE.matches(clazz));
        assertTrue(AccessLevel.PROTECTED.matches(clazz));
        assertFalse(AccessLevel.PRIVATE.matches(clazz));
        assertEquals(AccessLevel.PROTECTED, AccessLevel.accessModifierOf(clazz));
    }

    @Test
    public void testLocalClass()
    throws Exception {
        class Local {
        }
        final class Local2
        extends Local {
        }

        {
            final Class<?> clazz = Local.class;
            assertFalse(ClassKind.TOP_LEVEL.matches(clazz));
            assertFalse(ClassKind.NESTED.matches(clazz));
            assertFalse(ClassKind.INNER.matches(clazz));
            assertTrue(ClassKind.LOCAL.matches(clazz));
            assertFalse(ClassKind.ANONYMOUS.matches(clazz));
            assertEquals(ClassKind.LOCAL, ClassKind.kindOf(clazz));

            assertFalse(AccessLevel.PUBLIC.matches(clazz));
            assertTrue(AccessLevel.PACKAGE_PRIVATE.matches(clazz));
            assertFalse(AccessLevel.PROTECTED.matches(clazz));
            assertFalse(AccessLevel.PRIVATE.matches(clazz));
            assertEquals(AccessLevel.PACKAGE_PRIVATE, AccessLevel.accessModifierOf(clazz));
        }
        {
            final Class<?> clazz = Local2.class;
            assertFalse(ClassKind.TOP_LEVEL.matches(clazz));
            assertFalse(ClassKind.NESTED.matches(clazz));
            assertFalse(ClassKind.INNER.matches(clazz));
            assertTrue(ClassKind.LOCAL.matches(clazz));
            assertFalse(ClassKind.ANONYMOUS.matches(clazz));
            assertEquals(ClassKind.LOCAL, ClassKind.kindOf(clazz));

            assertFalse(AccessLevel.PUBLIC.matches(clazz));
            assertTrue(AccessLevel.PACKAGE_PRIVATE.matches(clazz));
            assertFalse(AccessLevel.PROTECTED.matches(clazz));
            assertFalse(AccessLevel.PRIVATE.matches(clazz));
            assertEquals(AccessLevel.PACKAGE_PRIVATE, AccessLevel.accessModifierOf(clazz));
        }
    }

    private static final Class<?> Anonymous = new Cloneable() {}.getClass();

    @Test
    public void testAnonymousClass()
    throws Exception {
        {
            final Class<?> clazz = CombinedTests.Anonymous;
            assertFalse(ClassKind.TOP_LEVEL.matches(clazz));
            assertFalse(ClassKind.NESTED.matches(clazz));
            assertFalse(ClassKind.INNER.matches(clazz));
            assertFalse(ClassKind.LOCAL.matches(clazz));
            assertTrue(ClassKind.ANONYMOUS.matches(clazz));
            assertEquals(ClassKind.ANONYMOUS, ClassKind.kindOf(clazz));

            assertFalse(AccessLevel.PUBLIC.matches(clazz));
            assertTrue(AccessLevel.PACKAGE_PRIVATE.matches(clazz));
            assertFalse(AccessLevel.PROTECTED.matches(clazz));
            assertFalse(AccessLevel.PRIVATE.matches(clazz));
            assertEquals(AccessLevel.PACKAGE_PRIVATE, AccessLevel.accessModifierOf(clazz));
        }
        {
            final Class<?> clazz = new Cloneable() {}.getClass();
            assertFalse(ClassKind.TOP_LEVEL.matches(clazz));
            assertFalse(ClassKind.NESTED.matches(clazz));
            assertFalse(ClassKind.INNER.matches(clazz));
            assertFalse(ClassKind.LOCAL.matches(clazz));
            assertTrue(ClassKind.ANONYMOUS.matches(clazz));
            assertEquals(ClassKind.ANONYMOUS, ClassKind.kindOf(clazz));

            assertFalse(AccessLevel.PUBLIC.matches(clazz));
            assertTrue(AccessLevel.PACKAGE_PRIVATE.matches(clazz));
            assertFalse(AccessLevel.PROTECTED.matches(clazz));
            assertFalse(AccessLevel.PRIVATE.matches(clazz));
            assertEquals(AccessLevel.PACKAGE_PRIVATE, AccessLevel.accessModifierOf(clazz));
        }
    }

    @Test
    public void succeedTryLoadClass()
    throws Exception {
        final Optional<Class<?>> objectClass = tryLoadClass("java.lang.Object");
        assertNotNull(objectClass);
        assertTrue(objectClass.isPresent());
        assertEquals(Object.class, objectClass.get());
    }

    @Test
    public void failTryLoadClass()
    throws Exception {
        final Optional<Class<?>> objectClass = tryLoadClass("java.lang.Abject");
        assertNotNull(objectClass);
        assertFalse(objectClass.isPresent());
    }

    @Test
    public void testGetBasecomponentType()
    throws Exception {
        assertEquals(Object.class, baseComponentTypeOf(new Object().getClass()));
        assertEquals(Object.class, baseComponentTypeOf(new Object[] {}.getClass()));
        assertEquals(Object.class, baseComponentTypeOf(new Object[][] {}.getClass()));
        assertEquals(Object.class,
                     baseComponentTypeOf(new Object[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][] {}.getClass()));
        assertEquals(Object.class, baseComponentTypeOf(Array.newInstance(Object.class, 0).getClass()));
        assertEquals(Object.class, baseComponentTypeOf(Array.newInstance(Object.class, 1).getClass()));
        assertEquals(Object.class, baseComponentTypeOf(Array.newInstance(Object.class, 2).getClass()));
        assertEquals(Object.class, baseComponentTypeOf(Array.newInstance(Object.class, 255).getClass()));
    }

    /**
     * @see org.j8unit.tools.CombinedTests.PrivateNested#foo(java.security.cert.X509Certificate[],java.lang.String,java.lang.String...)
     */
    @Test
    public void testGetJavadocName()
    throws Exception {
        final Optional<Method> m1 = optionalise(() -> Object.class.getMethod("equals", Object.class), System.err::println);
        assertEquals("java.lang.Object#equals(java.lang.Object)", javadocNameOf(m1.get()));
        final Optional<Method> m2 = optionalise(() -> Inner.class.getMethod("hashCode"), System.err::println);
        assertEquals("org.j8unit.tools.CombinedTests.Inner#hashCode()", javadocNameOf(m2.get()));
        final Optional<Method> m3 = optionalise(() -> PrivateNested.class.getMethod("toString"), System.err::println);
        assertEquals("org.j8unit.tools.CombinedTests.PrivateNested#toString()", javadocNameOf(m3.get()));
        final Optional<Method> m4 = optionalise(() -> PrivateNested.class.getMethod("foo", X509Certificate[].class, String.class, String[].class),
                                                System.err::println);
        assertEquals("org.j8unit.tools.CombinedTests.PrivateNested#foo(java.security.cert.X509Certificate[],java.lang.String,java.lang.String...)",
                     javadocNameOf(m4.get()));
        final Optional<Method> m5 = optionalise(() -> PrivateNested.class.getMethod("bar", X509Certificate[].class, String.class, Map.Entry[].class),
                                                System.err::println);
        assertEquals("org.j8unit.tools.CombinedTests.PrivateNested#bar(java.security.cert.X509Certificate[],java.lang.String,java.util.Map.Entry...)",
                     javadocNameOf(m5.get()));
    }

}
