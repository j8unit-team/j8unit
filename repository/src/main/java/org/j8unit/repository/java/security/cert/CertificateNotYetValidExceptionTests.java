package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.cert.CertificateNotYetValidException class
 * java.security.cert.CertificateNotYetValidException}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.security.cert.CertificateNotYetValidExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.cert.CertificateNotYetValidExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.cert.CertificateNotYetValidException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertificateNotYetValidExceptionTests<SUT extends java.security.cert.CertificateNotYetValidException>
extends org.j8unit.repository.java.security.cert.CertificateExceptionTests<SUT> {

}
