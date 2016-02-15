package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ConcurrentLinkedDeque class
 * java.util.concurrent.ConcurrentLinkedDeque}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ConcurrentLinkedDequeClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ConcurrentLinkedDeque class java.util.concurrent.ConcurrentLinkedDeque (the hereby targeted
 *      class-under-test class)
 * @see ConcurrentLinkedDequeClassTests ConcurrentLinkedDequeClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConcurrentLinkedDequeTests<SUT extends java.util.concurrent.ConcurrentLinkedDeque<E>, E>
extends org.j8unit.repository.java.util.DequeTests<SUT, E>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.util.AbstractCollectionTests<SUT, E> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#push(Object) public void
     * java.util.concurrent.ConcurrentLinkedDeque.push(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#push(Object) public void
     * java.util.concurrent.ConcurrentLinkedDeque.push(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#push(Object) public void
     *      java.util.concurrent.ConcurrentLinkedDeque.push(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_push_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#peek() public E
     * java.util.concurrent.ConcurrentLinkedDeque.peek()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#peek() public java.lang.Object
     * java.util.concurrent.ConcurrentLinkedDeque.peek()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#peek() public java.lang.Object
     *      java.util.concurrent.ConcurrentLinkedDeque.peek() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#peekFirst() public E
     * java.util.concurrent.ConcurrentLinkedDeque.peekFirst()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#peekFirst() public java.lang.Object
     * java.util.concurrent.ConcurrentLinkedDeque.peekFirst()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#peekFirst() public java.lang.Object
     *      java.util.concurrent.ConcurrentLinkedDeque.peekFirst() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_peekFirst()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#peekLast() public E
     * java.util.concurrent.ConcurrentLinkedDeque.peekLast()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#peekLast() public java.lang.Object
     * java.util.concurrent.ConcurrentLinkedDeque.peekLast()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#peekLast() public java.lang.Object
     *      java.util.concurrent.ConcurrentLinkedDeque.peekLast() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_peekLast()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#clear() public void
     * java.util.concurrent.ConcurrentLinkedDeque.clear()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#clear() public void
     * java.util.concurrent.ConcurrentLinkedDeque.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#clear() public void
     *      java.util.concurrent.ConcurrentLinkedDeque.clear() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#isEmpty() public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.isEmpty()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#isEmpty() public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.isEmpty()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#isEmpty() public boolean
     *      java.util.concurrent.ConcurrentLinkedDeque.isEmpty() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#spliterator() public java.util.Spliterator
     * <E> java.util.concurrent.ConcurrentLinkedDeque.spliterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#spliterator() public java.util.Spliterator
     * java.util.concurrent.ConcurrentLinkedDeque.spliterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#spliterator() public java.util.Spliterator
     *      java.util.concurrent.ConcurrentLinkedDeque.spliterator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#add(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.add(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#add(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.add(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#add(Object) public boolean
     *      java.util.concurrent.ConcurrentLinkedDeque.add(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#addFirst(Object) public void
     * java.util.concurrent.ConcurrentLinkedDeque.addFirst(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#addFirst(Object) public void
     * java.util.concurrent.ConcurrentLinkedDeque.addFirst(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#addFirst(Object) public void
     *      java.util.concurrent.ConcurrentLinkedDeque.addFirst(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addFirst_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#pollFirst() public E
     * java.util.concurrent.ConcurrentLinkedDeque.pollFirst()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#pollFirst() public java.lang.Object
     * java.util.concurrent.ConcurrentLinkedDeque.pollFirst()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#pollFirst() public java.lang.Object
     *      java.util.concurrent.ConcurrentLinkedDeque.pollFirst() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_pollFirst()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#removeFirstOccurrence(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.removeFirstOccurrence(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#removeFirstOccurrence(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.removeFirstOccurrence(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#removeFirstOccurrence(Object) public boolean
     *      java.util.concurrent.ConcurrentLinkedDeque.removeFirstOccurrence(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeFirstOccurrence_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#size() public int
     * java.util.concurrent.ConcurrentLinkedDeque.size()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#size() public int
     * java.util.concurrent.ConcurrentLinkedDeque.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#size() public int
     *      java.util.concurrent.ConcurrentLinkedDeque.size() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#addAll(java.util.Collection) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.addAll(java.util.Collection<? extends E>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#addAll(java.util.Collection) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.addAll(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#addAll(java.util.Collection) public boolean
     *      java.util.concurrent.ConcurrentLinkedDeque.addAll(java.util.Collection) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#contains(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.contains(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#contains(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.contains(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#contains(Object) public boolean
     *      java.util.concurrent.ConcurrentLinkedDeque.contains(java.lang.Object) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#offerLast(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.offerLast(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#offerLast(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.offerLast(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#offerLast(Object) public boolean
     *      java.util.concurrent.ConcurrentLinkedDeque.offerLast(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_offerLast_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#remove(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#remove(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#remove(Object) public boolean
     *      java.util.concurrent.ConcurrentLinkedDeque.remove(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#remove() public E
     * java.util.concurrent.ConcurrentLinkedDeque.remove()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#remove() public java.lang.Object
     * java.util.concurrent.ConcurrentLinkedDeque.remove()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#remove() public java.lang.Object
     *      java.util.concurrent.ConcurrentLinkedDeque.remove() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_remove()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#getLast() public E
     * java.util.concurrent.ConcurrentLinkedDeque.getLast()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#getLast() public java.lang.Object
     * java.util.concurrent.ConcurrentLinkedDeque.getLast()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#getLast() public java.lang.Object
     *      java.util.concurrent.ConcurrentLinkedDeque.getLast() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getLast()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#pollLast() public E
     * java.util.concurrent.ConcurrentLinkedDeque.pollLast()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#pollLast() public java.lang.Object
     * java.util.concurrent.ConcurrentLinkedDeque.pollLast()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#pollLast() public java.lang.Object
     *      java.util.concurrent.ConcurrentLinkedDeque.pollLast() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_pollLast()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#removeLast() public E
     * java.util.concurrent.ConcurrentLinkedDeque.removeLast()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#removeLast() public java.lang.Object
     * java.util.concurrent.ConcurrentLinkedDeque.removeLast()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#removeLast() public java.lang.Object
     *      java.util.concurrent.ConcurrentLinkedDeque.removeLast() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeLast()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#poll() public E
     * java.util.concurrent.ConcurrentLinkedDeque.poll()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#poll() public java.lang.Object
     * java.util.concurrent.ConcurrentLinkedDeque.poll()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#poll() public java.lang.Object
     *      java.util.concurrent.ConcurrentLinkedDeque.poll() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#descendingIterator() public java.util.Iterator
     * <E> java.util.concurrent.ConcurrentLinkedDeque.descendingIterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#descendingIterator() public java.util.Iterator
     * java.util.concurrent.ConcurrentLinkedDeque.descendingIterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#descendingIterator() public java.util.Iterator
     *      java.util.concurrent.ConcurrentLinkedDeque.descendingIterator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_descendingIterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#offerFirst(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.offerFirst(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#offerFirst(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.offerFirst(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#offerFirst(Object) public boolean
     *      java.util.concurrent.ConcurrentLinkedDeque.offerFirst(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_offerFirst_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#element() public E
     * java.util.concurrent.ConcurrentLinkedDeque.element()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#element() public java.lang.Object
     * java.util.concurrent.ConcurrentLinkedDeque.element()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#element() public java.lang.Object
     *      java.util.concurrent.ConcurrentLinkedDeque.element() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_element()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#removeLastOccurrence(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.removeLastOccurrence(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#removeLastOccurrence(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.removeLastOccurrence(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#removeLastOccurrence(Object) public boolean
     *      java.util.concurrent.ConcurrentLinkedDeque.removeLastOccurrence(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeLastOccurrence_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#toArray() public java.lang.Object[]
     * java.util.concurrent.ConcurrentLinkedDeque.toArray()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#toArray() public java.lang.Object[]
     * java.util.concurrent.ConcurrentLinkedDeque.toArray()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#toArray() public java.lang.Object[]
     *      java.util.concurrent.ConcurrentLinkedDeque.toArray() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#toArray(Object[]) public <T> T[]
     * java.util.concurrent.ConcurrentLinkedDeque.toArray(T[])}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#toArray(Object[]) public java.lang.Object[]
     * java.util.concurrent.ConcurrentLinkedDeque.toArray(java.lang.Object[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#toArray(Object[]) public java.lang.Object[]
     *      java.util.concurrent.ConcurrentLinkedDeque.toArray(java.lang.Object[]) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#getFirst() public E
     * java.util.concurrent.ConcurrentLinkedDeque.getFirst()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#getFirst() public java.lang.Object
     * java.util.concurrent.ConcurrentLinkedDeque.getFirst()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#getFirst() public java.lang.Object
     *      java.util.concurrent.ConcurrentLinkedDeque.getFirst() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getFirst()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#removeFirst() public E
     * java.util.concurrent.ConcurrentLinkedDeque.removeFirst()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#removeFirst() public java.lang.Object
     * java.util.concurrent.ConcurrentLinkedDeque.removeFirst()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#removeFirst() public java.lang.Object
     *      java.util.concurrent.ConcurrentLinkedDeque.removeFirst() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeFirst()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#iterator() public java.util.Iterator
     * <E> java.util.concurrent.ConcurrentLinkedDeque.iterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#iterator() public java.util.Iterator
     * java.util.concurrent.ConcurrentLinkedDeque.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#iterator() public java.util.Iterator
     *      java.util.concurrent.ConcurrentLinkedDeque.iterator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#pop() public E
     * java.util.concurrent.ConcurrentLinkedDeque.pop()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#pop() public java.lang.Object
     * java.util.concurrent.ConcurrentLinkedDeque.pop()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#pop() public java.lang.Object
     *      java.util.concurrent.ConcurrentLinkedDeque.pop() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_pop()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#offer(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.offer(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#offer(Object) public boolean
     * java.util.concurrent.ConcurrentLinkedDeque.offer(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#offer(Object) public boolean
     *      java.util.concurrent.ConcurrentLinkedDeque.offer(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#addLast(Object) public void
     * java.util.concurrent.ConcurrentLinkedDeque.addLast(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ConcurrentLinkedDeque#addLast(Object) public void
     * java.util.concurrent.ConcurrentLinkedDeque.addLast(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ConcurrentLinkedDeque#addLast(Object) public void
     *      java.util.concurrent.ConcurrentLinkedDeque.addLast(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addLast_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.Collection#removeAll(java.util.Collection) interface java.util.Collection}</li>
     * <li>{@linkplain java.util.AbstractCollection#removeAll(java.util.Collection) class java.util.AbstractCollection}
     * </li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeAll_Collection()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.Collection#containsAll(java.util.Collection) interface java.util.Collection}</li>
     * <li>{@linkplain java.util.AbstractCollection#containsAll(java.util.Collection) class
     * java.util.AbstractCollection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_containsAll_Collection()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.Collection#hashCode() interface java.util.Collection}</li>
     * <li>{@linkplain java.util.AbstractCollection#hashCode() class java.util.AbstractCollection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.Collection#retainAll(java.util.Collection) interface java.util.Collection}</li>
     * <li>{@linkplain java.util.AbstractCollection#retainAll(java.util.Collection) class java.util.AbstractCollection}
     * </li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_retainAll_Collection()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.Collection#equals(Object) interface java.util.Collection}</li>
     * <li>{@linkplain java.util.AbstractCollection#equals(Object) class java.util.AbstractCollection}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
    }

}
