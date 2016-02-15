package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.DynamicAny.FieldNameHelper class
 * org.omg.DynamicAny.FieldNameHelper}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link FieldNameHelperClassTests}.
 * </p>
 *
 * @see org.omg.DynamicAny.FieldNameHelper class org.omg.DynamicAny.FieldNameHelper (the hereby targeted
 *      class-under-test class)
 * @see FieldNameHelperClassTests FieldNameHelperClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FieldNameHelperTests<SUT extends org.omg.DynamicAny.FieldNameHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
