package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CertPathValidatorException class
 * java.security.cert.CertPathValidatorException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CertPathValidatorExceptionClassTests}.
 * </p>
 *
 * @see java.security.cert.CertPathValidatorException class java.security.cert.CertPathValidatorException (the hereby
 *      targeted class-under-test class)
 * @see CertPathValidatorExceptionClassTests CertPathValidatorExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertPathValidatorExceptionTests<SUT extends java.security.cert.CertPathValidatorException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathValidatorException#getCertPath() public
     * java.security.cert.CertPath java.security.cert.CertPathValidatorException.getCertPath()}.
     *
     * <p>
     * Test method for {@link java.security.cert.CertPathValidatorException#getCertPath() public
     * java.security.cert.CertPath java.security.cert.CertPathValidatorException.getCertPath()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPathValidatorException#getCertPath() public java.security.cert.CertPath
     *      java.security.cert.CertPathValidatorException.getCertPath() (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.security.cert.CertPathValidatorException#getReason() public
     * java.security.cert.CertPathValidatorException$Reason java.security.cert.CertPathValidatorException.getReason()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPathValidatorException#getReason() public
     *      java.security.cert.CertPathValidatorException$Reason
     *      java.security.cert.CertPathValidatorException.getReason() (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.security.cert.CertPathValidatorException#getIndex() public int
     * java.security.cert.CertPathValidatorException.getIndex()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.cert.CertPathValidatorException#getIndex() public int
     *      java.security.cert.CertPathValidatorException.getIndex() (the hereby targeted method-under-test)
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
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.security.cert.CertPathValidatorException.Reason interface
     * java.security.cert.CertPathValidatorException$Reason}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link CertPathValidatorExceptionClassTests.ReasonClassTests}.
     * </p>
     *
     * @see java.security.cert.CertPathValidatorException.Reason interface
     *      java.security.cert.CertPathValidatorException$Reason (the hereby targeted class-under-test class)
     * @see CertPathValidatorExceptionClassTests.ReasonClassTests CertPathValidatorExceptionClassTests.ReasonClassTests
     *      (the complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ReasonTests<SUT extends java.security.cert.CertPathValidatorException.Reason>
    extends org.j8unit.repository.java.io.SerializableTests<SUT> {

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.security.cert.CertPathValidatorException.BasicReason class
     * java.security.cert.CertPathValidatorException$BasicReason}. The complementary j8unit test interface containing
     * the class relevant aspects is {@link CertPathValidatorExceptionClassTests.BasicReasonClassTests}.
     * </p>
     *
     * @see java.security.cert.CertPathValidatorException.BasicReason class
     *      java.security.cert.CertPathValidatorException$BasicReason (the hereby targeted class-under-test class)
     * @see CertPathValidatorExceptionClassTests.BasicReasonClassTests
     *      CertPathValidatorExceptionClassTests.BasicReasonClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BasicReasonTests<SUT extends java.security.cert.CertPathValidatorException.BasicReason>
    extends CertPathValidatorExceptionTests.ReasonTests<SUT>,
    org.j8unit.repository.java.lang.EnumTests<SUT, java.security.cert.CertPathValidatorException.BasicReason> {

    }

}
