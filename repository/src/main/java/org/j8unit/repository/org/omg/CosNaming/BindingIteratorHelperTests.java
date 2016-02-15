package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CosNaming.BindingIteratorHelper class
 * org.omg.CosNaming.BindingIteratorHelper}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link BindingIteratorHelperClassTests}.
 * </p>
 *
 * @see org.omg.CosNaming.BindingIteratorHelper class org.omg.CosNaming.BindingIteratorHelper (the hereby targeted
 *      class-under-test class)
 * @see BindingIteratorHelperClassTests BindingIteratorHelperClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BindingIteratorHelperTests<SUT extends org.omg.CosNaming.BindingIteratorHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
