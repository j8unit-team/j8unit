package org.j8unit.repository.java.time.temporal;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.time.temporal.UnsupportedTemporalTypeException class
 * java.time.temporal.UnsupportedTemporalTypeException}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.time.temporal.UnsupportedTemporalTypeExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.time.temporal.UnsupportedTemporalTypeExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.time.temporal.UnsupportedTemporalTypeException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnsupportedTemporalTypeExceptionTests<SUT extends java.time.temporal.UnsupportedTemporalTypeException>
extends org.j8unit.repository.java.time.DateTimeExceptionTests<SUT> {

}
