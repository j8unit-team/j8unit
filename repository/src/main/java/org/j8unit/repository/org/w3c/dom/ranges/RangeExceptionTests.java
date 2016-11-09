package org.j8unit.repository.org.w3c.dom.ranges;

import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.RuntimeExceptionTests;
import org.junit.experimental.categories.Category;
import org.w3c.dom.ranges.RangeException;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link RangeException
 * public class org.w3c.dom.ranges.RangeException}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link RangeExceptionClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RangeExceptionTests<SUT extends RangeException>
extends RuntimeExceptionTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.ranges.RangeException]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.ranges.RangeException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.ranges.RangeException]
}
