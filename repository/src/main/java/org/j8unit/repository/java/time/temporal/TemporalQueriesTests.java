package org.j8unit.repository.java.time.temporal;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.temporal.TemporalQueries class
 * java.time.temporal.TemporalQueries}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link TemporalQueriesClassTests}.
 * </p>
 *
 * @see java.time.temporal.TemporalQueries class java.time.temporal.TemporalQueries (the hereby targeted
 *      class-under-test class)
 * @see TemporalQueriesClassTests TemporalQueriesClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TemporalQueriesTests<SUT extends java.time.temporal.TemporalQueries>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
