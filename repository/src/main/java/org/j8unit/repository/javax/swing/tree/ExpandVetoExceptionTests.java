package org.j8unit.repository.javax.swing.tree;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.tree.ExpandVetoException class
 * javax.swing.tree.ExpandVetoException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ExpandVetoExceptionClassTests}.
 * </p>
 *
 * @see javax.swing.tree.ExpandVetoException class javax.swing.tree.ExpandVetoException (the hereby targeted
 *      class-under-test class)
 * @see ExpandVetoExceptionClassTests ExpandVetoExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExpandVetoExceptionTests<SUT extends javax.swing.tree.ExpandVetoException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
