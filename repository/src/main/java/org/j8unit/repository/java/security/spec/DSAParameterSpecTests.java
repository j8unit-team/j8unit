package org.j8unit.repository.java.security.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.spec.DSAParameterSpec class
 * java.security.spec.DSAParameterSpec}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link DSAParameterSpecClassTests}.
 * </p>
 *
 * @see java.security.spec.DSAParameterSpec class java.security.spec.DSAParameterSpec (the hereby targeted
 *      class-under-test class)
 * @see DSAParameterSpecClassTests DSAParameterSpecClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DSAParameterSpecTests<SUT extends java.security.spec.DSAParameterSpec>
extends AlgorithmParameterSpecTests<SUT>, org.j8unit.repository.java.security.interfaces.DSAParamsTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.spec.DSAParameterSpec#getG() public java.math.BigInteger
     * java.security.spec.DSAParameterSpec.getG()}.
     *
     * <p>
     * Test method for {@link java.security.spec.DSAParameterSpec#getG() public java.math.BigInteger
     * java.security.spec.DSAParameterSpec.getG()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.DSAParameterSpec#getG() public java.math.BigInteger
     *      java.security.spec.DSAParameterSpec.getG() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getG()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.DSAParameterSpec#getP() public java.math.BigInteger
     * java.security.spec.DSAParameterSpec.getP()}.
     *
     * <p>
     * Test method for {@link java.security.spec.DSAParameterSpec#getP() public java.math.BigInteger
     * java.security.spec.DSAParameterSpec.getP()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.DSAParameterSpec#getP() public java.math.BigInteger
     *      java.security.spec.DSAParameterSpec.getP() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.security.spec.DSAParameterSpec#getQ() public java.math.BigInteger
     * java.security.spec.DSAParameterSpec.getQ()}.
     *
     * <p>
     * Test method for {@link java.security.spec.DSAParameterSpec#getQ() public java.math.BigInteger
     * java.security.spec.DSAParameterSpec.getQ()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.DSAParameterSpec#getQ() public java.math.BigInteger
     *      java.security.spec.DSAParameterSpec.getQ() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getQ()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
