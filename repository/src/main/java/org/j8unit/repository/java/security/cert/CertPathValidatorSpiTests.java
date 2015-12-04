package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.cert.CertPathValidatorSpi class java.security.cert.CertPathValidatorSpi},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.cert.CertPathValidatorSpiClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertPathValidatorSpiTests<SUT extends java.security.cert.CertPathValidatorSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathValidatorSpi#engineGetRevocationChecker() public
     * java.security.cert.CertPathChecker java.security.cert.CertPathValidatorSpi.engineGetRevocationChecker()}.
     * </p>
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
     * {@link java.security.cert.CertPathValidatorSpi#engineValidate(java.security.cert.CertPath,java.security.cert.CertPathParameters)
     * public abstract java.security.cert.CertPathValidatorResult
     * java.security.cert.CertPathValidatorSpi.engineValidate(java.security.cert.CertPath,java.security.cert.CertPathParameters)
     * throws java.security.cert.CertPathValidatorException,java.security.InvalidAlgorithmParameterException}.
     * </p>
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
