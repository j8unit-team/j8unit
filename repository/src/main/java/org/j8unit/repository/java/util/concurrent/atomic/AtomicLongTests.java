package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.atomic.AtomicLong class
 * java.util.concurrent.atomic.AtomicLong}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AtomicLongClassTests}.
 * </p>
 *
 * @see java.util.concurrent.atomic.AtomicLong class java.util.concurrent.atomic.AtomicLong (the hereby targeted
 *      class-under-test class)
 * @see AtomicLongClassTests AtomicLongClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AtomicLongTests<SUT extends java.util.concurrent.atomic.AtomicLong>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.NumberTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#compareAndSet(long, long) public final boolean
     * java.util.concurrent.atomic.AtomicLong.compareAndSet(long,long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#compareAndSet(long, long) public final boolean
     * java.util.concurrent.atomic.AtomicLong.compareAndSet(long,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#compareAndSet(long, long) public final boolean
     *      java.util.concurrent.atomic.AtomicLong.compareAndSet(long,long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareAndSet_long_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#get() public final long
     * java.util.concurrent.atomic.AtomicLong.get()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#get() public final long
     * java.util.concurrent.atomic.AtomicLong.get()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#get() public final long java.util.concurrent.atomic.AtomicLong.get()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#getAndAdd(long) public final long
     * java.util.concurrent.atomic.AtomicLong.getAndAdd(long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#getAndAdd(long) public final long
     * java.util.concurrent.atomic.AtomicLong.getAndAdd(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#getAndAdd(long) public final long
     *      java.util.concurrent.atomic.AtomicLong.getAndAdd(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndAdd_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#lazySet(long) public final void
     * java.util.concurrent.atomic.AtomicLong.lazySet(long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#lazySet(long) public final void
     * java.util.concurrent.atomic.AtomicLong.lazySet(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#lazySet(long) public final void
     *      java.util.concurrent.atomic.AtomicLong.lazySet(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lazySet_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#getAndSet(long) public final long
     * java.util.concurrent.atomic.AtomicLong.getAndSet(long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#getAndSet(long) public final long
     * java.util.concurrent.atomic.AtomicLong.getAndSet(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#getAndSet(long) public final long
     *      java.util.concurrent.atomic.AtomicLong.getAndSet(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndSet_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#getAndUpdate(java.util.function.LongUnaryOperator)
     * public final long java.util.concurrent.atomic.AtomicLong.getAndUpdate(java.util.function.LongUnaryOperator)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#getAndUpdate(java.util.function.LongUnaryOperator)
     * public final long java.util.concurrent.atomic.AtomicLong.getAndUpdate(java.util.function.LongUnaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#getAndUpdate(java.util.function.LongUnaryOperator) public final long
     *      java.util.concurrent.atomic.AtomicLong.getAndUpdate(java.util.function.LongUnaryOperator) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndUpdate_LongUnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#toString() public java.lang.String
     * java.util.concurrent.atomic.AtomicLong.toString()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#toString() public java.lang.String
     * java.util.concurrent.atomic.AtomicLong.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#toString() public java.lang.String
     *      java.util.concurrent.atomic.AtomicLong.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#addAndGet(long) public final long
     * java.util.concurrent.atomic.AtomicLong.addAndGet(long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#addAndGet(long) public final long
     * java.util.concurrent.atomic.AtomicLong.addAndGet(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#addAndGet(long) public final long
     *      java.util.concurrent.atomic.AtomicLong.addAndGet(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addAndGet_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#getAndDecrement() public final long
     * java.util.concurrent.atomic.AtomicLong.getAndDecrement()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#getAndDecrement() public final long
     * java.util.concurrent.atomic.AtomicLong.getAndDecrement()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#getAndDecrement() public final long
     *      java.util.concurrent.atomic.AtomicLong.getAndDecrement() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndDecrement()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicLong#accumulateAndGet(long, java.util.function.LongBinaryOperator)
     * public final long
     * java.util.concurrent.atomic.AtomicLong.accumulateAndGet(long,java.util.function.LongBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicLong#accumulateAndGet(long, java.util.function.LongBinaryOperator)
     * public final long
     * java.util.concurrent.atomic.AtomicLong.accumulateAndGet(long,java.util.function.LongBinaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#accumulateAndGet(long, java.util.function.LongBinaryOperator) public
     *      final long
     *      java.util.concurrent.atomic.AtomicLong.accumulateAndGet(long,java.util.function.LongBinaryOperator) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accumulateAndGet_long_LongBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicLong#getAndAccumulate(long, java.util.function.LongBinaryOperator)
     * public final long
     * java.util.concurrent.atomic.AtomicLong.getAndAccumulate(long,java.util.function.LongBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicLong#getAndAccumulate(long, java.util.function.LongBinaryOperator)
     * public final long
     * java.util.concurrent.atomic.AtomicLong.getAndAccumulate(long,java.util.function.LongBinaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#getAndAccumulate(long, java.util.function.LongBinaryOperator) public
     *      final long
     *      java.util.concurrent.atomic.AtomicLong.getAndAccumulate(long,java.util.function.LongBinaryOperator) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndAccumulate_long_LongBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#getAndIncrement() public final long
     * java.util.concurrent.atomic.AtomicLong.getAndIncrement()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#getAndIncrement() public final long
     * java.util.concurrent.atomic.AtomicLong.getAndIncrement()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#getAndIncrement() public final long
     *      java.util.concurrent.atomic.AtomicLong.getAndIncrement() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndIncrement()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#set(long) public final void
     * java.util.concurrent.atomic.AtomicLong.set(long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#set(long) public final void
     * java.util.concurrent.atomic.AtomicLong.set(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#set(long) public final void
     *      java.util.concurrent.atomic.AtomicLong.set(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#incrementAndGet() public final long
     * java.util.concurrent.atomic.AtomicLong.incrementAndGet()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#incrementAndGet() public final long
     * java.util.concurrent.atomic.AtomicLong.incrementAndGet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#incrementAndGet() public final long
     *      java.util.concurrent.atomic.AtomicLong.incrementAndGet() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_incrementAndGet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#weakCompareAndSet(long, long) public final boolean
     * java.util.concurrent.atomic.AtomicLong.weakCompareAndSet(long,long)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#weakCompareAndSet(long, long) public final boolean
     * java.util.concurrent.atomic.AtomicLong.weakCompareAndSet(long,long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#weakCompareAndSet(long, long) public final boolean
     *      java.util.concurrent.atomic.AtomicLong.weakCompareAndSet(long,long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_weakCompareAndSet_long_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#intValue() public int
     * java.util.concurrent.atomic.AtomicLong.intValue()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#intValue() public int
     * java.util.concurrent.atomic.AtomicLong.intValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#intValue() public int
     *      java.util.concurrent.atomic.AtomicLong.intValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_intValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#floatValue() public float
     * java.util.concurrent.atomic.AtomicLong.floatValue()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#floatValue() public float
     * java.util.concurrent.atomic.AtomicLong.floatValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#floatValue() public float
     *      java.util.concurrent.atomic.AtomicLong.floatValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_floatValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#doubleValue() public double
     * java.util.concurrent.atomic.AtomicLong.doubleValue()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#doubleValue() public double
     * java.util.concurrent.atomic.AtomicLong.doubleValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#doubleValue() public double
     *      java.util.concurrent.atomic.AtomicLong.doubleValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_doubleValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#updateAndGet(java.util.function.LongUnaryOperator)
     * public final long java.util.concurrent.atomic.AtomicLong.updateAndGet(java.util.function.LongUnaryOperator)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#updateAndGet(java.util.function.LongUnaryOperator)
     * public final long java.util.concurrent.atomic.AtomicLong.updateAndGet(java.util.function.LongUnaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#updateAndGet(java.util.function.LongUnaryOperator) public final long
     *      java.util.concurrent.atomic.AtomicLong.updateAndGet(java.util.function.LongUnaryOperator) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_updateAndGet_LongUnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#decrementAndGet() public final long
     * java.util.concurrent.atomic.AtomicLong.decrementAndGet()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#decrementAndGet() public final long
     * java.util.concurrent.atomic.AtomicLong.decrementAndGet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#decrementAndGet() public final long
     *      java.util.concurrent.atomic.AtomicLong.decrementAndGet() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_decrementAndGet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#longValue() public long
     * java.util.concurrent.atomic.AtomicLong.longValue()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicLong#longValue() public long
     * java.util.concurrent.atomic.AtomicLong.longValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicLong#longValue() public long
     *      java.util.concurrent.atomic.AtomicLong.longValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_longValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
