package org.j8unit.tools;

import static java.lang.String.format;
import static org.j8unit.generator.analysis.AccessScope.CLASS;
import static org.j8unit.generator.analysis.AccessScope.INSTANCE;
import static org.j8unit.generator.util.BiFunctions.curryFirst;
import static org.j8unit.generator.util.TypeAnalysis.getInterfaces;
import static org.junit.Assert.*;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DayOfWeek;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.function.Function;
import org.j8unit.generator.api.GeneratorSetup;
import org.junit.Before;
import org.junit.Test;
import com.sun.net.httpserver.Headers;

public class GeneratorSetupTest {

    public static final GeneratorSetup JAVA_LANG = GeneratorSetup.forJavaPackage("java.lang") //
                                                                 .intoTargetFolder(".") //
                                                                 .asSubPackageOf("") //
                                                                 .doTestClassNamingWith("", false, "Test") //
                                                                 .doTestConstructorNamingWith("create_", false, "") //
                                                                 .doTestMethodNamingWith("test_", false, "") //
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
    
    @Before
    public void testName()
    throws Exception {
        JAVA_LANG.resetImportMemory();
    }

    @Test
    public void get_INSTANCE_TestClassSuperTypesMapper()
    throws Exception {
        final Function<? super Entry<? extends Class<?>, ? extends Type>, ? extends String> mapper = curryFirst(INSTANCE::getTestInterfaceSuperTypeDefinition, JAVA_LANG);
        {
            final Entry<? extends Class<?>, ? extends Type> e = getInterfaces(Enum.class).entrySet().iterator().next();
            final String r = mapper.apply(e);
            assertEquals("java.lang.ComparableTest<SUT, E>", r);
        }
        {
            final Entry<? extends Class<?>, ? extends Type> e = new SimpleImmutableEntry<>(Comparable.class, getInterfaces(String.class).get(Comparable.class));
            final String r = mapper.apply(e);
            assertEquals("java.lang.ComparableTest<SUT, String>", r);
        }
        {
            JAVA_LANG.resetImportMemory();
            final Entry<? extends Class<?>, ? extends Type> e = new SimpleImmutableEntry<>(DayOfWeek.class.getSuperclass(),
                                                                                           DayOfWeek.class.getGenericSuperclass());
            final String r = mapper.apply(e);
            assertEquals("java.lang.EnumTest<SUT, DayOfWeek>", r);
            assertEquals(format("import java.time.DayOfWeek;%n"),  JAVA_LANG.renderImport("java.lang"));
            JAVA_LANG.resetImportMemory();
        }
        {
            final Entry<? extends Class<?>, ? extends Type> e = new SimpleImmutableEntry<>(String.class, String.class);
            final String r = mapper.apply(e);
            assertEquals("java.lang.StringTest<SUT>", r);
        }
        {
            final Entry<? extends Class<?>, ? extends Type> e = getInterfaces(Collection.class).entrySet().iterator().next();
            final String r = mapper.apply(e);
            assertEquals("java.lang.IterableTest<SUT, E>", r);
        }
        {
            final Entry<? extends Class<?>, ? extends Type> e = new SimpleImmutableEntry<>(Map.class, Map.class);
            final String r = mapper.apply(e);
            assertEquals("java.util.MapTest<SUT, K, V>", r);
        }
        {
            final Entry<? extends Class<?>, ? extends Type> e = new SimpleImmutableEntry<>(Properties.class.getSuperclass(),
                                                                                           Properties.class.getGenericSuperclass());
            final String r = mapper.apply(e);
            assertEquals("java.util.HashtableTest<SUT, Object, Object>", r);
        }
        {
            JAVA_LANG.resetImportMemory();
            final Entry<? extends Class<?>, ? extends Type> e = getInterfaces(Headers.class).entrySet().iterator().next();
            final String r = mapper.apply(e);
            assertEquals("java.util.MapTest<SUT, String, List<String>>", r);
            assertEquals(format("import java.util.List;%n"),  JAVA_LANG.renderImport("java.lang"));
            JAVA_LANG.resetImportMemory();
        }
    }

    @Test
    public void get_CLASS_TestClassSuperTypesMapper()
    throws Exception {
        final Function<? super Entry<? extends Class<?>, ? extends Type>, ? extends String> mapper = curryFirst(CLASS::getTestInterfaceSuperTypeDefinition, JAVA_LANG);
        {
            final Entry<? extends Class<?>, ? extends Type> e = getInterfaces(Enum.class).entrySet().iterator().next();
            final String r = mapper.apply(e);
            assertEquals("java.lang.ComparableTest<SUT>", r);
        }
        {
            final Entry<? extends Class<?>, ? extends Type> e = new SimpleImmutableEntry<>(Comparable.class, getInterfaces(String.class).get(Comparable.class));
            final String r = mapper.apply(e);
            assertEquals("java.lang.ComparableTest<SUT>", r);
        }
        {
            final Entry<? extends Class<?>, ? extends Type> e = new SimpleImmutableEntry<>(DayOfWeek.class.getSuperclass(),
                                                                                           DayOfWeek.class.getGenericSuperclass());
            final String r = mapper.apply(e);
            assertEquals("java.lang.EnumTest<SUT>", r);
        }
        {
            final Entry<? extends Class<?>, ? extends Type> e = new SimpleImmutableEntry<>(String.class, String.class);
            final String r = mapper.apply(e);
            assertEquals("java.lang.StringTest<SUT>", r);
        }
        {
            final Entry<? extends Class<?>, ? extends Type> e = getInterfaces(Collection.class).entrySet().iterator().next();
            final String r = mapper.apply(e);
            assertEquals("java.lang.IterableTest<SUT>", r);
        }
        {
            final Entry<? extends Class<?>, ? extends Type> e = new SimpleImmutableEntry<>(Map.class, Map.class);
            final String r = mapper.apply(e);
            assertEquals("java.util.MapTest<SUT>", r);
        }
        {
            final Entry<? extends Class<?>, ? extends Type> e = new SimpleImmutableEntry<>(Properties.class.getSuperclass(),
                                                                                           Properties.class.getGenericSuperclass());
            final String r = mapper.apply(e);
            assertEquals("java.util.HashtableTest<SUT>", r);
        }
        {
            final Entry<? extends Class<?>, ? extends Type> e = getInterfaces(Headers.class).entrySet().iterator().next();
            final String r = mapper.apply(e);
            assertEquals("java.util.MapTest<SUT>", r);
        }
    }

    @Test
    public void test_targetSimpleNameOf()
    throws Exception {
        assertEquals("ObjectTest", JAVA_LANG.targetBasicNameOf(Object.class));
        assertEquals("ObjectTest", JAVA_LANG_INTO.targetBasicNameOf(Object.class));
        assertEquals("ObjectTest", JAVA_LANG_SUBBED.targetBasicNameOf(Object.class));
        assertEquals("ObjectTest", JAVA_LANG_INTO_SUBBED.targetBasicNameOf(Object.class));
        assertEquals("MapTest.EntryTest", JAVA_LANG.targetBasicNameOf(Map.Entry.class));
        assertEquals("MapTest.EntryTest", JAVA_LANG_INTO.targetBasicNameOf(Map.Entry.class));
        assertEquals("MapTest.EntryTest", JAVA_LANG_SUBBED.targetBasicNameOf(Map.Entry.class));
        assertEquals("MapTest.EntryTest", JAVA_LANG_INTO_SUBBED.targetBasicNameOf(Map.Entry.class));

        try {
            JAVA_LANG.targetBasicNameOf(byte.class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetBasicNameOf(byte[][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetBasicNameOf(Object[].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetBasicNameOf(Object[][][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetBasicNameOf(Map.Entry[].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetBasicNameOf(Map.Entry[][][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
    }

    @Test
    public void test_targetSimpleClassOf()
    throws Exception {
        assertEquals("ObjectTest.class", JAVA_LANG.targetBasicClassOf(Object.class));
        assertEquals("ObjectTest.class", JAVA_LANG_INTO.targetBasicClassOf(Object.class));
        assertEquals("ObjectTest.class", JAVA_LANG_SUBBED.targetBasicClassOf(Object.class));
        assertEquals("ObjectTest.class", JAVA_LANG_INTO_SUBBED.targetBasicClassOf(Object.class));
        assertEquals("MapTest.EntryTest.class", JAVA_LANG.targetBasicClassOf(Map.Entry.class));
        assertEquals("MapTest.EntryTest.class", JAVA_LANG_INTO.targetBasicClassOf(Map.Entry.class));
        assertEquals("MapTest.EntryTest.class", JAVA_LANG_SUBBED.targetBasicClassOf(Map.Entry.class));
        assertEquals("MapTest.EntryTest.class", JAVA_LANG_INTO_SUBBED.targetBasicClassOf(Map.Entry.class));

        try {
            JAVA_LANG.targetBasicClassOf(byte.class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetBasicClassOf(byte[][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetBasicClassOf(Object[].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetBasicClassOf(Object[][][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetBasicClassOf(Map.Entry[].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetBasicClassOf(Map.Entry[][][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
    }

    @Test
    public void test_targetCanonicalNameOf()
    throws Exception {
        assertEquals("java.lang.ObjectTest", JAVA_LANG.targetCanonicalNameOf(Object.class));
        assertEquals("java.lang.ObjectTest", JAVA_LANG_INTO.targetCanonicalNameOf(Object.class));
        assertEquals("foo.bar.java.lang.ObjectTest", JAVA_LANG_SUBBED.targetCanonicalNameOf(Object.class));
        assertEquals("foo.bar.java.lang.ObjectTest", JAVA_LANG_INTO_SUBBED.targetCanonicalNameOf(Object.class));
        assertEquals("java.util.MapTest.EntryTest", JAVA_LANG.targetCanonicalNameOf(Map.Entry.class));
        assertEquals("java.util.MapTest.EntryTest", JAVA_LANG_INTO.targetCanonicalNameOf(Map.Entry.class));
        assertEquals("foo.bar.java.util.MapTest.EntryTest", JAVA_LANG_SUBBED.targetCanonicalNameOf(Map.Entry.class));
        assertEquals("foo.bar.java.util.MapTest.EntryTest", JAVA_LANG_INTO_SUBBED.targetCanonicalNameOf(Map.Entry.class));
        assertEquals("java.lang.ObjectTest", JAVA_LANG.targetCanonicalNameOf(Object.class));
        assertEquals("java.lang.ObjectTest", JAVA_LANG_INTO.targetCanonicalNameOf(Object.class));
        assertEquals("foo.bar.java.lang.ObjectTest", JAVA_LANG_SUBBED.targetCanonicalNameOf(Object.class));
        assertEquals("foo.bar.java.lang.ObjectTest", JAVA_LANG_INTO_SUBBED.targetCanonicalNameOf(Object.class));
        assertEquals("java.util.MapTest.EntryTest", JAVA_LANG.targetCanonicalNameOf(Map.Entry.class));
        assertEquals("java.util.MapTest.EntryTest", JAVA_LANG_INTO.targetCanonicalNameOf(Map.Entry.class));
        assertEquals("foo.bar.java.util.MapTest.EntryTest", JAVA_LANG_SUBBED.targetCanonicalNameOf(Map.Entry.class));
        assertEquals("foo.bar.java.util.MapTest.EntryTest", JAVA_LANG_INTO_SUBBED.targetCanonicalNameOf(Map.Entry.class));

        try {
            JAVA_LANG.targetCanonicalNameOf(byte.class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetCanonicalNameOf(byte[][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetCanonicalNameOf(Object[].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetCanonicalNameOf(Object[][][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetCanonicalNameOf(Map.Entry[].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetCanonicalNameOf(Map.Entry[][][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
    }

    @Test
    public void test_targetCanonicalClassOf()
    throws Exception {
        assertEquals("java.lang.ObjectTest.class", JAVA_LANG.targetCanonicalClassOf(Object.class));
        assertEquals("java.lang.ObjectTest.class", JAVA_LANG_INTO.targetCanonicalClassOf(Object.class));
        assertEquals("foo.bar.java.lang.ObjectTest.class", JAVA_LANG_SUBBED.targetCanonicalClassOf(Object.class));
        assertEquals("foo.bar.java.lang.ObjectTest.class", JAVA_LANG_INTO_SUBBED.targetCanonicalClassOf(Object.class));
        assertEquals("java.util.MapTest.EntryTest.class", JAVA_LANG.targetCanonicalClassOf(Map.Entry.class));
        assertEquals("java.util.MapTest.EntryTest.class", JAVA_LANG_INTO.targetCanonicalClassOf(Map.Entry.class));
        assertEquals("foo.bar.java.util.MapTest.EntryTest.class", JAVA_LANG_SUBBED.targetCanonicalClassOf(Map.Entry.class));
        assertEquals("foo.bar.java.util.MapTest.EntryTest.class", JAVA_LANG_INTO_SUBBED.targetCanonicalClassOf(Map.Entry.class));
        assertEquals("java.lang.ObjectTest.class", JAVA_LANG.targetCanonicalClassOf(Object.class));
        assertEquals("java.lang.ObjectTest.class", JAVA_LANG_INTO.targetCanonicalClassOf(Object.class));
        assertEquals("foo.bar.java.lang.ObjectTest.class", JAVA_LANG_SUBBED.targetCanonicalClassOf(Object.class));
        assertEquals("foo.bar.java.lang.ObjectTest.class", JAVA_LANG_INTO_SUBBED.targetCanonicalClassOf(Object.class));
        assertEquals("java.util.MapTest.EntryTest.class", JAVA_LANG.targetCanonicalClassOf(Map.Entry.class));
        assertEquals("java.util.MapTest.EntryTest.class", JAVA_LANG_INTO.targetCanonicalClassOf(Map.Entry.class));
        assertEquals("foo.bar.java.util.MapTest.EntryTest.class", JAVA_LANG_SUBBED.targetCanonicalClassOf(Map.Entry.class));
        assertEquals("foo.bar.java.util.MapTest.EntryTest.class", JAVA_LANG_INTO_SUBBED.targetCanonicalClassOf(Map.Entry.class));

        try {
            JAVA_LANG.targetCanonicalClassOf(byte.class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetCanonicalClassOf(byte[][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetCanonicalClassOf(Object[].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetCanonicalClassOf(Object[][][].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetCanonicalClassOf(Map.Entry[].class);
            fail();
        } catch (final IllegalArgumentException ignore) {}
        try {
            JAVA_LANG.targetCanonicalClassOf(Map.Entry[][][].class);
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
        final Path here = Paths.get(".");
        assertEquals(Paths.get("java", "lang").toAbsolutePath(), JAVA_LANG.targetFolderFor(Object.class.getPackage()));
        assertEquals(Paths.get("src", "main", "java", "java", "lang").toAbsolutePath(), JAVA_LANG_INTO.targetFolderFor(Object.class.getPackage()));
        assertEquals(Paths.get("foo", "bar", "java", "lang").toAbsolutePath(), JAVA_LANG_SUBBED.targetFolderFor(Object.class.getPackage()));
        assertEquals(Paths.get("src", "main", "java", "foo", "bar", "java", "lang").toAbsolutePath(),
                     JAVA_LANG_INTO_SUBBED.targetFolderFor(Object.class.getPackage()));
        assertEquals(Paths.get("org", "j8unit", "tools").toAbsolutePath(), JAVA_LANG.targetFolderFor(PackagePrivateClass.class.getPackage()));
        assertEquals(Paths.get("src", "main", "java", "org", "j8unit", "tools").toAbsolutePath(),
                     JAVA_LANG_INTO.targetFolderFor(PackagePrivateClass.class.getPackage()));
        assertEquals(Paths.get("foo", "bar", "org", "j8unit", "tools").toAbsolutePath(),
                     JAVA_LANG_SUBBED.targetFolderFor(PackagePrivateClass.class.getPackage()));
        assertEquals(Paths.get("src", "main", "java", "foo", "bar", "org", "j8unit", "tools").toAbsolutePath(),
                     JAVA_LANG_INTO_SUBBED.targetFolderFor(PackagePrivateClass.class.getPackage()));
    }

    @Test
    public void testFolderForClass()
    throws Exception {
        assertEquals(Paths.get("java", "lang").toAbsolutePath(), JAVA_LANG.targetFolderFor(Object.class));
        assertEquals(Paths.get("src", "main", "java", "java", "lang").toAbsolutePath(), JAVA_LANG_INTO.targetFolderFor(Object.class));
        assertEquals(Paths.get("foo", "bar", "java", "lang").toAbsolutePath(), JAVA_LANG_SUBBED.targetFolderFor(Object.class));
        assertEquals(Paths.get("src", "main", "java", "foo", "bar", "java", "lang").toAbsolutePath(), JAVA_LANG_INTO_SUBBED.targetFolderFor(Object.class));
        assertEquals(Paths.get("org", "j8unit", "tools").toAbsolutePath(), JAVA_LANG.targetFolderFor(PackagePrivateClass.class));
        assertEquals(Paths.get("src", "main", "java", "org", "j8unit", "tools").toAbsolutePath(), JAVA_LANG_INTO.targetFolderFor(PackagePrivateClass.class));
        assertEquals(Paths.get("foo", "bar", "org", "j8unit", "tools").toAbsolutePath(), JAVA_LANG_SUBBED.targetFolderFor(PackagePrivateClass.class));
        assertEquals(Paths.get("src", "main", "java", "foo", "bar", "org", "j8unit", "tools").toAbsolutePath(),
                     JAVA_LANG_INTO_SUBBED.targetFolderFor(PackagePrivateClass.class));
    }

    @Test
    public void testUseClass()
    throws Exception {
        // public
        assertTrue(JAVA_LANG.useType(Object.class));
        assertTrue(JAVA_LANG_INTO.useType(Object.class));
        assertTrue(JAVA_LANG_SUBBED.useType(Object.class));
        assertTrue(JAVA_LANG_INTO_SUBBED.useType(Object.class));
        assertTrue(JAVA_LANG.useType(PublicClass.class));
        assertTrue(JAVA_LANG_INTO.useType(PublicClass.class));
        assertTrue(JAVA_LANG_SUBBED.useType(PublicClass.class));
        assertTrue(JAVA_LANG_INTO_SUBBED.useType(PublicClass.class));
        // protected
        assertTrue(JAVA_LANG.useType(ProtectedClass.class));
        assertTrue(JAVA_LANG_INTO.useType(ProtectedClass.class));
        assertFalse(JAVA_LANG_SUBBED.useType(ProtectedClass.class));
        assertFalse(JAVA_LANG_INTO_SUBBED.useType(ProtectedClass.class));
        // private
        assertFalse(JAVA_LANG.useType(PrivateClass.class));
        assertFalse(JAVA_LANG_INTO.useType(PrivateClass.class));
        assertFalse(JAVA_LANG_SUBBED.useType(PrivateClass.class));
        assertFalse(JAVA_LANG_INTO_SUBBED.useType(PrivateClass.class));
        // package private
        assertTrue(JAVA_LANG.useType(PackagePrivateClass.class));
        assertTrue(JAVA_LANG_INTO.useType(PackagePrivateClass.class));
        assertFalse(JAVA_LANG_SUBBED.useType(PackagePrivateClass.class));
        assertFalse(JAVA_LANG_INTO_SUBBED.useType(PackagePrivateClass.class));
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
    public void testVariousTestNames()
    throws Exception {
        assertEquals("ObjectTest", JAVA_LANG.targetSimpleNameOf(Object.class));
        assertEquals("ObjectTest", JAVA_LANG.targetBasicNameOf(Object.class));
        assertEquals("java.lang.ObjectTest", JAVA_LANG.targetCanonicalNameOf(Object.class));

        assertEquals("StringTest", JAVA_LANG.targetSimpleNameOf(String.class));
        assertEquals("StringTest", JAVA_LANG.targetBasicNameOf(String.class));
        assertEquals("java.lang.StringTest", JAVA_LANG.targetCanonicalNameOf(String.class));

        assertEquals("MapTest", JAVA_LANG.targetSimpleNameOf(Map.class));
        assertEquals("MapTest", JAVA_LANG.targetBasicNameOf(Map.class));
        assertEquals("java.util.MapTest", JAVA_LANG.targetCanonicalNameOf(Map.class));

        assertEquals("EntryTest", JAVA_LANG.targetSimpleNameOf(Map.Entry.class));
        assertEquals("MapTest.EntryTest", JAVA_LANG.targetBasicNameOf(Map.Entry.class));
        assertEquals("java.util.MapTest.EntryTest", JAVA_LANG.targetCanonicalNameOf(Map.Entry.class));

        assertEquals("TypeTest", JAVA_LANG.targetSimpleNameOf(ProcessBuilder.Redirect.Type.class));
        assertEquals("ProcessBuilderTest.RedirectTest.TypeTest", JAVA_LANG.targetBasicNameOf(ProcessBuilder.Redirect.Type.class));
        assertEquals("java.lang.ProcessBuilderTest.RedirectTest.TypeTest", JAVA_LANG.targetCanonicalNameOf(ProcessBuilder.Redirect.Type.class));
    }

    @Test
    public void testVariousTestClasses()
    throws Exception {
        assertEquals("ObjectTest.class", JAVA_LANG.targetSimpleClassOf(Object.class));
        assertEquals("ObjectTest.class", JAVA_LANG.targetBasicClassOf(Object.class));
        assertEquals("java.lang.ObjectTest.class", JAVA_LANG.targetCanonicalClassOf(Object.class));

        assertEquals("StringTest.class", JAVA_LANG.targetSimpleClassOf(String.class));
        assertEquals("StringTest.class", JAVA_LANG.targetBasicClassOf(String.class));
        assertEquals("java.lang.StringTest.class", JAVA_LANG.targetCanonicalClassOf(String.class));

        assertEquals("MapTest.class", JAVA_LANG.targetSimpleClassOf(Map.class));
        assertEquals("MapTest.class", JAVA_LANG.targetBasicClassOf(Map.class));
        assertEquals("java.util.MapTest.class", JAVA_LANG.targetCanonicalClassOf(Map.class));

        assertEquals("EntryTest.class", JAVA_LANG.targetSimpleClassOf(Map.Entry.class));
        assertEquals("MapTest.EntryTest.class", JAVA_LANG.targetBasicClassOf(Map.Entry.class));
        assertEquals("java.util.MapTest.EntryTest.class", JAVA_LANG.targetCanonicalClassOf(Map.Entry.class));

        assertEquals("TypeTest.class", JAVA_LANG.targetSimpleClassOf(ProcessBuilder.Redirect.Type.class));
        assertEquals("ProcessBuilderTest.RedirectTest.TypeTest.class", JAVA_LANG.targetBasicClassOf(ProcessBuilder.Redirect.Type.class));
        assertEquals("java.lang.ProcessBuilderTest.RedirectTest.TypeTest.class", JAVA_LANG.targetCanonicalClassOf(ProcessBuilder.Redirect.Type.class));
    }

}
