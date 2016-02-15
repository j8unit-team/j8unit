package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.IdUniquenessPolicy interface
 * org.omg.PortableServer.IdUniquenessPolicy}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link IdUniquenessPolicyClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.IdUniquenessPolicy interface org.omg.PortableServer.IdUniquenessPolicy (the hereby
 *      targeted class-under-test class)
 * @see IdUniquenessPolicyClassTests IdUniquenessPolicyClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IdUniquenessPolicyTests<SUT extends org.omg.PortableServer.IdUniquenessPolicy>
extends IdUniquenessPolicyOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.PolicyTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
