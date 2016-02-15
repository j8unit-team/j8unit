package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.channels.ClosedChannelException class
 * java.nio.channels.ClosedChannelException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ClosedChannelExceptionClassTests}.
 * </p>
 *
 * @see java.nio.channels.ClosedChannelException class java.nio.channels.ClosedChannelException (the hereby targeted
 *      class-under-test class)
 * @see ClosedChannelExceptionClassTests ClosedChannelExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClosedChannelExceptionTests<SUT extends java.nio.channels.ClosedChannelException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

}
