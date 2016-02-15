package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.net.SocketTimeoutException class java.net.SocketTimeoutException}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link SocketTimeoutExceptionClassTests}.
 * </p>
 *
 * @see java.net.SocketTimeoutException class java.net.SocketTimeoutException (the hereby targeted class-under-test
 *      class)
 * @see SocketTimeoutExceptionClassTests SocketTimeoutExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SocketTimeoutExceptionTests<SUT extends java.net.SocketTimeoutException>
extends org.j8unit.repository.java.io.InterruptedIOExceptionTests<SUT> {

}
