package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.TimeoutException class
 * java.util.concurrent.TimeoutException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link TimeoutExceptionClassTests}.
 * </p>
 *
 * @see java.util.concurrent.TimeoutException class java.util.concurrent.TimeoutException (the hereby targeted
 *      class-under-test class)
 * @see TimeoutExceptionClassTests TimeoutExceptionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TimeoutExceptionTests<SUT extends java.util.concurrent.TimeoutException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
