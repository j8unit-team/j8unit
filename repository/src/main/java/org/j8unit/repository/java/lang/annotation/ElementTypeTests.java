package org.j8unit.repository.java.lang.annotation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.annotation.ElementType class java.lang.annotation.ElementType}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link ElementTypeClassTests}.
 * </p>
 *
 * @see java.lang.annotation.ElementType class java.lang.annotation.ElementType (the hereby targeted class-under-test
 *      class)
 * @see ElementTypeClassTests ElementTypeClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ElementTypeTests<SUT extends java.lang.annotation.ElementType>
extends org.j8unit.repository.java.lang.EnumTests<SUT, java.lang.annotation.ElementType> {

}
