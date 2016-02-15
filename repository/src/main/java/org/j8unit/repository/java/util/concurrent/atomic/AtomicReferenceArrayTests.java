package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.atomic.AtomicReferenceArray class
 * java.util.concurrent.atomic.AtomicReferenceArray}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link AtomicReferenceArrayClassTests}.
 * </p>
 *
 * @see java.util.concurrent.atomic.AtomicReferenceArray class java.util.concurrent.atomic.AtomicReferenceArray (the
 *      hereby targeted class-under-test class)
 * @see AtomicReferenceArrayClassTests AtomicReferenceArrayClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AtomicReferenceArrayTests<SUT extends java.util.concurrent.atomic.AtomicReferenceArray<E>, E>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceArray#accumulateAndGet(int, Object, java.util.function.BinaryOperator)
     * public final E
     * java.util.concurrent.atomic.AtomicReferenceArray.accumulateAndGet(int,E,java.util.function.BinaryOperator<E>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceArray#accumulateAndGet(int, Object, java.util.function.BinaryOperator)
     * public final java.lang.Object
     * java.util.concurrent.atomic.AtomicReferenceArray.accumulateAndGet(int,java.lang.Object,java.util.function.BinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceArray#accumulateAndGet(int, Object,
     *      java.util.function.BinaryOperator) public final java.lang.Object
     *      java.util.concurrent.atomic.AtomicReferenceArray.accumulateAndGet(int,java.lang.Object,java.util.function.
     *      BinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accumulateAndGet_int_Object_BinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceArray#getAndAccumulate(int, Object, java.util.function.BinaryOperator)
     * public final E
     * java.util.concurrent.atomic.AtomicReferenceArray.getAndAccumulate(int,E,java.util.function.BinaryOperator<E>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceArray#getAndAccumulate(int, Object, java.util.function.BinaryOperator)
     * public final java.lang.Object
     * java.util.concurrent.atomic.AtomicReferenceArray.getAndAccumulate(int,java.lang.Object,java.util.function.BinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceArray#getAndAccumulate(int, Object,
     *      java.util.function.BinaryOperator) public final java.lang.Object
     *      java.util.concurrent.atomic.AtomicReferenceArray.getAndAccumulate(int,java.lang.Object,java.util.function.
     *      BinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndAccumulate_int_Object_BinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#getAndSet(int, Object) public final E
     * java.util.concurrent.atomic.AtomicReferenceArray.getAndSet(int,E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#getAndSet(int, Object) public final
     * java.lang.Object java.util.concurrent.atomic.AtomicReferenceArray.getAndSet(int,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceArray#getAndSet(int, Object) public final java.lang.Object
     *      java.util.concurrent.atomic.AtomicReferenceArray.getAndSet(int,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndSet_int_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceArray#getAndUpdate(int, java.util.function.UnaryOperator)
     * public final E java.util.concurrent.atomic.AtomicReferenceArray.getAndUpdate(int,java.util.function.UnaryOperator
     * <E>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceArray#getAndUpdate(int, java.util.function.UnaryOperator)
     * public final java.lang.Object
     * java.util.concurrent.atomic.AtomicReferenceArray.getAndUpdate(int,java.util.function.UnaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceArray#getAndUpdate(int, java.util.function.UnaryOperator) public
     *      final java.lang.Object
     *      java.util.concurrent.atomic.AtomicReferenceArray.getAndUpdate(int,java.util.function.UnaryOperator) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndUpdate_int_UnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#toString() public java.lang.String
     * java.util.concurrent.atomic.AtomicReferenceArray.toString()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#toString() public java.lang.String
     * java.util.concurrent.atomic.AtomicReferenceArray.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceArray#toString() public java.lang.String
     *      java.util.concurrent.atomic.AtomicReferenceArray.toString() (the hereby targeted method-under-test)
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
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceArray#updateAndGet(int, java.util.function.UnaryOperator)
     * public final E java.util.concurrent.atomic.AtomicReferenceArray.updateAndGet(int,java.util.function.UnaryOperator
     * <E>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceArray#updateAndGet(int, java.util.function.UnaryOperator)
     * public final java.lang.Object
     * java.util.concurrent.atomic.AtomicReferenceArray.updateAndGet(int,java.util.function.UnaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceArray#updateAndGet(int, java.util.function.UnaryOperator) public
     *      final java.lang.Object
     *      java.util.concurrent.atomic.AtomicReferenceArray.updateAndGet(int,java.util.function.UnaryOperator) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_updateAndGet_int_UnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#length() public final int
     * java.util.concurrent.atomic.AtomicReferenceArray.length()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#length() public final int
     * java.util.concurrent.atomic.AtomicReferenceArray.length()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceArray#length() public final int
     *      java.util.concurrent.atomic.AtomicReferenceArray.length() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_length()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#lazySet(int, Object) public final void
     * java.util.concurrent.atomic.AtomicReferenceArray.lazySet(int,E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#lazySet(int, Object) public final void
     * java.util.concurrent.atomic.AtomicReferenceArray.lazySet(int,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceArray#lazySet(int, Object) public final void
     *      java.util.concurrent.atomic.AtomicReferenceArray.lazySet(int,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lazySet_int_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#get(int) public final E
     * java.util.concurrent.atomic.AtomicReferenceArray.get(int)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#get(int) public final java.lang.Object
     * java.util.concurrent.atomic.AtomicReferenceArray.get(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceArray#get(int) public final java.lang.Object
     *      java.util.concurrent.atomic.AtomicReferenceArray.get(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#compareAndSet(int, Object, Object) public
     * final boolean java.util.concurrent.atomic.AtomicReferenceArray.compareAndSet(int,E,E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#compareAndSet(int, Object, Object) public
     * final boolean
     * java.util.concurrent.atomic.AtomicReferenceArray.compareAndSet(int,java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceArray#compareAndSet(int, Object, Object) public final boolean
     *      java.util.concurrent.atomic.AtomicReferenceArray.compareAndSet(int,java.lang.Object,java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareAndSet_int_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#weakCompareAndSet(int, Object, Object)
     * public final boolean java.util.concurrent.atomic.AtomicReferenceArray.weakCompareAndSet(int,E,E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#weakCompareAndSet(int, Object, Object)
     * public final boolean
     * java.util.concurrent.atomic.AtomicReferenceArray.weakCompareAndSet(int,java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceArray#weakCompareAndSet(int, Object, Object) public final boolean
     *      java.util.concurrent.atomic.AtomicReferenceArray.weakCompareAndSet(int,java.lang.Object,java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_weakCompareAndSet_int_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#set(int, Object) public final void
     * java.util.concurrent.atomic.AtomicReferenceArray.set(int,E)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceArray#set(int, Object) public final void
     * java.util.concurrent.atomic.AtomicReferenceArray.set(int,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceArray#set(int, Object) public final void
     *      java.util.concurrent.atomic.AtomicReferenceArray.set(int,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_int_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
