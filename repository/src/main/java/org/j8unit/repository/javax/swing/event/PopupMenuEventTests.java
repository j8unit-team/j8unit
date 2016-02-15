package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.event.PopupMenuEvent class javax.swing.event.PopupMenuEvent}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link PopupMenuEventClassTests}.
 * </p>
 *
 * @see javax.swing.event.PopupMenuEvent class javax.swing.event.PopupMenuEvent (the hereby targeted class-under-test
 *      class)
 * @see PopupMenuEventClassTests PopupMenuEventClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PopupMenuEventTests<SUT extends javax.swing.event.PopupMenuEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

}
