package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.server.RemoteServer class java.rmi.server.RemoteServer}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link RemoteServerClassTests}.
 * </p>
 *
 * @see java.rmi.server.RemoteServer class java.rmi.server.RemoteServer (the hereby targeted class-under-test class)
 * @see RemoteServerClassTests RemoteServerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RemoteServerTests<SUT extends java.rmi.server.RemoteServer>
extends RemoteObjectTests<SUT> {

}
