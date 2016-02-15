package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.LinkedBlockingDeque class
 * java.util.concurrent.LinkedBlockingDeque}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link LinkedBlockingDequeClassTests}.
 * </p>
 *
 * @see java.util.concurrent.LinkedBlockingDeque class java.util.concurrent.LinkedBlockingDeque (the hereby targeted
 *      class-under-test class)
 * @see LinkedBlockingDequeClassTests LinkedBlockingDequeClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LinkedBlockingDequeTests<SUT extends java.util.concurrent.LinkedBlockingDeque<E>, E>
extends BlockingDequeTests<SUT, E>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.util.AbstractQueueTests<SUT, E> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#toString() public java.lang.String
     * java.util.concurrent.LinkedBlockingDeque.toString()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#toString() public java.lang.String
     * java.util.concurrent.LinkedBlockingDeque.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#toString() public java.lang.String
     *      java.util.concurrent.LinkedBlockingDeque.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#pollFirst() public E
     * java.util.concurrent.LinkedBlockingDeque.pollFirst()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#pollFirst() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.pollFirst()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#pollFirst() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.pollFirst() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#pollFirst(long, java.util.concurrent.TimeUnit)
     * public E java.util.concurrent.LinkedBlockingDeque.pollFirst(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#pollFirst(long, java.util.concurrent.TimeUnit)
     * public java.lang.Object java.util.concurrent.LinkedBlockingDeque.pollFirst(long,java.util.concurrent.TimeUnit)
     * throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#pollFirst(long, java.util.concurrent.TimeUnit) public
     *      java.lang.Object java.util.concurrent.LinkedBlockingDeque.pollFirst(long,java.util.concurrent.TimeUnit)
     *      throws java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#removeFirstOccurrence(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.removeFirstOccurrence(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#removeFirstOccurrence(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.removeFirstOccurrence(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#removeFirstOccurrence(Object) public boolean
     *      java.util.concurrent.LinkedBlockingDeque.removeFirstOccurrence(java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#remainingCapacity() public int
     * java.util.concurrent.LinkedBlockingDeque.remainingCapacity()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#remainingCapacity() public int
     * java.util.concurrent.LinkedBlockingDeque.remainingCapacity()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#remainingCapacity() public int
     *      java.util.concurrent.LinkedBlockingDeque.remainingCapacity() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_remainingCapacity()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#addFirst(Object) public void
     * java.util.concurrent.LinkedBlockingDeque.addFirst(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#addFirst(Object) public void
     * java.util.concurrent.LinkedBlockingDeque.addFirst(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#addFirst(Object) public void
     *      java.util.concurrent.LinkedBlockingDeque.addFirst(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#offerLast(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.offerLast(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#offerLast(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.offerLast(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#offerLast(Object) public boolean
     *      java.util.concurrent.LinkedBlockingDeque.offerLast(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for
     * {@link java.util.concurrent.LinkedBlockingDeque#offerLast(Object, long, java.util.concurrent.TimeUnit) public
     * boolean java.util.concurrent.LinkedBlockingDeque.offerLast(E,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.LinkedBlockingDeque#offerLast(Object, long, java.util.concurrent.TimeUnit) public
     * boolean java.util.concurrent.LinkedBlockingDeque.offerLast(java.lang.Object,long,java.util.concurrent.TimeUnit)
     * throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#offerLast(Object, long, java.util.concurrent.TimeUnit) public
     *      boolean
     *      java.util.concurrent.LinkedBlockingDeque.offerLast(java.lang.Object,long,java.util.concurrent.TimeUnit)
     *      throws java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#take() public E
     * java.util.concurrent.LinkedBlockingDeque.take() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#take() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.take() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#take() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.take() throws java.lang.InterruptedException (the hereby targeted
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#contains(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.contains(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#contains(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.contains(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#contains(Object) public boolean
     *      java.util.concurrent.LinkedBlockingDeque.contains(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#takeLast() public E
     * java.util.concurrent.LinkedBlockingDeque.takeLast() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#takeLast() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.takeLast() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#takeLast() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.takeLast() throws java.lang.InterruptedException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#size() public int
     * java.util.concurrent.LinkedBlockingDeque.size()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#size() public int
     * java.util.concurrent.LinkedBlockingDeque.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#size() public int java.util.concurrent.LinkedBlockingDeque.size()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#clear() public void
     * java.util.concurrent.LinkedBlockingDeque.clear()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#clear() public void
     * java.util.concurrent.LinkedBlockingDeque.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#clear() public void
     *      java.util.concurrent.LinkedBlockingDeque.clear() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#peekFirst() public E
     * java.util.concurrent.LinkedBlockingDeque.peekFirst()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#peekFirst() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.peekFirst()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#peekFirst() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.peekFirst() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#peekLast() public E
     * java.util.concurrent.LinkedBlockingDeque.peekLast()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#peekLast() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.peekLast()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#peekLast() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.peekLast() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#drainTo(java.util.Collection) public int
     * java.util.concurrent.LinkedBlockingDeque.drainTo(java.util.Collection<? super E>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#drainTo(java.util.Collection) public int
     * java.util.concurrent.LinkedBlockingDeque.drainTo(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#drainTo(java.util.Collection) public int
     *      java.util.concurrent.LinkedBlockingDeque.drainTo(java.util.Collection) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_drainTo_Collection()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#drainTo(java.util.Collection, int) public int
     * java.util.concurrent.LinkedBlockingDeque.drainTo(java.util.Collection<? super E>,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#drainTo(java.util.Collection, int) public int
     * java.util.concurrent.LinkedBlockingDeque.drainTo(java.util.Collection,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#drainTo(java.util.Collection, int) public int
     *      java.util.concurrent.LinkedBlockingDeque.drainTo(java.util.Collection,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_drainTo_Collection_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#push(Object) public void
     * java.util.concurrent.LinkedBlockingDeque.push(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#push(Object) public void
     * java.util.concurrent.LinkedBlockingDeque.push(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#push(Object) public void
     *      java.util.concurrent.LinkedBlockingDeque.push(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#peek() public E
     * java.util.concurrent.LinkedBlockingDeque.peek()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#peek() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.peek()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#peek() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.peek() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#add(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.add(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#add(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.add(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#add(Object) public boolean
     *      java.util.concurrent.LinkedBlockingDeque.add(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#putLast(Object) public void
     * java.util.concurrent.LinkedBlockingDeque.putLast(E) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#putLast(Object) public void
     * java.util.concurrent.LinkedBlockingDeque.putLast(java.lang.Object) throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#putLast(Object) public void
     *      java.util.concurrent.LinkedBlockingDeque.putLast(java.lang.Object) throws java.lang.InterruptedException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#spliterator() public java.util.Spliterator
     * <E> java.util.concurrent.LinkedBlockingDeque.spliterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#spliterator() public java.util.Spliterator
     * java.util.concurrent.LinkedBlockingDeque.spliterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#spliterator() public java.util.Spliterator
     *      java.util.concurrent.LinkedBlockingDeque.spliterator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#toArray(Object[]) public <T> T[]
     * java.util.concurrent.LinkedBlockingDeque.toArray(T[])}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#toArray(Object[]) public java.lang.Object[]
     * java.util.concurrent.LinkedBlockingDeque.toArray(java.lang.Object[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#toArray(Object[]) public java.lang.Object[]
     *      java.util.concurrent.LinkedBlockingDeque.toArray(java.lang.Object[]) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#toArray() public java.lang.Object[]
     * java.util.concurrent.LinkedBlockingDeque.toArray()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#toArray() public java.lang.Object[]
     * java.util.concurrent.LinkedBlockingDeque.toArray()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#toArray() public java.lang.Object[]
     *      java.util.concurrent.LinkedBlockingDeque.toArray() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#putFirst(Object) public void
     * java.util.concurrent.LinkedBlockingDeque.putFirst(E) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#putFirst(Object) public void
     * java.util.concurrent.LinkedBlockingDeque.putFirst(java.lang.Object) throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#putFirst(Object) public void
     *      java.util.concurrent.LinkedBlockingDeque.putFirst(java.lang.Object) throws java.lang.InterruptedException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_putFirst_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#takeFirst() public E
     * java.util.concurrent.LinkedBlockingDeque.takeFirst() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#takeFirst() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.takeFirst() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#takeFirst() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.takeFirst() throws java.lang.InterruptedException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#element() public E
     * java.util.concurrent.LinkedBlockingDeque.element()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#element() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.element()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#element() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.element() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#removeLastOccurrence(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.removeLastOccurrence(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#removeLastOccurrence(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.removeLastOccurrence(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#removeLastOccurrence(Object) public boolean
     *      java.util.concurrent.LinkedBlockingDeque.removeLastOccurrence(java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#pop() public E
     * java.util.concurrent.LinkedBlockingDeque.pop()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#pop() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.pop()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#pop() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.pop() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#offer(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.offer(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#offer(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.offer(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#offer(Object) public boolean
     *      java.util.concurrent.LinkedBlockingDeque.offer(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for
     * {@link java.util.concurrent.LinkedBlockingDeque#offer(Object, long, java.util.concurrent.TimeUnit) public boolean
     * java.util.concurrent.LinkedBlockingDeque.offer(E,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.LinkedBlockingDeque#offer(Object, long, java.util.concurrent.TimeUnit) public boolean
     * java.util.concurrent.LinkedBlockingDeque.offer(java.lang.Object,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#offer(Object, long, java.util.concurrent.TimeUnit) public boolean
     *      java.util.concurrent.LinkedBlockingDeque.offer(java.lang.Object,long,java.util.concurrent.TimeUnit) throws
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#addLast(Object) public void
     * java.util.concurrent.LinkedBlockingDeque.addLast(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#addLast(Object) public void
     * java.util.concurrent.LinkedBlockingDeque.addLast(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#addLast(Object) public void
     *      java.util.concurrent.LinkedBlockingDeque.addLast(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#iterator() public java.util.Iterator
     * <E> java.util.concurrent.LinkedBlockingDeque.iterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#iterator() public java.util.Iterator
     * java.util.concurrent.LinkedBlockingDeque.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#iterator() public java.util.Iterator
     *      java.util.concurrent.LinkedBlockingDeque.iterator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#getFirst() public E
     * java.util.concurrent.LinkedBlockingDeque.getFirst()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#getFirst() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.getFirst()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#getFirst() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.getFirst() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#removeFirst() public E
     * java.util.concurrent.LinkedBlockingDeque.removeFirst()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#removeFirst() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.removeFirst()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#removeFirst() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.removeFirst() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#descendingIterator() public java.util.Iterator
     * <E> java.util.concurrent.LinkedBlockingDeque.descendingIterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#descendingIterator() public java.util.Iterator
     * java.util.concurrent.LinkedBlockingDeque.descendingIterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#descendingIterator() public java.util.Iterator
     *      java.util.concurrent.LinkedBlockingDeque.descendingIterator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#offerFirst(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.offerFirst(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#offerFirst(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.offerFirst(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#offerFirst(Object) public boolean
     *      java.util.concurrent.LinkedBlockingDeque.offerFirst(java.lang.Object) (the hereby targeted
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
     * Test method for
     * {@link java.util.concurrent.LinkedBlockingDeque#offerFirst(Object, long, java.util.concurrent.TimeUnit) public
     * boolean java.util.concurrent.LinkedBlockingDeque.offerFirst(E,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.LinkedBlockingDeque#offerFirst(Object, long, java.util.concurrent.TimeUnit) public
     * boolean java.util.concurrent.LinkedBlockingDeque.offerFirst(java.lang.Object,long,java.util.concurrent.TimeUnit)
     * throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#offerFirst(Object, long, java.util.concurrent.TimeUnit) public
     *      boolean
     *      java.util.concurrent.LinkedBlockingDeque.offerFirst(java.lang.Object,long,java.util.concurrent.TimeUnit)
     *      throws java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#poll(long, java.util.concurrent.TimeUnit) public
     * E java.util.concurrent.LinkedBlockingDeque.poll(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#poll(long, java.util.concurrent.TimeUnit) public
     * java.lang.Object java.util.concurrent.LinkedBlockingDeque.poll(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#poll(long, java.util.concurrent.TimeUnit) public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.poll(long,java.util.concurrent.TimeUnit) throws
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#poll() public E
     * java.util.concurrent.LinkedBlockingDeque.poll()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#poll() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.poll()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#poll() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.poll() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#getLast() public E
     * java.util.concurrent.LinkedBlockingDeque.getLast()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#getLast() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.getLast()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#getLast() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.getLast() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#pollLast() public E
     * java.util.concurrent.LinkedBlockingDeque.pollLast()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#pollLast() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.pollLast()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#pollLast() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.pollLast() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#pollLast(long, java.util.concurrent.TimeUnit)
     * public E java.util.concurrent.LinkedBlockingDeque.pollLast(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#pollLast(long, java.util.concurrent.TimeUnit)
     * public java.lang.Object java.util.concurrent.LinkedBlockingDeque.pollLast(long,java.util.concurrent.TimeUnit)
     * throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#pollLast(long, java.util.concurrent.TimeUnit) public
     *      java.lang.Object java.util.concurrent.LinkedBlockingDeque.pollLast(long,java.util.concurrent.TimeUnit)
     *      throws java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#removeLast() public E
     * java.util.concurrent.LinkedBlockingDeque.removeLast()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#removeLast() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.removeLast()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#removeLast() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.removeLast() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#remove(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#remove(Object) public boolean
     * java.util.concurrent.LinkedBlockingDeque.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#remove(Object) public boolean
     *      java.util.concurrent.LinkedBlockingDeque.remove(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#remove() public E
     * java.util.concurrent.LinkedBlockingDeque.remove()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#remove() public java.lang.Object
     * java.util.concurrent.LinkedBlockingDeque.remove()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#remove() public java.lang.Object
     *      java.util.concurrent.LinkedBlockingDeque.remove() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#put(Object) public void
     * java.util.concurrent.LinkedBlockingDeque.put(E) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.LinkedBlockingDeque#put(Object) public void
     * java.util.concurrent.LinkedBlockingDeque.put(java.lang.Object) throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.LinkedBlockingDeque#put(Object) public void
     *      java.util.concurrent.LinkedBlockingDeque.put(java.lang.Object) throws java.lang.InterruptedException (the
     *      hereby targeted method-under-test)
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
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.Collection#removeAll(java.util.Collection) interface java.util.Collection}</li>
     * <li>{@linkplain java.util.AbstractQueue#removeAll(java.util.Collection) class java.util.AbstractQueue}</li>
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
     * <li>{@linkplain java.util.AbstractQueue#containsAll(java.util.Collection) class java.util.AbstractQueue}</li>
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
     * <li>{@linkplain java.util.Collection#isEmpty() interface java.util.Collection}</li>
     * <li>{@linkplain java.util.AbstractQueue#isEmpty() class java.util.AbstractQueue}</li>
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
    public default void test_isEmpty()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.Collection#addAll(java.util.Collection) interface java.util.Collection}</li>
     * <li>{@linkplain java.util.AbstractQueue#addAll(java.util.Collection) class java.util.AbstractQueue}</li>
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
    public default void test_addAll_Collection()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.Collection#hashCode() interface java.util.Collection}</li>
     * <li>{@linkplain java.util.AbstractQueue#hashCode() class java.util.AbstractQueue}</li>
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
     * <li>{@linkplain java.util.AbstractQueue#retainAll(java.util.Collection) class java.util.AbstractQueue}</li>
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
     * <li>{@linkplain java.util.AbstractQueue#equals(Object) class java.util.AbstractQueue}</li>
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
