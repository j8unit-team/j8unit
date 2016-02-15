package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.Utilities class javax.swing.text.Utilities}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link UtilitiesClassTests}.
 * </p>
 *
 * @see javax.swing.text.Utilities class javax.swing.text.Utilities (the hereby targeted class-under-test class)
 * @see UtilitiesClassTests UtilitiesClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UtilitiesTests<SUT extends javax.swing.text.Utilities>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
