package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.concurrent.CancellationException class
 * java.util.concurrent.CancellationException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.util.concurrent.CancellationExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.concurrent.CancellationExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.concurrent.CancellationException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CancellationExceptionTests<SUT extends java.util.concurrent.CancellationException>
extends org.j8unit.repository.java.lang.IllegalStateExceptionTests<SUT> {

}
