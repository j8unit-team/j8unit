package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.cert.CRLReason class java.security.cert.CRLReason},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.cert.CRLReasonTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.cert.CRLReasonClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.cert.CRLReason
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CRLReasonTests<SUT extends java.security.cert.CRLReason>
extends org.j8unit.repository.java.lang.EnumTests<SUT, java.security.cert.CRLReason> {

}
