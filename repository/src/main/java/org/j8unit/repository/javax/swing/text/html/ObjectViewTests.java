package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.html.ObjectView class javax.swing.text.html.ObjectView}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link ObjectViewClassTests}.
 * </p>
 *
 * @see javax.swing.text.html.ObjectView class javax.swing.text.html.ObjectView (the hereby targeted class-under-test
 *      class)
 * @see ObjectViewClassTests ObjectViewClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectViewTests<SUT extends javax.swing.text.html.ObjectView>
extends org.j8unit.repository.javax.swing.text.ComponentViewTests<SUT> {

}
