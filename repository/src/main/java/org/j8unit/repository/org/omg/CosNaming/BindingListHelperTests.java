package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CosNaming.BindingListHelper class
 * org.omg.CosNaming.BindingListHelper}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link BindingListHelperClassTests}.
 * </p>
 *
 * @see org.omg.CosNaming.BindingListHelper class org.omg.CosNaming.BindingListHelper (the hereby targeted
 *      class-under-test class)
 * @see BindingListHelperClassTests BindingListHelperClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BindingListHelperTests<SUT extends org.omg.CosNaming.BindingListHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
