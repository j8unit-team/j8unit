package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CosNaming.BindingTypeHelper class
 * org.omg.CosNaming.BindingTypeHelper}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link BindingTypeHelperClassTests}.
 * </p>
 *
 * @see org.omg.CosNaming.BindingTypeHelper class org.omg.CosNaming.BindingTypeHelper (the hereby targeted
 *      class-under-test class)
 * @see BindingTypeHelperClassTests BindingTypeHelperClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BindingTypeHelperTests<SUT extends org.omg.CosNaming.BindingTypeHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
