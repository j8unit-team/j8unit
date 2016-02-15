package org.j8unit.repository.java.rmi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.ConnectIOException class java.rmi.ConnectIOException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ConnectIOExceptionClassTests}.
 * </p>
 *
 * @see java.rmi.ConnectIOException class java.rmi.ConnectIOException (the hereby targeted class-under-test class)
 * @see ConnectIOExceptionClassTests ConnectIOExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConnectIOExceptionTests<SUT extends java.rmi.ConnectIOException>
extends RemoteExceptionTests<SUT> {

}
