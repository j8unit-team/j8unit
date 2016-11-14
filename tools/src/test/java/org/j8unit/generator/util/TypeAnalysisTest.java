package org.j8unit.generator.util;

import static java.lang.reflect.Modifier.isPublic;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyMap;
import static java.util.Collections.emptySet;
import static java.util.Objects.nonNull;
import static org.j8unit.generator.util.TypeAnalysis.calculateNearestDeclaringParents;
import static org.j8unit.generator.util.TypeAnalysis.calculateNearestMatchingParents;
import static org.j8unit.generator.util.TypeAnalysis.getDeclaredMethod;
import static org.j8unit.generator.util.TypeAnalysis.getInterfaces;
import static org.j8unit.generator.util.TypeAnalysis.getMethod;
import static org.j8unit.generator.util.TypeAnalysis.getNearestMergingClass;
import static org.j8unit.generator.util.TypeAnalysis.redundantTypes;
import static org.j8unit.generator.util.TypeAnalysis.tryLoadClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.channels.AsynchronousByteChannel;
import java.nio.channels.AsynchronousChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.text.StringCharacterIterator;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.concurrent.DelayQueue;
import javax.lang.model.element.Name;
import org.junit.Test;

public class TypeAnalysisTest {

    @Test
    public void succeedTryLoadClass()
    throws Exception {
        final Optional<Class<?>> objectClass = tryLoadClass("java.lang.Object");
        assertNotNull(objectClass);
        assertTrue(objectClass.isPresent());
        assertEquals(Object.class, objectClass.get());
    }

    @Test
    public void failTryLoadClass()
    throws Exception {
        final Optional<Class<?>> objectClass = tryLoadClass("java.lang.Abject");
        assertNotNull(objectClass);
        assertFalse(objectClass.isPresent());
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

        // final java.lang.invoke.MethodHandles.Lookup lookup = java.lang.invoke.MethodHandles.lookup();
        // final java.lang.invoke.MethodHandle handle =
        // java.lang.invoke.MethodHandles.lookup().findVirtual(Oberklasse.class, "foobar",
        // java.lang.invoke.MethodType.methodType(String.class));
        // final java.lang.invoke.MethodHandle handle2 = java.lang.invoke.MethodHandles.lookup()
        // .findVirtual(Unterklasse.class, "foobar",
        // java.lang.invoke.MethodType.methodType(Integer.class));
    }

    public static interface I1 {

        public default void foobar() {
        };

    }

    public static class C1
    implements I1 {

        public void barfoo() {
        };

    }

    public static interface I2a
    extends I1 {
    }

    public static interface I2b
    extends I1 {

        public default void barfoo() {
        };

    }

    public static class C2
    extends C1
    implements I2b {
    }

    public static interface I3
    extends I2a, I2b {
    }

    public static class C3
    extends C2
    implements I1 {
    }

    public static interface I4
    extends I3 {

        @Override
        public default void foobar() {
        };

    }

    public static class C4
    extends C3 {

        @Override
        public void foobar() {
        };

    }

    public static interface I5
    extends I4, I1, I2b {
    }

    public static class C5
    extends C4
    implements I1, I2b {
    }

    @Test
    public void testByI1()
    throws Throwable {
        final Class<I1> type = I1.class;
        final Method method = type.getMethod("foobar");

        final Map<Class<?>, Set<Class<?>>> declarings = calculateNearestDeclaringParents(type, method, Objects::nonNull);
        assertEquals(emptySet(), declarings.keySet());
    }

    @Test
    public void testByC1()
    throws Throwable {
        final Class<C1> type = C1.class;
        final Method method = type.getMethod("foobar");
        final Method method2 = type.getMethod("barfoo");

        final Map<Class<?>, Set<Class<?>>> declarings = calculateNearestDeclaringParents(type, method, Objects::nonNull);
        assertEquals(new HashSet<>(asList(I1.class)), declarings.keySet());
        assertEquals(new HashSet<>(asList(I1.class)), declarings.get(I1.class));

        final Map<Class<?>, Set<Class<?>>> declarings2 = calculateNearestDeclaringParents(type, method2, Objects::nonNull);
        assertEquals(emptySet(), declarings2.keySet());
    }

    @Test
    public void testByI2a()
    throws Throwable {
        final Class<I2a> type = I2a.class;
        final Method method = type.getMethod("foobar");

        final Map<Class<?>, Set<Class<?>>> declarings = calculateNearestDeclaringParents(type, method, Objects::nonNull);
        assertEquals(new HashSet<>(asList(I1.class)), declarings.keySet());
        assertEquals(new HashSet<>(asList(I1.class)), declarings.get(I1.class));
    }

    @Test
    public void testByI2b()
    throws Throwable {
        final Class<I2b> type = I2b.class;
        final Method method = type.getMethod("foobar");
        final Method method2 = type.getMethod("barfoo");

        final Map<Class<?>, Set<Class<?>>> declarings = calculateNearestDeclaringParents(type, method, Objects::nonNull);
        assertEquals(new HashSet<>(asList(I1.class)), declarings.keySet());
        assertEquals(new HashSet<>(asList(I1.class)), declarings.get(I1.class));

        final Map<Class<?>, Set<Class<?>>> declarings2 = calculateNearestDeclaringParents(type, method2, Objects::nonNull);
        assertEquals(emptySet(), declarings2.keySet());
    }

    @Test
    public void testByC2()
    throws Throwable {
        final Class<C2> type = C2.class;
        final Method method = type.getMethod("foobar");
        final Method method2 = type.getMethod("barfoo");

        final Map<Class<?>, Set<Class<?>>> declarings = calculateNearestDeclaringParents(type, method, Objects::nonNull);
        assertEquals(new HashSet<>(asList(I1.class)), declarings.keySet());
        assertEquals(new HashSet<>(asList(C1.class, I2b.class)), declarings.get(I1.class));

        final Map<Class<?>, Set<Class<?>>> declarings2 = calculateNearestDeclaringParents(type, method2, Objects::nonNull);
        assertEquals(new HashSet<>(asList(C1.class, I2b.class)), declarings2.keySet());
        assertEquals(new HashSet<>(asList(C1.class)), declarings2.get(C1.class));
        assertEquals(new HashSet<>(asList(I2b.class)), declarings2.get(I2b.class));
    }

    @Test
    public void testByI3()
    throws Throwable {
        final Class<I3> type = I3.class;
        final Method method = type.getMethod("foobar");
        final Method method2 = type.getMethod("barfoo");

        final Map<Class<?>, Set<Class<?>>> declarings = calculateNearestDeclaringParents(type, method, Objects::nonNull);
        assertEquals(new HashSet<>(asList(I1.class)), declarings.keySet());
        assertEquals(new HashSet<>(asList(I2a.class, I2b.class)), declarings.get(I1.class));

        final Map<Class<?>, Set<Class<?>>> declarings2 = calculateNearestDeclaringParents(type, method2, Objects::nonNull);
        assertEquals(new HashSet<>(asList(I2b.class)), declarings2.keySet());
        assertEquals(new HashSet<>(asList(I2b.class)), declarings2.get(I2b.class));
    }

    @Test
    public void testByC3()
    throws Throwable {
        final Class<C3> type = C3.class;
        final Method methByD = type.getMethod("foobar");
        final Method method2 = type.getMethod("barfoo");

        final Map<Class<?>, Set<Class<?>>> declarings = calculateNearestDeclaringParents(type, methByD, Objects::nonNull);
        assertEquals(new HashSet<>(asList(I1.class)), declarings.keySet());
        assertEquals(new HashSet<>(asList(C2.class)), declarings.get(I1.class));

        final Map<Class<?>, Set<Class<?>>> declarings2 = calculateNearestDeclaringParents(type, method2, Objects::nonNull);
        // Method is declared by C because C extends B1 and implements B2.
        // That ambiguity is implicitly solved by C's preference of B1's method over B2's method (extended class
        // comes before implemented interface).
        assertEquals(new HashSet<>(asList(C2.class)), declarings2.keySet());
        assertEquals(new HashSet<>(asList(C2.class)), declarings2.get(C2.class));
    }

    @Test
    public void testByI4()
    throws Throwable {
        final Class<I4> type = I4.class;
        final Method method = type.getMethod("foobar");
        final Method method2 = type.getMethod("barfoo");

        final Map<Class<?>, Set<Class<?>>> declarings = calculateNearestDeclaringParents(type, method, Objects::nonNull);
        assertEquals(new HashSet<>(asList(I1.class)), declarings.keySet());
        assertEquals(new HashSet<>(asList(I3.class)), declarings.get(I1.class));

        final Map<Class<?>, Set<Class<?>>> declarings2 = calculateNearestDeclaringParents(type, method2, Objects::nonNull);
        assertEquals(new HashSet<>(asList(I2b.class)), declarings2.keySet());
        assertEquals(new HashSet<>(asList(I3.class)), declarings2.get(I2b.class));
    }

    @Test
    public void testByC4()
    throws Throwable {
        final Class<C4> type = C4.class;
        final Method method = type.getMethod("foobar");
        final Method method2 = type.getMethod("barfoo");

        final Map<Class<?>, Set<Class<?>>> declarings = calculateNearestDeclaringParents(type, method, Objects::nonNull);
        assertEquals(new HashSet<>(asList(I1.class)), declarings.keySet());
        assertEquals(new HashSet<>(asList(C3.class)), declarings.get(I1.class));

        final Map<Class<?>, Set<Class<?>>> declarings2 = calculateNearestDeclaringParents(type, method2, Objects::nonNull);
        assertEquals(new HashSet<>(asList(C2.class)), declarings2.keySet());
        assertEquals(new HashSet<>(asList(C3.class)), declarings2.get(C2.class));
    }

    @Test
    public void testByI5()
    throws Throwable {
        final Class<I5> type = I5.class;
        final Method method = type.getMethod("foobar");
        final Method method2 = type.getMethod("barfoo");

        final Map<Class<?>, Set<Class<?>>> declarings = calculateNearestDeclaringParents(type, method, Objects::nonNull);
        assertEquals(new HashSet<>(asList(I4.class)), declarings.keySet());
        assertEquals(new HashSet<>(asList(I4.class)), declarings.get(I4.class));

        final Map<Class<?>, Set<Class<?>>> declarings2 = calculateNearestDeclaringParents(type, method2, Objects::nonNull);
        assertEquals(new HashSet<>(asList(I2b.class)), declarings2.keySet());
        assertEquals(new HashSet<>(asList(I4.class)), declarings2.get(I2b.class));
    }

    @Test
    public void testByC5()
    throws Throwable {
        final Class<C5> type = C5.class;
        final Method method = type.getMethod("foobar");
        final Method method2 = type.getMethod("barfoo");

        final Map<Class<?>, Set<Class<?>>> declarings = calculateNearestDeclaringParents(type, method, Objects::nonNull);
        assertEquals(new HashSet<>(asList(C4.class)), declarings.keySet());
        assertEquals(new HashSet<>(asList(C4.class)), declarings.get(C4.class));

        final Map<Class<?>, Set<Class<?>>> declarings2 = calculateNearestDeclaringParents(type, method2, Objects::nonNull);
        assertEquals(new HashSet<>(asList(C2.class)), declarings2.keySet());
        assertEquals(new HashSet<>(asList(C4.class)), declarings2.get(C2.class));
    }

    @Test
    public void testByKeySetView()
    throws Throwable {
        final Class<?> classKSV = KeySetView.class;

        final Map<Class<?>, ? extends Type> nonNullMatchings = calculateNearestMatchingParents(classKSV, Objects::nonNull);
        assertEquals(new HashSet<>(asList(Class.forName("java.util.concurrent.ConcurrentHashMap$CollectionView"), Set.class, Serializable.class)),
                     nonNullMatchings.keySet());

        final Map<Class<?>, ? extends Type> publicMatchings = calculateNearestMatchingParents(classKSV, c -> nonNull(c) && isPublic(c.getModifiers()));
        assertEquals(new HashSet<>(asList(Set.class, Serializable.class, Collection.class, Object.class)), publicMatchings.keySet());

        publicMatchings.keySet().removeAll(redundantTypes(publicMatchings.keySet()));
        assertEquals(new HashSet<>(asList(Object.class, Set.class, Serializable.class)), publicMatchings.keySet());
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link java.nio.channels.Channel#close() interface java.nio.channels.Channel} (via parent node(s)
     * {@link java.nio.channels.NetworkChannel NetworkChannel})</li>
     * <li>{@link java.nio.channels.AsynchronousChannel#close() interface java.nio.channels.AsynchronousChannel} (via
     * parent node(s) {@link java.nio.channels.AsynchronousByteChannel AsynchronousByteChannel})</li>
     * </ul>
     *
     * <p>
     * Allerdings liegt eine Konkretisierung, sodass die unspez. Variante auszublenden ist ...
     *
     * ... und in diesem Fall letztendlich gar keine problematische Mehrfach-Einerbung vorliegt.
     * </p>
     *
     * <pre>
     * AsynchronousSocketChannel
     * implements AsynchronousByteChannel -> extends AsynchronousChannel -> extends Channel -> extends Closeable -> extends AutoCloseable
     * implements NetworkChannel                       ||                -> extends Channel -> extends Closeable -> extends AutoCloseable
     *                                                 ||                             ||                  ||                  ||
     *                                                 ||                             ||                  ||                  \/
     *                                                 ||                             ||                  \/                close()
     *                                                 ||                             \/                close()
     *                                                 \/                           close()
     *                                               close()
     * </pre>
     */
    @Test
    public void testByAsynchronousSocketChannel()
    throws Exception {
        final Class<?> clazz = AsynchronousSocketChannel.class;
        final Method method = clazz.getMethod("close");
        final Map<Class<?>, Set<Class<?>>> declarings = calculateNearestDeclaringParents(clazz, method, Objects::nonNull);
        assertEquals(new HashSet<>(asList(AsynchronousChannel.class)), declarings.keySet());
        assertEquals(new HashSet<>(asList(AsynchronousByteChannel.class)), declarings.get(AsynchronousChannel.class));
    }

    @Test
    public void testRedundantTypesViaString()
    throws Exception {
        final Set<Class<?>> set = new HashSet<>(asList(String.class, Serializable.class, Object.class, Comparable.class, CharSequence.class, Cloneable.class));
        final Set<Class<?>> redundant = redundantTypes(set);
        assertNotNull(redundant);
        assertEquals(new HashSet<>(asList(Serializable.class, Object.class, Comparable.class, CharSequence.class)), redundant);
    }

    @Test
    public void testRedundantTypesViaStringPlusStringCharacterIterator()
    throws Exception {
        final Set<Class<?>> set = new HashSet<>(asList(String.class, StringCharacterIterator.class, Serializable.class, Object.class, Comparable.class,
                                                       CharSequence.class, Cloneable.class));
        final Set<Class<?>> redundant = redundantTypes(set);
        assertNotNull(redundant);
        assertEquals(new HashSet<>(asList(Serializable.class, Object.class, Comparable.class, CharSequence.class, Cloneable.class)), redundant);
    }

    @Test
    public void testRedundantTypesViaDelayQueue()
    throws Exception {
        final Set<Class<?>> set = new HashSet<>(asList(DelayQueue.class, AbstractCollection.class, Cloneable.class, Object.class, Queue.class, Iterable.class,
                                                       Serializable.class));
        final Set<Class<?>> redundant = redundantTypes(set);
        assertNotNull(redundant);
        assertEquals(new HashSet<>(asList(AbstractCollection.class, Object.class, Queue.class, Iterable.class)), redundant);
    }

    @Test
    public void testRedundantTypesViaBlockingQueue()
    throws Exception {
        // Only Interface types plus Object
        final Set<Class<?>> set = new HashSet<>(asList(BlockingQueue.class, BlockingDeque.class, Cloneable.class, Object.class, Queue.class, Iterable.class,
                                                       Serializable.class));
        final Set<Class<?>> redundant = redundantTypes(set);
        assertNotNull(redundant);
        assertEquals(new HashSet<>(asList(BlockingQueue.class, Queue.class, Iterable.class)), redundant);
    }

}
