package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.cert.CertificateExpiredException class
 * java.security.cert.CertificateExpiredException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.security.cert.CertificateExpiredExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.cert.CertificateExpiredExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.cert.CertificateExpiredException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertificateExpiredExceptionTests<SUT extends java.security.cert.CertificateExpiredException>
extends org.j8unit.repository.java.security.cert.CertificateExceptionTests<SUT> {

}
