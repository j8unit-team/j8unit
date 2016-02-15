package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.KeyManagerFactorySpi class
 * javax.net.ssl.KeyManagerFactorySpi}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link KeyManagerFactorySpiClassTests}.
 * </p>
 *
 * @see javax.net.ssl.KeyManagerFactorySpi class javax.net.ssl.KeyManagerFactorySpi (the hereby targeted
 *      class-under-test class)
 * @see KeyManagerFactorySpiClassTests KeyManagerFactorySpiClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyManagerFactorySpiTests<SUT extends javax.net.ssl.KeyManagerFactorySpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
