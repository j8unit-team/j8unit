package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.event.MouseInputListener interface
 * javax.swing.event.MouseInputListener}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link MouseInputListenerClassTests}.
 * </p>
 *
 * @see javax.swing.event.MouseInputListener interface javax.swing.event.MouseInputListener (the hereby targeted
 *      class-under-test class)
 * @see MouseInputListenerClassTests MouseInputListenerClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MouseInputListenerTests<SUT extends javax.swing.event.MouseInputListener>
extends org.j8unit.repository.java.awt.event.MouseListenerTests<SUT>, org.j8unit.repository.java.awt.event.MouseMotionListenerTests<SUT> {

}
