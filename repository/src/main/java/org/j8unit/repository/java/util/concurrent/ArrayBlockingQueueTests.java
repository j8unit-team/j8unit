package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ArrayBlockingQueue class
 * java.util.concurrent.ArrayBlockingQueue}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ArrayBlockingQueueClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ArrayBlockingQueue class java.util.concurrent.ArrayBlockingQueue (the hereby targeted
 *      class-under-test class)
 * @see ArrayBlockingQueueClassTests ArrayBlockingQueueClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ArrayBlockingQueueTests<SUT extends java.util.concurrent.ArrayBlockingQueue<E>, E>
extends BlockingQueueTests<SUT, E>, org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.util.AbstractQueueTests<SUT, E> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#take() public E
     * java.util.concurrent.ArrayBlockingQueue.take() throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#take() public java.lang.Object
     * java.util.concurrent.ArrayBlockingQueue.take() throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#take() public java.lang.Object
     *      java.util.concurrent.ArrayBlockingQueue.take() throws java.lang.InterruptedException (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#offer(Object, long, java.util.concurrent.TimeUnit)
     * public boolean java.util.concurrent.ArrayBlockingQueue.offer(E,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#offer(Object, long, java.util.concurrent.TimeUnit)
     * public boolean java.util.concurrent.ArrayBlockingQueue.offer(java.lang.Object,long,java.util.concurrent.TimeUnit)
     * throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#offer(Object, long, java.util.concurrent.TimeUnit) public boolean
     *      java.util.concurrent.ArrayBlockingQueue.offer(java.lang.Object,long,java.util.concurrent.TimeUnit) throws
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#offer(Object) public boolean
     * java.util.concurrent.ArrayBlockingQueue.offer(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#offer(Object) public boolean
     * java.util.concurrent.ArrayBlockingQueue.offer(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#offer(Object) public boolean
     *      java.util.concurrent.ArrayBlockingQueue.offer(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#contains(Object) public boolean
     * java.util.concurrent.ArrayBlockingQueue.contains(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#contains(Object) public boolean
     * java.util.concurrent.ArrayBlockingQueue.contains(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#contains(Object) public boolean
     *      java.util.concurrent.ArrayBlockingQueue.contains(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#iterator() public java.util.Iterator
     * <E> java.util.concurrent.ArrayBlockingQueue.iterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#iterator() public java.util.Iterator
     * java.util.concurrent.ArrayBlockingQueue.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#iterator() public java.util.Iterator
     *      java.util.concurrent.ArrayBlockingQueue.iterator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#size() public int
     * java.util.concurrent.ArrayBlockingQueue.size()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#size() public int
     * java.util.concurrent.ArrayBlockingQueue.size()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#size() public int java.util.concurrent.ArrayBlockingQueue.size()
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#toArray() public java.lang.Object[]
     * java.util.concurrent.ArrayBlockingQueue.toArray()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#toArray() public java.lang.Object[]
     * java.util.concurrent.ArrayBlockingQueue.toArray()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#toArray() public java.lang.Object[]
     *      java.util.concurrent.ArrayBlockingQueue.toArray() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#toArray(Object[]) public <T> T[]
     * java.util.concurrent.ArrayBlockingQueue.toArray(T[])}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#toArray(Object[]) public java.lang.Object[]
     * java.util.concurrent.ArrayBlockingQueue.toArray(java.lang.Object[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#toArray(Object[]) public java.lang.Object[]
     *      java.util.concurrent.ArrayBlockingQueue.toArray(java.lang.Object[]) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#toString() public java.lang.String
     * java.util.concurrent.ArrayBlockingQueue.toString()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#toString() public java.lang.String
     * java.util.concurrent.ArrayBlockingQueue.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#toString() public java.lang.String
     *      java.util.concurrent.ArrayBlockingQueue.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#remainingCapacity() public int
     * java.util.concurrent.ArrayBlockingQueue.remainingCapacity()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#remainingCapacity() public int
     * java.util.concurrent.ArrayBlockingQueue.remainingCapacity()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#remainingCapacity() public int
     *      java.util.concurrent.ArrayBlockingQueue.remainingCapacity() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#add(Object) public boolean
     * java.util.concurrent.ArrayBlockingQueue.add(E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#add(Object) public boolean
     * java.util.concurrent.ArrayBlockingQueue.add(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#add(Object) public boolean
     *      java.util.concurrent.ArrayBlockingQueue.add(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#spliterator() public java.util.Spliterator
     * <E> java.util.concurrent.ArrayBlockingQueue.spliterator()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#spliterator() public java.util.Spliterator
     * java.util.concurrent.ArrayBlockingQueue.spliterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#spliterator() public java.util.Spliterator
     *      java.util.concurrent.ArrayBlockingQueue.spliterator() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#clear() public void
     * java.util.concurrent.ArrayBlockingQueue.clear()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#clear() public void
     * java.util.concurrent.ArrayBlockingQueue.clear()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#clear() public void java.util.concurrent.ArrayBlockingQueue.clear()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#poll() public E
     * java.util.concurrent.ArrayBlockingQueue.poll()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#poll() public java.lang.Object
     * java.util.concurrent.ArrayBlockingQueue.poll()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#poll() public java.lang.Object
     *      java.util.concurrent.ArrayBlockingQueue.poll() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#poll(long, java.util.concurrent.TimeUnit) public E
     * java.util.concurrent.ArrayBlockingQueue.poll(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#poll(long, java.util.concurrent.TimeUnit) public
     * java.lang.Object java.util.concurrent.ArrayBlockingQueue.poll(long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#poll(long, java.util.concurrent.TimeUnit) public java.lang.Object
     *      java.util.concurrent.ArrayBlockingQueue.poll(long,java.util.concurrent.TimeUnit) throws
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#drainTo(java.util.Collection) public int
     * java.util.concurrent.ArrayBlockingQueue.drainTo(java.util.Collection<? super E>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#drainTo(java.util.Collection) public int
     * java.util.concurrent.ArrayBlockingQueue.drainTo(java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#drainTo(java.util.Collection) public int
     *      java.util.concurrent.ArrayBlockingQueue.drainTo(java.util.Collection) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#drainTo(java.util.Collection, int) public int
     * java.util.concurrent.ArrayBlockingQueue.drainTo(java.util.Collection<? super E>,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#drainTo(java.util.Collection, int) public int
     * java.util.concurrent.ArrayBlockingQueue.drainTo(java.util.Collection,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#drainTo(java.util.Collection, int) public int
     *      java.util.concurrent.ArrayBlockingQueue.drainTo(java.util.Collection,int) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#peek() public E
     * java.util.concurrent.ArrayBlockingQueue.peek()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#peek() public java.lang.Object
     * java.util.concurrent.ArrayBlockingQueue.peek()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#peek() public java.lang.Object
     *      java.util.concurrent.ArrayBlockingQueue.peek() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#remove(Object) public boolean
     * java.util.concurrent.ArrayBlockingQueue.remove(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#remove(Object) public boolean
     * java.util.concurrent.ArrayBlockingQueue.remove(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#remove(Object) public boolean
     *      java.util.concurrent.ArrayBlockingQueue.remove(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#put(Object) public void
     * java.util.concurrent.ArrayBlockingQueue.put(E) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.ArrayBlockingQueue#put(Object) public void
     * java.util.concurrent.ArrayBlockingQueue.put(java.lang.Object) throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.ArrayBlockingQueue#put(Object) public void
     *      java.util.concurrent.ArrayBlockingQueue.put(java.lang.Object) throws java.lang.InterruptedException (the
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
     * <li>{@linkplain java.util.AbstractQueue#element() class java.util.AbstractQueue}</li>
     * <li>{@linkplain java.util.Queue#element() interface java.util.Queue}</li>
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
    public default void test_element()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain java.util.AbstractQueue#remove() class java.util.AbstractQueue}</li>
     * <li>{@linkplain java.util.Queue#remove() interface java.util.Queue}</li>
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
    public default void test_remove()
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
