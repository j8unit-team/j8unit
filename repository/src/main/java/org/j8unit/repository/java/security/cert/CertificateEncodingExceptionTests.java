package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CertificateEncodingException class
 * java.security.cert.CertificateEncodingException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link CertificateEncodingExceptionClassTests}.
 * </p>
 *
 * @see java.security.cert.CertificateEncodingException class java.security.cert.CertificateEncodingException (the
 *      hereby targeted class-under-test class)
 * @see CertificateEncodingExceptionClassTests CertificateEncodingExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertificateEncodingExceptionTests<SUT extends java.security.cert.CertificateEncodingException>
extends CertificateExceptionTests<SUT> {

}
