package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.DynamicAny.DynUnionHelper class org.omg.DynamicAny.DynUnionHelper}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link DynUnionHelperClassTests}.
 * </p>
 *
 * @see org.omg.DynamicAny.DynUnionHelper class org.omg.DynamicAny.DynUnionHelper (the hereby targeted class-under-test
 *      class)
 * @see DynUnionHelperClassTests DynUnionHelperClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynUnionHelperTests<SUT extends org.omg.DynamicAny.DynUnionHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
