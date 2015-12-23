package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.channels.Channels class java.nio.channels.Channels},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.channels.ChannelsTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.channels.ChannelsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.channels.Channels
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ChannelsTests<SUT extends java.nio.channels.Channels>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
