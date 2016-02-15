package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.server.RemoteStub class java.rmi.server.RemoteStub}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link RemoteStubClassTests}.
 * </p>
 *
 * @see java.rmi.server.RemoteStub class java.rmi.server.RemoteStub (the hereby targeted class-under-test class)
 * @see RemoteStubClassTests RemoteStubClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RemoteStubTests<SUT extends java.rmi.server.RemoteStub>
extends RemoteObjectTests<SUT> {

}
