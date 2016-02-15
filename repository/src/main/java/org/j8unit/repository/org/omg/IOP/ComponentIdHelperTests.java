package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.IOP.ComponentIdHelper class org.omg.IOP.ComponentIdHelper}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ComponentIdHelperClassTests}.
 * </p>
 *
 * @see org.omg.IOP.ComponentIdHelper class org.omg.IOP.ComponentIdHelper (the hereby targeted class-under-test class)
 * @see ComponentIdHelperClassTests ComponentIdHelperClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ComponentIdHelperTests<SUT extends org.omg.IOP.ComponentIdHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
