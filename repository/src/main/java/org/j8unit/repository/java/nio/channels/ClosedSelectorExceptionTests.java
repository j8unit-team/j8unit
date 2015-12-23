package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.channels.ClosedSelectorException class
 * java.nio.channels.ClosedSelectorException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.channels.ClosedSelectorExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.channels.ClosedSelectorExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.channels.ClosedSelectorException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClosedSelectorExceptionTests<SUT extends java.nio.channels.ClosedSelectorException>
extends org.j8unit.repository.java.lang.IllegalStateExceptionTests<SUT> {

}
