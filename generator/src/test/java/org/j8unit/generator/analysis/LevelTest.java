package org.j8unit.generator.analysis;

import static org.j8unit.generator.analysis.AccessLevel.API;
import static org.j8unit.generator.analysis.AccessLevel.DEVELOPER;
import static org.j8unit.generator.analysis.AccessLevel.MANUFACTURER;
import static org.j8unit.generator.analysis.AccessLevel.NONE;
import static org.j8unit.generator.analysis.AccessModifier.PACKAGE_PRIVATE;
import static org.j8unit.generator.analysis.AccessModifier.PRIVATE;
import static org.j8unit.generator.analysis.AccessModifier.PROTECTED;
import static org.j8unit.generator.analysis.AccessModifier.PUBLIC;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.junit.Test;

@SuppressWarnings("unused")
public class LevelTest {

    @Test
    public void testPublicTopLevelClass()
    throws Exception {
        final Class<?> clazz = AccessLevelHelperClass.class;
        // Access Level
        assertTrue(PUBLIC.matches(clazz));
        assertFalse(PUBLIC.mismatches(clazz));
        assertFalse(PACKAGE_PRIVATE.matches(clazz));
        assertTrue(PACKAGE_PRIVATE.mismatches(clazz));
        assertFalse(PROTECTED.matches(clazz));
        assertTrue(PROTECTED.mismatches(clazz));
        assertFalse(PRIVATE.matches(clazz));
        assertTrue(PRIVATE.mismatches(clazz));
        // API Level
        assertTrue(MANUFACTURER.matches(clazz));
        assertFalse(MANUFACTURER.mismatches(clazz));
        assertTrue(DEVELOPER.matches(clazz));
        assertFalse(DEVELOPER.mismatches(clazz));
        assertTrue(API.matches(clazz));
        assertFalse(API.mismatches(clazz));
        assertFalse(NONE.matches(clazz));
        assertTrue(NONE.mismatches(clazz));

        final Constructor<?> publicConstructor = clazz.getDeclaredConstructor(String.class);
        // Access Level
        assertTrue(PUBLIC.matches(publicConstructor));
        assertFalse(PUBLIC.mismatches(publicConstructor));
        assertFalse(PACKAGE_PRIVATE.matches(publicConstructor));
        assertTrue(PACKAGE_PRIVATE.mismatches(publicConstructor));
        assertFalse(PROTECTED.matches(publicConstructor));
        assertTrue(PROTECTED.mismatches(publicConstructor));
        assertFalse(PRIVATE.matches(publicConstructor));
        assertTrue(PRIVATE.mismatches(publicConstructor));
        // API Level
        assertTrue(MANUFACTURER.matches(publicConstructor));
        assertFalse(MANUFACTURER.mismatches(publicConstructor));
        assertTrue(DEVELOPER.matches(publicConstructor));
        assertFalse(DEVELOPER.mismatches(publicConstructor));
        assertTrue(API.matches(publicConstructor));
        assertFalse(API.mismatches(publicConstructor));
        assertFalse(NONE.matches(publicConstructor));
        assertTrue(NONE.mismatches(publicConstructor));

        final Constructor<?> packagePrivateConstructor = clazz.getDeclaredConstructor(Comparable.class);
        // Access Level
        assertFalse(PUBLIC.matches(packagePrivateConstructor));
        assertTrue(PUBLIC.mismatches(packagePrivateConstructor));
        assertTrue(PACKAGE_PRIVATE.matches(packagePrivateConstructor));
        assertFalse(PACKAGE_PRIVATE.mismatches(packagePrivateConstructor));
        assertFalse(PROTECTED.matches(packagePrivateConstructor));
        assertTrue(PROTECTED.mismatches(packagePrivateConstructor));
        assertFalse(PRIVATE.matches(packagePrivateConstructor));
        assertTrue(PRIVATE.mismatches(packagePrivateConstructor));
        // API Level
        assertTrue(MANUFACTURER.matches(packagePrivateConstructor));
        assertFalse(MANUFACTURER.mismatches(packagePrivateConstructor));
        assertFalse(DEVELOPER.matches(packagePrivateConstructor));
        assertTrue(DEVELOPER.mismatches(packagePrivateConstructor));
        assertFalse(API.matches(packagePrivateConstructor));
        assertTrue(API.mismatches(packagePrivateConstructor));
        assertFalse(NONE.matches(packagePrivateConstructor));
        assertTrue(NONE.mismatches(packagePrivateConstructor));

        final Constructor<?> protectedConstructor = clazz.getDeclaredConstructor(Serializable.class);
        assertFalse(PUBLIC.matches(protectedConstructor));
        assertTrue(PUBLIC.mismatches(protectedConstructor));
        assertFalse(PACKAGE_PRIVATE.matches(protectedConstructor));
        assertTrue(PACKAGE_PRIVATE.mismatches(protectedConstructor));
        assertTrue(PROTECTED.matches(protectedConstructor));
        assertFalse(PROTECTED.mismatches(protectedConstructor));
        assertFalse(PRIVATE.matches(protectedConstructor));
        assertTrue(PRIVATE.mismatches(protectedConstructor));
        // API Level
        assertTrue(MANUFACTURER.matches(protectedConstructor));
        assertFalse(MANUFACTURER.mismatches(protectedConstructor));
        assertTrue(DEVELOPER.matches(protectedConstructor));
        assertFalse(DEVELOPER.mismatches(protectedConstructor));
        assertFalse(API.matches(protectedConstructor));
        assertTrue(API.mismatches(protectedConstructor));
        assertFalse(NONE.matches(protectedConstructor));
        assertTrue(NONE.mismatches(protectedConstructor));

        final Constructor<?> privateConstructor = clazz.getDeclaredConstructor(CharSequence.class);
        assertFalse(PUBLIC.matches(privateConstructor));
        assertTrue(PUBLIC.mismatches(privateConstructor));
        assertFalse(PACKAGE_PRIVATE.matches(privateConstructor));
        assertTrue(PACKAGE_PRIVATE.mismatches(privateConstructor));
        assertFalse(PROTECTED.matches(privateConstructor));
        assertTrue(PROTECTED.mismatches(privateConstructor));
        assertTrue(PRIVATE.matches(privateConstructor));
        assertFalse(PRIVATE.mismatches(privateConstructor));
        // API Level
        assertFalse(MANUFACTURER.matches(privateConstructor));
        assertTrue(MANUFACTURER.mismatches(privateConstructor));
        assertFalse(DEVELOPER.matches(privateConstructor));
        assertTrue(DEVELOPER.mismatches(privateConstructor));
        assertFalse(API.matches(privateConstructor));
        assertTrue(API.mismatches(privateConstructor));
        assertFalse(NONE.matches(privateConstructor));
        assertTrue(NONE.mismatches(privateConstructor));

        final Method publicMethod = clazz.getDeclaredMethod("toString");
        // Access Level
        assertTrue(PUBLIC.matches(publicMethod));
        assertFalse(PUBLIC.mismatches(publicMethod));
        assertFalse(PACKAGE_PRIVATE.matches(publicMethod));
        assertTrue(PACKAGE_PRIVATE.mismatches(publicMethod));
        assertFalse(PROTECTED.matches(publicMethod));
        assertTrue(PROTECTED.mismatches(publicMethod));
        assertFalse(PRIVATE.matches(publicMethod));
        assertTrue(PRIVATE.mismatches(publicMethod));
        // API Level
        assertTrue(MANUFACTURER.matches(publicMethod));
        assertFalse(MANUFACTURER.mismatches(publicMethod));
        assertTrue(DEVELOPER.matches(publicMethod));
        assertFalse(DEVELOPER.mismatches(publicMethod));
        assertTrue(API.matches(publicMethod));
        assertFalse(API.mismatches(publicMethod));
        assertFalse(NONE.matches(publicMethod));
        assertTrue(NONE.mismatches(publicMethod));

        final Method packagePrivateMethod = clazz.getDeclaredMethod("toStringPackagePrivate");
        // Access Level
        assertFalse(PUBLIC.matches(packagePrivateMethod));
        assertTrue(PUBLIC.mismatches(packagePrivateMethod));
        assertTrue(PACKAGE_PRIVATE.matches(packagePrivateMethod));
        assertFalse(PACKAGE_PRIVATE.mismatches(packagePrivateMethod));
        assertFalse(PROTECTED.matches(packagePrivateMethod));
        assertTrue(PROTECTED.mismatches(packagePrivateMethod));
        assertFalse(PRIVATE.matches(packagePrivateMethod));
        assertTrue(PRIVATE.mismatches(packagePrivateMethod));
        // API Level
        assertTrue(MANUFACTURER.matches(packagePrivateMethod));
        assertFalse(MANUFACTURER.mismatches(packagePrivateMethod));
        assertFalse(DEVELOPER.matches(packagePrivateMethod));
        assertTrue(DEVELOPER.mismatches(packagePrivateMethod));
        assertFalse(API.matches(packagePrivateMethod));
        assertTrue(API.mismatches(packagePrivateMethod));
        assertFalse(NONE.matches(packagePrivateMethod));
        assertTrue(NONE.mismatches(packagePrivateMethod));

        final Method protectedMethod = clazz.getDeclaredMethod("toStringProtected");
        // Access Level
        assertFalse(PUBLIC.matches(protectedMethod));
        assertTrue(PUBLIC.mismatches(protectedMethod));
        assertFalse(PACKAGE_PRIVATE.matches(protectedMethod));
        assertTrue(PACKAGE_PRIVATE.mismatches(protectedMethod));
        assertTrue(PROTECTED.matches(protectedMethod));
        assertFalse(PROTECTED.mismatches(protectedMethod));
        assertFalse(PRIVATE.matches(protectedMethod));
        assertTrue(PRIVATE.mismatches(protectedMethod));
        // API Level
        assertTrue(MANUFACTURER.matches(protectedMethod));
        assertFalse(MANUFACTURER.mismatches(protectedMethod));
        assertTrue(DEVELOPER.matches(protectedMethod));
        assertFalse(DEVELOPER.mismatches(protectedMethod));
        assertFalse(API.matches(protectedMethod));
        assertTrue(API.mismatches(protectedMethod));
        assertFalse(NONE.matches(protectedMethod));
        assertTrue(NONE.mismatches(protectedMethod));

        final Method privateMethod = clazz.getDeclaredMethod("toStringPrivate");
        // Access Level
        assertFalse(PUBLIC.matches(privateMethod));
        assertTrue(PUBLIC.mismatches(privateMethod));
        assertFalse(PACKAGE_PRIVATE.matches(privateMethod));
        assertTrue(PACKAGE_PRIVATE.mismatches(privateMethod));
        assertFalse(PROTECTED.matches(privateMethod));
        assertTrue(PROTECTED.mismatches(privateMethod));
        assertTrue(PRIVATE.matches(privateMethod));
        assertFalse(PRIVATE.mismatches(privateMethod));
        // API Level
        assertFalse(MANUFACTURER.matches(privateMethod));
        assertTrue(MANUFACTURER.mismatches(privateMethod));
        assertFalse(DEVELOPER.matches(privateMethod));
        assertTrue(DEVELOPER.mismatches(privateMethod));
        assertFalse(API.matches(privateMethod));
        assertTrue(API.mismatches(privateMethod));
        assertFalse(NONE.matches(privateMethod));
        assertTrue(NONE.mismatches(privateMethod));
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
