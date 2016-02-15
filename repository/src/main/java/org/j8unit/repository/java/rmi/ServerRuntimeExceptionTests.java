package org.j8unit.repository.java.rmi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.ServerRuntimeException class java.rmi.ServerRuntimeException}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link ServerRuntimeExceptionClassTests}.
 * </p>
 *
 * @see java.rmi.ServerRuntimeException class java.rmi.ServerRuntimeException (the hereby targeted class-under-test
 *      class)
 * @see ServerRuntimeExceptionClassTests ServerRuntimeExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServerRuntimeExceptionTests<SUT extends java.rmi.ServerRuntimeException>
extends RemoteExceptionTests<SUT> {

}
