package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CertificateParsingException class
 * java.security.cert.CertificateParsingException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link CertificateParsingExceptionClassTests}.
 * </p>
 *
 * @see java.security.cert.CertificateParsingException class java.security.cert.CertificateParsingException (the hereby
 *      targeted class-under-test class)
 * @see CertificateParsingExceptionClassTests CertificateParsingExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertificateParsingExceptionTests<SUT extends java.security.cert.CertificateParsingException>
extends CertificateExceptionTests<SUT> {

}
