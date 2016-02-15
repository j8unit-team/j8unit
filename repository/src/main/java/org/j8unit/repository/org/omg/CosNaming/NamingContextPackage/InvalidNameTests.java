package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CosNaming.NamingContextPackage.InvalidName class
 * org.omg.CosNaming.NamingContextPackage.InvalidName}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link InvalidNameClassTests}.
 * </p>
 *
 * @see org.omg.CosNaming.NamingContextPackage.InvalidName class org.omg.CosNaming.NamingContextPackage.InvalidName (the
 *      hereby targeted class-under-test class)
 * @see InvalidNameClassTests InvalidNameClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidNameTests<SUT extends org.omg.CosNaming.NamingContextPackage.InvalidName>
extends org.j8unit.repository.org.omg.CORBA.UserExceptionTests<SUT> {

}
