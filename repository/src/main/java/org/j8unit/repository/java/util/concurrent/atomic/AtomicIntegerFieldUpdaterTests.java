package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.atomic.AtomicIntegerFieldUpdater class
 * java.util.concurrent.atomic.AtomicIntegerFieldUpdater}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link AtomicIntegerFieldUpdaterClassTests}.
 * </p>
 *
 * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater class
 *      java.util.concurrent.atomic.AtomicIntegerFieldUpdater (the hereby targeted class-under-test class)
 * @see AtomicIntegerFieldUpdaterClassTests AtomicIntegerFieldUpdaterClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AtomicIntegerFieldUpdaterTests<SUT extends java.util.concurrent.atomic.AtomicIntegerFieldUpdater<T>, T>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#set(Object, int) public abstract
     * void java.util.concurrent.atomic.AtomicIntegerFieldUpdater.set(T,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#set(Object, int) public abstract
     * void java.util.concurrent.atomic.AtomicIntegerFieldUpdater.set(java.lang.Object,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#set(Object, int) public abstract void
     *      java.util.concurrent.atomic.AtomicIntegerFieldUpdater.set(java.lang.Object,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_Object_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#incrementAndGet(Object) public int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.incrementAndGet(T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#incrementAndGet(Object) public int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.incrementAndGet(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#incrementAndGet(Object) public int
     *      java.util.concurrent.atomic.AtomicIntegerFieldUpdater.incrementAndGet(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_incrementAndGet_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndIncrement(Object) public int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndIncrement(T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndIncrement(Object) public int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndIncrement(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndIncrement(Object) public int
     *      java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndIncrement(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndIncrement_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#weakCompareAndSet(Object, int, int)
     * public abstract boolean java.util.concurrent.atomic.AtomicIntegerFieldUpdater.weakCompareAndSet(T,int,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#weakCompareAndSet(Object, int, int)
     * public abstract boolean
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.weakCompareAndSet(java.lang.Object,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#weakCompareAndSet(Object, int, int) public abstract
     *      boolean java.util.concurrent.atomic.AtomicIntegerFieldUpdater.weakCompareAndSet(java.lang.Object,int,int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_weakCompareAndSet_Object_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#updateAndGet(Object, java.util.function.IntUnaryOperator)
     * public final int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.updateAndGet(T,java.util.function.IntUnaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#updateAndGet(Object, java.util.function.IntUnaryOperator)
     * public final int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.updateAndGet(java.lang.Object,java.util.function.IntUnaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#updateAndGet(Object,
     *      java.util.function.IntUnaryOperator) public final int
     *      java.util.concurrent.atomic.AtomicIntegerFieldUpdater.updateAndGet(java.lang.Object,java.util.function.
     *      IntUnaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_updateAndGet_Object_IntUnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#decrementAndGet(Object) public int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.decrementAndGet(T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#decrementAndGet(Object) public int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.decrementAndGet(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#decrementAndGet(Object) public int
     *      java.util.concurrent.atomic.AtomicIntegerFieldUpdater.decrementAndGet(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_decrementAndGet_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#get(Object) public abstract int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.get(T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#get(Object) public abstract int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.get(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#get(Object) public abstract int
     *      java.util.concurrent.atomic.AtomicIntegerFieldUpdater.get(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#compareAndSet(Object, int, int)
     * public abstract boolean java.util.concurrent.atomic.AtomicIntegerFieldUpdater.compareAndSet(T,int,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#compareAndSet(Object, int, int)
     * public abstract boolean
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.compareAndSet(java.lang.Object,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#compareAndSet(Object, int, int) public abstract
     *      boolean java.util.concurrent.atomic.AtomicIntegerFieldUpdater.compareAndSet(java.lang.Object,int,int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareAndSet_Object_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#addAndGet(Object, int) public int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.addAndGet(T,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#addAndGet(Object, int) public int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.addAndGet(java.lang.Object,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#addAndGet(Object, int) public int
     *      java.util.concurrent.atomic.AtomicIntegerFieldUpdater.addAndGet(java.lang.Object,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addAndGet_Object_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndSet(Object, int) public int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndSet(T,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndSet(Object, int) public int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndSet(java.lang.Object,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndSet(Object, int) public int
     *      java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndSet(java.lang.Object,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndSet_Object_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndUpdate(Object, java.util.function.IntUnaryOperator)
     * public final int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndUpdate(T,java.util.function.IntUnaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndUpdate(Object, java.util.function.IntUnaryOperator)
     * public final int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndUpdate(java.lang.Object,java.util.function.IntUnaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndUpdate(Object,
     *      java.util.function.IntUnaryOperator) public final int
     *      java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndUpdate(java.lang.Object,java.util.function.
     *      IntUnaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndUpdate_Object_IntUnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#lazySet(Object, int) public abstract
     * void java.util.concurrent.atomic.AtomicIntegerFieldUpdater.lazySet(T,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#lazySet(Object, int) public abstract
     * void java.util.concurrent.atomic.AtomicIntegerFieldUpdater.lazySet(java.lang.Object,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#lazySet(Object, int) public abstract void
     *      java.util.concurrent.atomic.AtomicIntegerFieldUpdater.lazySet(java.lang.Object,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lazySet_Object_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndAdd(Object, int) public int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndAdd(T,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndAdd(Object, int) public int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndAdd(java.lang.Object,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndAdd(Object, int) public int
     *      java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndAdd(java.lang.Object,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndAdd_Object_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndAccumulate(Object, int, java.util.function.IntBinaryOperator)
     * public final int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndAccumulate(T,int,java.util.function.IntBinaryOperator)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndAccumulate(Object, int, java.util.function.IntBinaryOperator)
     * public final int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndAccumulate(java.lang.Object,int,java.util.function.IntBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndAccumulate(Object, int,
     *      java.util.function.IntBinaryOperator) public final int
     *      java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndAccumulate(java.lang.Object,int,java.util.
     *      function.IntBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndAccumulate_Object_int_IntBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#accumulateAndGet(Object, int, java.util.function.IntBinaryOperator)
     * public final int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.accumulateAndGet(T,int,java.util.function.IntBinaryOperator)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#accumulateAndGet(Object, int, java.util.function.IntBinaryOperator)
     * public final int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.accumulateAndGet(java.lang.Object,int,java.util.function.IntBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#accumulateAndGet(Object, int,
     *      java.util.function.IntBinaryOperator) public final int
     *      java.util.concurrent.atomic.AtomicIntegerFieldUpdater.accumulateAndGet(java.lang.Object,int,java.util.
     *      function.IntBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accumulateAndGet_Object_int_IntBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndDecrement(Object) public int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndDecrement(T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndDecrement(Object) public int
     * java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndDecrement(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicIntegerFieldUpdater#getAndDecrement(Object) public int
     *      java.util.concurrent.atomic.AtomicIntegerFieldUpdater.getAndDecrement(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndDecrement_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
