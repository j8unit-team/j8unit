package org.j8unit.repository.java.rmi.activation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.rmi.activation.Activatable class java.rmi.activation.Activatable}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.rmi.activation.ActivatableTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.rmi.activation.ActivatableClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.rmi.activation.Activatable
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActivatableTests<SUT extends java.rmi.activation.Activatable>
extends org.j8unit.repository.java.rmi.server.RemoteServerTests<SUT> {

}
