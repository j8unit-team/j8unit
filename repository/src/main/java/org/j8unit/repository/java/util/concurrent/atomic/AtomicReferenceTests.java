package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.atomic.AtomicReference class
 * java.util.concurrent.atomic.AtomicReference}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AtomicReferenceClassTests}.
 * </p>
 *
 * @see java.util.concurrent.atomic.AtomicReference class java.util.concurrent.atomic.AtomicReference (the hereby
 *      targeted class-under-test class)
 * @see AtomicReferenceClassTests AtomicReferenceClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AtomicReferenceTests<SUT extends java.util.concurrent.atomic.AtomicReference<V>, V>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReference#accumulateAndGet(Object, java.util.function.BinaryOperator)
     * public final V java.util.concurrent.atomic.AtomicReference.accumulateAndGet(V,java.util.function.BinaryOperator
     * <V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReference#accumulateAndGet(Object, java.util.function.BinaryOperator)
     * public final java.lang.Object
     * java.util.concurrent.atomic.AtomicReference.accumulateAndGet(java.lang.Object,java.util.function.BinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReference#accumulateAndGet(Object, java.util.function.BinaryOperator)
     *      public final java.lang.Object
     *      java.util.concurrent.atomic.AtomicReference.accumulateAndGet(java.lang.Object,java.util.function.
     *      BinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accumulateAndGet_Object_BinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReference#getAndAccumulate(Object, java.util.function.BinaryOperator)
     * public final V java.util.concurrent.atomic.AtomicReference.getAndAccumulate(V,java.util.function.BinaryOperator
     * <V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReference#getAndAccumulate(Object, java.util.function.BinaryOperator)
     * public final java.lang.Object
     * java.util.concurrent.atomic.AtomicReference.getAndAccumulate(java.lang.Object,java.util.function.BinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReference#getAndAccumulate(Object, java.util.function.BinaryOperator)
     *      public final java.lang.Object
     *      java.util.concurrent.atomic.AtomicReference.getAndAccumulate(java.lang.Object,java.util.function.
     *      BinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndAccumulate_Object_BinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#lazySet(Object) public final void
     * java.util.concurrent.atomic.AtomicReference.lazySet(V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#lazySet(Object) public final void
     * java.util.concurrent.atomic.AtomicReference.lazySet(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReference#lazySet(Object) public final void
     *      java.util.concurrent.atomic.AtomicReference.lazySet(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lazySet_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#getAndSet(Object) public final V
     * java.util.concurrent.atomic.AtomicReference.getAndSet(V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#getAndSet(Object) public final
     * java.lang.Object java.util.concurrent.atomic.AtomicReference.getAndSet(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReference#getAndSet(Object) public final java.lang.Object
     *      java.util.concurrent.atomic.AtomicReference.getAndSet(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndSet_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#getAndUpdate(java.util.function.UnaryOperator)
     * public final V java.util.concurrent.atomic.AtomicReference.getAndUpdate(java.util.function.UnaryOperator<V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#getAndUpdate(java.util.function.UnaryOperator)
     * public final java.lang.Object
     * java.util.concurrent.atomic.AtomicReference.getAndUpdate(java.util.function.UnaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReference#getAndUpdate(java.util.function.UnaryOperator) public final
     *      java.lang.Object java.util.concurrent.atomic.AtomicReference.getAndUpdate(java.util.function.UnaryOperator)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndUpdate_UnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#toString() public java.lang.String
     * java.util.concurrent.atomic.AtomicReference.toString()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#toString() public java.lang.String
     * java.util.concurrent.atomic.AtomicReference.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReference#toString() public java.lang.String
     *      java.util.concurrent.atomic.AtomicReference.toString() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#updateAndGet(java.util.function.UnaryOperator)
     * public final V java.util.concurrent.atomic.AtomicReference.updateAndGet(java.util.function.UnaryOperator<V>)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#updateAndGet(java.util.function.UnaryOperator)
     * public final java.lang.Object
     * java.util.concurrent.atomic.AtomicReference.updateAndGet(java.util.function.UnaryOperator)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReference#updateAndGet(java.util.function.UnaryOperator) public final
     *      java.lang.Object java.util.concurrent.atomic.AtomicReference.updateAndGet(java.util.function.UnaryOperator)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_updateAndGet_UnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#compareAndSet(Object, Object) public final
     * boolean java.util.concurrent.atomic.AtomicReference.compareAndSet(V,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#compareAndSet(Object, Object) public final
     * boolean java.util.concurrent.atomic.AtomicReference.compareAndSet(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReference#compareAndSet(Object, Object) public final boolean
     *      java.util.concurrent.atomic.AtomicReference.compareAndSet(java.lang.Object,java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareAndSet_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#weakCompareAndSet(Object, Object) public final
     * boolean java.util.concurrent.atomic.AtomicReference.weakCompareAndSet(V,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#weakCompareAndSet(Object, Object) public final
     * boolean java.util.concurrent.atomic.AtomicReference.weakCompareAndSet(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReference#weakCompareAndSet(Object, Object) public final boolean
     *      java.util.concurrent.atomic.AtomicReference.weakCompareAndSet(java.lang.Object,java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_weakCompareAndSet_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#get() public final V
     * java.util.concurrent.atomic.AtomicReference.get()}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#get() public final java.lang.Object
     * java.util.concurrent.atomic.AtomicReference.get()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReference#get() public final java.lang.Object
     *      java.util.concurrent.atomic.AtomicReference.get() (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#set(Object) public final void
     * java.util.concurrent.atomic.AtomicReference.set(V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReference#set(Object) public final void
     * java.util.concurrent.atomic.AtomicReference.set(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReference#set(Object) public final void
     *      java.util.concurrent.atomic.AtomicReference.set(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
