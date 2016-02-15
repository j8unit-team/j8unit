package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.BlockingDeque interface
 * java.util.concurrent.BlockingDeque}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link BlockingDequeClassTests}.
 * </p>
 *
 * @see java.util.concurrent.BlockingDeque interface java.util.concurrent.BlockingDeque (the hereby targeted
 *      class-under-test class)
 * @see BlockingDequeClassTests BlockingDequeClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BlockingDequeTests<SUT extends java.util.concurrent.BlockingDeque<E>, E>
extends BlockingQueueTests<SUT, E>, org.j8unit.repository.java.util.DequeTests<SUT, E> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#add(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.add(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#add(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.add(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#add(Object) public abstract boolean
     *      java.util.concurrent.BlockingDeque.add(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingDeque#putLast(Object) public abstract void
     * java.util.concurrent.BlockingDeque.putLast(E) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#putLast(Object) public abstract void
     * java.util.concurrent.BlockingDeque.putLast(java.lang.Object) throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#putLast(Object) public abstract void
     *      java.util.concurrent.BlockingDeque.putLast(java.lang.Object) throws java.lang.InterruptedException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_putLast_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#peek() public abstract E
     * java.util.concurrent.BlockingDeque.peek()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#peek() public abstract java.lang.Object
     * java.util.concurrent.BlockingDeque.peek()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#peek() public abstract java.lang.Object
     *      java.util.concurrent.BlockingDeque.peek() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingDeque#push(Object) public abstract void
     * java.util.concurrent.BlockingDeque.push(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#push(Object) public abstract void
     * java.util.concurrent.BlockingDeque.push(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#push(Object) public abstract void
     *      java.util.concurrent.BlockingDeque.push(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingDeque#size() public abstract int
     * java.util.concurrent.BlockingDeque.size()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#size() public abstract int
     * java.util.concurrent.BlockingDeque.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#size() public abstract int java.util.concurrent.BlockingDeque.size() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingDeque#offerLast(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.offerLast(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#offerLast(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.offerLast(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#offerLast(Object) public abstract boolean
     *      java.util.concurrent.BlockingDeque.offerLast(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingDeque#offerLast(Object, long, java.util.concurrent.TimeUnit)
     * public abstract boolean java.util.concurrent.BlockingDeque.offerLast(E,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#offerLast(Object, long, java.util.concurrent.TimeUnit)
     * public abstract boolean
     * java.util.concurrent.BlockingDeque.offerLast(java.lang.Object,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#offerLast(Object, long, java.util.concurrent.TimeUnit) public abstract
     *      boolean java.util.concurrent.BlockingDeque.offerLast(java.lang.Object,long,java.util.concurrent.TimeUnit)
     *      throws java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_offerLast_Object_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#take() public abstract E
     * java.util.concurrent.BlockingDeque.take() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#take() public abstract java.lang.Object
     * java.util.concurrent.BlockingDeque.take() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#take() public abstract java.lang.Object
     *      java.util.concurrent.BlockingDeque.take() throws java.lang.InterruptedException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_take()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#takeLast() public abstract E
     * java.util.concurrent.BlockingDeque.takeLast() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#takeLast() public abstract java.lang.Object
     * java.util.concurrent.BlockingDeque.takeLast() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#takeLast() public abstract java.lang.Object
     *      java.util.concurrent.BlockingDeque.takeLast() throws java.lang.InterruptedException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_takeLast()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#contains(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.contains(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#contains(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.contains(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#contains(Object) public abstract boolean
     *      java.util.concurrent.BlockingDeque.contains(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingDeque#addFirst(Object) public abstract void
     * java.util.concurrent.BlockingDeque.addFirst(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#addFirst(Object) public abstract void
     * java.util.concurrent.BlockingDeque.addFirst(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#addFirst(Object) public abstract void
     *      java.util.concurrent.BlockingDeque.addFirst(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingDeque#pollFirst(long, java.util.concurrent.TimeUnit) public
     * abstract E java.util.concurrent.BlockingDeque.pollFirst(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#pollFirst(long, java.util.concurrent.TimeUnit) public
     * abstract java.lang.Object java.util.concurrent.BlockingDeque.pollFirst(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#pollFirst(long, java.util.concurrent.TimeUnit) public abstract
     *      java.lang.Object java.util.concurrent.BlockingDeque.pollFirst(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_pollFirst_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#removeFirstOccurrence(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.removeFirstOccurrence(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#removeFirstOccurrence(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.removeFirstOccurrence(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#removeFirstOccurrence(Object) public abstract boolean
     *      java.util.concurrent.BlockingDeque.removeFirstOccurrence(java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.BlockingDeque#pollLast(long, java.util.concurrent.TimeUnit) public
     * abstract E java.util.concurrent.BlockingDeque.pollLast(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#pollLast(long, java.util.concurrent.TimeUnit) public
     * abstract java.lang.Object java.util.concurrent.BlockingDeque.pollLast(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#pollLast(long, java.util.concurrent.TimeUnit) public abstract
     *      java.lang.Object java.util.concurrent.BlockingDeque.pollLast(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_pollLast_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#remove() public abstract E
     * java.util.concurrent.BlockingDeque.remove()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#remove() public abstract java.lang.Object
     * java.util.concurrent.BlockingDeque.remove()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#remove() public abstract java.lang.Object
     *      java.util.concurrent.BlockingDeque.remove() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingDeque#remove(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#remove(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#remove(Object) public abstract boolean
     *      java.util.concurrent.BlockingDeque.remove(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingDeque#put(Object) public abstract void
     * java.util.concurrent.BlockingDeque.put(E) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#put(Object) public abstract void
     * java.util.concurrent.BlockingDeque.put(java.lang.Object) throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#put(Object) public abstract void
     *      java.util.concurrent.BlockingDeque.put(java.lang.Object) throws java.lang.InterruptedException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_put_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#offerFirst(Object, long, java.util.concurrent.TimeUnit)
     * public abstract boolean java.util.concurrent.BlockingDeque.offerFirst(E,long,java.util.concurrent.TimeUnit)
     * throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#offerFirst(Object, long, java.util.concurrent.TimeUnit)
     * public abstract boolean
     * java.util.concurrent.BlockingDeque.offerFirst(java.lang.Object,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#offerFirst(Object, long, java.util.concurrent.TimeUnit) public abstract
     *      boolean java.util.concurrent.BlockingDeque.offerFirst(java.lang.Object,long,java.util.concurrent.TimeUnit)
     *      throws java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_offerFirst_Object_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#offerFirst(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.offerFirst(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#offerFirst(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.offerFirst(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#offerFirst(Object) public abstract boolean
     *      java.util.concurrent.BlockingDeque.offerFirst(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingDeque#poll(long, java.util.concurrent.TimeUnit) public
     * abstract E java.util.concurrent.BlockingDeque.poll(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#poll(long, java.util.concurrent.TimeUnit) public
     * abstract java.lang.Object java.util.concurrent.BlockingDeque.poll(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#poll(long, java.util.concurrent.TimeUnit) public abstract
     *      java.lang.Object java.util.concurrent.BlockingDeque.poll(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_poll_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#poll() public abstract E
     * java.util.concurrent.BlockingDeque.poll()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#poll() public abstract java.lang.Object
     * java.util.concurrent.BlockingDeque.poll()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#poll() public abstract java.lang.Object
     *      java.util.concurrent.BlockingDeque.poll() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingDeque#addLast(Object) public abstract void
     * java.util.concurrent.BlockingDeque.addLast(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#addLast(Object) public abstract void
     * java.util.concurrent.BlockingDeque.addLast(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#addLast(Object) public abstract void
     *      java.util.concurrent.BlockingDeque.addLast(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingDeque#offer(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.offer(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#offer(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.offer(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#offer(Object) public abstract boolean
     *      java.util.concurrent.BlockingDeque.offer(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingDeque#offer(Object, long, java.util.concurrent.TimeUnit)
     * public abstract boolean java.util.concurrent.BlockingDeque.offer(E,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#offer(Object, long, java.util.concurrent.TimeUnit)
     * public abstract boolean
     * java.util.concurrent.BlockingDeque.offer(java.lang.Object,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#offer(Object, long, java.util.concurrent.TimeUnit) public abstract
     *      boolean java.util.concurrent.BlockingDeque.offer(java.lang.Object,long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_offer_Object_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#iterator() public abstract java.util.Iterator
     * <E> java.util.concurrent.BlockingDeque.iterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#iterator() public abstract java.util.Iterator
     * java.util.concurrent.BlockingDeque.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#iterator() public abstract java.util.Iterator
     *      java.util.concurrent.BlockingDeque.iterator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingDeque#takeFirst() public abstract E
     * java.util.concurrent.BlockingDeque.takeFirst() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#takeFirst() public abstract java.lang.Object
     * java.util.concurrent.BlockingDeque.takeFirst() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#takeFirst() public abstract java.lang.Object
     *      java.util.concurrent.BlockingDeque.takeFirst() throws java.lang.InterruptedException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_takeFirst()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#element() public abstract E
     * java.util.concurrent.BlockingDeque.element()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#element() public abstract java.lang.Object
     * java.util.concurrent.BlockingDeque.element()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#element() public abstract java.lang.Object
     *      java.util.concurrent.BlockingDeque.element() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingDeque#removeLastOccurrence(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.removeLastOccurrence(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#removeLastOccurrence(Object) public abstract boolean
     * java.util.concurrent.BlockingDeque.removeLastOccurrence(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#removeLastOccurrence(Object) public abstract boolean
     *      java.util.concurrent.BlockingDeque.removeLastOccurrence(java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.BlockingDeque#putFirst(Object) public abstract void
     * java.util.concurrent.BlockingDeque.putFirst(E) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingDeque#putFirst(Object) public abstract void
     * java.util.concurrent.BlockingDeque.putFirst(java.lang.Object) throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingDeque#putFirst(Object) public abstract void
     *      java.util.concurrent.BlockingDeque.putFirst(java.lang.Object) throws java.lang.InterruptedException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_putFirst_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
