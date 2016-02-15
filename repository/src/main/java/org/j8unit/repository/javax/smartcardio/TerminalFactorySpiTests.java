package org.j8unit.repository.javax.smartcardio;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.smartcardio.TerminalFactorySpi class
 * javax.smartcardio.TerminalFactorySpi}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link TerminalFactorySpiClassTests}.
 * </p>
 *
 * @see javax.smartcardio.TerminalFactorySpi class javax.smartcardio.TerminalFactorySpi (the hereby targeted
 *      class-under-test class)
 * @see TerminalFactorySpiClassTests TerminalFactorySpiClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TerminalFactorySpiTests<SUT extends javax.smartcardio.TerminalFactorySpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
