package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.event.MouseInputListener interface
 * javax.swing.event.MouseInputListener}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.event.MouseInputListenerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.event.MouseInputListenerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.event.MouseInputListener
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MouseInputListenerTests<SUT extends javax.swing.event.MouseInputListener>
extends org.j8unit.repository.java.awt.event.MouseListenerTests<SUT>, org.j8unit.repository.java.awt.event.MouseMotionListenerTests<SUT> {

}
