package org.j8unit.repository.java.rmi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.rmi.NoSuchObjectException class java.rmi.NoSuchObjectException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.rmi.NoSuchObjectExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.rmi.NoSuchObjectExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.rmi.NoSuchObjectException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NoSuchObjectExceptionTests<SUT extends java.rmi.NoSuchObjectException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
