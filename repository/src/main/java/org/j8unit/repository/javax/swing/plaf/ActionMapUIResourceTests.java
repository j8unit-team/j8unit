package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.ActionMapUIResource class
 * javax.swing.plaf.ActionMapUIResource}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.ActionMapUIResourceTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.ActionMapUIResourceClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.ActionMapUIResource
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActionMapUIResourceTests<SUT extends javax.swing.plaf.ActionMapUIResource>
extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.ActionMapTests<SUT> {

}
