package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.ToolTipUI class javax.swing.plaf.ToolTipUI}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ToolTipUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.ToolTipUI class javax.swing.plaf.ToolTipUI (the hereby targeted class-under-test class)
 * @see ToolTipUIClassTests ToolTipUIClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ToolTipUITests<SUT extends javax.swing.plaf.ToolTipUI>
extends ComponentUITests<SUT> {

}
