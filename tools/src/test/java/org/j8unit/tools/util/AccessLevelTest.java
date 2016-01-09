package org.j8unit.tools.util;

import static org.j8unit.tools.util.AccessLevel.PACKAGE_PRIVATE;
import static org.j8unit.tools.util.AccessLevel.PRIVATE;
import static org.j8unit.tools.util.AccessLevel.PROTECTED;
import static org.j8unit.tools.util.AccessLevel.PUBLIC;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.junit.Test;

@SuppressWarnings("unused")
public class AccessLevelTest {

    @Test
    public void testPublicTopLevelClass()
    throws Exception {
        final Class<?> clazz = AccessLevelTest.class;
        assertTrue(PUBLIC.matches(clazz));
        assertFalse(PACKAGE_PRIVATE.matches(clazz));
        assertFalse(PROTECTED.matches(clazz));
        assertFalse(PRIVATE.matches(clazz));
        assertFalse(PUBLIC.mismatches(clazz));
        assertTrue(PACKAGE_PRIVATE.mismatches(clazz));
        assertTrue(PROTECTED.mismatches(clazz));
        assertTrue(PRIVATE.mismatches(clazz));
    }

    public static class PublicNested {

        public PublicNested(final String publicConstructor) {
        }

        PublicNested(final Comparable<String> packagePrivateConstructor) {
        }

        protected PublicNested(final Serializable protectedConstructor) {
        }

        private PublicNested(final CharSequence privateConstructor) {
        }

        @Override
        public String toString() {
            return super.toString();
        }

        String toStringPackagePrivate() {
            return this.toString();
        }

        protected String toStringProtected() {
            return this.toString();
        }

        private String toStringPrivate() {
            return this.toString();
        }

    }

    @Test
    public void testPublicNestedClass()
    throws Exception {
        final Class<?> clazz = PublicNested.class;
        assertTrue(PUBLIC.matches(clazz));
        assertFalse(PACKAGE_PRIVATE.matches(clazz));
        assertFalse(PROTECTED.matches(clazz));
        assertFalse(PRIVATE.matches(clazz));
        final Constructor<?> publicConstructor = clazz.getDeclaredConstructor(String.class);
        assertTrue(PUBLIC.matches(publicConstructor));
        assertFalse(PACKAGE_PRIVATE.matches(publicConstructor));
        assertFalse(PROTECTED.matches(publicConstructor));
        assertFalse(PRIVATE.matches(publicConstructor));
        final Constructor<?> packagePrivateConstructor = clazz.getDeclaredConstructor(Comparable.class);
        assertFalse(PUBLIC.matches(packagePrivateConstructor));
        assertTrue(PACKAGE_PRIVATE.matches(packagePrivateConstructor));
        assertFalse(PROTECTED.matches(packagePrivateConstructor));
        assertFalse(PRIVATE.matches(packagePrivateConstructor));
        final Constructor<?> protectedConstructor = clazz.getDeclaredConstructor(Serializable.class);
        assertFalse(PUBLIC.matches(protectedConstructor));
        assertFalse(PACKAGE_PRIVATE.matches(protectedConstructor));
        assertTrue(PROTECTED.matches(protectedConstructor));
        assertFalse(PRIVATE.matches(protectedConstructor));
        final Constructor<?> privateConstructor = clazz.getDeclaredConstructor(CharSequence.class);
        assertFalse(PUBLIC.matches(privateConstructor));
        assertFalse(PACKAGE_PRIVATE.matches(privateConstructor));
        assertFalse(PROTECTED.matches(privateConstructor));
        assertTrue(PRIVATE.matches(privateConstructor));
        final Method publicMethod = clazz.getDeclaredMethod("toString");
        assertTrue(PUBLIC.matches(publicMethod));
        assertFalse(PACKAGE_PRIVATE.matches(publicMethod));
        assertFalse(PROTECTED.matches(publicMethod));
        assertFalse(PRIVATE.matches(publicMethod));
        final Method packagePrivateMethod = clazz.getDeclaredMethod("toStringPackagePrivate");
        assertFalse(PUBLIC.matches(packagePrivateMethod));
        assertTrue(PACKAGE_PRIVATE.matches(packagePrivateMethod));
        assertFalse(PROTECTED.matches(packagePrivateMethod));
        assertFalse(PRIVATE.matches(packagePrivateMethod));
        final Method protectedMethod = clazz.getDeclaredMethod("toStringProtected");
        assertFalse(PUBLIC.matches(protectedMethod));
        assertFalse(PACKAGE_PRIVATE.matches(protectedMethod));
        assertTrue(PROTECTED.matches(protectedMethod));
        assertFalse(PRIVATE.matches(protectedMethod));
        final Method privateMethod = clazz.getDeclaredMethod("toStringPrivate");
        assertFalse(PUBLIC.matches(privateMethod));
        assertFalse(PACKAGE_PRIVATE.matches(privateMethod));
        assertFalse(PROTECTED.matches(privateMethod));
        assertTrue(PRIVATE.matches(privateMethod));

        assertFalse(PUBLIC.mismatches(clazz));
        assertTrue(PACKAGE_PRIVATE.mismatches(clazz));
        assertTrue(PROTECTED.mismatches(clazz));
        assertTrue(PRIVATE.mismatches(clazz));
        assertFalse(PUBLIC.mismatches(publicConstructor));
        assertTrue(PACKAGE_PRIVATE.mismatches(publicConstructor));
        assertTrue(PROTECTED.mismatches(publicConstructor));
        assertTrue(PRIVATE.mismatches(publicConstructor));
        assertTrue(PUBLIC.mismatches(packagePrivateConstructor));
        assertFalse(PACKAGE_PRIVATE.mismatches(packagePrivateConstructor));
        assertTrue(PROTECTED.mismatches(packagePrivateConstructor));
        assertTrue(PRIVATE.mismatches(packagePrivateConstructor));
        assertTrue(PUBLIC.mismatches(protectedConstructor));
        assertTrue(PACKAGE_PRIVATE.mismatches(protectedConstructor));
        assertFalse(PROTECTED.mismatches(protectedConstructor));
        assertTrue(PRIVATE.mismatches(protectedConstructor));
        assertTrue(PUBLIC.mismatches(privateConstructor));
        assertTrue(PACKAGE_PRIVATE.mismatches(privateConstructor));
        assertTrue(PROTECTED.mismatches(privateConstructor));
        assertFalse(PRIVATE.mismatches(privateConstructor));
        assertFalse(PUBLIC.mismatches(publicMethod));
        assertTrue(PACKAGE_PRIVATE.mismatches(publicMethod));
        assertTrue(PROTECTED.mismatches(publicMethod));
        assertTrue(PRIVATE.mismatches(publicMethod));
        assertTrue(PUBLIC.mismatches(packagePrivateMethod));
        assertFalse(PACKAGE_PRIVATE.mismatches(packagePrivateMethod));
        assertTrue(PROTECTED.mismatches(packagePrivateMethod));
        assertTrue(PRIVATE.mismatches(packagePrivateMethod));
        assertTrue(PUBLIC.mismatches(protectedMethod));
        assertTrue(PACKAGE_PRIVATE.mismatches(protectedMethod));
        assertFalse(PROTECTED.mismatches(protectedMethod));
        assertTrue(PRIVATE.mismatches(protectedMethod));
        assertTrue(PUBLIC.mismatches(privateMethod));
        assertTrue(PACKAGE_PRIVATE.mismatches(privateMethod));
        assertTrue(PROTECTED.mismatches(privateMethod));
        assertFalse(PRIVATE.mismatches(privateMethod));
    }

    static class PackagePrivateNested {

        public PackagePrivateNested(final String publicConstructor) {
        }

        PackagePrivateNested(final Comparable<String> packagePrivateConstructor) {
        }

        protected PackagePrivateNested(final Serializable protectedConstructor) {
        }

        private PackagePrivateNested(final CharSequence privateConstructor) {
        }

        @Override
        public String toString() {
            return super.toString();
        }

        String toStringPackagePrivate() {
            return this.toString();
        }

        protected String toStringProtected() {
            return this.toString();
        }

        private String toStringPrivate() {
            return this.toString();
        }

    }

    @Test
    public void testPackagePrivateNestedClass()
    throws Exception {
        final Class<?> clazz = PackagePrivateNested.class;
        assertFalse(PUBLIC.matches(clazz));
        assertTrue(PACKAGE_PRIVATE.matches(clazz));
        assertFalse(PROTECTED.matches(clazz));
        assertFalse(PRIVATE.matches(clazz));
        final Constructor<?> publicConstructor = clazz.getDeclaredConstructor(String.class);
        assertTrue(PUBLIC.matches(publicConstructor));
        assertFalse(PACKAGE_PRIVATE.matches(publicConstructor));
        assertFalse(PROTECTED.matches(publicConstructor));
        assertFalse(PRIVATE.matches(publicConstructor));
        final Constructor<?> packagePrivateConstructor = clazz.getDeclaredConstructor(Comparable.class);
        assertFalse(PUBLIC.matches(packagePrivateConstructor));
        assertTrue(PACKAGE_PRIVATE.matches(packagePrivateConstructor));
        assertFalse(PROTECTED.matches(packagePrivateConstructor));
        assertFalse(PRIVATE.matches(packagePrivateConstructor));
        final Constructor<?> protectedConstructor = clazz.getDeclaredConstructor(Serializable.class);
        assertFalse(PUBLIC.matches(protectedConstructor));
        assertFalse(PACKAGE_PRIVATE.matches(protectedConstructor));
        assertTrue(PROTECTED.matches(protectedConstructor));
        assertFalse(PRIVATE.matches(protectedConstructor));
        final Constructor<?> privateConstructor = clazz.getDeclaredConstructor(CharSequence.class);
        assertFalse(PUBLIC.matches(privateConstructor));
        assertFalse(PACKAGE_PRIVATE.matches(privateConstructor));
        assertFalse(PROTECTED.matches(privateConstructor));
        assertTrue(PRIVATE.matches(privateConstructor));
        final Method publicMethod = clazz.getDeclaredMethod("toString");
        assertTrue(PUBLIC.matches(publicMethod));
        assertFalse(PACKAGE_PRIVATE.matches(publicMethod));
        assertFalse(PROTECTED.matches(publicMethod));
        assertFalse(PRIVATE.matches(publicMethod));
        final Method packagePrivateMethod = clazz.getDeclaredMethod("toStringPackagePrivate");
        assertFalse(PUBLIC.matches(packagePrivateMethod));
        assertTrue(PACKAGE_PRIVATE.matches(packagePrivateMethod));
        assertFalse(PROTECTED.matches(packagePrivateMethod));
        assertFalse(PRIVATE.matches(packagePrivateMethod));
        final Method protectedMethod = clazz.getDeclaredMethod("toStringProtected");
        assertFalse(PUBLIC.matches(protectedMethod));
        assertFalse(PACKAGE_PRIVATE.matches(protectedMethod));
        assertTrue(PROTECTED.matches(protectedMethod));
        assertFalse(PRIVATE.matches(protectedMethod));
        final Method privateMethod = clazz.getDeclaredMethod("toStringPrivate");
        assertFalse(PUBLIC.matches(privateMethod));
        assertFalse(PACKAGE_PRIVATE.matches(privateMethod));
        assertFalse(PROTECTED.matches(privateMethod));
        assertTrue(PRIVATE.matches(privateMethod));

        assertTrue(PUBLIC.mismatches(clazz));
        assertFalse(PACKAGE_PRIVATE.mismatches(clazz));
        assertTrue(PROTECTED.mismatches(clazz));
        assertTrue(PRIVATE.mismatches(clazz));
        assertFalse(PUBLIC.mismatches(publicConstructor));
        assertTrue(PACKAGE_PRIVATE.mismatches(publicConstructor));
        assertTrue(PROTECTED.mismatches(publicConstructor));
        assertTrue(PRIVATE.mismatches(publicConstructor));
        assertTrue(PUBLIC.mismatches(packagePrivateConstructor));
        assertFalse(PACKAGE_PRIVATE.mismatches(packagePrivateConstructor));
        assertTrue(PROTECTED.mismatches(packagePrivateConstructor));
        assertTrue(PRIVATE.mismatches(packagePrivateConstructor));
        assertTrue(PUBLIC.mismatches(protectedConstructor));
        assertTrue(PACKAGE_PRIVATE.mismatches(protectedConstructor));
        assertFalse(PROTECTED.mismatches(protectedConstructor));
        assertTrue(PRIVATE.mismatches(protectedConstructor));
        assertTrue(PUBLIC.mismatches(privateConstructor));
        assertTrue(PACKAGE_PRIVATE.mismatches(privateConstructor));
        assertTrue(PROTECTED.mismatches(privateConstructor));
        assertFalse(PRIVATE.mismatches(privateConstructor));
        assertFalse(PUBLIC.mismatches(publicMethod));
        assertTrue(PACKAGE_PRIVATE.mismatches(publicMethod));
        assertTrue(PROTECTED.mismatches(publicMethod));
        assertTrue(PRIVATE.mismatches(publicMethod));
        assertTrue(PUBLIC.mismatches(packagePrivateMethod));
        assertFalse(PACKAGE_PRIVATE.mismatches(packagePrivateMethod));
        assertTrue(PROTECTED.mismatches(packagePrivateMethod));
        assertTrue(PRIVATE.mismatches(packagePrivateMethod));
        assertTrue(PUBLIC.mismatches(protectedMethod));
        assertTrue(PACKAGE_PRIVATE.mismatches(protectedMethod));
        assertFalse(PROTECTED.mismatches(protectedMethod));
        assertTrue(PRIVATE.mismatches(protectedMethod));
        assertTrue(PUBLIC.mismatches(privateMethod));
        assertTrue(PACKAGE_PRIVATE.mismatches(privateMethod));
        assertTrue(PROTECTED.mismatches(privateMethod));
        assertFalse(PRIVATE.mismatches(privateMethod));
    }

    protected static class ProtectedNested {

        public ProtectedNested(final String publicConstructor) {
        }

        ProtectedNested(final Comparable<String> packagePrivateConstructor) {
        }

        protected ProtectedNested(final Serializable protectedConstructor) {
        }

        private ProtectedNested(final CharSequence privateConstructor) {
        }

        @Override
        public String toString() {
            return super.toString();
        }

        String toStringPackagePrivate() {
            return this.toString();
        }

        protected String toStringProtected() {
            return this.toString();
        }

        private String toStringPrivate() {
            return this.toString();
        }

    }

    @Test
    public void testProtectedNestedClass()
    throws Exception {
        final Class<?> clazz = ProtectedNested.class;
        assertFalse(PUBLIC.matches(clazz));
        assertFalse(PACKAGE_PRIVATE.matches(clazz));
        assertTrue(PROTECTED.matches(clazz));
        assertFalse(PRIVATE.matches(clazz));
        final Constructor<?> publicConstructor = clazz.getDeclaredConstructor(String.class);
        assertTrue(PUBLIC.matches(publicConstructor));
        assertFalse(PACKAGE_PRIVATE.matches(publicConstructor));
        assertFalse(PROTECTED.matches(publicConstructor));
        assertFalse(PRIVATE.matches(publicConstructor));
        final Constructor<?> packagePrivateConstructor = clazz.getDeclaredConstructor(Comparable.class);
        assertFalse(PUBLIC.matches(packagePrivateConstructor));
        assertTrue(PACKAGE_PRIVATE.matches(packagePrivateConstructor));
        assertFalse(PROTECTED.matches(packagePrivateConstructor));
        assertFalse(PRIVATE.matches(packagePrivateConstructor));
        final Constructor<?> protectedConstructor = clazz.getDeclaredConstructor(Serializable.class);
        assertFalse(PUBLIC.matches(protectedConstructor));
        assertFalse(PACKAGE_PRIVATE.matches(protectedConstructor));
        assertTrue(PROTECTED.matches(protectedConstructor));
        assertFalse(PRIVATE.matches(protectedConstructor));
        final Constructor<?> privateConstructor = clazz.getDeclaredConstructor(CharSequence.class);
        assertFalse(PUBLIC.matches(privateConstructor));
        assertFalse(PACKAGE_PRIVATE.matches(privateConstructor));
        assertFalse(PROTECTED.matches(privateConstructor));
        assertTrue(PRIVATE.matches(privateConstructor));
        final Method publicMethod = clazz.getDeclaredMethod("toString");
        assertTrue(PUBLIC.matches(publicMethod));
        assertFalse(PACKAGE_PRIVATE.matches(publicMethod));
        assertFalse(PROTECTED.matches(publicMethod));
        assertFalse(PRIVATE.matches(publicMethod));
        final Method packagePrivateMethod = clazz.getDeclaredMethod("toStringPackagePrivate");
        assertFalse(PUBLIC.matches(packagePrivateMethod));
        assertTrue(PACKAGE_PRIVATE.matches(packagePrivateMethod));
        assertFalse(PROTECTED.matches(packagePrivateMethod));
        assertFalse(PRIVATE.matches(packagePrivateMethod));
        final Method protectedMethod = clazz.getDeclaredMethod("toStringProtected");
        assertFalse(PUBLIC.matches(protectedMethod));
        assertFalse(PACKAGE_PRIVATE.matches(protectedMethod));
        assertTrue(PROTECTED.matches(protectedMethod));
        assertFalse(PRIVATE.matches(protectedMethod));
        final Method privateMethod = clazz.getDeclaredMethod("toStringPrivate");
        assertFalse(PUBLIC.matches(privateMethod));
        assertFalse(PACKAGE_PRIVATE.matches(privateMethod));
        assertFalse(PROTECTED.matches(privateMethod));
        assertTrue(PRIVATE.matches(privateMethod));

        assertTrue(PUBLIC.mismatches(clazz));
        assertTrue(PACKAGE_PRIVATE.mismatches(clazz));
        assertFalse(PROTECTED.mismatches(clazz));
        assertTrue(PRIVATE.mismatches(clazz));
        assertFalse(PUBLIC.mismatches(publicConstructor));
        assertTrue(PACKAGE_PRIVATE.mismatches(publicConstructor));
        assertTrue(PROTECTED.mismatches(publicConstructor));
        assertTrue(PRIVATE.mismatches(publicConstructor));
        assertTrue(PUBLIC.mismatches(packagePrivateConstructor));
        assertFalse(PACKAGE_PRIVATE.mismatches(packagePrivateConstructor));
        assertTrue(PROTECTED.mismatches(packagePrivateConstructor));
        assertTrue(PRIVATE.mismatches(packagePrivateConstructor));
        assertTrue(PUBLIC.mismatches(protectedConstructor));
        assertTrue(PACKAGE_PRIVATE.mismatches(protectedConstructor));
        assertFalse(PROTECTED.mismatches(protectedConstructor));
        assertTrue(PRIVATE.mismatches(protectedConstructor));
        assertTrue(PUBLIC.mismatches(privateConstructor));
        assertTrue(PACKAGE_PRIVATE.mismatches(privateConstructor));
        assertTrue(PROTECTED.mismatches(privateConstructor));
        assertFalse(PRIVATE.mismatches(privateConstructor));
        assertFalse(PUBLIC.mismatches(publicMethod));
        assertTrue(PACKAGE_PRIVATE.mismatches(publicMethod));
        assertTrue(PROTECTED.mismatches(publicMethod));
        assertTrue(PRIVATE.mismatches(publicMethod));
        assertTrue(PUBLIC.mismatches(packagePrivateMethod));
        assertFalse(PACKAGE_PRIVATE.mismatches(packagePrivateMethod));
        assertTrue(PROTECTED.mismatches(packagePrivateMethod));
        assertTrue(PRIVATE.mismatches(packagePrivateMethod));
        assertTrue(PUBLIC.mismatches(protectedMethod));
        assertTrue(PACKAGE_PRIVATE.mismatches(protectedMethod));
        assertFalse(PROTECTED.mismatches(protectedMethod));
        assertTrue(PRIVATE.mismatches(protectedMethod));
        assertTrue(PUBLIC.mismatches(privateMethod));
        assertTrue(PACKAGE_PRIVATE.mismatches(privateMethod));
        assertTrue(PROTECTED.mismatches(privateMethod));
        assertFalse(PRIVATE.mismatches(privateMethod));
    }

    private static class PrivateNested {

        public PrivateNested(final String publicConstructor) {
        }

        PrivateNested(final Comparable<String> packagePrivateConstructor) {
        }

        protected PrivateNested(final Serializable protectedConstructor) {
        }

        private PrivateNested(final CharSequence privateConstructor) {
        }

        @Override
        public String toString() {
            return super.toString();
        }

        String toStringPackagePrivate() {
            return this.toString();
        }

        protected String toStringProtected() {
            return this.toString();
        }

        private String toStringPrivate() {
            return this.toString();
        }

    }

    @Test
    public void testPrivateNestedClass()
    throws Exception {
        final Class<?> clazz = PrivateNested.class;
        assertFalse(PUBLIC.matches(clazz));
        assertFalse(PACKAGE_PRIVATE.matches(clazz));
        assertFalse(PROTECTED.matches(clazz));
        assertTrue(PRIVATE.matches(clazz));
        final Constructor<?> publicConstructor = clazz.getDeclaredConstructor(String.class);
        assertTrue(PUBLIC.matches(publicConstructor));
        assertFalse(PACKAGE_PRIVATE.matches(publicConstructor));
        assertFalse(PROTECTED.matches(publicConstructor));
        assertFalse(PRIVATE.matches(publicConstructor));
        final Constructor<?> packagePrivateConstructor = clazz.getDeclaredConstructor(Comparable.class);
        assertFalse(PUBLIC.matches(packagePrivateConstructor));
        assertTrue(PACKAGE_PRIVATE.matches(packagePrivateConstructor));
        assertFalse(PROTECTED.matches(packagePrivateConstructor));
        assertFalse(PRIVATE.matches(packagePrivateConstructor));
        final Constructor<?> protectedConstructor = clazz.getDeclaredConstructor(Serializable.class);
        assertFalse(PUBLIC.matches(protectedConstructor));
        assertFalse(PACKAGE_PRIVATE.matches(protectedConstructor));
        assertTrue(PROTECTED.matches(protectedConstructor));
        assertFalse(PRIVATE.matches(protectedConstructor));
        final Constructor<?> privateConstructor = clazz.getDeclaredConstructor(CharSequence.class);
        assertFalse(PUBLIC.matches(privateConstructor));
        assertFalse(PACKAGE_PRIVATE.matches(privateConstructor));
        assertFalse(PROTECTED.matches(privateConstructor));
        assertTrue(PRIVATE.matches(privateConstructor));
        final Method publicMethod = clazz.getDeclaredMethod("toString");
        assertTrue(PUBLIC.matches(publicMethod));
        assertFalse(PACKAGE_PRIVATE.matches(publicMethod));
        assertFalse(PROTECTED.matches(publicMethod));
        assertFalse(PRIVATE.matches(publicMethod));
        final Method packagePrivateMethod = clazz.getDeclaredMethod("toStringPackagePrivate");
        assertFalse(PUBLIC.matches(packagePrivateMethod));
        assertTrue(PACKAGE_PRIVATE.matches(packagePrivateMethod));
        assertFalse(PROTECTED.matches(packagePrivateMethod));
        assertFalse(PRIVATE.matches(packagePrivateMethod));
        final Method protectedMethod = clazz.getDeclaredMethod("toStringProtected");
        assertFalse(PUBLIC.matches(protectedMethod));
        assertFalse(PACKAGE_PRIVATE.matches(protectedMethod));
        assertTrue(PROTECTED.matches(protectedMethod));
        assertFalse(PRIVATE.matches(protectedMethod));
        final Method privateMethod = clazz.getDeclaredMethod("toStringPrivate");
        assertFalse(PUBLIC.matches(privateMethod));
        assertFalse(PACKAGE_PRIVATE.matches(privateMethod));
        assertFalse(PROTECTED.matches(privateMethod));
        assertTrue(PRIVATE.matches(privateMethod));

        assertTrue(PUBLIC.mismatches(clazz));
        assertTrue(PACKAGE_PRIVATE.mismatches(clazz));
        assertTrue(PROTECTED.mismatches(clazz));
        assertFalse(PRIVATE.mismatches(clazz));
        assertFalse(PUBLIC.mismatches(publicConstructor));
        assertTrue(PACKAGE_PRIVATE.mismatches(publicConstructor));
        assertTrue(PROTECTED.mismatches(publicConstructor));
        assertTrue(PRIVATE.mismatches(publicConstructor));
        assertTrue(PUBLIC.mismatches(packagePrivateConstructor));
        assertFalse(PACKAGE_PRIVATE.mismatches(packagePrivateConstructor));
        assertTrue(PROTECTED.mismatches(packagePrivateConstructor));
        assertTrue(PRIVATE.mismatches(packagePrivateConstructor));
        assertTrue(PUBLIC.mismatches(protectedConstructor));
        assertTrue(PACKAGE_PRIVATE.mismatches(protectedConstructor));
        assertFalse(PROTECTED.mismatches(protectedConstructor));
        assertTrue(PRIVATE.mismatches(protectedConstructor));
        assertTrue(PUBLIC.mismatches(privateConstructor));
        assertTrue(PACKAGE_PRIVATE.mismatches(privateConstructor));
        assertTrue(PROTECTED.mismatches(privateConstructor));
        assertFalse(PRIVATE.mismatches(privateConstructor));
        assertFalse(PUBLIC.mismatches(publicMethod));
        assertTrue(PACKAGE_PRIVATE.mismatches(publicMethod));
        assertTrue(PROTECTED.mismatches(publicMethod));
        assertTrue(PRIVATE.mismatches(publicMethod));
        assertTrue(PUBLIC.mismatches(packagePrivateMethod));
        assertFalse(PACKAGE_PRIVATE.mismatches(packagePrivateMethod));
        assertTrue(PROTECTED.mismatches(packagePrivateMethod));
        assertTrue(PRIVATE.mismatches(packagePrivateMethod));
        assertTrue(PUBLIC.mismatches(protectedMethod));
        assertTrue(PACKAGE_PRIVATE.mismatches(protectedMethod));
        assertFalse(PROTECTED.mismatches(protectedMethod));
        assertTrue(PRIVATE.mismatches(protectedMethod));
        assertTrue(PUBLIC.mismatches(privateMethod));
        assertTrue(PACKAGE_PRIVATE.mismatches(privateMethod));
        assertTrue(PROTECTED.mismatches(privateMethod));
        assertFalse(PRIVATE.mismatches(privateMethod));
    }

}
