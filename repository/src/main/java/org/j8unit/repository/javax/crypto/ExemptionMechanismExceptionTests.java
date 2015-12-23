package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.crypto.ExemptionMechanismException class
 * javax.crypto.ExemptionMechanismException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.crypto.ExemptionMechanismExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.crypto.ExemptionMechanismExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.crypto.ExemptionMechanismException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExemptionMechanismExceptionTests<SUT extends javax.crypto.ExemptionMechanismException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

}
