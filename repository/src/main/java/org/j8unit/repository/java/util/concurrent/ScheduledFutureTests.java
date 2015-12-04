package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.concurrent.ScheduledFuture interface java.util.concurrent.ScheduledFuture},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.ScheduledFutureClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ScheduledFutureTests<SUT extends java.util.concurrent.ScheduledFuture<V>, V>
extends org.j8unit.repository.java.util.concurrent.DelayedTests<SUT>, org.j8unit.repository.java.util.concurrent.FutureTests<SUT, V> {

}
