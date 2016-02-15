package org.j8unit.repository.javax.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.cert.CertificateNotYetValidException class
 * javax.security.cert.CertificateNotYetValidException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link CertificateNotYetValidExceptionClassTests}.
 * </p>
 *
 * @see javax.security.cert.CertificateNotYetValidException class javax.security.cert.CertificateNotYetValidException
 *      (the hereby targeted class-under-test class)
 * @see CertificateNotYetValidExceptionClassTests CertificateNotYetValidExceptionClassTests (the complementary j8unit
 *      test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertificateNotYetValidExceptionTests<SUT extends javax.security.cert.CertificateNotYetValidException>
extends CertificateExceptionTests<SUT> {

}
