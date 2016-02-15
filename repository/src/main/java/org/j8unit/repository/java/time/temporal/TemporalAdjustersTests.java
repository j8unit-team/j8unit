package org.j8unit.repository.java.time.temporal;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.temporal.TemporalAdjusters class
 * java.time.temporal.TemporalAdjusters}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link TemporalAdjustersClassTests}.
 * </p>
 *
 * @see java.time.temporal.TemporalAdjusters class java.time.temporal.TemporalAdjusters (the hereby targeted
 *      class-under-test class)
 * @see TemporalAdjustersClassTests TemporalAdjustersClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TemporalAdjustersTests<SUT extends java.time.temporal.TemporalAdjusters>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
