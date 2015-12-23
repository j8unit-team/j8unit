package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableServer.ForwardRequest class
 * org.omg.PortableServer.ForwardRequest}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.PortableServer.ForwardRequestTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableServer.ForwardRequestClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableServer.ForwardRequest
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ForwardRequestTests<SUT extends org.omg.PortableServer.ForwardRequest>
extends org.j8unit.repository.org.omg.CORBA.UserExceptionTests<SUT> {

}
