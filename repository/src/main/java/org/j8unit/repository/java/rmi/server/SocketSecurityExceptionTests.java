package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.server.SocketSecurityException class
 * java.rmi.server.SocketSecurityException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SocketSecurityExceptionClassTests}.
 * </p>
 *
 * @see java.rmi.server.SocketSecurityException class java.rmi.server.SocketSecurityException (the hereby targeted
 *      class-under-test class)
 * @see SocketSecurityExceptionClassTests SocketSecurityExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SocketSecurityExceptionTests<SUT extends java.rmi.server.SocketSecurityException>
extends ExportExceptionTests<SUT> {

}
