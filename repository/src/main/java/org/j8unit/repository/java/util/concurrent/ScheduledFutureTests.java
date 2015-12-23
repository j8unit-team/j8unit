package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.concurrent.ScheduledFuture interface
 * java.util.concurrent.ScheduledFuture}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.concurrent.ScheduledFutureTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.concurrent.ScheduledFutureClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.concurrent.ScheduledFuture
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ScheduledFutureTests<SUT extends java.util.concurrent.ScheduledFuture<V>, V>
extends org.j8unit.repository.java.util.concurrent.DelayedTests<SUT>, org.j8unit.repository.java.util.concurrent.FutureTests<SUT, V> {

}
