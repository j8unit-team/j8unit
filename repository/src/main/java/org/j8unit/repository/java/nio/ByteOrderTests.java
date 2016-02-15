package org.j8unit.repository.java.nio;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.ByteOrder class java.nio.ByteOrder}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link ByteOrderClassTests}.
 * </p>
 *
 * @see java.nio.ByteOrder class java.nio.ByteOrder (the hereby targeted class-under-test class)
 * @see ByteOrderClassTests ByteOrderClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ByteOrderTests<SUT extends java.nio.ByteOrder>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.ByteOrder#toString() public java.lang.String java.nio.ByteOrder.toString()}.
     *
     * <p>
     * Test method for {@link java.nio.ByteOrder#toString() public java.lang.String java.nio.ByteOrder.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.ByteOrder#toString() public java.lang.String java.nio.ByteOrder.toString() (the hereby targeted
     *      method-under-test)
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

}
