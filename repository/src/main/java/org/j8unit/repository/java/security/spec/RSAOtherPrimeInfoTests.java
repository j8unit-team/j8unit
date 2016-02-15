package org.j8unit.repository.java.security.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.spec.RSAOtherPrimeInfo class
 * java.security.spec.RSAOtherPrimeInfo}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link RSAOtherPrimeInfoClassTests}.
 * </p>
 *
 * @see java.security.spec.RSAOtherPrimeInfo class java.security.spec.RSAOtherPrimeInfo (the hereby targeted
 *      class-under-test class)
 * @see RSAOtherPrimeInfoClassTests RSAOtherPrimeInfoClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RSAOtherPrimeInfoTests<SUT extends java.security.spec.RSAOtherPrimeInfo>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.spec.RSAOtherPrimeInfo#getCrtCoefficient() public final java.math.BigInteger
     * java.security.spec.RSAOtherPrimeInfo.getCrtCoefficient()}.
     *
     * <p>
     * Test method for {@link java.security.spec.RSAOtherPrimeInfo#getCrtCoefficient() public final java.math.BigInteger
     * java.security.spec.RSAOtherPrimeInfo.getCrtCoefficient()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.RSAOtherPrimeInfo#getCrtCoefficient() public final java.math.BigInteger
     *      java.security.spec.RSAOtherPrimeInfo.getCrtCoefficient() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCrtCoefficient()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.RSAOtherPrimeInfo#getExponent() public final java.math.BigInteger
     * java.security.spec.RSAOtherPrimeInfo.getExponent()}.
     *
     * <p>
     * Test method for {@link java.security.spec.RSAOtherPrimeInfo#getExponent() public final java.math.BigInteger
     * java.security.spec.RSAOtherPrimeInfo.getExponent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.RSAOtherPrimeInfo#getExponent() public final java.math.BigInteger
     *      java.security.spec.RSAOtherPrimeInfo.getExponent() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.RSAOtherPrimeInfo#getPrime() public final java.math.BigInteger
     * java.security.spec.RSAOtherPrimeInfo.getPrime()}.
     *
     * <p>
     * Test method for {@link java.security.spec.RSAOtherPrimeInfo#getPrime() public final java.math.BigInteger
     * java.security.spec.RSAOtherPrimeInfo.getPrime()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.RSAOtherPrimeInfo#getPrime() public final java.math.BigInteger
     *      java.security.spec.RSAOtherPrimeInfo.getPrime() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
