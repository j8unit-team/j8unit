package org.j8unit.repository.java.rmi.activation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.rmi.activation.ActivateFailedException class
 * java.rmi.activation.ActivateFailedException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.rmi.activation.ActivateFailedExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.rmi.activation.ActivateFailedExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.rmi.activation.ActivateFailedException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActivateFailedExceptionTests<SUT extends java.rmi.activation.ActivateFailedException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
