package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.DesktopPaneUI class javax.swing.plaf.DesktopPaneUI}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DesktopPaneUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.DesktopPaneUI class javax.swing.plaf.DesktopPaneUI (the hereby targeted class-under-test class)
 * @see DesktopPaneUIClassTests DesktopPaneUIClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DesktopPaneUITests<SUT extends javax.swing.plaf.DesktopPaneUI>
extends ComponentUITests<SUT> {

}
