package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.EmptyStackException class java.util.EmptyStackException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link EmptyStackExceptionClassTests}.
 * </p>
 *
 * @see java.util.EmptyStackException class java.util.EmptyStackException (the hereby targeted class-under-test class)
 * @see EmptyStackExceptionClassTests EmptyStackExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EmptyStackExceptionTests<SUT extends java.util.EmptyStackException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
