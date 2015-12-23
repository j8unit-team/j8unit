package org.j8unit.repository.java.time.temporal;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.time.temporal.TemporalAdjusters class
 * java.time.temporal.TemporalAdjusters}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.time.temporal.TemporalAdjustersTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.time.temporal.TemporalAdjustersClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.time.temporal.TemporalAdjusters
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TemporalAdjustersTests<SUT extends java.time.temporal.TemporalAdjusters>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
