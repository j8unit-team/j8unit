package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.IllegalFormatException class java.util.IllegalFormatException}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link IllegalFormatExceptionClassTests}.
 * </p>
 *
 * @see java.util.IllegalFormatException class java.util.IllegalFormatException (the hereby targeted class-under-test
 *      class)
 * @see IllegalFormatExceptionClassTests IllegalFormatExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IllegalFormatExceptionTests<SUT extends java.util.IllegalFormatException>
extends org.j8unit.repository.java.lang.IllegalArgumentExceptionTests<SUT> {

}
