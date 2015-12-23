package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.SpinnerUI class javax.swing.plaf.SpinnerUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.SpinnerUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.SpinnerUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.SpinnerUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SpinnerUITests<SUT extends javax.swing.plaf.SpinnerUI>
extends org.j8unit.repository.javax.swing.plaf.ComponentUITests<SUT> {

}
