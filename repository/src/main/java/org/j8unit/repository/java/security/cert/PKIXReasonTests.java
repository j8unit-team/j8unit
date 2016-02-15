package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.cert.PKIXReason class java.security.cert.PKIXReason}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PKIXReasonClassTests}.
 * </p>
 *
 * @see java.security.cert.PKIXReason class java.security.cert.PKIXReason (the hereby targeted class-under-test class)
 * @see PKIXReasonClassTests PKIXReasonClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PKIXReasonTests<SUT extends java.security.cert.PKIXReason>
extends CertPathValidatorExceptionTests.ReasonTests<SUT>, org.j8unit.repository.java.lang.EnumTests<SUT, java.security.cert.PKIXReason> {

}
