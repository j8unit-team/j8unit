package org.j8unit.runners.model;

import static java.lang.reflect.Modifier.isPrivate;
import static java.lang.reflect.Modifier.isStatic;
import static java.util.Arrays.asList;
import static java.util.Collections.emptySet;
import static org.j8unit.runners.model.J8TestClass.getClassHierarchy;
import static org.j8unit.runners.model.J8TestClass.getInterfaceHierarchy;
import static org.j8unit.runners.model.J8TestClass.getTypeHierarchy;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.model.TestClass;

public class J8TestClassTests {

    private static Method jUnit4GetSuperClasses;

    @SuppressWarnings("unchecked")
    private static List<Class<?>> jUnit4GetSuperClasses(final Class<?> clazz)
    throws IllegalAccessException, InvocationTargetException {
        assertNotNull(jUnit4GetSuperClasses);
        assertTrue(isStatic(jUnit4GetSuperClasses.getModifiers()));
        assertTrue(jUnit4GetSuperClasses.isAccessible());
        assertArrayEquals(new Class<?>[] { Class.class }, jUnit4GetSuperClasses.getParameterTypes());
        assertEquals(List.class, jUnit4GetSuperClasses.getReturnType());
        return (List<Class<?>>) jUnit4GetSuperClasses.invoke(null, clazz);
    }

    private static void testSimilarResult(final Class<?> clazz)
    throws IllegalAccessException, InvocationTargetException {
        final Set<Class<?>> superClasses = getClassHierarchy(clazz);
        final List<Class<?>> result = jUnit4GetSuperClasses(clazz);
        assertEquals(new ArrayList<>(superClasses), result);
    }

    @BeforeClass
    public static void explorePrivateJUnit4Method()
    throws NoSuchMethodException, SecurityException {
        jUnit4GetSuperClasses = TestClass.class.getDeclaredMethod("getSuperClasses", Class.class);
        assertTrue(isPrivate(jUnit4GetSuperClasses.getModifiers()));
        assertTrue(isStatic(jUnit4GetSuperClasses.getModifiers()));
        assertEquals(List.class, jUnit4GetSuperClasses.getReturnType());
        assertFalse(jUnit4GetSuperClasses.isAccessible());
        jUnit4GetSuperClasses.setAccessible(true);
        assertTrue(jUnit4GetSuperClasses.isAccessible());
    }

    @Test
    public void testClassHierarchyOfNull()
    throws Exception {
        final Set<Class<?>> superClasses = getClassHierarchy(null);
        final Set<Class<?>> expected = emptySet();
        assertEquals(expected, superClasses);
    }

    @Test
    public void testEqualClassHierarchyOfNull()
    throws Exception {
        testSimilarResult(null);
    }

    @Test
    public void testInterfaceHierarchyOfNull()
    throws Exception {
        final Set<Class<?>> superClasses = getInterfaceHierarchy(null);
        final Set<Class<?>> expected = emptySet();
        assertEquals(expected, superClasses);
    }

    @Test
    public void testTypeHierarchyOfNull()
    throws Exception {
        final Set<Class<?>> superClasses = getTypeHierarchy(null);
        final Set<Class<?>> expected = emptySet();
        assertEquals(expected, superClasses);
    }

    @Test
    public void testClassHierarchyOfDeque()
    throws Exception {
        final Set<Class<?>> superClasses = getClassHierarchy((Deque.class));
        final Set<Class<?>> expected = emptySet();
        assertEquals(expected, superClasses);
    }

    @Test
    public void testInterfaceHierarchyOfDeque()
    throws Exception {
        final Set<Class<?>> superClasses = getInterfaceHierarchy((Deque.class));
        final Set<Class<?>> expected = new LinkedHashSet<>(asList(Deque.class, Queue.class, Collection.class, Iterable.class));
        assertEquals(expected, superClasses);
    }

    @Test
    public void testTypeHierarchyOfDeque()
    throws Exception {
        final Set<Class<?>> superClasses = getTypeHierarchy((Deque.class));
        final Set<Class<?>> expected = new LinkedHashSet<>(asList(Deque.class, Queue.class, Collection.class, Iterable.class));
        assertEquals(expected, superClasses);
    }

    @Test
    public void testClassHierarchyOfLinkedHashMap()
    throws Exception {
        final Set<Class<?>> superClasses = getClassHierarchy((LinkedHashMap.class));
        final Set<Class<?>> expected = new LinkedHashSet<>(asList(LinkedHashMap.class, HashMap.class, AbstractMap.class, Object.class));
        assertEquals(expected, superClasses);
    }

    @Test
    public void testEqualClassHierarchyOfLinkedHashMap()
    throws Exception {
        testSimilarResult(LinkedHashMap.class);
    }

    @Test
    public void testInterfaceHierarchyOfLinkedHashMap()
    throws Exception {
        final Set<Class<?>> superClasses = getInterfaceHierarchy((LinkedHashMap.class));
        final Set<Class<?>> expected = emptySet();
        assertEquals(expected, superClasses);
    }

    @Test
    public void testTypeHierarchyOfLinkedHashMap()
    throws Exception {
        final Set<Class<?>> superClasses = getTypeHierarchy((LinkedHashMap.class));
        final Set<Class<?>> expected = new LinkedHashSet<>(asList(LinkedHashMap.class, Map.class, HashMap.class, Cloneable.class, Serializable.class,
                                                                  AbstractMap.class, Object.class));
        assertEquals(expected, superClasses);
    }

    @Test
    public void testClassHierarchyOfBufferedInputStream()
    throws Exception {
        final Set<Class<?>> superClasses = getClassHierarchy((BufferedInputStream.class));
        final Set<Class<?>> expected = new LinkedHashSet<>(asList(BufferedInputStream.class, FilterInputStream.class, InputStream.class, Object.class));
        assertEquals(expected, superClasses);
    }

    @Test
    public void testEqualClassHierarchyOfBufferedInputStream()
    throws Exception {
        testSimilarResult(BufferedInputStream.class);
    }

    @Test
    public void testInterfaceHierarchyOfBufferedInputStream()
    throws Exception {
        final Set<Class<?>> superClasses = getInterfaceHierarchy((BufferedInputStream.class));
        final Set<Class<?>> expected = emptySet();
        assertEquals(expected, superClasses);
    }

    @Test
    public void testTypeHierarchyOfBufferedInputStream()
    throws Exception {
        final Set<Class<?>> superClasses = getTypeHierarchy((BufferedInputStream.class));
        final Set<Class<?>> expected = new LinkedHashSet<>(asList(BufferedInputStream.class, FilterInputStream.class, InputStream.class, Closeable.class,
                                                                  AutoCloseable.class, Object.class));
        assertEquals(expected, superClasses);
    }

}
