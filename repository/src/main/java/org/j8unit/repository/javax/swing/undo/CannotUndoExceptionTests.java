package org.j8unit.repository.javax.swing.undo;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.undo.CannotUndoException class
 * javax.swing.undo.CannotUndoException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link CannotUndoExceptionClassTests}.
 * </p>
 *
 * @see javax.swing.undo.CannotUndoException class javax.swing.undo.CannotUndoException (the hereby targeted
 *      class-under-test class)
 * @see CannotUndoExceptionClassTests CannotUndoExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CannotUndoExceptionTests<SUT extends javax.swing.undo.CannotUndoException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
