package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.KeyAgreementSpi class javax.crypto.KeyAgreementSpi}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link KeyAgreementSpiClassTests}.
 * </p>
 *
 * @see javax.crypto.KeyAgreementSpi class javax.crypto.KeyAgreementSpi (the hereby targeted class-under-test class)
 * @see KeyAgreementSpiClassTests KeyAgreementSpiClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyAgreementSpiTests<SUT extends javax.crypto.KeyAgreementSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
