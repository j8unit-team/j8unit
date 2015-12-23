package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.AuthenticationException class
 * javax.naming.AuthenticationException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.AuthenticationExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.AuthenticationExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.AuthenticationException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AuthenticationExceptionTests<SUT extends javax.naming.AuthenticationException>
extends org.j8unit.repository.javax.naming.NamingSecurityExceptionTests<SUT> {

}
