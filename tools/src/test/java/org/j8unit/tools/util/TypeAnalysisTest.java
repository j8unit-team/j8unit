package org.j8unit.tools.util;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyMap;
import static org.j8unit.tools.util.TypeAnalysis.arrayDimensionOf;
import static org.j8unit.tools.util.TypeAnalysis.baseComponentTypeOf;
import static org.j8unit.tools.util.TypeAnalysis.getDeclaredMethod;
import static org.j8unit.tools.util.TypeAnalysis.getInterfaces;
import static org.j8unit.tools.util.TypeAnalysis.getMethod;
import static org.j8unit.tools.util.TypeAnalysis.getNearestMergingClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import javax.lang.model.element.Name;
import org.junit.Test;

public class TypeAnalysisTest {

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

    private static interface FooInterface {

        public abstract String foobar();
    }

    private static interface FooSubInterface
    extends FooInterface {
    }

    private static interface BarInterface {

        public default String foobar() {
            return "";
        }
    }

    private static interface BarSubInterface
    extends BarInterface {
    }

    private static interface FooBarInterface
    extends FooInterface, BarInterface {

        @Override
        default String foobar() {
            return BarInterface.super.foobar();
        }
    }

    private static class FooBarClass
    implements FooBarInterface {
    }

    private static interface FooBarSubInterface
    extends FooBarInterface {
    }

    private static class FooBarSubClass
    extends FooBarClass
    implements FooBarSubInterface {

        @Override
        public String foobar() {
            return super.foobar();
        }
    }

    @Test
    public void testGetNearestMergingClass()
    throws Exception {
        final Method toString = Object.class.getMethod("toString");
        assertFalse(getNearestMergingClass(Closeable.class, toString).isPresent());
        assertTrue(getNearestMergingClass(Object.class, toString).isPresent());
        assertEquals(Object.class, getNearestMergingClass(Object.class, toString).get());
        assertTrue(getNearestMergingClass(String.class, toString).isPresent());
        assertEquals(String.class, getNearestMergingClass(String.class, toString).get());
        assertTrue(getNearestMergingClass(CharSequence.class, toString).isPresent());
        assertEquals(CharSequence.class, getNearestMergingClass(CharSequence.class, toString).get());
        assertTrue(getNearestMergingClass(Name.class, toString).isPresent());
        assertEquals(CharSequence.class, getNearestMergingClass(Name.class, toString).get());

        final Method foobar = FooInterface.class.getMethod("foobar");
        assertTrue(getNearestMergingClass(FooInterface.class, foobar).isPresent());
        assertEquals(FooInterface.class, getNearestMergingClass(FooInterface.class, foobar).get());
        assertTrue(getNearestMergingClass(FooSubInterface.class, foobar).isPresent());
        assertEquals(FooInterface.class, getNearestMergingClass(FooSubInterface.class, foobar).get());
        assertTrue(getNearestMergingClass(BarInterface.class, foobar).isPresent());
        assertEquals(BarInterface.class, getNearestMergingClass(BarInterface.class, foobar).get());
        assertTrue(getNearestMergingClass(BarSubInterface.class, foobar).isPresent());
        assertEquals(BarInterface.class, getNearestMergingClass(BarSubInterface.class, foobar).get());
        assertTrue(getNearestMergingClass(FooBarInterface.class, foobar).isPresent());
        assertEquals(FooBarInterface.class, getNearestMergingClass(FooBarInterface.class, foobar).get());
        assertTrue(getNearestMergingClass(FooBarClass.class, foobar).isPresent());
        assertEquals(FooBarInterface.class, getNearestMergingClass(FooBarClass.class, foobar).get());
        assertTrue(getNearestMergingClass(FooBarSubInterface.class, foobar).isPresent());
        assertEquals(FooBarInterface.class, getNearestMergingClass(FooBarSubInterface.class, foobar).get());
        assertTrue(getNearestMergingClass(FooBarSubClass.class, foobar).isPresent());
        assertEquals(FooBarSubClass.class, getNearestMergingClass(FooBarSubClass.class, foobar).get());
    }

    public static class Oberklasse {

        protected String foobar() {
            System.out.println("FOOBAR!!!");
            return "FOOBAR!!!";
        }
    }

    public static class Unterklasse
    extends Oberklasse {
    }

    @Test
    public void testName()
    throws Throwable {
        assertFalse(getMethod(Oberklasse.class, "foobar").isPresent());
        assertTrue(getDeclaredMethod(Oberklasse.class, "foobar").isPresent());
        System.out.println("Oberklassenmethoden (getMethods)");
        asList(Oberklasse.class.getMethods()).forEach(System.out::println);
        System.out.println("Oberklassenmethoden (getDeclaredMethods)");
        asList(Oberklasse.class.getDeclaredMethods()).forEach(System.out::println);

        assertFalse(getMethod(Unterklasse.class, "foobar").isPresent());
        assertFalse(getDeclaredMethod(Unterklasse.class, "foobar").isPresent());
        System.out.println("Unterklassenmethoden (getMethods)");
        asList(Unterklasse.class.getMethods()).forEach(System.out::println);
        System.out.println("Unterklassenmethoden (getDeclaredMethods)");
        asList(Unterklasse.class.getDeclaredMethods()).forEach(System.out::println);

        final Lookup lookup = MethodHandles.lookup();
        final MethodHandle handle = MethodHandles.lookup().findVirtual(Oberklasse.class, "foobar", MethodType.methodType(String.class));
        final MethodHandle handle2 = MethodHandles.lookup().findVirtual(Unterklasse.class, "foobar", MethodType.methodType(Integer.class));
    }

}
