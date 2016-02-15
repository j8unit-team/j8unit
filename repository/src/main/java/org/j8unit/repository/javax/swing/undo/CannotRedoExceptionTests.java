package org.j8unit.repository.javax.swing.undo;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.undo.CannotRedoException class
 * javax.swing.undo.CannotRedoException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link CannotRedoExceptionClassTests}.
 * </p>
 *
 * @see javax.swing.undo.CannotRedoException class javax.swing.undo.CannotRedoException (the hereby targeted
 *      class-under-test class)
 * @see CannotRedoExceptionClassTests CannotRedoExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CannotRedoExceptionTests<SUT extends javax.swing.undo.CannotRedoException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
