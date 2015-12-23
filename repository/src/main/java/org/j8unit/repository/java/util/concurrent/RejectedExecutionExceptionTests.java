package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.concurrent.RejectedExecutionException class
 * java.util.concurrent.RejectedExecutionException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.util.concurrent.RejectedExecutionExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.concurrent.RejectedExecutionExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.concurrent.RejectedExecutionException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RejectedExecutionExceptionTests<SUT extends java.util.concurrent.RejectedExecutionException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
