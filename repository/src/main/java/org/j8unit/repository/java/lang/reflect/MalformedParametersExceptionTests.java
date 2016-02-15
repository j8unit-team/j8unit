package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.reflect.MalformedParametersException class
 * java.lang.reflect.MalformedParametersException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link MalformedParametersExceptionClassTests}.
 * </p>
 *
 * @see java.lang.reflect.MalformedParametersException class java.lang.reflect.MalformedParametersException (the hereby
 *      targeted class-under-test class)
 * @see MalformedParametersExceptionClassTests MalformedParametersExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MalformedParametersExceptionTests<SUT extends java.lang.reflect.MalformedParametersException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
