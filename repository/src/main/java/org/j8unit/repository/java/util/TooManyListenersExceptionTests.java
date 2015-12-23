package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.TooManyListenersException class
 * java.util.TooManyListenersException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.TooManyListenersExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.TooManyListenersExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.TooManyListenersException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TooManyListenersExceptionTests<SUT extends java.util.TooManyListenersException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
