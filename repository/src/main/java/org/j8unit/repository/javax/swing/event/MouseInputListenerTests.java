package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.event.MouseInputListener interface javax.swing.event.MouseInputListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.MouseInputListenerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MouseInputListenerTests<SUT extends javax.swing.event.MouseInputListener>
extends org.j8unit.repository.java.awt.event.MouseListenerTests<SUT>, org.j8unit.repository.java.awt.event.MouseMotionListenerTests<SUT> {

}
