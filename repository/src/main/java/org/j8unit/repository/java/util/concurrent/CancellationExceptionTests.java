package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.CancellationException class
 * java.util.concurrent.CancellationException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CancellationExceptionClassTests}.
 * </p>
 *
 * @see java.util.concurrent.CancellationException class java.util.concurrent.CancellationException (the hereby targeted
 *      class-under-test class)
 * @see CancellationExceptionClassTests CancellationExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CancellationExceptionTests<SUT extends java.util.concurrent.CancellationException>
extends org.j8unit.repository.java.lang.IllegalStateExceptionTests<SUT> {

}
