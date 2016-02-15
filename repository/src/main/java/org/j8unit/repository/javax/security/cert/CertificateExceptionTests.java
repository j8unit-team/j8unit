package org.j8unit.repository.javax.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.cert.CertificateException class
 * javax.security.cert.CertificateException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CertificateExceptionClassTests}.
 * </p>
 *
 * @see javax.security.cert.CertificateException class javax.security.cert.CertificateException (the hereby targeted
 *      class-under-test class)
 * @see CertificateExceptionClassTests CertificateExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertificateExceptionTests<SUT extends javax.security.cert.CertificateException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
