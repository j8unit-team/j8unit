package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.atomic.AtomicLongFieldUpdater class
 * java.util.concurrent.atomic.AtomicLongFieldUpdater}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link AtomicLongFieldUpdaterClassTests}.
 * </p>
 *
 * @see java.util.concurrent.atomic.AtomicLongFieldUpdater class java.util.concurrent.atomic.AtomicLongFieldUpdater (the
 *      hereby targeted class-under-test class)
 * @see AtomicLongFieldUpdaterClassTests AtomicLongFieldUpdaterClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AtomicLongFieldUpdaterTests<SUT extends java.util.concurrent.atomic.AtomicLongFieldUpdater<T>, T>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#updateAndGet(Object, java.util.function.LongUnaryOperator)
     * public final long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.updateAndGet(T,java.util.function.LongUnaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#updateAndGet(Object, java.util.function.LongUnaryOperator)
     * public final long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.updateAndGet(java.lang.Object,java.util.function.LongUnaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#updateAndGet(Object,
     *      java.util.function.LongUnaryOperator) public final long
     *      java.util.concurrent.atomic.AtomicLongFieldUpdater.updateAndGet(java.lang.Object,java.util.function.
     *      LongUnaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_updateAndGet_Object_LongUnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#decrementAndGet(Object) public long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.decrementAndGet(T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#decrementAndGet(Object) public long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.decrementAndGet(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#decrementAndGet(Object) public long
     *      java.util.concurrent.atomic.AtomicLongFieldUpdater.decrementAndGet(java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#set(Object, long) public abstract void
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.set(T,long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#set(Object, long) public abstract void
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.set(java.lang.Object,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#set(Object, long) public abstract void
     *      java.util.concurrent.atomic.AtomicLongFieldUpdater.set(java.lang.Object,long) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_Object_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#incrementAndGet(Object) public long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.incrementAndGet(T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#incrementAndGet(Object) public long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.incrementAndGet(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#incrementAndGet(Object) public long
     *      java.util.concurrent.atomic.AtomicLongFieldUpdater.incrementAndGet(java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndIncrement(Object) public long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndIncrement(T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndIncrement(Object) public long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndIncrement(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndIncrement(Object) public long
     *      java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndIncrement(java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#weakCompareAndSet(Object, long, long)
     * public abstract boolean java.util.concurrent.atomic.AtomicLongFieldUpdater.weakCompareAndSet(T,long,long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#weakCompareAndSet(Object, long, long)
     * public abstract boolean
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.weakCompareAndSet(java.lang.Object,long,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#weakCompareAndSet(Object, long, long) public abstract
     *      boolean java.util.concurrent.atomic.AtomicLongFieldUpdater.weakCompareAndSet(java.lang.Object,long,long)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_weakCompareAndSet_Object_long_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#addAndGet(Object, long) public long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.addAndGet(T,long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#addAndGet(Object, long) public long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.addAndGet(java.lang.Object,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#addAndGet(Object, long) public long
     *      java.util.concurrent.atomic.AtomicLongFieldUpdater.addAndGet(java.lang.Object,long) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addAndGet_Object_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndSet(Object, long) public long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndSet(T,long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndSet(Object, long) public long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndSet(java.lang.Object,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndSet(Object, long) public long
     *      java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndSet(java.lang.Object,long) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndSet_Object_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndUpdate(Object, java.util.function.LongUnaryOperator)
     * public final long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndUpdate(T,java.util.function.LongUnaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndUpdate(Object, java.util.function.LongUnaryOperator)
     * public final long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndUpdate(java.lang.Object,java.util.function.LongUnaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndUpdate(Object,
     *      java.util.function.LongUnaryOperator) public final long
     *      java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndUpdate(java.lang.Object,java.util.function.
     *      LongUnaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndUpdate_Object_LongUnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#lazySet(Object, long) public abstract
     * void java.util.concurrent.atomic.AtomicLongFieldUpdater.lazySet(T,long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#lazySet(Object, long) public abstract
     * void java.util.concurrent.atomic.AtomicLongFieldUpdater.lazySet(java.lang.Object,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#lazySet(Object, long) public abstract void
     *      java.util.concurrent.atomic.AtomicLongFieldUpdater.lazySet(java.lang.Object,long) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lazySet_Object_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndAdd(Object, long) public long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndAdd(T,long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndAdd(Object, long) public long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndAdd(java.lang.Object,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndAdd(Object, long) public long
     *      java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndAdd(java.lang.Object,long) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndAdd_Object_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndAccumulate(Object, long, java.util.function.LongBinaryOperator)
     * public final long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndAccumulate(T,long,java.util.function.LongBinaryOperator)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndAccumulate(Object, long, java.util.function.LongBinaryOperator)
     * public final long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndAccumulate(java.lang.Object,long,java.util.function.LongBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndAccumulate(Object, long,
     *      java.util.function.LongBinaryOperator) public final long
     *      java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndAccumulate(java.lang.Object,long,java.util.function
     *      .LongBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndAccumulate_Object_long_LongBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#accumulateAndGet(Object, long, java.util.function.LongBinaryOperator)
     * public final long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.accumulateAndGet(T,long,java.util.function.LongBinaryOperator)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#accumulateAndGet(Object, long, java.util.function.LongBinaryOperator)
     * public final long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.accumulateAndGet(java.lang.Object,long,java.util.function.LongBinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#accumulateAndGet(Object, long,
     *      java.util.function.LongBinaryOperator) public final long
     *      java.util.concurrent.atomic.AtomicLongFieldUpdater.accumulateAndGet(java.lang.Object,long,java.util.function
     *      .LongBinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accumulateAndGet_Object_long_LongBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndDecrement(Object) public long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndDecrement(T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndDecrement(Object) public long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndDecrement(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#getAndDecrement(Object) public long
     *      java.util.concurrent.atomic.AtomicLongFieldUpdater.getAndDecrement(java.lang.Object) (the hereby targeted
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

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#get(Object) public abstract long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.get(T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#get(Object) public abstract long
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.get(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#get(Object) public abstract long
     *      java.util.concurrent.atomic.AtomicLongFieldUpdater.get(java.lang.Object) (the hereby targeted
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
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#compareAndSet(Object, long, long)
     * public abstract boolean java.util.concurrent.atomic.AtomicLongFieldUpdater.compareAndSet(T,long,long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLongFieldUpdater#compareAndSet(Object, long, long)
     * public abstract boolean
     * java.util.concurrent.atomic.AtomicLongFieldUpdater.compareAndSet(java.lang.Object,long,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLongFieldUpdater#compareAndSet(Object, long, long) public abstract boolean
     *      java.util.concurrent.atomic.AtomicLongFieldUpdater.compareAndSet(java.lang.Object,long,long) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareAndSet_Object_long_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
