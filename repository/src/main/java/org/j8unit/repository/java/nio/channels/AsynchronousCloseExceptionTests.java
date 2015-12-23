package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.channels.AsynchronousCloseException class
 * java.nio.channels.AsynchronousCloseException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.nio.channels.AsynchronousCloseExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.channels.AsynchronousCloseExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.channels.AsynchronousCloseException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AsynchronousCloseExceptionTests<SUT extends java.nio.channels.AsynchronousCloseException>
extends org.j8unit.repository.java.nio.channels.ClosedChannelExceptionTests<SUT> {

}
