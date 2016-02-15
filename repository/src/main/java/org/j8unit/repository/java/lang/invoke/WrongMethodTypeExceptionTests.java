package org.j8unit.repository.java.lang.invoke;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.invoke.WrongMethodTypeException class
 * java.lang.invoke.WrongMethodTypeException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link WrongMethodTypeExceptionClassTests}.
 * </p>
 *
 * @see java.lang.invoke.WrongMethodTypeException class java.lang.invoke.WrongMethodTypeException (the hereby targeted
 *      class-under-test class)
 * @see WrongMethodTypeExceptionClassTests WrongMethodTypeExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WrongMethodTypeExceptionTests<SUT extends java.lang.invoke.WrongMethodTypeException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
