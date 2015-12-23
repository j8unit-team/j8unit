package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.channels.ByteChannel interface java.nio.channels.ByteChannel}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.channels.ByteChannelTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.channels.ByteChannelClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.channels.ByteChannel
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ByteChannelTests<SUT extends java.nio.channels.ByteChannel>
extends org.j8unit.repository.java.nio.channels.ReadableByteChannelTests<SUT>, org.j8unit.repository.java.nio.channels.WritableByteChannelTests<SUT> {

}
