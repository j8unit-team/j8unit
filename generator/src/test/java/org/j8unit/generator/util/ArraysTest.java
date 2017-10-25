package org.j8unit.generator.util;

import static java.util.Arrays.asList;
import static org.j8unit.generator.util.Arrays.arrayAnalysisOf;
import static org.j8unit.generator.util.Arrays.arrayDimensionOf;
import static org.j8unit.generator.util.Arrays.baseComponentTypeOf;
import static org.junit.Assert.assertEquals;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ArraysTest {

    @Parameters(name = "{0}")
    public static Iterable<Object[]> data() {
        return asList(new Object[][] { { boolean.class, boolean.class, 0 }, //
                                       { byte.class, byte.class, 0 }, //
                                       { byte[].class, byte.class, 1 }, //
                                       { byte[][][].class, byte.class, 3 }, //
                                       { char.class, char.class, 0 }, //
                                       { int.class, int.class, 0 }, //
                                       { long.class, long.class, 0 }, //
                                       { float.class, float.class, 0 }, //
                                       { double.class, double.class, 0 }, //
                                       { void.class, void.class, 0 }, //
                                       { Object.class, Object.class, 0 }, //
                                       { Object[].class, Object.class, 1 }, //
                                       { Object[][][].class, Object.class, 3 }, //
                                       { Object[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][].class,
                                         Object.class, 255 }, //
                                       { Map.Entry.class, Map.Entry.class, 0 }, //
                                       { Map.Entry[].class, Map.Entry.class, 1 }, //
                                       { Map.Entry[][][].class, Map.Entry.class, 3 }, //
        });
    }

    @Parameter(0)
    public Class<?> clazz;

    @Parameter(1)
    public Class<?> base;

    @Parameter(2)
    public int dimension;

    @Test
    public void test_arrayAnalysisOf()
    throws Exception {
        assertEquals(this.base, arrayAnalysisOf(this.clazz).getKey());
        assertEquals(this.dimension, (int) arrayAnalysisOf(this.clazz).getValue());
    }

    @Test
    public void test_baseComponentTypeOf()
    throws Exception {
        assertEquals(this.base, baseComponentTypeOf(this.clazz));
    }

    @Test
    public void test_arrayDimensionOf()
    throws Exception {
        assertEquals(this.dimension, arrayDimensionOf(this.clazz));
    }

}
