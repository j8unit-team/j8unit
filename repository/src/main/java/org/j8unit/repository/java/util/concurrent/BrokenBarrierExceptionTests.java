package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.concurrent.BrokenBarrierException class
 * java.util.concurrent.BrokenBarrierException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.util.concurrent.BrokenBarrierExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.concurrent.BrokenBarrierExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.concurrent.BrokenBarrierException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BrokenBarrierExceptionTests<SUT extends java.util.concurrent.BrokenBarrierException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
