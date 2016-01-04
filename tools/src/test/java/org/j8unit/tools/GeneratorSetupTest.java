package org.j8unit.tools;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.nio.file.Paths;
import java.util.Map;
import org.junit.Test;

public class GeneratorSetupTest {

    private static final GeneratorSetup JAVA_LANG = GeneratorSetup.forJavaPackage("java.lang") //
                                                                  .intoTargetFolder(".") //
                                                                  .asSubPackageOf("") //
                                                                  .useTestClassPrefix("") //
                                                                  .upperCaseTestClassInfix(false) //
                                                                  .useTestClassSuffix("Test") //
                                                                  .useTestConstructorPrefix("create_") //
                                                                  .upperCaseTestConstructorInfix(false) //
                                                                  .useTestConstructorSuffix("") //
                                                                  .useTestMethodPrefix("test_") //
                                                                  .upperCaseTestMethodInfix(false) //
                                                                  .useTestMethodSuffix("") //
                                                                  .overwriteExistingFiles() //
                                                                  .build();

    private static final GeneratorSetup JAVA_LANG_INTO = GeneratorSetup.similarTo(JAVA_LANG) //
                                                                       .intoTargetFolder("src/main/java") //
                                                                       .build();

    private static final GeneratorSetup JAVA_LANG_SUBBED = GeneratorSetup.similarTo(JAVA_LANG) //
                                                                         .asSubPackageOf("foo.bar") //
                                                                         .build();

    private static final GeneratorSetup JAVA_LANG_INTO_SUBBED = GeneratorSetup.similarTo(JAVA_LANG_INTO) //
                                                                              .asSubPackageOf("foo.bar") //
                                                                              .build();

    @Test
    public void test_simpleCanonicalTestNameOf()
    throws Exception {
        assertEquals("ObjectTest", JAVA_LANG.simpleCanonicalTestNameOf(Object.class));
        assertEquals("ObjectTest", JAVA_LANG_INTO.simpleCanonicalTestNameOf(Object.class));
        assertEquals("ObjectTest", JAVA_LANG_SUBBED.simpleCanonicalTestNameOf(Object.class));
        assertEquals("ObjectTest", JAVA_LANG_INTO_SUBBED.simpleCanonicalTestNameOf(Object.class));
        assertEquals("MapTest.EntryTest", JAVA_LANG.simpleCanonicalTestNameOf(Map.Entry.class));
        assertEquals("MapTest.EntryTest", JAVA_LANG_INTO.simpleCanonicalTestNameOf(Map.Entry.class));
        assertEquals("MapTest.EntryTest", JAVA_LANG_SUBBED.simpleCanonicalTestNameOf(Map.Entry.class));
        assertEquals("MapTest.EntryTest", JAVA_LANG_INTO_SUBBED.simpleCanonicalTestNameOf(Map.Entry.class));

        try {
            JAVA_LANG.simpleCanonicalTestNameOf(byte.class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.simpleCanonicalTestNameOf(byte[][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.simpleCanonicalTestNameOf(Object[].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.simpleCanonicalTestNameOf(Object[][][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.simpleCanonicalTestNameOf(Map.Entry[].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.simpleCanonicalTestNameOf(Map.Entry[][][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
    }

    @Test
    public void test_simpleCanonicalTestClassOf()
    throws Exception {
        assertEquals("ObjectTest.class", JAVA_LANG.simpleCanonicalTestClassOf(Object.class));
        assertEquals("ObjectTest.class", JAVA_LANG_INTO.simpleCanonicalTestClassOf(Object.class));
        assertEquals("ObjectTest.class", JAVA_LANG_SUBBED.simpleCanonicalTestClassOf(Object.class));
        assertEquals("ObjectTest.class", JAVA_LANG_INTO_SUBBED.simpleCanonicalTestClassOf(Object.class));
        assertEquals("MapTest.EntryTest.class", JAVA_LANG.simpleCanonicalTestClassOf(Map.Entry.class));
        assertEquals("MapTest.EntryTest.class", JAVA_LANG_INTO.simpleCanonicalTestClassOf(Map.Entry.class));
        assertEquals("MapTest.EntryTest.class", JAVA_LANG_SUBBED.simpleCanonicalTestClassOf(Map.Entry.class));
        assertEquals("MapTest.EntryTest.class", JAVA_LANG_INTO_SUBBED.simpleCanonicalTestClassOf(Map.Entry.class));

        try {
            JAVA_LANG.simpleCanonicalTestClassOf(byte.class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.simpleCanonicalTestClassOf(byte[][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.simpleCanonicalTestClassOf(Object[].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.simpleCanonicalTestClassOf(Object[][][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.simpleCanonicalTestClassOf(Map.Entry[].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.simpleCanonicalTestClassOf(Map.Entry[][][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
    }

    @Test
    public void test_canonicalTestNameOf()
    throws Exception {
        assertEquals("ObjectTest", JAVA_LANG.canonicalTestNameOf(Object.class, "java.lang"));
        assertEquals("ObjectTest", JAVA_LANG_INTO.canonicalTestNameOf(Object.class, "java.lang"));
        assertEquals("ObjectTest", JAVA_LANG_SUBBED.canonicalTestNameOf(Object.class, "java.lang"));
        assertEquals("ObjectTest", JAVA_LANG_INTO_SUBBED.canonicalTestNameOf(Object.class, "java.lang"));
        assertEquals("java.util.MapTest.EntryTest", JAVA_LANG.canonicalTestNameOf(Map.Entry.class, "java.lang"));
        assertEquals("java.util.MapTest.EntryTest", JAVA_LANG_INTO.canonicalTestNameOf(Map.Entry.class, "java.lang"));
        assertEquals("foo.bar.java.util.MapTest.EntryTest", JAVA_LANG_SUBBED.canonicalTestNameOf(Map.Entry.class, "java.lang"));
        assertEquals("foo.bar.java.util.MapTest.EntryTest", JAVA_LANG_INTO_SUBBED.canonicalTestNameOf(Map.Entry.class, "java.lang"));
        assertEquals("java.lang.ObjectTest", JAVA_LANG.canonicalTestNameOf(Object.class, "java.util"));
        assertEquals("java.lang.ObjectTest", JAVA_LANG_INTO.canonicalTestNameOf(Object.class, "java.util"));
        assertEquals("foo.bar.java.lang.ObjectTest", JAVA_LANG_SUBBED.canonicalTestNameOf(Object.class, "java.util"));
        assertEquals("foo.bar.java.lang.ObjectTest", JAVA_LANG_INTO_SUBBED.canonicalTestNameOf(Object.class, "java.util"));
        assertEquals("MapTest.EntryTest", JAVA_LANG.canonicalTestNameOf(Map.Entry.class, "java.util"));
        assertEquals("MapTest.EntryTest", JAVA_LANG_INTO.canonicalTestNameOf(Map.Entry.class, "java.util"));
        assertEquals("MapTest.EntryTest", JAVA_LANG_SUBBED.canonicalTestNameOf(Map.Entry.class, "java.util"));
        assertEquals("MapTest.EntryTest", JAVA_LANG_INTO_SUBBED.canonicalTestNameOf(Map.Entry.class, "java.util"));

        try {
            JAVA_LANG.canonicalTestNameOf(byte.class, "java.lang");
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.canonicalTestNameOf(byte[][].class, "java.lang");
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.canonicalTestNameOf(Object[].class, "java.lang");
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.canonicalTestNameOf(Object[][][].class, "java.lang");
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.canonicalTestNameOf(Map.Entry[].class, "java.lang");
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.canonicalTestNameOf(Map.Entry[][][].class, "java.lang");
            fail();
        } catch (final IllegalArgumentException ignore) {}
    }

    @Test
    public void test_canonicalTestClassOf()
    throws Exception {
        assertEquals("ObjectTest.class", JAVA_LANG.canonicalTestClassOf(Object.class, "java.lang"));
        assertEquals("ObjectTest.class", JAVA_LANG_INTO.canonicalTestClassOf(Object.class, "java.lang"));
        assertEquals("ObjectTest.class", JAVA_LANG_SUBBED.canonicalTestClassOf(Object.class, "java.lang"));
        assertEquals("ObjectTest.class", JAVA_LANG_INTO_SUBBED.canonicalTestClassOf(Object.class, "java.lang"));
        assertEquals("java.util.MapTest.EntryTest.class", JAVA_LANG.canonicalTestClassOf(Map.Entry.class, "java.lang"));
        assertEquals("java.util.MapTest.EntryTest.class", JAVA_LANG_INTO.canonicalTestClassOf(Map.Entry.class, "java.lang"));
        assertEquals("foo.bar.java.util.MapTest.EntryTest.class", JAVA_LANG_SUBBED.canonicalTestClassOf(Map.Entry.class, "java.lang"));
        assertEquals("foo.bar.java.util.MapTest.EntryTest.class", JAVA_LANG_INTO_SUBBED.canonicalTestClassOf(Map.Entry.class, "java.lang"));
        assertEquals("java.lang.ObjectTest.class", JAVA_LANG.canonicalTestClassOf(Object.class, "java.util"));
        assertEquals("java.lang.ObjectTest.class", JAVA_LANG_INTO.canonicalTestClassOf(Object.class, "java.util"));
        assertEquals("foo.bar.java.lang.ObjectTest.class", JAVA_LANG_SUBBED.canonicalTestClassOf(Object.class, "java.util"));
        assertEquals("foo.bar.java.lang.ObjectTest.class", JAVA_LANG_INTO_SUBBED.canonicalTestClassOf(Object.class, "java.util"));
        assertEquals("MapTest.EntryTest.class", JAVA_LANG.canonicalTestClassOf(Map.Entry.class, "java.util"));
        assertEquals("MapTest.EntryTest.class", JAVA_LANG_INTO.canonicalTestClassOf(Map.Entry.class, "java.util"));
        assertEquals("MapTest.EntryTest.class", JAVA_LANG_SUBBED.canonicalTestClassOf(Map.Entry.class, "java.util"));
        assertEquals("MapTest.EntryTest.class", JAVA_LANG_INTO_SUBBED.canonicalTestClassOf(Map.Entry.class, "java.util"));

        try {
            JAVA_LANG.canonicalTestClassOf(byte.class, "java.lang");
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.canonicalTestClassOf(byte[][].class, "java.lang");
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.canonicalTestClassOf(Object[].class, "java.lang");
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.canonicalTestClassOf(Object[][][].class, "java.lang");
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.canonicalTestClassOf(Map.Entry[].class, "java.lang");
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.canonicalTestClassOf(Map.Entry[][][].class, "java.lang");
            fail();
        } catch (final IllegalArgumentException ignore) {}
    }

    public static class PublicClass {

        public PublicClass() {
        };

        protected PublicClass(final CharSequence protectedConstructor) {
        };

        private PublicClass(final String privateConstructor) {
        };

        PublicClass(final StringBuilder privateConstructor) {
        };

        public void publicMethod() {
        };

        protected void protectedMethod() {
        };

        private void privateMethod() {
        };

        void packagePrivateMethod() {
        };
    }

    protected static class ProtectedClass {
    }

    private static class PrivateClass {
    }

    static class PackagePrivateClass {
    }

    @Test
    public void testFolderForPackage()
    throws Exception {
        assertEquals(Paths.get("java", "lang"), JAVA_LANG.folderForPackage(Object.class.getPackage()));
        assertEquals(Paths.get("src", "main", "java", "java", "lang"), JAVA_LANG_INTO.folderForPackage(Object.class.getPackage()));
        assertEquals(Paths.get("foo", "bar", "java", "lang"), JAVA_LANG_SUBBED.folderForPackage(Object.class.getPackage()));
        assertEquals(Paths.get("src", "main", "java", "foo", "bar", "java", "lang"), JAVA_LANG_INTO_SUBBED.folderForPackage(Object.class.getPackage()));
        assertEquals(Paths.get("org", "j8unit", "tools"), JAVA_LANG.folderForPackage(PackagePrivateClass.class.getPackage()));
        assertEquals(Paths.get("src", "main", "java", "org", "j8unit", "tools"), JAVA_LANG_INTO.folderForPackage(PackagePrivateClass.class.getPackage()));
        assertEquals(Paths.get("foo", "bar", "org", "j8unit", "tools"), JAVA_LANG_SUBBED.folderForPackage(PackagePrivateClass.class.getPackage()));
        assertEquals(Paths.get("src", "main", "java", "foo", "bar", "org", "j8unit", "tools"),
                     JAVA_LANG_INTO_SUBBED.folderForPackage(PackagePrivateClass.class.getPackage()));
    }

    @Test
    public void testFolderForClass()
    throws Exception {
        assertEquals(Paths.get("java", "lang"), JAVA_LANG.folderForClass(Object.class));
        assertEquals(Paths.get("src", "main", "java", "java", "lang"), JAVA_LANG_INTO.folderForClass(Object.class));
        assertEquals(Paths.get("foo", "bar", "java", "lang"), JAVA_LANG_SUBBED.folderForClass(Object.class));
        assertEquals(Paths.get("src", "main", "java", "foo", "bar", "java", "lang"), JAVA_LANG_INTO_SUBBED.folderForClass(Object.class));
        assertEquals(Paths.get("org", "j8unit", "tools"), JAVA_LANG.folderForClass(PackagePrivateClass.class));
        assertEquals(Paths.get("src", "main", "java", "org", "j8unit", "tools"), JAVA_LANG_INTO.folderForClass(PackagePrivateClass.class));
        assertEquals(Paths.get("foo", "bar", "org", "j8unit", "tools"), JAVA_LANG_SUBBED.folderForClass(PackagePrivateClass.class));
        assertEquals(Paths.get("src", "main", "java", "foo", "bar", "org", "j8unit", "tools"), JAVA_LANG_INTO_SUBBED.folderForClass(PackagePrivateClass.class));
    }

    @Test
    public void testUseClass()
    throws Exception {
        // public
        assertTrue(JAVA_LANG.useClass(Object.class));
        assertTrue(JAVA_LANG_INTO.useClass(Object.class));
        assertTrue(JAVA_LANG_SUBBED.useClass(Object.class));
        assertTrue(JAVA_LANG_INTO_SUBBED.useClass(Object.class));
        assertTrue(JAVA_LANG.useClass(PublicClass.class));
        assertTrue(JAVA_LANG_INTO.useClass(PublicClass.class));
        assertTrue(JAVA_LANG_SUBBED.useClass(PublicClass.class));
        assertTrue(JAVA_LANG_INTO_SUBBED.useClass(PublicClass.class));
        // protected
        assertTrue(JAVA_LANG.useClass(ProtectedClass.class));
        assertTrue(JAVA_LANG_INTO.useClass(ProtectedClass.class));
        assertFalse(JAVA_LANG_SUBBED.useClass(ProtectedClass.class));
        assertFalse(JAVA_LANG_INTO_SUBBED.useClass(ProtectedClass.class));
        // private
        assertFalse(JAVA_LANG.useClass(PrivateClass.class));
        assertFalse(JAVA_LANG_INTO.useClass(PrivateClass.class));
        assertFalse(JAVA_LANG_SUBBED.useClass(PrivateClass.class));
        assertFalse(JAVA_LANG_INTO_SUBBED.useClass(PrivateClass.class));
        // package private
        assertTrue(JAVA_LANG.useClass(PackagePrivateClass.class));
        assertTrue(JAVA_LANG_INTO.useClass(PackagePrivateClass.class));
        assertFalse(JAVA_LANG_SUBBED.useClass(PackagePrivateClass.class));
        assertFalse(JAVA_LANG_INTO_SUBBED.useClass(PackagePrivateClass.class));
    }

    @Test
    public void testUseConstructor()
    throws Exception {
        // public
        assertTrue(JAVA_LANG.useConstructor(Object.class.getDeclaredConstructor()));
        assertTrue(JAVA_LANG.useConstructor(PublicClass.class.getDeclaredConstructor()));
        assertTrue(JAVA_LANG_INTO.useConstructor(PublicClass.class.getDeclaredConstructor()));
        assertTrue(JAVA_LANG_SUBBED.useConstructor(PublicClass.class.getDeclaredConstructor()));
        assertTrue(JAVA_LANG_INTO_SUBBED.useConstructor(PublicClass.class.getDeclaredConstructor()));
        // protected
        assertTrue(JAVA_LANG.useConstructor(PublicClass.class.getDeclaredConstructor(CharSequence.class)));
        assertTrue(JAVA_LANG_INTO.useConstructor(PublicClass.class.getDeclaredConstructor(CharSequence.class)));
        assertFalse(JAVA_LANG_SUBBED.useConstructor(PublicClass.class.getDeclaredConstructor(CharSequence.class)));
        assertFalse(JAVA_LANG_INTO_SUBBED.useConstructor(PublicClass.class.getDeclaredConstructor(CharSequence.class)));
        // private
        assertFalse(JAVA_LANG.useConstructor(PublicClass.class.getDeclaredConstructor(String.class)));
        assertFalse(JAVA_LANG_INTO.useConstructor(PublicClass.class.getDeclaredConstructor(String.class)));
        assertFalse(JAVA_LANG_SUBBED.useConstructor(PublicClass.class.getDeclaredConstructor(String.class)));
        assertFalse(JAVA_LANG_INTO_SUBBED.useConstructor(PublicClass.class.getDeclaredConstructor(String.class)));
        // package private
        assertTrue(JAVA_LANG.useConstructor(PublicClass.class.getDeclaredConstructor(StringBuilder.class)));
        assertTrue(JAVA_LANG_INTO.useConstructor(PublicClass.class.getDeclaredConstructor(StringBuilder.class)));
        assertFalse(JAVA_LANG_SUBBED.useConstructor(PublicClass.class.getDeclaredConstructor(StringBuilder.class)));
        assertFalse(JAVA_LANG_INTO_SUBBED.useConstructor(PublicClass.class.getDeclaredConstructor(StringBuilder.class)));
    }

    @Test
    public void testUseMethod()
    throws Exception {
        // public
        assertTrue(JAVA_LANG.useMethod(Object.class.getDeclaredMethod("toString")));
        assertTrue(JAVA_LANG_INTO.useMethod(Object.class.getDeclaredMethod("toString")));
        assertTrue(JAVA_LANG_SUBBED.useMethod(Object.class.getDeclaredMethod("toString")));
        assertTrue(JAVA_LANG_INTO_SUBBED.useMethod(Object.class.getDeclaredMethod("toString")));
        assertTrue(JAVA_LANG.useMethod(PublicClass.class.getDeclaredMethod("publicMethod")));
        assertTrue(JAVA_LANG_INTO.useMethod(PublicClass.class.getDeclaredMethod("publicMethod")));
        assertTrue(JAVA_LANG_SUBBED.useMethod(PublicClass.class.getDeclaredMethod("publicMethod")));
        assertTrue(JAVA_LANG_INTO_SUBBED.useMethod(PublicClass.class.getDeclaredMethod("publicMethod")));
        // protected
        assertTrue(JAVA_LANG.useMethod(PublicClass.class.getDeclaredMethod("protectedMethod")));
        assertTrue(JAVA_LANG_INTO.useMethod(PublicClass.class.getDeclaredMethod("protectedMethod")));
        assertFalse(JAVA_LANG_SUBBED.useMethod(PublicClass.class.getDeclaredMethod("protectedMethod")));
        assertFalse(JAVA_LANG_INTO_SUBBED.useMethod(PublicClass.class.getDeclaredMethod("protectedMethod")));
        // private
        assertFalse(JAVA_LANG.useMethod(PublicClass.class.getDeclaredMethod("privateMethod")));
        assertFalse(JAVA_LANG_INTO.useMethod(PublicClass.class.getDeclaredMethod("privateMethod")));
        assertFalse(JAVA_LANG_SUBBED.useMethod(PublicClass.class.getDeclaredMethod("privateMethod")));
        assertFalse(JAVA_LANG_INTO_SUBBED.useMethod(PublicClass.class.getDeclaredMethod("privateMethod")));
        // package private
        assertTrue(JAVA_LANG.useMethod(PublicClass.class.getDeclaredMethod("packagePrivateMethod")));
        assertTrue(JAVA_LANG_INTO.useMethod(PublicClass.class.getDeclaredMethod("packagePrivateMethod")));
        assertFalse(JAVA_LANG_SUBBED.useMethod(PublicClass.class.getDeclaredMethod("packagePrivateMethod")));
        assertFalse(JAVA_LANG_INTO_SUBBED.useMethod(PublicClass.class.getDeclaredMethod("packagePrivateMethod")));
    }

    @Test
    public void testName()
    throws Exception {
        assertEquals("TypeTest", JAVA_LANG.verySimpleCanonicalTestNameOf(ProcessBuilder.Redirect.Type.class));
        assertEquals("ProcessBuilderTest.RedirectTest.TypeTest", JAVA_LANG.simpleCanonicalTestNameOf(ProcessBuilder.Redirect.Type.class));
        assertEquals("ProcessBuilderTest.RedirectTest.TypeTest", JAVA_LANG.canonicalTestNameOf(ProcessBuilder.Redirect.Type.class, "java.lang"));
        assertEquals("java.lang.ProcessBuilderTest.RedirectTest.TypeTest", JAVA_LANG.canonicalTestNameOf(ProcessBuilder.Redirect.Type.class, "java.util"));
    }

}
