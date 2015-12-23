package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.concurrent.ExecutionException class
 * java.util.concurrent.ExecutionException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.concurrent.ExecutionExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.concurrent.ExecutionExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.concurrent.ExecutionException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExecutionExceptionTests<SUT extends java.util.concurrent.ExecutionException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
