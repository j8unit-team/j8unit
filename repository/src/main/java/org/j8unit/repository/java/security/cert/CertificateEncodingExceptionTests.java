package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.cert.CertificateEncodingException class
 * java.security.cert.CertificateEncodingException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.security.cert.CertificateEncodingExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.cert.CertificateEncodingExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.cert.CertificateEncodingException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertificateEncodingExceptionTests<SUT extends java.security.cert.CertificateEncodingException>
extends org.j8unit.repository.java.security.cert.CertificateExceptionTests<SUT> {

}
