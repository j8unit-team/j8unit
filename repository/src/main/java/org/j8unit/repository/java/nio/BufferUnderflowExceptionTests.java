package org.j8unit.repository.java.nio;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.BufferUnderflowException class
 * java.nio.BufferUnderflowException}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.BufferUnderflowExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.BufferUnderflowExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.BufferUnderflowException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BufferUnderflowExceptionTests<SUT extends java.nio.BufferUnderflowException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
