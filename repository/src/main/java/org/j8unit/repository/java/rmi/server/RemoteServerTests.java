package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.rmi.server.RemoteServer class java.rmi.server.RemoteServer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.rmi.server.RemoteServerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.rmi.server.RemoteServerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.rmi.server.RemoteServer
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RemoteServerTests<SUT extends java.rmi.server.RemoteServer>
extends org.j8unit.repository.java.rmi.server.RemoteObjectTests<SUT> {

}
