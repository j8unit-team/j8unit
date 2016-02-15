package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.reflect.Array class java.lang.reflect.Array}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ArrayClassTests}.
 * </p>
 *
 * @see java.lang.reflect.Array class java.lang.reflect.Array (the hereby targeted class-under-test class)
 * @see ArrayClassTests ArrayClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ArrayTests<SUT extends java.lang.reflect.Array>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
