package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CosNaming.NameComponentHelper class
 * org.omg.CosNaming.NameComponentHelper}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link NameComponentHelperClassTests}.
 * </p>
 *
 * @see org.omg.CosNaming.NameComponentHelper class org.omg.CosNaming.NameComponentHelper (the hereby targeted
 *      class-under-test class)
 * @see NameComponentHelperClassTests NameComponentHelperClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NameComponentHelperTests<SUT extends org.omg.CosNaming.NameComponentHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
