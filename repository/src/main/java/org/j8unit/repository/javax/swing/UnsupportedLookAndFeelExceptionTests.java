package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.UnsupportedLookAndFeelException class
 * javax.swing.UnsupportedLookAndFeelException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link UnsupportedLookAndFeelExceptionClassTests}.
 * </p>
 *
 * @see javax.swing.UnsupportedLookAndFeelException class javax.swing.UnsupportedLookAndFeelException (the hereby
 *      targeted class-under-test class)
 * @see UnsupportedLookAndFeelExceptionClassTests UnsupportedLookAndFeelExceptionClassTests (the complementary j8unit
 *      test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnsupportedLookAndFeelExceptionTests<SUT extends javax.swing.UnsupportedLookAndFeelException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
