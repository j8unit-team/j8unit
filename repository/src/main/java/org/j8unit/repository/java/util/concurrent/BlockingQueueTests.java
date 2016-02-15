package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.BlockingQueue interface
 * java.util.concurrent.BlockingQueue}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link BlockingQueueClassTests}.
 * </p>
 *
 * @see java.util.concurrent.BlockingQueue interface java.util.concurrent.BlockingQueue (the hereby targeted
 *      class-under-test class)
 * @see BlockingQueueClassTests BlockingQueueClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BlockingQueueTests<SUT extends java.util.concurrent.BlockingQueue<E>, E>
extends org.j8unit.repository.java.util.QueueTests<SUT, E> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.BlockingQueue#poll(long, java.util.concurrent.TimeUnit) public
     * abstract E java.util.concurrent.BlockingQueue.poll(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingQueue#poll(long, java.util.concurrent.TimeUnit) public
     * abstract java.lang.Object java.util.concurrent.BlockingQueue.poll(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingQueue#poll(long, java.util.concurrent.TimeUnit) public abstract
     *      java.lang.Object java.util.concurrent.BlockingQueue.poll(long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.BlockingQueue#remove(Object) public abstract boolean
     * java.util.concurrent.BlockingQueue.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingQueue#remove(Object) public abstract boolean
     * java.util.concurrent.BlockingQueue.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingQueue#remove(Object) public abstract boolean
     *      java.util.concurrent.BlockingQueue.remove(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingQueue#put(Object) public abstract void
     * java.util.concurrent.BlockingQueue.put(E) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingQueue#put(Object) public abstract void
     * java.util.concurrent.BlockingQueue.put(java.lang.Object) throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingQueue#put(Object) public abstract void
     *      java.util.concurrent.BlockingQueue.put(java.lang.Object) throws java.lang.InterruptedException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.BlockingQueue#drainTo(java.util.Collection) public abstract int
     * java.util.concurrent.BlockingQueue.drainTo(java.util.Collection<? super E>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingQueue#drainTo(java.util.Collection) public abstract int
     * java.util.concurrent.BlockingQueue.drainTo(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingQueue#drainTo(java.util.Collection) public abstract int
     *      java.util.concurrent.BlockingQueue.drainTo(java.util.Collection) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.BlockingQueue#drainTo(java.util.Collection, int) public abstract int
     * java.util.concurrent.BlockingQueue.drainTo(java.util.Collection<? super E>,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingQueue#drainTo(java.util.Collection, int) public abstract int
     * java.util.concurrent.BlockingQueue.drainTo(java.util.Collection,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingQueue#drainTo(java.util.Collection, int) public abstract int
     *      java.util.concurrent.BlockingQueue.drainTo(java.util.Collection,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.BlockingQueue#remainingCapacity() public abstract int
     * java.util.concurrent.BlockingQueue.remainingCapacity()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingQueue#remainingCapacity() public abstract int
     * java.util.concurrent.BlockingQueue.remainingCapacity()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingQueue#remainingCapacity() public abstract int
     *      java.util.concurrent.BlockingQueue.remainingCapacity() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.BlockingQueue#contains(Object) public abstract boolean
     * java.util.concurrent.BlockingQueue.contains(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingQueue#contains(Object) public abstract boolean
     * java.util.concurrent.BlockingQueue.contains(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingQueue#contains(Object) public abstract boolean
     *      java.util.concurrent.BlockingQueue.contains(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingQueue#add(Object) public abstract boolean
     * java.util.concurrent.BlockingQueue.add(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingQueue#add(Object) public abstract boolean
     * java.util.concurrent.BlockingQueue.add(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingQueue#add(Object) public abstract boolean
     *      java.util.concurrent.BlockingQueue.add(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingQueue#offer(Object) public abstract boolean
     * java.util.concurrent.BlockingQueue.offer(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingQueue#offer(Object) public abstract boolean
     * java.util.concurrent.BlockingQueue.offer(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingQueue#offer(Object) public abstract boolean
     *      java.util.concurrent.BlockingQueue.offer(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.BlockingQueue#offer(Object, long, java.util.concurrent.TimeUnit)
     * public abstract boolean java.util.concurrent.BlockingQueue.offer(E,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingQueue#offer(Object, long, java.util.concurrent.TimeUnit)
     * public abstract boolean
     * java.util.concurrent.BlockingQueue.offer(java.lang.Object,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingQueue#offer(Object, long, java.util.concurrent.TimeUnit) public abstract
     *      boolean java.util.concurrent.BlockingQueue.offer(java.lang.Object,long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link java.util.concurrent.BlockingQueue#take() public abstract E
     * java.util.concurrent.BlockingQueue.take() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.BlockingQueue#take() public abstract java.lang.Object
     * java.util.concurrent.BlockingQueue.take() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.BlockingQueue#take() public abstract java.lang.Object
     *      java.util.concurrent.BlockingQueue.take() throws java.lang.InterruptedException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_take()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
