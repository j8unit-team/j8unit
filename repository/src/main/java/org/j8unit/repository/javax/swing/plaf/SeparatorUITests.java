package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.SeparatorUI class javax.swing.plaf.SeparatorUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.SeparatorUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.SeparatorUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.SeparatorUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SeparatorUITests<SUT extends javax.swing.plaf.SeparatorUI>
extends org.j8unit.repository.javax.swing.plaf.ComponentUITests<SUT> {

}
