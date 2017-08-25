package org.j8unit.generator.analysis;

import static org.j8unit.generator.util.Optionals.optionalise;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.j8unit.generator.api.render.OriginRenderer;
import org.junit.Test;

/**
 * @see org.j8unit.generator.analysis.CombinedTests
 * @see org.j8unit.generator.analysis.CombinedTests.Nested
 * @see org.j8unit.generator.analysis.CombinedTests.PrivateNested
 */
public class CombinedTests {

    @Test
    public void testTopLevelClass()
    throws Exception {
        final Class<?> clazz = CombinedTests.class;
        assertTrue(TypePosition.TOP_LEVEL.matches(clazz));
        assertFalse(TypePosition.TOP_LEVEL.mismatches(clazz));
        assertFalse(TypePosition.NESTED.matches(clazz));
        assertTrue(TypePosition.NESTED.mismatches(clazz));
        assertFalse(TypePosition.INNER.matches(clazz));
        assertTrue(TypePosition.INNER.mismatches(clazz));
        assertFalse(TypePosition.LOCAL.matches(clazz));
        assertTrue(TypePosition.LOCAL.mismatches(clazz));
        assertFalse(TypePosition.ANONYMOUS.matches(clazz));
        assertTrue(TypePosition.ANONYMOUS.mismatches(clazz));
        assertEquals(TypePosition.TOP_LEVEL, TypePosition.kindOf(clazz));

        assertTrue(AccessModifier.PUBLIC.matches(clazz));
        assertFalse(AccessModifier.PUBLIC.mismatches(clazz));
        assertFalse(AccessModifier.PACKAGE_PRIVATE.matches(clazz));
        assertTrue(AccessModifier.PACKAGE_PRIVATE.mismatches(clazz));
        assertFalse(AccessModifier.PROTECTED.matches(clazz));
        assertTrue(AccessModifier.PROTECTED.mismatches(clazz));
        assertFalse(AccessModifier.PRIVATE.matches(clazz));
        assertTrue(AccessModifier.PRIVATE.mismatches(clazz));
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
            assertFalse(TypePosition.TOP_LEVEL.matches(clazz));
            assertTrue(TypePosition.TOP_LEVEL.mismatches(clazz));
            assertTrue(TypePosition.NESTED.matches(clazz));
            assertFalse(TypePosition.NESTED.mismatches(clazz));
            assertFalse(TypePosition.INNER.matches(clazz));
            assertTrue(TypePosition.INNER.mismatches(clazz));
            assertFalse(TypePosition.LOCAL.matches(clazz));
            assertTrue(TypePosition.LOCAL.mismatches(clazz));
            assertFalse(TypePosition.ANONYMOUS.matches(clazz));
            assertTrue(TypePosition.ANONYMOUS.mismatches(clazz));
            assertEquals(TypePosition.NESTED, TypePosition.kindOf(clazz));

            assertFalse(AccessModifier.PUBLIC.matches(clazz));
            assertTrue(AccessModifier.PUBLIC.mismatches(clazz));
            assertTrue(AccessModifier.PACKAGE_PRIVATE.matches(clazz));
            assertFalse(AccessModifier.PACKAGE_PRIVATE.mismatches(clazz));
            assertFalse(AccessModifier.PROTECTED.matches(clazz));
            assertTrue(AccessModifier.PROTECTED.mismatches(clazz));
            assertFalse(AccessModifier.PRIVATE.matches(clazz));
            assertTrue(AccessModifier.PRIVATE.mismatches(clazz));
        }
        {
            final Class<?> clazz = PrivateNested.class;
            assertFalse(TypePosition.TOP_LEVEL.matches(clazz));
            assertTrue(TypePosition.TOP_LEVEL.mismatches(clazz));
            assertTrue(TypePosition.NESTED.matches(clazz));
            assertFalse(TypePosition.NESTED.mismatches(clazz));
            assertFalse(TypePosition.INNER.matches(clazz));
            assertTrue(TypePosition.INNER.mismatches(clazz));
            assertFalse(TypePosition.LOCAL.matches(clazz));
            assertTrue(TypePosition.LOCAL.mismatches(clazz));
            assertFalse(TypePosition.ANONYMOUS.matches(clazz));
            assertTrue(TypePosition.ANONYMOUS.mismatches(clazz));
            assertEquals(TypePosition.NESTED, TypePosition.kindOf(clazz));

            assertFalse(AccessModifier.PUBLIC.matches(clazz));
            assertTrue(AccessModifier.PUBLIC.mismatches(clazz));
            assertFalse(AccessModifier.PACKAGE_PRIVATE.matches(clazz));
            assertTrue(AccessModifier.PACKAGE_PRIVATE.mismatches(clazz));
            assertFalse(AccessModifier.PROTECTED.matches(clazz));
            assertTrue(AccessModifier.PROTECTED.mismatches(clazz));
            assertTrue(AccessModifier.PRIVATE.matches(clazz));
            assertFalse(AccessModifier.PRIVATE.mismatches(clazz));
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
        final Class<?> clazz = CombinedTests.Inner.class;
        assertFalse(TypePosition.TOP_LEVEL.matches(clazz));
        assertTrue(TypePosition.TOP_LEVEL.mismatches(clazz));
        assertFalse(TypePosition.NESTED.matches(clazz));
        assertTrue(TypePosition.NESTED.mismatches(clazz));
        assertTrue(TypePosition.INNER.matches(clazz));
        assertFalse(TypePosition.INNER.mismatches(clazz));
        assertFalse(TypePosition.LOCAL.matches(clazz));
        assertTrue(TypePosition.LOCAL.mismatches(clazz));
        assertFalse(TypePosition.ANONYMOUS.matches(clazz));
        assertTrue(TypePosition.ANONYMOUS.mismatches(clazz));
        assertEquals(TypePosition.INNER, TypePosition.kindOf(clazz));

        assertFalse(AccessModifier.PUBLIC.matches(clazz));
        assertTrue(AccessModifier.PUBLIC.mismatches(clazz));
        assertFalse(AccessModifier.PACKAGE_PRIVATE.matches(clazz));
        assertTrue(AccessModifier.PACKAGE_PRIVATE.mismatches(clazz));
        assertTrue(AccessModifier.PROTECTED.matches(clazz));
        assertFalse(AccessModifier.PROTECTED.mismatches(clazz));
        assertFalse(AccessModifier.PRIVATE.matches(clazz));
        assertTrue(AccessModifier.PRIVATE.mismatches(clazz));
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
            assertFalse(TypePosition.TOP_LEVEL.matches(clazz));
            assertTrue(TypePosition.TOP_LEVEL.mismatches(clazz));
            assertFalse(TypePosition.NESTED.matches(clazz));
            assertTrue(TypePosition.NESTED.mismatches(clazz));
            assertFalse(TypePosition.INNER.matches(clazz));
            assertTrue(TypePosition.INNER.mismatches(clazz));
            assertTrue(TypePosition.LOCAL.matches(clazz));
            assertFalse(TypePosition.LOCAL.mismatches(clazz));
            assertFalse(TypePosition.ANONYMOUS.matches(clazz));
            assertTrue(TypePosition.ANONYMOUS.mismatches(clazz));
            assertEquals(TypePosition.LOCAL, TypePosition.kindOf(clazz));

            assertFalse(AccessModifier.PUBLIC.matches(clazz));
            assertTrue(AccessModifier.PUBLIC.mismatches(clazz));
            assertTrue(AccessModifier.PACKAGE_PRIVATE.matches(clazz));
            assertFalse(AccessModifier.PACKAGE_PRIVATE.mismatches(clazz));
            assertFalse(AccessModifier.PROTECTED.matches(clazz));
            assertTrue(AccessModifier.PROTECTED.mismatches(clazz));
            assertFalse(AccessModifier.PRIVATE.matches(clazz));
            assertTrue(AccessModifier.PRIVATE.mismatches(clazz));
        }
        {
            final Class<?> clazz = Local2.class;
            assertFalse(TypePosition.TOP_LEVEL.matches(clazz));
            assertTrue(TypePosition.TOP_LEVEL.mismatches(clazz));
            assertFalse(TypePosition.NESTED.matches(clazz));
            assertTrue(TypePosition.NESTED.mismatches(clazz));
            assertFalse(TypePosition.INNER.matches(clazz));
            assertTrue(TypePosition.INNER.mismatches(clazz));
            assertTrue(TypePosition.LOCAL.matches(clazz));
            assertFalse(TypePosition.LOCAL.mismatches(clazz));
            assertFalse(TypePosition.ANONYMOUS.matches(clazz));
            assertTrue(TypePosition.ANONYMOUS.mismatches(clazz));
            assertEquals(TypePosition.LOCAL, TypePosition.kindOf(clazz));

            assertFalse(AccessModifier.PUBLIC.matches(clazz));
            assertTrue(AccessModifier.PUBLIC.mismatches(clazz));
            assertTrue(AccessModifier.PACKAGE_PRIVATE.matches(clazz));
            assertFalse(AccessModifier.PACKAGE_PRIVATE.mismatches(clazz));
            assertFalse(AccessModifier.PROTECTED.matches(clazz));
            assertTrue(AccessModifier.PROTECTED.mismatches(clazz));
            assertFalse(AccessModifier.PRIVATE.matches(clazz));
            assertTrue(AccessModifier.PRIVATE.mismatches(clazz));
        }
    }

    private static final Class<?> Anonymous = new Cloneable() {}.getClass();

    @Test
    public void testAnonymousClass()
    throws Exception {
        {
            final Class<?> clazz = CombinedTests.Anonymous;
            assertFalse(TypePosition.TOP_LEVEL.matches(clazz));
            assertTrue(TypePosition.TOP_LEVEL.mismatches(clazz));
            assertFalse(TypePosition.NESTED.matches(clazz));
            assertTrue(TypePosition.NESTED.mismatches(clazz));
            assertFalse(TypePosition.INNER.matches(clazz));
            assertTrue(TypePosition.INNER.mismatches(clazz));
            assertFalse(TypePosition.LOCAL.matches(clazz));
            assertTrue(TypePosition.LOCAL.mismatches(clazz));
            assertTrue(TypePosition.ANONYMOUS.matches(clazz));
            assertFalse(TypePosition.ANONYMOUS.mismatches(clazz));
            assertEquals(TypePosition.ANONYMOUS, TypePosition.kindOf(clazz));

            assertFalse(AccessModifier.PUBLIC.matches(clazz));
            assertTrue(AccessModifier.PUBLIC.mismatches(clazz));
            assertTrue(AccessModifier.PACKAGE_PRIVATE.matches(clazz));
            assertFalse(AccessModifier.PACKAGE_PRIVATE.mismatches(clazz));
            assertFalse(AccessModifier.PROTECTED.matches(clazz));
            assertTrue(AccessModifier.PROTECTED.mismatches(clazz));
            assertFalse(AccessModifier.PRIVATE.matches(clazz));
            assertTrue(AccessModifier.PRIVATE.mismatches(clazz));
        }
        {
            final Class<?> clazz = new Cloneable() {}.getClass();
            assertFalse(TypePosition.TOP_LEVEL.matches(clazz));
            assertTrue(TypePosition.TOP_LEVEL.mismatches(clazz));
            assertFalse(TypePosition.NESTED.matches(clazz));
            assertTrue(TypePosition.NESTED.mismatches(clazz));
            assertFalse(TypePosition.INNER.matches(clazz));
            assertTrue(TypePosition.INNER.mismatches(clazz));
            assertFalse(TypePosition.LOCAL.matches(clazz));
            assertTrue(TypePosition.LOCAL.mismatches(clazz));
            assertTrue(TypePosition.ANONYMOUS.matches(clazz));
            assertFalse(TypePosition.ANONYMOUS.mismatches(clazz));
            assertEquals(TypePosition.ANONYMOUS, TypePosition.kindOf(clazz));

            assertFalse(AccessModifier.PUBLIC.matches(clazz));
            assertTrue(AccessModifier.PUBLIC.mismatches(clazz));
            assertTrue(AccessModifier.PACKAGE_PRIVATE.matches(clazz));
            assertFalse(AccessModifier.PACKAGE_PRIVATE.mismatches(clazz));
            assertFalse(AccessModifier.PROTECTED.matches(clazz));
            assertTrue(AccessModifier.PROTECTED.mismatches(clazz));
            assertFalse(AccessModifier.PRIVATE.matches(clazz));
            assertTrue(AccessModifier.PRIVATE.mismatches(clazz));
        }
    }

    /**
     * @see org.j8unit.generator.analysis.CombinedTests.PrivateNested#foo(java.security.cert.X509Certificate[],java.lang.String,java.lang.String...)
     */
    @Test
    public void testGetJavadocName()
    throws Exception {
        final OriginRenderer renderer = new OriginRenderer() {};

        final Optional<Method> m1 = optionalise(() -> Object.class.getMethod("equals", Object.class), System.err::println);
        assertEquals("java.lang.Object#equals(java.lang.Object)", renderer.javadocNameOf(m1.get()));
        final Optional<Method> m2 = optionalise(() -> Inner.class.getMethod("hashCode"), System.err::println);
        assertEquals("org.j8unit.generator.analysis.CombinedTests.Inner#hashCode()", renderer.javadocNameOf(m2.get()));
        final Optional<Method> m3 = optionalise(() -> PrivateNested.class.getMethod("toString"), System.err::println);
        assertEquals("org.j8unit.generator.analysis.CombinedTests.PrivateNested#toString()", renderer.javadocNameOf(m3.get()));
        final Optional<Method> m4 = optionalise(() -> PrivateNested.class.getMethod("foo", X509Certificate[].class, String.class, String[].class),
                                                System.err::println);
        assertEquals("org.j8unit.generator.analysis.CombinedTests.PrivateNested#foo(java.security.cert.X509Certificate[], java.lang.String, java.lang.String...)",
                     renderer.javadocNameOf(m4.get()));
        final Optional<Method> m5 = optionalise(() -> PrivateNested.class.getMethod("bar", X509Certificate[].class, String.class, Map.Entry[].class),
                                                System.err::println);
        assertEquals("org.j8unit.generator.analysis.CombinedTests.PrivateNested#bar(java.security.cert.X509Certificate[], java.lang.String, java.util.Map.Entry...)",
                     renderer.javadocNameOf(m5.get()));
    }

}
