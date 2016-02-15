package org.j8unit.repository.java.nio;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.ReadOnlyBufferException class java.nio.ReadOnlyBufferException}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link ReadOnlyBufferExceptionClassTests}.
 * </p>
 *
 * @see java.nio.ReadOnlyBufferException class java.nio.ReadOnlyBufferException (the hereby targeted class-under-test
 *      class)
 * @see ReadOnlyBufferExceptionClassTests ReadOnlyBufferExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ReadOnlyBufferExceptionTests<SUT extends java.nio.ReadOnlyBufferException>
extends org.j8unit.repository.java.lang.UnsupportedOperationExceptionTests<SUT> {

}
