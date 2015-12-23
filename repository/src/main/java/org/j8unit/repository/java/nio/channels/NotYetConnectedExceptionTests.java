package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.channels.NotYetConnectedException class
 * java.nio.channels.NotYetConnectedException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.nio.channels.NotYetConnectedExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.channels.NotYetConnectedExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.channels.NotYetConnectedException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NotYetConnectedExceptionTests<SUT extends java.nio.channels.NotYetConnectedException>
extends org.j8unit.repository.java.lang.IllegalStateExceptionTests<SUT> {

}
