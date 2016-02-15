package org.j8unit.repository.java.lang.instrument;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.instrument.UnmodifiableClassException class
 * java.lang.instrument.UnmodifiableClassException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link UnmodifiableClassExceptionClassTests}.
 * </p>
 *
 * @see java.lang.instrument.UnmodifiableClassException class java.lang.instrument.UnmodifiableClassException (the
 *      hereby targeted class-under-test class)
 * @see UnmodifiableClassExceptionClassTests UnmodifiableClassExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnmodifiableClassExceptionTests<SUT extends java.lang.instrument.UnmodifiableClassException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
