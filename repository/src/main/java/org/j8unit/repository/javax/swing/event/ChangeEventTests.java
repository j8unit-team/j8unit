package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.event.ChangeEvent class javax.swing.event.ChangeEvent},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.event.ChangeEventTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.event.ChangeEventClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.event.ChangeEvent
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ChangeEventTests<SUT extends javax.swing.event.ChangeEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

}
