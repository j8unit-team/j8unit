package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.atomic.AtomicInteger class
 * java.util.concurrent.atomic.AtomicInteger}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AtomicIntegerClassTests}.
 * </p>
 *
 * @see java.util.concurrent.atomic.AtomicInteger class java.util.concurrent.atomic.AtomicInteger (the hereby targeted
 *      class-under-test class)
 * @see AtomicIntegerClassTests AtomicIntegerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AtomicIntegerTests<SUT extends java.util.concurrent.atomic.AtomicInteger>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.NumberTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#compareAndSet(int, int) public final boolean
     * java.util.concurrent.atomic.AtomicInteger.compareAndSet(int,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#compareAndSet(int, int) public final boolean
     * java.util.concurrent.atomic.AtomicInteger.compareAndSet(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#compareAndSet(int, int) public final boolean
     *      java.util.concurrent.atomic.AtomicInteger.compareAndSet(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareAndSet_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#get() public final int
     * java.util.concurrent.atomic.AtomicInteger.get()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#get() public final int
     * java.util.concurrent.atomic.AtomicInteger.get()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#get() public final int
     *      java.util.concurrent.atomic.AtomicInteger.get() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#getAndDecrement() public final int
     * java.util.concurrent.atomic.AtomicInteger.getAndDecrement()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#getAndDecrement() public final int
     * java.util.concurrent.atomic.AtomicInteger.getAndDecrement()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#getAndDecrement() public final int
     *      java.util.concurrent.atomic.AtomicInteger.getAndDecrement() (the hereby targeted method-under-test)
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
     * {@link java.util.concurrent.atomic.AtomicInteger#accumulateAndGet(int, java.util.function.IntBinaryOperator)
     * public final int
     * java.util.concurrent.atomic.AtomicInteger.accumulateAndGet(int,java.util.function.IntBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicInteger#accumulateAndGet(int, java.util.function.IntBinaryOperator)
     * public final int
     * java.util.concurrent.atomic.AtomicInteger.accumulateAndGet(int,java.util.function.IntBinaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#accumulateAndGet(int, java.util.function.IntBinaryOperator) public
     *      final int
     *      java.util.concurrent.atomic.AtomicInteger.accumulateAndGet(int,java.util.function.IntBinaryOperator) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accumulateAndGet_int_IntBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicInteger#getAndAccumulate(int, java.util.function.IntBinaryOperator)
     * public final int
     * java.util.concurrent.atomic.AtomicInteger.getAndAccumulate(int,java.util.function.IntBinaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicInteger#getAndAccumulate(int, java.util.function.IntBinaryOperator)
     * public final int
     * java.util.concurrent.atomic.AtomicInteger.getAndAccumulate(int,java.util.function.IntBinaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#getAndAccumulate(int, java.util.function.IntBinaryOperator) public
     *      final int
     *      java.util.concurrent.atomic.AtomicInteger.getAndAccumulate(int,java.util.function.IntBinaryOperator) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndAccumulate_int_IntBinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#getAndAdd(int) public final int
     * java.util.concurrent.atomic.AtomicInteger.getAndAdd(int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#getAndAdd(int) public final int
     * java.util.concurrent.atomic.AtomicInteger.getAndAdd(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#getAndAdd(int) public final int
     *      java.util.concurrent.atomic.AtomicInteger.getAndAdd(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndAdd_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#lazySet(int) public final void
     * java.util.concurrent.atomic.AtomicInteger.lazySet(int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#lazySet(int) public final void
     * java.util.concurrent.atomic.AtomicInteger.lazySet(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#lazySet(int) public final void
     *      java.util.concurrent.atomic.AtomicInteger.lazySet(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lazySet_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#getAndSet(int) public final int
     * java.util.concurrent.atomic.AtomicInteger.getAndSet(int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#getAndSet(int) public final int
     * java.util.concurrent.atomic.AtomicInteger.getAndSet(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#getAndSet(int) public final int
     *      java.util.concurrent.atomic.AtomicInteger.getAndSet(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndSet_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicInteger#getAndUpdate(java.util.function.IntUnaryOperator) public final
     * int java.util.concurrent.atomic.AtomicInteger.getAndUpdate(java.util.function.IntUnaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicInteger#getAndUpdate(java.util.function.IntUnaryOperator) public final
     * int java.util.concurrent.atomic.AtomicInteger.getAndUpdate(java.util.function.IntUnaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#getAndUpdate(java.util.function.IntUnaryOperator) public final int
     *      java.util.concurrent.atomic.AtomicInteger.getAndUpdate(java.util.function.IntUnaryOperator) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndUpdate_IntUnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#toString() public java.lang.String
     * java.util.concurrent.atomic.AtomicInteger.toString()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#toString() public java.lang.String
     * java.util.concurrent.atomic.AtomicInteger.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#toString() public java.lang.String
     *      java.util.concurrent.atomic.AtomicInteger.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#addAndGet(int) public final int
     * java.util.concurrent.atomic.AtomicInteger.addAndGet(int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#addAndGet(int) public final int
     * java.util.concurrent.atomic.AtomicInteger.addAndGet(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#addAndGet(int) public final int
     *      java.util.concurrent.atomic.AtomicInteger.addAndGet(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addAndGet_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#weakCompareAndSet(int, int) public final boolean
     * java.util.concurrent.atomic.AtomicInteger.weakCompareAndSet(int,int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#weakCompareAndSet(int, int) public final boolean
     * java.util.concurrent.atomic.AtomicInteger.weakCompareAndSet(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#weakCompareAndSet(int, int) public final boolean
     *      java.util.concurrent.atomic.AtomicInteger.weakCompareAndSet(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_weakCompareAndSet_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#intValue() public int
     * java.util.concurrent.atomic.AtomicInteger.intValue()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#intValue() public int
     * java.util.concurrent.atomic.AtomicInteger.intValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#intValue() public int
     *      java.util.concurrent.atomic.AtomicInteger.intValue() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#getAndIncrement() public final int
     * java.util.concurrent.atomic.AtomicInteger.getAndIncrement()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#getAndIncrement() public final int
     * java.util.concurrent.atomic.AtomicInteger.getAndIncrement()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#getAndIncrement() public final int
     *      java.util.concurrent.atomic.AtomicInteger.getAndIncrement() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#set(int) public final void
     * java.util.concurrent.atomic.AtomicInteger.set(int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#set(int) public final void
     * java.util.concurrent.atomic.AtomicInteger.set(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#set(int) public final void
     *      java.util.concurrent.atomic.AtomicInteger.set(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#incrementAndGet() public final int
     * java.util.concurrent.atomic.AtomicInteger.incrementAndGet()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#incrementAndGet() public final int
     * java.util.concurrent.atomic.AtomicInteger.incrementAndGet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#incrementAndGet() public final int
     *      java.util.concurrent.atomic.AtomicInteger.incrementAndGet() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#longValue() public long
     * java.util.concurrent.atomic.AtomicInteger.longValue()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#longValue() public long
     * java.util.concurrent.atomic.AtomicInteger.longValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#longValue() public long
     *      java.util.concurrent.atomic.AtomicInteger.longValue() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#floatValue() public float
     * java.util.concurrent.atomic.AtomicInteger.floatValue()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#floatValue() public float
     * java.util.concurrent.atomic.AtomicInteger.floatValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#floatValue() public float
     *      java.util.concurrent.atomic.AtomicInteger.floatValue() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#doubleValue() public double
     * java.util.concurrent.atomic.AtomicInteger.doubleValue()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#doubleValue() public double
     * java.util.concurrent.atomic.AtomicInteger.doubleValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#doubleValue() public double
     *      java.util.concurrent.atomic.AtomicInteger.doubleValue() (the hereby targeted method-under-test)
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
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicInteger#updateAndGet(java.util.function.IntUnaryOperator) public final
     * int java.util.concurrent.atomic.AtomicInteger.updateAndGet(java.util.function.IntUnaryOperator)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicInteger#updateAndGet(java.util.function.IntUnaryOperator) public final
     * int java.util.concurrent.atomic.AtomicInteger.updateAndGet(java.util.function.IntUnaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#updateAndGet(java.util.function.IntUnaryOperator) public final int
     *      java.util.concurrent.atomic.AtomicInteger.updateAndGet(java.util.function.IntUnaryOperator) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_updateAndGet_IntUnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#decrementAndGet() public final int
     * java.util.concurrent.atomic.AtomicInteger.decrementAndGet()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicInteger#decrementAndGet() public final int
     * java.util.concurrent.atomic.AtomicInteger.decrementAndGet()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicInteger#decrementAndGet() public final int
     *      java.util.concurrent.atomic.AtomicInteger.decrementAndGet() (the hereby targeted method-under-test)
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

}
