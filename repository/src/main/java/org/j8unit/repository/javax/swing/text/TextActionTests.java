package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.TextAction class javax.swing.text.TextAction},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.TextActionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.TextActionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.TextAction
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TextActionTests<SUT extends javax.swing.text.TextAction>
extends org.j8unit.repository.javax.swing.AbstractActionTests<SUT> {

}
