package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.ExemptionMechanismSpi class
 * javax.crypto.ExemptionMechanismSpi}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link ExemptionMechanismSpiClassTests}.
 * </p>
 *
 * @see javax.crypto.ExemptionMechanismSpi class javax.crypto.ExemptionMechanismSpi (the hereby targeted
 *      class-under-test class)
 * @see ExemptionMechanismSpiClassTests ExemptionMechanismSpiClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExemptionMechanismSpiTests<SUT extends javax.crypto.ExemptionMechanismSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
