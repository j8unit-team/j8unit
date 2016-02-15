package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CertPathValidatorSpi class
 * java.security.cert.CertPathValidatorSpi}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CertPathValidatorSpiClassTests}.
 * </p>
 *
 * @see java.security.cert.CertPathValidatorSpi class java.security.cert.CertPathValidatorSpi (the hereby targeted
 *      class-under-test class)
 * @see CertPathValidatorSpiClassTests CertPathValidatorSpiClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertPathValidatorSpiTests<SUT extends java.security.cert.CertPathValidatorSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathValidatorSpi#engineGetRevocationChecker() public
     * java.security.cert.CertPathChecker java.security.cert.CertPathValidatorSpi.engineGetRevocationChecker()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertPathValidatorSpi#engineGetRevocationChecker() public
     * java.security.cert.CertPathChecker java.security.cert.CertPathValidatorSpi.engineGetRevocationChecker()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPathValidatorSpi#engineGetRevocationChecker() public
     *      java.security.cert.CertPathChecker java.security.cert.CertPathValidatorSpi.engineGetRevocationChecker() (the
     *      hereby targeted method-under-test)
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
     * Test method for
     * {@link java.security.cert.CertPathValidatorSpi#engineValidate(java.security.cert.CertPath, java.security.cert.CertPathParameters)
     * public abstract java.security.cert.CertPathValidatorResult
     * java.security.cert.CertPathValidatorSpi.engineValidate(java.security.cert.CertPath,java.security.cert.CertPathParameters)
     * throws java.security.cert.CertPathValidatorException,java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for
     * {@link java.security.cert.CertPathValidatorSpi#engineValidate(java.security.cert.CertPath, java.security.cert.CertPathParameters)
     * public abstract java.security.cert.CertPathValidatorResult
     * java.security.cert.CertPathValidatorSpi.engineValidate(java.security.cert.CertPath,java.security.cert.CertPathParameters)
     * throws java.security.cert.CertPathValidatorException,java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPathValidatorSpi#engineValidate(java.security.cert.CertPath,
     *      java.security.cert.CertPathParameters) public abstract java.security.cert.CertPathValidatorResult
     *      java.security.cert.CertPathValidatorSpi.engineValidate(java.security.cert.CertPath,java.security.cert.
     *      CertPathParameters) throws
     *      java.security.cert.CertPathValidatorException,java.security.InvalidAlgorithmParameterException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineValidate_CertPath_CertPathParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
