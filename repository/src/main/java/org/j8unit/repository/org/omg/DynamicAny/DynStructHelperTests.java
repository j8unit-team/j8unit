package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.DynamicAny.DynStructHelper class
 * org.omg.DynamicAny.DynStructHelper}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link DynStructHelperClassTests}.
 * </p>
 *
 * @see org.omg.DynamicAny.DynStructHelper class org.omg.DynamicAny.DynStructHelper (the hereby targeted
 *      class-under-test class)
 * @see DynStructHelperClassTests DynStructHelperClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynStructHelperTests<SUT extends org.omg.DynamicAny.DynStructHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
