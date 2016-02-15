package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.CertificateExpiredException class
 * java.security.cert.CertificateExpiredException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link CertificateExpiredExceptionClassTests}.
 * </p>
 *
 * @see java.security.cert.CertificateExpiredException class java.security.cert.CertificateExpiredException (the hereby
 *      targeted class-under-test class)
 * @see CertificateExpiredExceptionClassTests CertificateExpiredExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertificateExpiredExceptionTests<SUT extends java.security.cert.CertificateExpiredException>
extends CertificateExceptionTests<SUT> {

}
