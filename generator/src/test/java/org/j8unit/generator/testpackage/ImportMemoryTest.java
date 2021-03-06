package org.j8unit.generator.testpackage;

import static org.j8unit.generator.util.Java.JAVA_LANG;
import static org.j8unit.generator.util.Java.JAVA_NAMESPACE_DELIMITER;
import static org.j8unit.generator.util.Optionals.optionalise;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.j8unit.generator.api.ImportMemory;
import org.junit.Test;

public class ImportMemoryTest {

    public static final class Collection
    extends Object {

    }

    @Test
    public void testAddJavaLang()
    throws Exception {
        final ImportMemory memory = new ImportMemory();
        assertTrue(memory.add(java.lang.String.class));
    }

    @Test
    public void testAddJavaLangNested()
    throws Exception {
        final ImportMemory memory = new ImportMemory();
        assertTrue(memory.add(java.lang.Character.UnicodeScript.class));
    }

    public static final class String
    extends Object {
    }

    @Test
    public void testClassWithNameEqualToJavaLang()
    throws Exception {
        final ImportMemory memory = new ImportMemory();
        final Class<String> alternativeStringClass = ImportMemoryTest.String.class;
        final java.lang.String originStringClass = JAVA_LANG + JAVA_NAMESPACE_DELIMITER + alternativeStringClass.getSimpleName();
        assertTrue(optionalise(() -> Class.forName(originStringClass)).isPresent());
        assertFalse(memory.add(alternativeStringClass));
    }

    @Test
    public void testMultipleImport_1()
    throws Exception {
        final ImportMemory memory = new ImportMemory();
        assertTrue(memory.add(java.util.Collection.class));
        assertFalse(memory.add(org.j8unit.generator.testpackage.Collection.class));
        assertFalse(memory.add(org.j8unit.generator.testpackage.ImportMemoryTest.Collection.class));
    }

    @Test
    public void testMultipleImport_2()
    throws Exception {
        final ImportMemory memory = new ImportMemory();
        assertTrue(memory.add(org.j8unit.generator.testpackage.Collection.class));
        assertFalse(memory.add(java.util.Collection.class));
        assertFalse(memory.add(org.j8unit.generator.testpackage.ImportMemoryTest.Collection.class));
    }

    @Test
    public void testMultipleImport_3()
    throws Exception {
        final ImportMemory memory = new ImportMemory();
        assertTrue(memory.add(org.j8unit.generator.testpackage.ImportMemoryTest.Collection.class));
        assertFalse(memory.add(java.util.Collection.class));
        assertFalse(memory.add(org.j8unit.generator.testpackage.Collection.class));
    }

    @Test
    public void testMultipleImport_4()
    throws Exception {
        final ImportMemory memory = new ImportMemory();
        assertTrue(memory.add(java.util.Collection[][].class));
        assertFalse(memory.add(org.j8unit.generator.testpackage.Collection.class));
    }

    @Test
    public void testMultipleImport_5()
    throws Exception {
        final ImportMemory memory = new ImportMemory();
        assertTrue(memory.add(java.util.Collection.class));
        assertFalse(memory.add(org.j8unit.generator.testpackage.Collection[][].class));
    }

    @Test
    public void testMultipleStaticImport_1()
    throws Exception {
        final ImportMemory memory = new ImportMemory();
        assertTrue(memory.addStatic(java.util.Arrays.class, "stream"));
        assertTrue(memory.addStatic(java.util.Arrays.class, "sort"));
        assertTrue(memory.addStatic(java.util.Arrays.class, "fill"));
        assertFalse(memory.addStatic(org.j8unit.generator.testpackage.Collection.class, "stream"));
        assertTrue(memory.addStatic(org.j8unit.generator.testpackage.Collection.class, "copy"));
        assertFalse(memory.addStatic(org.j8unit.generator.testpackage.ImportMemoryTest.Collection.class, "stream"));
        assertFalse(memory.addStatic(org.j8unit.generator.testpackage.ImportMemoryTest.Collection.class, "copy"));
    }

    @Test
    public void testMultipleStaticImport_2()
    throws Exception {
        final ImportMemory memory = new ImportMemory();
        assertTrue(memory.addStatic(org.j8unit.generator.testpackage.Collection.class, "stream"));
        assertTrue(memory.addStatic(org.j8unit.generator.testpackage.Collection.class, "sort"));
        assertTrue(memory.addStatic(org.j8unit.generator.testpackage.Collection.class, "fill"));
        assertFalse(memory.addStatic(java.util.Collection.class, "stream"));
        assertTrue(memory.addStatic(java.util.Collection.class, "copy"));
        assertFalse(memory.addStatic(org.j8unit.generator.testpackage.ImportMemoryTest.Collection.class, "stream"));
        assertFalse(memory.addStatic(org.j8unit.generator.testpackage.ImportMemoryTest.Collection.class, "copy"));
    }

    @Test
    public void testMultipleStaticImport_3()
    throws Exception {
        final ImportMemory memory = new ImportMemory();
        assertTrue(memory.addStatic(org.j8unit.generator.testpackage.ImportMemoryTest.Collection.class, "stream"));
        assertTrue(memory.addStatic(org.j8unit.generator.testpackage.ImportMemoryTest.Collection.class, "sort"));
        assertTrue(memory.addStatic(org.j8unit.generator.testpackage.ImportMemoryTest.Collection.class, "fill"));
        assertFalse(memory.addStatic(java.util.Collection.class, "stream"));
        assertTrue(memory.addStatic(java.util.Collection.class, "copy"));
        assertFalse(memory.addStatic(org.j8unit.generator.testpackage.Collection.class, "stream"));
        assertFalse(memory.addStatic(org.j8unit.generator.testpackage.Collection.class, "copy"));
    }

}

class Collection
extends Object {
}
