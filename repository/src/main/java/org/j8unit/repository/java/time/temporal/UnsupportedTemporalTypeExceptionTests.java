package org.j8unit.repository.java.time.temporal;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.time.temporal.UnsupportedTemporalTypeException class
 * java.time.temporal.UnsupportedTemporalTypeException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link UnsupportedTemporalTypeExceptionClassTests}.
 * </p>
 *
 * @see java.time.temporal.UnsupportedTemporalTypeException class java.time.temporal.UnsupportedTemporalTypeException
 *      (the hereby targeted class-under-test class)
 * @see UnsupportedTemporalTypeExceptionClassTests UnsupportedTemporalTypeExceptionClassTests (the complementary j8unit
 *      test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnsupportedTemporalTypeExceptionTests<SUT extends java.time.temporal.UnsupportedTemporalTypeException>
extends org.j8unit.repository.java.time.DateTimeExceptionTests<SUT> {

}
