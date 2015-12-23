package org.j8unit.repository.java.time.temporal;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.time.temporal.TemporalQueries class
 * java.time.temporal.TemporalQueries}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.time.temporal.TemporalQueriesTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.time.temporal.TemporalQueriesClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.time.temporal.TemporalQueries
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TemporalQueriesTests<SUT extends java.time.temporal.TemporalQueries>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
