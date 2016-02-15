package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.IOP.MultipleComponentProfileHelper class
 * org.omg.IOP.MultipleComponentProfileHelper}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MultipleComponentProfileHelperClassTests}.
 * </p>
 *
 * @see org.omg.IOP.MultipleComponentProfileHelper class org.omg.IOP.MultipleComponentProfileHelper (the hereby targeted
 *      class-under-test class)
 * @see MultipleComponentProfileHelperClassTests MultipleComponentProfileHelperClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MultipleComponentProfileHelperTests<SUT extends org.omg.IOP.MultipleComponentProfileHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
