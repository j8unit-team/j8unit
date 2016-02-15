package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.KeyStroke class javax.swing.KeyStroke}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link KeyStrokeClassTests}.
 * </p>
 *
 * @see javax.swing.KeyStroke class javax.swing.KeyStroke (the hereby targeted class-under-test class)
 * @see KeyStrokeClassTests KeyStrokeClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyStrokeTests<SUT extends javax.swing.KeyStroke>
extends org.j8unit.repository.java.awt.AWTKeyStrokeTests<SUT> {

}
