package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.RejectedExecutionException class
 * java.util.concurrent.RejectedExecutionException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link RejectedExecutionExceptionClassTests}.
 * </p>
 *
 * @see java.util.concurrent.RejectedExecutionException class java.util.concurrent.RejectedExecutionException (the
 *      hereby targeted class-under-test class)
 * @see RejectedExecutionExceptionClassTests RejectedExecutionExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RejectedExecutionExceptionTests<SUT extends java.util.concurrent.RejectedExecutionException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
