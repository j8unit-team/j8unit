package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.SecretKeyFactorySpi class javax.crypto.SecretKeyFactorySpi}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link SecretKeyFactorySpiClassTests}.
 * </p>
 *
 * @see javax.crypto.SecretKeyFactorySpi class javax.crypto.SecretKeyFactorySpi (the hereby targeted class-under-test
 *      class)
 * @see SecretKeyFactorySpiClassTests SecretKeyFactorySpiClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SecretKeyFactorySpiTests<SUT extends javax.crypto.SecretKeyFactorySpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
