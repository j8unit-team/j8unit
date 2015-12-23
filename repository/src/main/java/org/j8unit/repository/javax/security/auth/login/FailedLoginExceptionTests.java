package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.security.auth.login.FailedLoginException class
 * javax.security.auth.login.FailedLoginException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.security.auth.login.FailedLoginExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.security.auth.login.FailedLoginExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.security.auth.login.FailedLoginException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FailedLoginExceptionTests<SUT extends javax.security.auth.login.FailedLoginException>
extends org.j8unit.repository.javax.security.auth.login.LoginExceptionTests<SUT> {

}
