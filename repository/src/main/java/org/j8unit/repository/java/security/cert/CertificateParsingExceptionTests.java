package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.cert.CertificateParsingException class
 * java.security.cert.CertificateParsingException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.security.cert.CertificateParsingExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.cert.CertificateParsingExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.cert.CertificateParsingException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertificateParsingExceptionTests<SUT extends java.security.cert.CertificateParsingException>
extends org.j8unit.repository.java.security.cert.CertificateExceptionTests<SUT> {

}
