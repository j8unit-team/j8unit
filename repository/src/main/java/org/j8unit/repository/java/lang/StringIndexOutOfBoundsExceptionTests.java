package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain StringIndexOutOfBoundsException class
 * java.lang.StringIndexOutOfBoundsException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link StringIndexOutOfBoundsExceptionClassTests}.
 * </p>
 *
 * @see StringIndexOutOfBoundsException class java.lang.StringIndexOutOfBoundsException (the hereby targeted
 *      class-under-test class)
 * @see StringIndexOutOfBoundsExceptionClassTests StringIndexOutOfBoundsExceptionClassTests (the complementary j8unit
 *      test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StringIndexOutOfBoundsExceptionTests<SUT extends StringIndexOutOfBoundsException>
extends IndexOutOfBoundsExceptionTests<SUT> {

}
