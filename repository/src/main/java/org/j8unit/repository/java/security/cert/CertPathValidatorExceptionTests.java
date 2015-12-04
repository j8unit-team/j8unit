package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.cert.CertPathValidatorException class
 * java.security.cert.CertPathValidatorException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.cert.CertPathValidatorExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CertPathValidatorExceptionTests<SUT extends java.security.cert.CertPathValidatorException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathValidatorException#getCertPath() public
     * java.security.cert.CertPath java.security.cert.CertPathValidatorException.getCertPath()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCertPath()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathValidatorException#getReason() public
     * java.security.cert.CertPathValidatorException$Reason java.security.cert.CertPathValidatorException.getReason()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReason()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathValidatorException#getIndex() public int
     * java.security.cert.CertPathValidatorException.getIndex()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIndex()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link java.security.cert.CertPathValidatorException$BasicReason class
     * java.security.cert.CertPathValidatorException$BasicReason}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.security.cert.CertPathValidatorExceptionClassTests.BasicReasonClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface BasicReasonTests<SUT extends java.security.cert.CertPathValidatorException.BasicReason>
    extends org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests.ReasonTests<SUT>,
    org.j8unit.repository.java.lang.EnumTests<SUT, java.security.cert.CertPathValidatorException.BasicReason> {

    }

    /**
     * <p>
     * Test class for {@link java.security.cert.CertPathValidatorException$Reason interface
     * java.security.cert.CertPathValidatorException$Reason}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.security.cert.CertPathValidatorExceptionClassTests.ReasonClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ReasonTests<SUT extends java.security.cert.CertPathValidatorException.Reason>
    extends org.j8unit.repository.java.io.SerializableTests<SUT> {

    }

}
