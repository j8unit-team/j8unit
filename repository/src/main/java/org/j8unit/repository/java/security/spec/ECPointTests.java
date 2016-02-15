package org.j8unit.repository.java.security.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.spec.ECPoint class java.security.spec.ECPoint}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ECPointClassTests}.
 * </p>
 *
 * @see java.security.spec.ECPoint class java.security.spec.ECPoint (the hereby targeted class-under-test class)
 * @see ECPointClassTests ECPointClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ECPointTests<SUT extends java.security.spec.ECPoint>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.spec.ECPoint#getAffineY() public java.math.BigInteger
     * java.security.spec.ECPoint.getAffineY()}.
     *
     * <p>
     * Test method for {@link java.security.spec.ECPoint#getAffineY() public java.math.BigInteger
     * java.security.spec.ECPoint.getAffineY()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.ECPoint#getAffineY() public java.math.BigInteger java.security.spec.ECPoint.getAffineY()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAffineY()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.ECPoint#getAffineX() public java.math.BigInteger
     * java.security.spec.ECPoint.getAffineX()}.
     *
     * <p>
     * Test method for {@link java.security.spec.ECPoint#getAffineX() public java.math.BigInteger
     * java.security.spec.ECPoint.getAffineX()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.ECPoint#getAffineX() public java.math.BigInteger java.security.spec.ECPoint.getAffineX()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAffineX()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.ECPoint#equals(Object) public boolean
     * java.security.spec.ECPoint.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.spec.ECPoint#equals(Object) public boolean
     * java.security.spec.ECPoint.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.ECPoint#equals(Object) public boolean java.security.spec.ECPoint.equals(java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.ECPoint#hashCode() public int java.security.spec.ECPoint.hashCode()}.
     *
     * <p>
     * Test method for {@link java.security.spec.ECPoint#hashCode() public int java.security.spec.ECPoint.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.ECPoint#hashCode() public int java.security.spec.ECPoint.hashCode() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
