package org.j8unit.repository.java.util.concurrent.atomic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.atomic.AtomicReferenceFieldUpdater class
 * java.util.concurrent.atomic.AtomicReferenceFieldUpdater}. The complementary j8unit test interface containing the
 * class relevant aspects is {@link AtomicReferenceFieldUpdaterClassTests}.
 * </p>
 *
 * @see java.util.concurrent.atomic.AtomicReferenceFieldUpdater class
 *      java.util.concurrent.atomic.AtomicReferenceFieldUpdater (the hereby targeted class-under-test class)
 * @see AtomicReferenceFieldUpdaterClassTests AtomicReferenceFieldUpdaterClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AtomicReferenceFieldUpdaterTests<SUT extends java.util.concurrent.atomic.AtomicReferenceFieldUpdater<T, V>, T, V>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#get(Object) public abstract V
     * java.util.concurrent.atomic.AtomicReferenceFieldUpdater.get(T)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#get(Object) public abstract
     * java.lang.Object java.util.concurrent.atomic.AtomicReferenceFieldUpdater.get(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceFieldUpdater#get(Object) public abstract java.lang.Object
     *      java.util.concurrent.atomic.AtomicReferenceFieldUpdater.get(java.lang.Object) (the hereby targeted
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
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#compareAndSet(Object, Object, Object) public
     * abstract boolean java.util.concurrent.atomic.AtomicReferenceFieldUpdater.compareAndSet(T,V,V)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#compareAndSet(Object, Object, Object) public
     * abstract boolean
     * java.util.concurrent.atomic.AtomicReferenceFieldUpdater.compareAndSet(java.lang.Object,java.lang.Object,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceFieldUpdater#compareAndSet(Object, Object, Object) public
     *      abstract boolean
     *      java.util.concurrent.atomic.AtomicReferenceFieldUpdater.compareAndSet(java.lang.Object,java.lang.Object,java
     *      .lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compareAndSet_Object_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#weakCompareAndSet(Object, Object, Object) public
     * abstract boolean java.util.concurrent.atomic.AtomicReferenceFieldUpdater.weakCompareAndSet(T,V,V)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#weakCompareAndSet(Object, Object, Object) public
     * abstract boolean
     * java.util.concurrent.atomic.AtomicReferenceFieldUpdater.weakCompareAndSet(java.lang.Object,java.lang.Object,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceFieldUpdater#weakCompareAndSet(Object, Object, Object) public
     *      abstract boolean
     *      java.util.concurrent.atomic.AtomicReferenceFieldUpdater.weakCompareAndSet(java.lang.Object,java.lang.Object,
     *      java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_weakCompareAndSet_Object_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#set(Object, Object) public
     * abstract void java.util.concurrent.atomic.AtomicReferenceFieldUpdater.set(T,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#set(Object, Object) public
     * abstract void java.util.concurrent.atomic.AtomicReferenceFieldUpdater.set(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceFieldUpdater#set(Object, Object) public abstract void
     *      java.util.concurrent.atomic.AtomicReferenceFieldUpdater.set(java.lang.Object,java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#getAndAccumulate(Object, Object, java.util.function.BinaryOperator)
     * public final V
     * java.util.concurrent.atomic.AtomicReferenceFieldUpdater.getAndAccumulate(T,V,java.util.function.BinaryOperator
     * <V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#getAndAccumulate(Object, Object, java.util.function.BinaryOperator)
     * public final java.lang.Object
     * java.util.concurrent.atomic.AtomicReferenceFieldUpdater.getAndAccumulate(java.lang.Object,java.lang.Object,java.util.function.BinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceFieldUpdater#getAndAccumulate(Object, Object,
     *      java.util.function.BinaryOperator) public final java.lang.Object
     *      java.util.concurrent.atomic.AtomicReferenceFieldUpdater.getAndAccumulate(java.lang.Object,java.lang.Object,
     *      java.util.function.BinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndAccumulate_Object_Object_BinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#accumulateAndGet(Object, Object, java.util.function.BinaryOperator)
     * public final V
     * java.util.concurrent.atomic.AtomicReferenceFieldUpdater.accumulateAndGet(T,V,java.util.function.BinaryOperator
     * <V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#accumulateAndGet(Object, Object, java.util.function.BinaryOperator)
     * public final java.lang.Object
     * java.util.concurrent.atomic.AtomicReferenceFieldUpdater.accumulateAndGet(java.lang.Object,java.lang.Object,java.util.function.BinaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceFieldUpdater#accumulateAndGet(Object, Object,
     *      java.util.function.BinaryOperator) public final java.lang.Object
     *      java.util.concurrent.atomic.AtomicReferenceFieldUpdater.accumulateAndGet(java.lang.Object,java.lang.Object,
     *      java.util.function.BinaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_accumulateAndGet_Object_Object_BinaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#updateAndGet(Object, java.util.function.UnaryOperator)
     * public final V
     * java.util.concurrent.atomic.AtomicReferenceFieldUpdater.updateAndGet(T,java.util.function.UnaryOperator<V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#updateAndGet(Object, java.util.function.UnaryOperator)
     * public final java.lang.Object
     * java.util.concurrent.atomic.AtomicReferenceFieldUpdater.updateAndGet(java.lang.Object,java.util.function.UnaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceFieldUpdater#updateAndGet(Object,
     *      java.util.function.UnaryOperator) public final java.lang.Object
     *      java.util.concurrent.atomic.AtomicReferenceFieldUpdater.updateAndGet(java.lang.Object,java.util.function.
     *      UnaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_updateAndGet_Object_UnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#getAndSet(Object, Object) public V
     * java.util.concurrent.atomic.AtomicReferenceFieldUpdater.getAndSet(T,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#getAndSet(Object, Object) public
     * java.lang.Object
     * java.util.concurrent.atomic.AtomicReferenceFieldUpdater.getAndSet(java.lang.Object,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceFieldUpdater#getAndSet(Object, Object) public java.lang.Object
     *      java.util.concurrent.atomic.AtomicReferenceFieldUpdater.getAndSet(java.lang.Object,java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndSet_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#getAndUpdate(Object, java.util.function.UnaryOperator)
     * public final V
     * java.util.concurrent.atomic.AtomicReferenceFieldUpdater.getAndUpdate(T,java.util.function.UnaryOperator<V>)}.
     *
     * <p>
     * Test method for
     * {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#getAndUpdate(Object, java.util.function.UnaryOperator)
     * public final java.lang.Object
     * java.util.concurrent.atomic.AtomicReferenceFieldUpdater.getAndUpdate(java.lang.Object,java.util.function.UnaryOperator)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceFieldUpdater#getAndUpdate(Object,
     *      java.util.function.UnaryOperator) public final java.lang.Object
     *      java.util.concurrent.atomic.AtomicReferenceFieldUpdater.getAndUpdate(java.lang.Object,java.util.function.
     *      UnaryOperator) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAndUpdate_Object_UnaryOperator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#lazySet(Object, Object) public
     * abstract void java.util.concurrent.atomic.AtomicReferenceFieldUpdater.lazySet(T,V)}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater#lazySet(Object, Object) public
     * abstract void java.util.concurrent.atomic.AtomicReferenceFieldUpdater.lazySet(java.lang.Object,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.atomic.AtomicReferenceFieldUpdater#lazySet(Object, Object) public abstract void
     *      java.util.concurrent.atomic.AtomicReferenceFieldUpdater.lazySet(java.lang.Object,java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lazySet_Object_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
