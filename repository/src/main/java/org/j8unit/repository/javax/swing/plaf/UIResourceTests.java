package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.UIResource interface javax.swing.plaf.UIResource},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.UIResourceTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.UIResourceClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.UIResource
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UIResourceTests<SUT extends javax.swing.plaf.UIResource>
extends RepositoryTests<SUT> {

}
