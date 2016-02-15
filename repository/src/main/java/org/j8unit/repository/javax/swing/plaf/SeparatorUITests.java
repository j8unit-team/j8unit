package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.SeparatorUI class javax.swing.plaf.SeparatorUI}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SeparatorUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.SeparatorUI class javax.swing.plaf.SeparatorUI (the hereby targeted class-under-test class)
 * @see SeparatorUIClassTests SeparatorUIClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SeparatorUITests<SUT extends javax.swing.plaf.SeparatorUI>
extends ComponentUITests<SUT> {

}
