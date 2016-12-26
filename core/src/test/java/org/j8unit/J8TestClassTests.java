package org.j8unit;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.j8unit.runners.model.J8TestClass.getSuperClasses;
import static org.junit.Assert.assertEquals;
import java.lang.reflect.Method;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.j8unit.runners.model.J8TestClass;
import org.junit.Test;
import org.junit.runners.model.TestClass;

public class J8TestClassTests {

    @Test
    public void testClassHierarchyOfNull()
    throws Exception {
        final List<Class<?>> superClasses = getSuperClasses(null);
        assertEquals(emptyList(), superClasses);
    }

    @Test
    public void testEqualClassHierarchyOfNull()
    throws Exception {
        final List<Class<?>> superClasses = getSuperClasses(null);
        final Method method = TestClass.class.getDeclaredMethod("getSuperClasses", Class.class);
        method.setAccessible(true);
        final List<Class<?>> result = (List<Class<?>>) method.invoke(null, (Class<?>) null);
        assertEquals(superClasses, result);
    }

    @Test
    public void testClassHierarchyOfInterface()
    throws Exception {
        final List<Class<?>> superClasses = getSuperClasses(Deque.class);
        assertEquals(asList(Deque.class), superClasses);
    }

    @Test
    public void testEqualClassHierarchyOfInterface()
    throws Exception {
        final List<Class<?>> superClasses = getSuperClasses(Deque.class);
        final Method method = TestClass.class.getDeclaredMethod("getSuperClasses", Class.class);
        method.setAccessible(true);
        final List<Class<?>> result = (List<Class<?>>) method.invoke(null, Deque.class);
        assertEquals(superClasses, result);
    }

    @Test
    public void testClassHierarchyOfClass()
    throws Exception {
        final List<Class<?>> superClasses = J8TestClass.getSuperClasses(LinkedHashMap.class);
        assertEquals(asList(LinkedHashMap.class, HashMap.class, java.util.AbstractMap.class, Object.class), superClasses);
    }

    @Test
    public void testEqualClassHierarchyOfClass()
    throws Exception {
        final List<Class<?>> superClasses = J8TestClass.getSuperClasses(LinkedHashMap.class);
        final Method method = TestClass.class.getDeclaredMethod("getSuperClasses", Class.class);
        method.setAccessible(true);
        final List<Class<?>> result = (List<Class<?>>) method.invoke(null, LinkedHashMap.class);
        assertEquals(superClasses, result);
    }

}
