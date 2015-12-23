package org.j8unit.repository.java.rmi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.rmi.UnexpectedException class java.rmi.UnexpectedException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.rmi.UnexpectedExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.rmi.UnexpectedExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.rmi.UnexpectedException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnexpectedExceptionTests<SUT extends java.rmi.UnexpectedException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
