package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.beans.Introspector class java.beans.Introspector}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link IntrospectorClassTests}.
 * </p>
 *
 * @see java.beans.Introspector class java.beans.Introspector (the hereby targeted class-under-test class)
 * @see IntrospectorClassTests IntrospectorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IntrospectorTests<SUT extends java.beans.Introspector>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
