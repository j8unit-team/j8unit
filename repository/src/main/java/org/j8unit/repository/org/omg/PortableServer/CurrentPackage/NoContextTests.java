package org.j8unit.repository.org.omg.PortableServer.CurrentPackage;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.CurrentPackage.NoContext class
 * org.omg.PortableServer.CurrentPackage.NoContext}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link NoContextClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.CurrentPackage.NoContext class org.omg.PortableServer.CurrentPackage.NoContext (the
 *      hereby targeted class-under-test class)
 * @see NoContextClassTests NoContextClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NoContextTests<SUT extends org.omg.PortableServer.CurrentPackage.NoContext>
extends org.j8unit.repository.org.omg.CORBA.UserExceptionTests<SUT> {

}
