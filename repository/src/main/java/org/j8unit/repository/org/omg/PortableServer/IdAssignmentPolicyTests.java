package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableServer.IdAssignmentPolicy interface
 * org.omg.PortableServer.IdAssignmentPolicy}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.PortableServer.IdAssignmentPolicyTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableServer.IdAssignmentPolicyClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableServer.IdAssignmentPolicy
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IdAssignmentPolicyTests<SUT extends org.omg.PortableServer.IdAssignmentPolicy>
extends org.j8unit.repository.org.omg.PortableServer.IdAssignmentPolicyOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.PolicyTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
