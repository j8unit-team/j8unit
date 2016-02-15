package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CertPathBuilderSpi class
 * java.security.cert.CertPathBuilderSpi}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link CertPathBuilderSpiClassTests}.
 * </p>
 *
 * @see java.security.cert.CertPathBuilderSpi class java.security.cert.CertPathBuilderSpi (the hereby targeted
 *      class-under-test class)
 * @see CertPathBuilderSpiClassTests CertPathBuilderSpiClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertPathBuilderSpiTests<SUT extends java.security.cert.CertPathBuilderSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilderSpi#engineGetRevocationChecker() public
     * java.security.cert.CertPathChecker java.security.cert.CertPathBuilderSpi.engineGetRevocationChecker()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilderSpi#engineGetRevocationChecker() public
     * java.security.cert.CertPathChecker java.security.cert.CertPathBuilderSpi.engineGetRevocationChecker()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPathBuilderSpi#engineGetRevocationChecker() public java.security.cert.CertPathChecker
     *      java.security.cert.CertPathBuilderSpi.engineGetRevocationChecker() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGetRevocationChecker()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilderSpi#engineBuild(java.security.cert.CertPathParameters)
     * public abstract java.security.cert.CertPathBuilderResult
     * java.security.cert.CertPathBuilderSpi.engineBuild(java.security.cert.CertPathParameters) throws
     * java.security.cert.CertPathBuilderException,java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilderSpi#engineBuild(java.security.cert.CertPathParameters)
     * public abstract java.security.cert.CertPathBuilderResult
     * java.security.cert.CertPathBuilderSpi.engineBuild(java.security.cert.CertPathParameters) throws
     * java.security.cert.CertPathBuilderException,java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPathBuilderSpi#engineBuild(java.security.cert.CertPathParameters) public abstract
     *      java.security.cert.CertPathBuilderResult
     *      java.security.cert.CertPathBuilderSpi.engineBuild(java.security.cert.CertPathParameters) throws
     *      java.security.cert.CertPathBuilderException,java.security.InvalidAlgorithmParameterException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineBuild_CertPathParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
