package org.j8unit.repository.java.nio;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.BufferOverflowException class java.nio.BufferOverflowException}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link BufferOverflowExceptionClassTests}.
 * </p>
 *
 * @see java.nio.BufferOverflowException class java.nio.BufferOverflowException (the hereby targeted class-under-test
 *      class)
 * @see BufferOverflowExceptionClassTests BufferOverflowExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BufferOverflowExceptionTests<SUT extends java.nio.BufferOverflowException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
