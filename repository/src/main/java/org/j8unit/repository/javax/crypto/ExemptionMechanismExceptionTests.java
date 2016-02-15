package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.ExemptionMechanismException class
 * javax.crypto.ExemptionMechanismException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ExemptionMechanismExceptionClassTests}.
 * </p>
 *
 * @see javax.crypto.ExemptionMechanismException class javax.crypto.ExemptionMechanismException (the hereby targeted
 *      class-under-test class)
 * @see ExemptionMechanismExceptionClassTests ExemptionMechanismExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExemptionMechanismExceptionTests<SUT extends javax.crypto.ExemptionMechanismException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

}
