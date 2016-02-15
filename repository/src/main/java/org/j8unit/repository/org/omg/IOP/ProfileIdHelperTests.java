package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.IOP.ProfileIdHelper class org.omg.IOP.ProfileIdHelper}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ProfileIdHelperClassTests}.
 * </p>
 *
 * @see org.omg.IOP.ProfileIdHelper class org.omg.IOP.ProfileIdHelper (the hereby targeted class-under-test class)
 * @see ProfileIdHelperClassTests ProfileIdHelperClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ProfileIdHelperTests<SUT extends org.omg.IOP.ProfileIdHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
