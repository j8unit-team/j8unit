package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.ScheduledFuture interface
 * java.util.concurrent.ScheduledFuture}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ScheduledFutureClassTests}.
 * </p>
 *
 * @see java.util.concurrent.ScheduledFuture interface java.util.concurrent.ScheduledFuture (the hereby targeted
 *      class-under-test class)
 * @see ScheduledFutureClassTests ScheduledFutureClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ScheduledFutureTests<SUT extends java.util.concurrent.ScheduledFuture<V>, V>
extends DelayedTests<SUT>, FutureTests<SUT, V> {

}
