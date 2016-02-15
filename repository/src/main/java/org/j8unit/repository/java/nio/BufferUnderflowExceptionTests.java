package org.j8unit.repository.java.nio;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.BufferUnderflowException class java.nio.BufferUnderflowException}
 * . The complementary j8unit test interface containing the class relevant aspects is
 * {@link BufferUnderflowExceptionClassTests}.
 * </p>
 *
 * @see java.nio.BufferUnderflowException class java.nio.BufferUnderflowException (the hereby targeted class-under-test
 *      class)
 * @see BufferUnderflowExceptionClassTests BufferUnderflowExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BufferUnderflowExceptionTests<SUT extends java.nio.BufferUnderflowException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
