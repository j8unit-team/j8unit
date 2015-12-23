package org.j8unit.repository.java.rmi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.rmi.ConnectException class java.rmi.ConnectException}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.rmi.ConnectExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.rmi.ConnectExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.rmi.ConnectException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConnectExceptionTests<SUT extends java.rmi.ConnectException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
