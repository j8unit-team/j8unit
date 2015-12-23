package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.event.PopupMenuEvent class
 * javax.swing.event.PopupMenuEvent}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.event.PopupMenuEventTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.event.PopupMenuEventClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.event.PopupMenuEvent
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PopupMenuEventTests<SUT extends javax.swing.event.PopupMenuEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

}
