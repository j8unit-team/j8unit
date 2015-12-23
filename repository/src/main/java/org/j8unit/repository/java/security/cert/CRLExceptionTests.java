package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.cert.CRLException class java.security.cert.CRLException}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.cert.CRLExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.cert.CRLExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.cert.CRLException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CRLExceptionTests<SUT extends java.security.cert.CRLException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

}
