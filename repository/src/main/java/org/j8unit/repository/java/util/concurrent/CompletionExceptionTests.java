package org.j8unit.repository.java.util.concurrent;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.concurrent.CompletionException class
 * java.util.concurrent.CompletionException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CompletionExceptionClassTests}.
 * </p>
 *
 * @see java.util.concurrent.CompletionException class java.util.concurrent.CompletionException (the hereby targeted
 *      class-under-test class)
 * @see CompletionExceptionClassTests CompletionExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CompletionExceptionTests<SUT extends java.util.concurrent.CompletionException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
