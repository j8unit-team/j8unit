package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.PriorityQueue class java.util.PriorityQueue}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link PriorityQueueClassTests}.
 * </p>
 *
 * @see java.util.PriorityQueue class java.util.PriorityQueue (the hereby targeted class-under-test class)
 * @see PriorityQueueClassTests PriorityQueueClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PriorityQueueTests<SUT extends java.util.PriorityQueue<E>, E>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, AbstractQueueTests<SUT, E> {

    /**
     * <p>
     * Test method for {@link java.util.PriorityQueue#spliterator() public final java.util.Spliterator
     * <E> java.util.PriorityQueue.spliterator()}.
     *
     * <p>
     * Test method for {@link java.util.PriorityQueue#spliterator() public final java.util.Spliterator
     * java.util.PriorityQueue.spliterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PriorityQueue#spliterator() public final java.util.Spliterator
     *      java.util.PriorityQueue.spliterator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.PriorityQueue#add(Object) public boolean java.util.PriorityQueue.add(E)}.
     *
     * <p>
     * Test method for {@link java.util.PriorityQueue#add(Object) public boolean
     * java.util.PriorityQueue.add(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PriorityQueue#add(Object) public boolean java.util.PriorityQueue.add(java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.PriorityQueue#remove(Object) public boolean
     * java.util.PriorityQueue.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.PriorityQueue#remove(Object) public boolean
     * java.util.PriorityQueue.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PriorityQueue#remove(Object) public boolean java.util.PriorityQueue.remove(java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.PriorityQueue#peek() public E java.util.PriorityQueue.peek()}.
     *
     * <p>
     * Test method for {@link java.util.PriorityQueue#peek() public java.lang.Object java.util.PriorityQueue.peek()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PriorityQueue#peek() public java.lang.Object java.util.PriorityQueue.peek() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_peek()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.PriorityQueue#poll() public E java.util.PriorityQueue.poll()}.
     *
     * <p>
     * Test method for {@link java.util.PriorityQueue#poll() public java.lang.Object java.util.PriorityQueue.poll()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PriorityQueue#poll() public java.lang.Object java.util.PriorityQueue.poll() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_poll()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.PriorityQueue#clear() public void java.util.PriorityQueue.clear()}.
     *
     * <p>
     * Test method for {@link java.util.PriorityQueue#clear() public void java.util.PriorityQueue.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PriorityQueue#clear() public void java.util.PriorityQueue.clear() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.PriorityQueue#size() public int java.util.PriorityQueue.size()}.
     *
     * <p>
     * Test method for {@link java.util.PriorityQueue#size() public int java.util.PriorityQueue.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PriorityQueue#size() public int java.util.PriorityQueue.size() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.PriorityQueue#contains(Object) public boolean
     * java.util.PriorityQueue.contains(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.PriorityQueue#contains(Object) public boolean
     * java.util.PriorityQueue.contains(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PriorityQueue#contains(Object) public boolean java.util.PriorityQueue.contains(java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.PriorityQueue#iterator() public java.util.Iterator
     * <E> java.util.PriorityQueue.iterator()}.
     *
     * <p>
     * Test method for {@link java.util.PriorityQueue#iterator() public java.util.Iterator
     * java.util.PriorityQueue.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PriorityQueue#iterator() public java.util.Iterator java.util.PriorityQueue.iterator() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.PriorityQueue#offer(Object) public boolean java.util.PriorityQueue.offer(E)}.
     *
     * <p>
     * Test method for {@link java.util.PriorityQueue#offer(Object) public boolean
     * java.util.PriorityQueue.offer(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PriorityQueue#offer(Object) public boolean java.util.PriorityQueue.offer(java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_offer_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.PriorityQueue#comparator() public java.util.Comparator<? super E>
     * java.util.PriorityQueue.comparator()}.
     *
     * <p>
     * Test method for {@link java.util.PriorityQueue#comparator() public java.util.Comparator
     * java.util.PriorityQueue.comparator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PriorityQueue#comparator() public java.util.Comparator java.util.PriorityQueue.comparator() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_comparator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.PriorityQueue#toArray(Object[]) public <T> T[]
     * java.util.PriorityQueue.toArray(T[])}.
     *
     * <p>
     * Test method for {@link java.util.PriorityQueue#toArray(Object[]) public java.lang.Object[]
     * java.util.PriorityQueue.toArray(java.lang.Object[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PriorityQueue#toArray(Object[]) public java.lang.Object[]
     *      java.util.PriorityQueue.toArray(java.lang.Object[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.PriorityQueue#toArray() public java.lang.Object[]
     * java.util.PriorityQueue.toArray()}.
     *
     * <p>
     * Test method for {@link java.util.PriorityQueue#toArray() public java.lang.Object[]
     * java.util.PriorityQueue.toArray()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.PriorityQueue#toArray() public java.lang.Object[] java.util.PriorityQueue.toArray() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
