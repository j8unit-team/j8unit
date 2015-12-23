package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.cert.CertStoreException class
 * java.security.cert.CertStoreException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.cert.CertStoreExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.cert.CertStoreExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.cert.CertStoreException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertStoreExceptionTests<SUT extends java.security.cert.CertStoreException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

}
