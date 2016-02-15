package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.ConnectionPendingException class
 * java.nio.channels.ConnectionPendingException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ConnectionPendingExceptionClassTests}.
 * </p>
 *
 * @see java.nio.channels.ConnectionPendingException class java.nio.channels.ConnectionPendingException (the hereby
 *      targeted class-under-test class)
 * @see ConnectionPendingExceptionClassTests ConnectionPendingExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConnectionPendingExceptionTests<SUT extends java.nio.channels.ConnectionPendingException>
extends org.j8unit.repository.java.lang.IllegalStateExceptionTests<SUT> {

}
