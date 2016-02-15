package org.j8unit.repository.org.w3c.dom.ranges;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.ranges.RangeException class org.w3c.dom.ranges.RangeException}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link RangeExceptionClassTests}.
 * </p>
 *
 * @see org.w3c.dom.ranges.RangeException class org.w3c.dom.ranges.RangeException (the hereby targeted class-under-test
 *      class)
 * @see RangeExceptionClassTests RangeExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RangeExceptionTests<SUT extends org.w3c.dom.ranges.RangeException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
