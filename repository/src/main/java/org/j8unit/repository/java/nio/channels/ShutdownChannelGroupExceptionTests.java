package org.j8unit.repository.java.nio.channels;

import java.nio.channels.ShutdownChannelGroupException;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.IllegalStateExceptionTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link ShutdownChannelGroupException public class java.nio.channels.ShutdownChannelGroupException}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.nio.channels.ShutdownChannelGroupExceptionClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ShutdownChannelGroupExceptionTests<SUT extends ShutdownChannelGroupException>
extends IllegalStateExceptionTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.ShutdownChannelGroupException]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.ShutdownChannelGroupException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.ShutdownChannelGroupException]

}
