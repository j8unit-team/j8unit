package org.j8unit.util;

import static java.lang.reflect.Modifier.isPrivate;
import static java.lang.reflect.Modifier.isStatic;
import static java.security.AccessController.doPrivileged;
import static java.util.Arrays.asList;
import static java.util.Collections.emptySet;
import static java.util.Collections.singleton;
import static org.j8unit.util.Reflection.allClassesOf;
import static org.j8unit.util.Reflection.allInterfacesOf;
import static org.j8unit.util.Reflection.allTypesOf;
import static org.j8unit.util.Reflection.getClassHierarchy;
import static org.j8unit.util.Reflection.getInterfaceHierarchy;
import static org.j8unit.util.Reflection.getTypeHierarchy;
import static org.j8unit.util.Reflection.isOverriddenBy;
import static org.j8unit.util.Reflection.redundantTypes;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.security.PrivilegedAction;
import java.text.StringCharacterIterator;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.model.TestClass;
import org.j8unit.util.helper.EmptyClass;

public class ReflectionTests
extends EmptyClass {

    @Test
    public void testUtilityContainerCharacteristics()
    throws Exception {
        UtilityContainerTest.testUtilityContainerCharacteristics(Reflection.class);
    }

    @Test
    public void verifyAllModesFieldHasSimilarValue()
    throws Exception {
        final int reflectionAllModes = Reflection.ALL_MODES;
        final Field field = Lookup.class.getDeclaredField("ALL_MODES");
        doPrivileged((PrivilegedAction<Void>) () -> {
            field.setAccessible(true);
            return null;
        });
        final int looupAllModes = field.getInt(null);
        assertEquals(looupAllModes, reflectionAllModes);
    }

    @Test
    public void testClassForNameSucceeds()
    throws Exception {
        final Optional<Class<?>> stringClass = Reflection.classForName("java.lang.String");
        assertEquals(Optional.of(String.class), stringClass);
    }

    @Test
    public void testClassForNameMisses()
    throws Exception {
        final Optional<Class<?>> missing = Reflection.classForName("String");
        assertEquals(Optional.empty(), missing);
    }

    @Ignore("Add null barrier and run test")
    @Test(expected = IllegalArgumentException.class)
    public void testClassForNullMisses()
    throws Exception {
        Reflection.classForName(null);
    }

    /**
     * Assigned by {@link #explorePrivateJUnit4Method()}; invoked by {@link #jUnit4GetSuperClasses(Class)}.
     */
    private static Method jUnit4GetSuperClasses;

    @BeforeClass
    public static void explorePrivateJUnit4Method()
    throws NoSuchMethodException, SecurityException {
        // There must exist a declared method ...
        // ... with a specific name ...
        // ... with a Class.class parameter ...
        jUnit4GetSuperClasses = TestClass.class.getDeclaredMethod("getSuperClasses", Class.class);
        // ... which is private ...
        assertTrue(isPrivate(jUnit4GetSuperClasses.getModifiers()));
        // ... and static ...
        assertTrue(isStatic(jUnit4GetSuperClasses.getModifiers()));
        // ... and returns a List ...
        assertEquals(List.class, jUnit4GetSuperClasses.getReturnType());
        // ... and is made accessible for later invocation.
        assertFalse(jUnit4GetSuperClasses.isAccessible());
        jUnit4GetSuperClasses.setAccessible(true);
        assertTrue(jUnit4GetSuperClasses.isAccessible());
    }

    @SuppressWarnings("unchecked")
    private static List<Class<?>> jUnit4GetSuperClasses(final Class<?> clazz)
    throws IllegalAccessException, InvocationTargetException {
        return (List<Class<?>>) jUnit4GetSuperClasses.invoke(null, clazz);
    }

    /**
     * Asserts the equal behaviour of {@link Reflection#getClassHierarchy(Class)} and
     * {@link TestClass#getSuperClasses(Class)}.
     */
    private static void testSimilarResult(final Class<?> clazz)
    throws IllegalAccessException, InvocationTargetException {
        final Set<Class<?>> superClasses = getClassHierarchy(clazz);
        final List<Class<?>> result = jUnit4GetSuperClasses(clazz);
        assertEquals(new ArrayList<>(superClasses), result);
    }

    /*
     * Type analysis of {@code null}:
     */

    @Test
    public void testAllClassesOfNull()
    throws Exception {
        final Set<Class<?>> superClasses = allClassesOf(null);
        final Set<Class<?>> expected = emptySet();
        assertEquals(expected, superClasses);
    }

    @Test
    public void testAllInterfacesOfNull()
    throws Exception {
        final Set<Class<?>> superClasses = allInterfacesOf(null);
        final Set<Class<?>> expected = emptySet();
        assertEquals(expected, superClasses);
    }

    @Test
    public void testAllTypesOfNull()
    throws Exception {
        final Set<Class<?>> superClasses = allTypesOf(null);
        final Set<Class<?>> expected = emptySet();
        assertEquals(expected, superClasses);
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

    /*
     * Type analysis of {@link Deque}:
     */

    @Test
    public void testAllClassesOfDeque()
    throws Exception {
        final Set<Class<?>> superClasses = allClassesOf(Deque.class);
        final Set<Class<?>> expected = emptySet();
        assertEquals(expected, superClasses);
    }

    @Test
    public void testAllInterfacesOfDeque()
    throws Exception {
        final Set<Class<?>> superClasses = allInterfacesOf(Deque.class);
        final Set<Class<?>> expected = new LinkedHashSet<>(asList(Deque.class, Queue.class, Collection.class, Iterable.class));
        assertEquals(expected, superClasses);
    }

    @Test
    public void testAllTypesOfDeque()
    throws Exception {
        final Set<Class<?>> superClasses = allTypesOf(Deque.class);
        final Set<Class<?>> expected = new LinkedHashSet<>(asList(Deque.class, Queue.class, Collection.class, Iterable.class));
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

    /*
     * Type analysis of {@link LinkedHashMap}:
     */

    @Test
    public void testAllClassesOfLinkedHashMap()
    throws Exception {
        final Set<Class<?>> superClasses = allClassesOf(LinkedHashMap.class);
        final Set<Class<?>> expected = new LinkedHashSet<>(asList(LinkedHashMap.class, HashMap.class, AbstractMap.class, Object.class));
        assertEquals(expected, superClasses);
    }

    @Test
    public void testAllInterfacesOfLinkedHashMap()
    throws Exception {
        final Set<Class<?>> superClasses = allInterfacesOf(LinkedHashMap.class);
        final Set<Class<?>> expected = new LinkedHashSet<>(asList(Map.class, Cloneable.class, Serializable.class));
        assertEquals(expected, superClasses);
    }

    @Test
    public void testAllTypesOfLinkedHashMap()
    throws Exception {
        final Set<Class<?>> superClasses = allTypesOf(LinkedHashMap.class);
        final Set<Class<?>> expected = new LinkedHashSet<>(asList(LinkedHashMap.class, Map.class, HashMap.class, Cloneable.class, Serializable.class,
                                                                  AbstractMap.class, Object.class));
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

    /*
     * Type analysis of {@link BufferedInputStream}:
     */

    @Test
    public void testAllClassesOfBufferedInputStream()
    throws Exception {
        final Set<Class<?>> superClasses = allClassesOf(BufferedInputStream.class);
        final Set<Class<?>> expected = new LinkedHashSet<>(asList(BufferedInputStream.class, FilterInputStream.class, InputStream.class, Object.class));
        assertEquals(expected, superClasses);
    }

    @Test
    public void testAllInterfacesOfBufferedInputStream()
    throws Exception {
        final Set<Class<?>> superClasses = allInterfacesOf(BufferedInputStream.class);
        final Set<Class<?>> expected = new LinkedHashSet<>(asList(Closeable.class, AutoCloseable.class));
        assertEquals(expected, superClasses);
    }

    @Test
    public void testAllTypesOfBufferedInputStream()
    throws Exception {
        final Set<Class<?>> superClasses = allTypesOf(BufferedInputStream.class);
        final Set<Class<?>> expected = new LinkedHashSet<>(asList(BufferedInputStream.class, FilterInputStream.class, InputStream.class, Closeable.class,
                                                                  AutoCloseable.class, Object.class));
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

    /*
     * Method assignability:
     *
     * TODO: Test super-instance-method vs. sub-static-method, and vice-versa.
     */

    @Test
    public void testMethodAssignabilityForSpecificOverriddenAbstractMethod()
    throws Exception {
        assertOverriddenMethod("someAbstractMethodThatShallBeOverridden");
    }

    @Test
    public void testMethodAssignabilityForSpecificOverriddenMethod()
    throws Exception {
        assertOverriddenMethod("someProtectedMethodThatShallBeOverridden");
    }

    /**
     * TODO: Make #isOverriddenBy(...) fully compatible to JLS 8, Sec. 8.4.8.1. 'Overriding (by Instance Methods)'
     */
    @Ignore("TODO: Make #isOverriddenBy(...) fully compatible to JLS 8, Sec. 8.4.8.1. 'Overriding (by Instance Methods)'")
    @Test
    public void testMethod_Private()
    throws Exception {
        assertNotOverriddenMethod("somePrivateMethodThatShallBeRedefined");
    }

    @Test
    public void testMethodAssignabilityForSpecificHiddenMethod()
    throws Exception {
        assertNotOverriddenMethod("someStaticMethodThatShallBeHidden");
    }

    @Test
    public void testMethod_XXX()
    throws Exception {
        assertOverriddenMethod("someMethodThatShallBeRedefinedWithCovariantReturnType");
    }

    @Test
    public void testMethod_YYY()
    throws Exception {
        assertNotOverriddenMethod("someMethodThatShallBeRedefinedWithContravariantParameterType", Integer.class, Number.class);
    }

    @Test
    public void testMethod_ZZZ()
    throws Exception {
        assertNotOverriddenMethod("someMethodThatShallBeRedefinedWithCovariantReturnTypeAndContravariantParameterType", Integer.class, Number.class);
    }

    @Test
    public void testMethod_AAA()
    throws Exception {
        assertNotOverriddenMethod("someMethodThatRedefinedWithDifferentParameterType", String.class, Inet4Address.class);
    }

    private static void assertOverriddenMethod(final String name)
    throws Exception {
        final Method base = Foo.class.getDeclaredMethod(name);
        final Method sub = Bar.class.getDeclaredMethod(name);
        assertTrue(isOverriddenBy(base, base));
        assertTrue(isOverriddenBy(base, sub));
        assertTrue(isOverriddenBy(sub, sub));
        assertFalse(isOverriddenBy(sub, base));
    }

    private static void assertNotOverriddenMethod(final String name)
    throws Exception {
        final Method base = Foo.class.getDeclaredMethod(name);
        final Method sub = Bar.class.getDeclaredMethod(name);
        assertTrue(isOverriddenBy(base, base));
        assertFalse(isOverriddenBy(base, sub));
        assertTrue(isOverriddenBy(sub, sub));
        assertFalse(isOverriddenBy(sub, base));
    }

    private static void assertNotOverriddenMethod(final String name, final Class<?> basePT, final Class<?> oPT)
    throws Exception {
        final Method base = Foo.class.getDeclaredMethod(name, basePT);
        final Method sub = Bar.class.getDeclaredMethod(name, oPT);
        assertTrue(isOverriddenBy(base, base));
        assertFalse(isOverriddenBy(base, sub));
        assertTrue(isOverriddenBy(sub, sub));
        assertFalse(isOverriddenBy(sub, base));
    }

    /*
     * Redundant Types:
     */

    @Test
    public void testRedundantTypesViaString()
    throws Exception {
        final LinkedHashSet<Class<?>> types = allTypesOf(String.class);
        final Set<Class<?>> redundant = redundantTypes(types);

        assertEquals(new HashSet<>(asList(Serializable.class, Object.class, Comparable.class, CharSequence.class)), redundant);
        types.removeAll(redundant);
        assertEquals(singleton(String.class), types);
    }

    @Test
    public void testRedundantTypesViaStringPlusOthers()
    throws Exception {
        final LinkedHashSet<Class<?>> types = allTypesOf(String.class);
        types.add(StringCharacterIterator.class);
        types.add(Cloneable.class);
        final Set<Class<?>> redundant = redundantTypes(types);

        assertEquals(new HashSet<>(asList(Serializable.class, Object.class, Comparable.class, CharSequence.class, Cloneable.class)), redundant);
        types.removeAll(redundant);
        assertEquals(new HashSet<>(asList(String.class, StringCharacterIterator.class)), types);
    }

    @Test
    public void testRedundantTypesViaDelayQueuePlusOthers()
    throws Exception {
        final Set<Class<?>> types = new HashSet<>(asList(DelayQueue.class, AbstractCollection.class, Cloneable.class, Object.class, Queue.class, Iterable.class,
                                                         Serializable.class));
        final Set<Class<?>> redundant = redundantTypes(types);

        assertEquals(new HashSet<>(asList(AbstractCollection.class, Object.class, Queue.class, Iterable.class)), redundant);
        types.removeAll(redundant);
        assertEquals(new HashSet<>(asList(DelayQueue.class, Cloneable.class, Serializable.class)), types);
    }

    @Test
    public void testRedundantTypesViaSeveralInterfacesPlusObject()
    throws Exception {
        final Set<Class<?>> types = new HashSet<>(asList(BlockingQueue.class, BlockingDeque.class, Cloneable.class, Object.class, Queue.class, Iterable.class,
                                                         Serializable.class));
        final Set<Class<?>> redundant = redundantTypes(types);

        assertEquals(new HashSet<>(asList(BlockingQueue.class, Queue.class, Iterable.class)), redundant);
        types.removeAll(redundant);
        assertEquals(new HashSet<>(asList(BlockingDeque.class, Cloneable.class, Object.class, Serializable.class)), types);
    }

}
