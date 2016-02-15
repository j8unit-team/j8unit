package org.j8unit.repository.java.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.Collection interface java.util.Collection}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link CollectionClassTests}.
 * </p>
 *
 * @see java.util.Collection interface java.util.Collection (the hereby targeted class-under-test class)
 * @see CollectionClassTests CollectionClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CollectionTests<SUT extends java.util.Collection<E>, E>
extends org.j8unit.repository.java.lang.IterableTests<SUT, E> {

    /**
     * @see java.util.Collection#iterator() public abstract java.util.Iterator java.util.Collection.iterator() (the
     *      hereby targeted method-under-test)
     * @see java.util.Collection#isEmpty() public abstract boolean java.util.Collection.isEmpty() (the hereby targeted
     *      method-under-test)
     *
     * @since 0.9.2
     */
    @Test
    public default void testIteratorAccordingToIsEmpty() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final java.util.Iterator<E> iterator = sut.iterator();
        if (sut.isEmpty()) {
            assertFalse(iterator.hasNext());
        } else {
            assertTrue(iterator.hasNext());
        }
    }

    /**
     * @see java.util.Collection#size() public abstract int java.util.Collection.size() (the hereby targeted
     *      method-under-test)
     *
     * @since 0.9.2
     */
    @Test
    public default void testNonNegativeSize() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertFalse(sut.size() < 0);
    }

    /**
     * @see java.util.Collection#size() public abstract int java.util.Collection.size() (the hereby targeted
     *      method-under-test)
     * @see java.util.Collection#isEmpty() public abstract boolean java.util.Collection.isEmpty() (the hereby targeted
     *      method-under-test)
     *
     * @since 0.9.2
     */
    @Test
    public default void testSizeAccordingToIsEmpty() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        if (sut.isEmpty()) {
            assertEquals(0, sut.size());
        } else {
            assertNotEquals(0, sut.size());
        }
    }

    /**
     * @see java.util.Collection#size() public abstract int java.util.Collection.size() (the hereby targeted
     *      method-under-test)
     * @see java.util.Collection#toArray() public abstract java.lang.Object[] java.util.Collection.toArray() (the hereby
     *      targeted method-under-test)
     *
     * @since 0.9.2
     */
    @Test
    public default void testToArraySize() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Object[] array = sut.toArray();
        assertEquals(sut.size(), array.length);
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#containsAll(java.util.Collection) public abstract boolean
     * java.util.Collection.containsAll(java.util.Collection<?>)}.
     *
     * <p>
     * Test method for {@link java.util.Collection#containsAll(java.util.Collection) public abstract boolean
     * java.util.Collection.containsAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#containsAll(java.util.Collection) public abstract boolean
     *      java.util.Collection.containsAll(java.util.Collection) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_containsAll_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#spliterator() public default java.util.Spliterator
     * <E> java.util.Collection.spliterator()}.
     *
     * <p>
     * Test method for {@link java.util.Collection#spliterator() public default java.util.Spliterator
     * java.util.Collection.spliterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#spliterator() public default java.util.Spliterator java.util.Collection.spliterator()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_spliterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#add(Object) public abstract boolean java.util.Collection.add(E)}.
     *
     * <p>
     * Test method for {@link java.util.Collection#add(Object) public abstract boolean
     * java.util.Collection.add(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#add(Object) public abstract boolean java.util.Collection.add(java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#removeIf(java.util.function.Predicate) public default boolean
     * java.util.Collection.removeIf(java.util.function.Predicate<? super E>)}.
     *
     * <p>
     * Test method for {@link java.util.Collection#removeIf(java.util.function.Predicate) public default boolean
     * java.util.Collection.removeIf(java.util.function.Predicate)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#removeIf(java.util.function.Predicate) public default boolean
     *      java.util.Collection.removeIf(java.util.function.Predicate) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeIf_Predicate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#remove(Object) public abstract boolean
     * java.util.Collection.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Collection#remove(Object) public abstract boolean
     * java.util.Collection.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#remove(Object) public abstract boolean java.util.Collection.remove(java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#clear() public abstract void java.util.Collection.clear()}.
     *
     * <p>
     * Test method for {@link java.util.Collection#clear() public abstract void java.util.Collection.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#clear() public abstract void java.util.Collection.clear() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clear()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#isEmpty() public abstract boolean java.util.Collection.isEmpty()}.
     *
     * <p>
     * Test method for {@link java.util.Collection#isEmpty() public abstract boolean java.util.Collection.isEmpty()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#isEmpty() public abstract boolean java.util.Collection.isEmpty() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isEmpty()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#equals(Object) public abstract boolean
     * java.util.Collection.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Collection#equals(Object) public abstract boolean
     * java.util.Collection.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#equals(Object) public abstract boolean java.util.Collection.equals(java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#hashCode() public abstract int java.util.Collection.hashCode()}.
     *
     * <p>
     * Test method for {@link java.util.Collection#hashCode() public abstract int java.util.Collection.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#hashCode() public abstract int java.util.Collection.hashCode() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#addAll(java.util.Collection) public abstract boolean
     * java.util.Collection.addAll(java.util.Collection<? extends E>)}.
     *
     * <p>
     * Test method for {@link java.util.Collection#addAll(java.util.Collection) public abstract boolean
     * java.util.Collection.addAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#addAll(java.util.Collection) public abstract boolean
     *      java.util.Collection.addAll(java.util.Collection) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addAll_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#stream() public default java.util.stream.Stream
     * <E> java.util.Collection.stream()}.
     *
     * <p>
     * Test method for {@link java.util.Collection#stream() public default java.util.stream.Stream
     * java.util.Collection.stream()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#stream() public default java.util.stream.Stream java.util.Collection.stream() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_stream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#size() public abstract int java.util.Collection.size()}.
     *
     * <p>
     * Test method for {@link java.util.Collection#size() public abstract int java.util.Collection.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#size() public abstract int java.util.Collection.size() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_size()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#contains(Object) public abstract boolean
     * java.util.Collection.contains(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.Collection#contains(Object) public abstract boolean
     * java.util.Collection.contains(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#contains(Object) public abstract boolean
     *      java.util.Collection.contains(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_contains_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#iterator() public abstract java.util.Iterator
     * <E> java.util.Collection.iterator()}.
     *
     * <p>
     * Test method for {@link java.util.Collection#iterator() public abstract java.util.Iterator
     * java.util.Collection.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#iterator() public abstract java.util.Iterator java.util.Collection.iterator() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_iterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#removeAll(java.util.Collection) public abstract boolean
     * java.util.Collection.removeAll(java.util.Collection<?>)}.
     *
     * <p>
     * Test method for {@link java.util.Collection#removeAll(java.util.Collection) public abstract boolean
     * java.util.Collection.removeAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#removeAll(java.util.Collection) public abstract boolean
     *      java.util.Collection.removeAll(java.util.Collection) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeAll_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#retainAll(java.util.Collection) public abstract boolean
     * java.util.Collection.retainAll(java.util.Collection<?>)}.
     *
     * <p>
     * Test method for {@link java.util.Collection#retainAll(java.util.Collection) public abstract boolean
     * java.util.Collection.retainAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#retainAll(java.util.Collection) public abstract boolean
     *      java.util.Collection.retainAll(java.util.Collection) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_retainAll_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#parallelStream() public default java.util.stream.Stream
     * <E> java.util.Collection.parallelStream()}.
     *
     * <p>
     * Test method for {@link java.util.Collection#parallelStream() public default java.util.stream.Stream
     * java.util.Collection.parallelStream()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#parallelStream() public default java.util.stream.Stream
     *      java.util.Collection.parallelStream() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parallelStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#toArray(Object[]) public abstract <T> T[]
     * java.util.Collection.toArray(T[])}.
     *
     * <p>
     * Test method for {@link java.util.Collection#toArray(Object[]) public abstract java.lang.Object[]
     * java.util.Collection.toArray(java.lang.Object[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#toArray(Object[]) public abstract java.lang.Object[]
     *      java.util.Collection.toArray(java.lang.Object[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toArray_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.Collection#toArray() public abstract java.lang.Object[]
     * java.util.Collection.toArray()}.
     *
     * <p>
     * Test method for {@link java.util.Collection#toArray() public abstract java.lang.Object[]
     * java.util.Collection.toArray()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.Collection#toArray() public abstract java.lang.Object[] java.util.Collection.toArray() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
