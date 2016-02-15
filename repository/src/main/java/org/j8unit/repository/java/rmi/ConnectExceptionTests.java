package org.j8unit.repository.java.rmi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.ConnectException class java.rmi.ConnectException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ConnectExceptionClassTests}.
 * </p>
 *
 * @see java.rmi.ConnectException class java.rmi.ConnectException (the hereby targeted class-under-test class)
 * @see ConnectExceptionClassTests ConnectExceptionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConnectExceptionTests<SUT extends java.rmi.ConnectException>
extends RemoteExceptionTests<SUT> {

}
