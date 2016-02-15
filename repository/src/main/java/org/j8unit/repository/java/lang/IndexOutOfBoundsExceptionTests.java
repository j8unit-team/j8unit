package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain IndexOutOfBoundsException class java.lang.IndexOutOfBoundsException}. The
 * complementary j8unit test interface containing the class relevant aspects is
 * {@link IndexOutOfBoundsExceptionClassTests}.
 * </p>
 *
 * @see IndexOutOfBoundsException class java.lang.IndexOutOfBoundsException (the hereby targeted class-under-test class)
 * @see IndexOutOfBoundsExceptionClassTests IndexOutOfBoundsExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IndexOutOfBoundsExceptionTests<SUT extends IndexOutOfBoundsException>
extends RuntimeExceptionTests<SUT> {

}
