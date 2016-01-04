package org.j8unit.tools;

import static java.util.Collections.emptyMap;
import static org.j8unit.tools.GeneratorAnalysis.arrayDimensionOf;
import static org.j8unit.tools.GeneratorAnalysis.baseComponentTypeOf;
import static org.j8unit.tools.GeneratorAnalysis.getInterfaces;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.Closeable;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import org.junit.Test;

public class GeneratorAnalysisTest {

    @Test
    public void test_baseComponentTypeOf()
    throws Exception {
        assertEquals(byte.class, baseComponentTypeOf(byte.class));
        assertEquals(byte.class, baseComponentTypeOf(byte[][].class));
        assertEquals(Object.class, baseComponentTypeOf(Object.class));
        assertEquals(Object.class, baseComponentTypeOf(Object[].class));
        assertEquals(Object.class, baseComponentTypeOf(Object[][][].class));
        assertEquals(Map.Entry.class, baseComponentTypeOf(Map.Entry.class));
        assertEquals(Map.Entry.class, baseComponentTypeOf(Map.Entry[].class));
        assertEquals(Map.Entry.class, baseComponentTypeOf(Map.Entry[][][].class));
    }

    @Test
    public void test_arrayDimensionOf()
    throws Exception {
        assertEquals(0, arrayDimensionOf(byte.class));
        assertEquals(2, arrayDimensionOf(byte[][].class));
        assertEquals(0, arrayDimensionOf(Object.class));
        assertEquals(1, arrayDimensionOf(Object[].class));
        assertEquals(3, arrayDimensionOf(Object[][][].class));
        assertEquals(0, arrayDimensionOf(Map.Entry.class));
        assertEquals(1, arrayDimensionOf(Map.Entry[].class));
        assertEquals(3, arrayDimensionOf(Map.Entry[][][].class));
    }

    @Test
    public void test_getInterfaces() {
        assertEquals(emptyMap(), getInterfaces(Object.class));
        assertEquals(emptyMap(), getInterfaces(Serializable.class));
        assertEquals(emptyMap(), getInterfaces(AutoCloseable.class));
        assertEquals(1, getInterfaces(Closeable.class).size());
        assertTrue(getInterfaces(Closeable.class).keySet().contains(AutoCloseable.class));
        assertEquals("java.lang.AutoCloseable", getInterfaces(Closeable.class).get(AutoCloseable.class).getTypeName());
        assertEquals(3, getInterfaces(String.class).size());
        assertTrue(getInterfaces(String.class).keySet().contains(Serializable.class));
        assertTrue(getInterfaces(String.class).keySet().contains(Comparable.class));
        assertTrue(getInterfaces(String.class).keySet().contains(CharSequence.class));
        assertEquals("java.io.Serializable", getInterfaces(String.class).get(Serializable.class).getTypeName());
        assertEquals("java.lang.Comparable<java.lang.String>", getInterfaces(String.class).get(Comparable.class).toString());
        assertEquals("java.lang.CharSequence", getInterfaces(String.class).get(CharSequence.class).getTypeName());
        assertEquals(emptyMap(), getInterfaces(Iterable.class));
        assertEquals(1, getInterfaces(Collection.class).size());
        assertTrue(getInterfaces(Collection.class).keySet().contains(Iterable.class));
        assertEquals("java.lang.Iterable<E>", getInterfaces(Collection.class).get(Iterable.class).toString());
    }

}
