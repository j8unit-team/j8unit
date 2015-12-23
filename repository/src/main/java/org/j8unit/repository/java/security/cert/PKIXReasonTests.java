package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.cert.PKIXReason class java.security.cert.PKIXReason},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.cert.PKIXReasonTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.cert.PKIXReasonClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.cert.PKIXReason
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PKIXReasonTests<SUT extends java.security.cert.PKIXReason>
extends org.j8unit.repository.java.security.cert.CertPathValidatorExceptionTests.ReasonTests<SUT>,
org.j8unit.repository.java.lang.EnumTests<SUT, java.security.cert.PKIXReason> {

}
