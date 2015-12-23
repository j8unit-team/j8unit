package org.j8unit.repository.java.rmi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.rmi.StubNotFoundException class java.rmi.StubNotFoundException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.rmi.StubNotFoundExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.rmi.StubNotFoundExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.rmi.StubNotFoundException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StubNotFoundExceptionTests<SUT extends java.rmi.StubNotFoundException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
