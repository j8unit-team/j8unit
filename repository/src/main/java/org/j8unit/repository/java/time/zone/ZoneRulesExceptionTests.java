package org.j8unit.repository.java.time.zone;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.zone.ZoneRulesException class java.time.zone.ZoneRulesException}
 * . The complementary j8unit test interface containing the class relevant aspects is
 * {@link ZoneRulesExceptionClassTests}.
 * </p>
 *
 * @see java.time.zone.ZoneRulesException class java.time.zone.ZoneRulesException (the hereby targeted class-under-test
 *      class)
 * @see ZoneRulesExceptionClassTests ZoneRulesExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ZoneRulesExceptionTests<SUT extends java.time.zone.ZoneRulesException>
extends org.j8unit.repository.java.time.DateTimeExceptionTests<SUT> {

}
