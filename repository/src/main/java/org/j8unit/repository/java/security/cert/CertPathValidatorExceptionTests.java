package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.cert.CertPathValidatorException class
 * java.security.cert.CertPathValidatorException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.cert.CertPathValidatorExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.cert.CertPathValidatorException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertPathValidatorExceptionTests<SUT extends java.security.cert.CertPathValidatorException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.security.cert.CertPathValidatorException.BasicReason class
     * java.security.cert.CertPathValidatorException$BasicReason}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests.BasicReasonTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.security.cert.CertPathValidatorExceptionClassTests.BasicReasonClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.security.cert.CertPathValidatorException.BasicReason
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BasicReasonTests<SUT extends java.security.cert.CertPathValidatorException.BasicReason>
    extends org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests.ReasonTests<SUT>,
    org.j8unit.repository.java.lang.EnumTests<SUT, java.security.cert.CertPathValidatorException.BasicReason> {

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.security.cert.CertPathValidatorException.Reason interface
     * java.security.cert.CertPathValidatorException$Reason}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests.ReasonTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.security.cert.CertPathValidatorExceptionClassTests.ReasonClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.security.cert.CertPathValidatorException.Reason
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ReasonTests<SUT extends java.security.cert.CertPathValidatorException.Reason>
    extends org.j8unit.repository.java.io.SerializableTests<SUT> {

    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathValidatorException#getCertPath() public
     * java.security.cert.CertPath java.security.cert.CertPathValidatorException.getCertPath()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.cert.CertPathValidatorException#getCertPath()
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
     * Test method for {@link java.security.cert.CertPathValidatorException#getIndex() public int
     * java.security.cert.CertPathValidatorException.getIndex()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.cert.CertPathValidatorException#getIndex()
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
     * Test method for {@link java.security.cert.CertPathValidatorException#getReason() public
     * java.security.cert.CertPathValidatorException$Reason java.security.cert.CertPathValidatorException.getReason()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.cert.CertPathValidatorException#getReason()
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

}
