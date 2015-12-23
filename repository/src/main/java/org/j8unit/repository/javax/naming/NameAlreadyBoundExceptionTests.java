package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.NameAlreadyBoundException class
 * javax.naming.NameAlreadyBoundException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.NameAlreadyBoundExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.NameAlreadyBoundExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.NameAlreadyBoundException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NameAlreadyBoundExceptionTests<SUT extends javax.naming.NameAlreadyBoundException>
extends org.j8unit.repository.javax.naming.NamingExceptionTests<SUT> {

}
