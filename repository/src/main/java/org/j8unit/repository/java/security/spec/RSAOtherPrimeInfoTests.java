package org.j8unit.repository.java.security.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.spec.RSAOtherPrimeInfo class
 * java.security.spec.RSAOtherPrimeInfo}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.spec.RSAOtherPrimeInfoTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.spec.RSAOtherPrimeInfoClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.spec.RSAOtherPrimeInfo
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.spec.RSAOtherPrimeInfo#getCrtCoefficient()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.spec.RSAOtherPrimeInfo#getExponent()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.spec.RSAOtherPrimeInfo#getPrime()
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
