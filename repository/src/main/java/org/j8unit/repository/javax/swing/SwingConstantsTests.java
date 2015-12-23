package org.j8unit.repository.javax.swing;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.SwingConstants interface javax.swing.SwingConstants},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.SwingConstantsTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.SwingConstantsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.SwingConstants
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SwingConstantsTests<SUT extends javax.swing.SwingConstants>
extends RepositoryTests<SUT> {

}
