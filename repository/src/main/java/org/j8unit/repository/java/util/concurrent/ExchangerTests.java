package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.Exchanger class java.util.concurrent.Exchanger}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ExchangerClassTests}.
 * </p>
 *
 * @see java.util.concurrent.Exchanger class java.util.concurrent.Exchanger (the hereby targeted class-under-test class)
 * @see ExchangerClassTests ExchangerClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExchangerTests<SUT extends java.util.concurrent.Exchanger<V>, V>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Exchanger#exchange(Object, long, java.util.concurrent.TimeUnit)
     * public V java.util.concurrent.Exchanger.exchange(V,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException,java.util.concurrent.TimeoutException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Exchanger#exchange(Object, long, java.util.concurrent.TimeUnit)
     * public java.lang.Object
     * java.util.concurrent.Exchanger.exchange(java.lang.Object,long,java.util.concurrent.TimeUnit) throws
     * java.lang.InterruptedException,java.util.concurrent.TimeoutException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Exchanger#exchange(Object, long, java.util.concurrent.TimeUnit) public java.lang.Object
     *      java.util.concurrent.Exchanger.exchange(java.lang.Object,long,java.util.concurrent.TimeUnit) throws
     *      java.lang.InterruptedException,java.util.concurrent.TimeoutException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exchange_Object_long_TimeUnit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Exchanger#exchange(Object) public V
     * java.util.concurrent.Exchanger.exchange(V) throws java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link java.util.concurrent.Exchanger#exchange(Object) public java.lang.Object
     * java.util.concurrent.Exchanger.exchange(java.lang.Object) throws java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.concurrent.Exchanger#exchange(Object) public java.lang.Object
     *      java.util.concurrent.Exchanger.exchange(java.lang.Object) throws java.lang.InterruptedException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exchange_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
