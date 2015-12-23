package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.DefaultTextUI class javax.swing.text.DefaultTextUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.DefaultTextUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.DefaultTextUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.DefaultTextUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultTextUITests<SUT extends javax.swing.text.DefaultTextUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicTextUITests<SUT> {

}
