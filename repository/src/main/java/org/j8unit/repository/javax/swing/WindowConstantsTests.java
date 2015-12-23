package org.j8unit.repository.javax.swing;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.WindowConstants interface javax.swing.WindowConstants},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.WindowConstantsTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.WindowConstantsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.WindowConstants
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WindowConstantsTests<SUT extends javax.swing.WindowConstants>
extends RepositoryTests<SUT> {

}
