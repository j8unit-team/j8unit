package org.j8unit.repository.java.security.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.spec.ECFieldFp class java.security.spec.ECFieldFp}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ECFieldFpClassTests}.
 * </p>
 *
 * @see java.security.spec.ECFieldFp class java.security.spec.ECFieldFp (the hereby targeted class-under-test class)
 * @see ECFieldFpClassTests ECFieldFpClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ECFieldFpTests<SUT extends java.security.spec.ECFieldFp>
extends ECFieldTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.spec.ECFieldFp#getP() public java.math.BigInteger
     * java.security.spec.ECFieldFp.getP()}.
     *
     * <p>
     * Test method for {@link java.security.spec.ECFieldFp#getP() public java.math.BigInteger
     * java.security.spec.ECFieldFp.getP()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.ECFieldFp#getP() public java.math.BigInteger java.security.spec.ECFieldFp.getP() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getP()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.ECFieldFp#getFieldSize() public int
     * java.security.spec.ECFieldFp.getFieldSize()}.
     *
     * <p>
     * Test method for {@link java.security.spec.ECFieldFp#getFieldSize() public int
     * java.security.spec.ECFieldFp.getFieldSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.ECFieldFp#getFieldSize() public int java.security.spec.ECFieldFp.getFieldSize() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getFieldSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.ECFieldFp#equals(Object) public boolean
     * java.security.spec.ECFieldFp.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.security.spec.ECFieldFp#equals(Object) public boolean
     * java.security.spec.ECFieldFp.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.ECFieldFp#equals(Object) public boolean
     *      java.security.spec.ECFieldFp.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link java.security.spec.ECFieldFp#hashCode() public int
     * java.security.spec.ECFieldFp.hashCode()}.
     *
     * <p>
     * Test method for {@link java.security.spec.ECFieldFp#hashCode() public int
     * java.security.spec.ECFieldFp.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.ECFieldFp#hashCode() public int java.security.spec.ECFieldFp.hashCode() (the hereby
     *      targeted method-under-test)
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
