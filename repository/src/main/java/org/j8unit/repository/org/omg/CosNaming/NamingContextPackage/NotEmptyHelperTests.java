package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CosNaming.NamingContextPackage.NotEmptyHelper class
 * org.omg.CosNaming.NamingContextPackage.NotEmptyHelper}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link NotEmptyHelperClassTests}.
 * </p>
 *
 * @see org.omg.CosNaming.NamingContextPackage.NotEmptyHelper class
 *      org.omg.CosNaming.NamingContextPackage.NotEmptyHelper (the hereby targeted class-under-test class)
 * @see NotEmptyHelperClassTests NotEmptyHelperClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NotEmptyHelperTests<SUT extends org.omg.CosNaming.NamingContextPackage.NotEmptyHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
