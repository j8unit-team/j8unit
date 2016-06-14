package org.j8unit.generator.util;

import static org.j8unit.generator.util.Arrays.arrayAnalysisOf;
import static org.j8unit.generator.util.Arrays.arrayDimensionOf;
import static org.j8unit.generator.util.Arrays.baseComponentTypeOf;
import static org.junit.Assert.assertEquals;
import java.lang.reflect.Array;
import java.util.Map;
import org.junit.Test;

public class ArraysTest {

    @Test
    public void test_arrayAnalysisOf()
    throws Exception {
        assertEquals(byte.class, arrayAnalysisOf(byte.class).getKey());
        assertEquals(0, (int) arrayAnalysisOf(byte.class).getValue());
        assertEquals(byte.class, arrayAnalysisOf(byte[][].class).getKey());
        assertEquals(2, (int) arrayAnalysisOf(byte[][].class).getValue());
        assertEquals(Object.class, arrayAnalysisOf(Object.class).getKey());
        assertEquals(0, (int) arrayAnalysisOf(Object.class).getValue());
        assertEquals(Object.class, arrayAnalysisOf(Object[].class).getKey());
        assertEquals(1, (int) arrayAnalysisOf(Object[].class).getValue());
        assertEquals(Object.class, arrayAnalysisOf(Object[][][].class).getKey());
        assertEquals(3, (int) arrayAnalysisOf(Object[][][].class).getValue());
        assertEquals(Map.Entry.class, arrayAnalysisOf(Map.Entry.class).getKey());
        assertEquals(0, (int) arrayAnalysisOf(Map.Entry.class).getValue());
        assertEquals(Map.Entry.class, arrayAnalysisOf(Map.Entry[].class).getKey());
        assertEquals(1, (int) arrayAnalysisOf(Map.Entry[].class).getValue());
        assertEquals(Map.Entry.class, arrayAnalysisOf(Map.Entry[][][].class).getKey());
        assertEquals(3, (int) arrayAnalysisOf(Map.Entry[][][].class).getValue());
    }

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

}
