package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.concurrent.TimeoutException class
 * java.util.concurrent.TimeoutException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.concurrent.TimeoutExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.concurrent.TimeoutExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.concurrent.TimeoutException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TimeoutExceptionTests<SUT extends java.util.concurrent.TimeoutException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
