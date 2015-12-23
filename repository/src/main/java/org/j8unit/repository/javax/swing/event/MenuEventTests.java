package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.event.MenuEvent class javax.swing.event.MenuEvent},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.event.MenuEventTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.event.MenuEventClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.event.MenuEvent
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MenuEventTests<SUT extends javax.swing.event.MenuEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

}
