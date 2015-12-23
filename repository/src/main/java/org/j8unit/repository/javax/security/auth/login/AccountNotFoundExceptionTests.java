package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.security.auth.login.AccountNotFoundException class
 * javax.security.auth.login.AccountNotFoundException}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.security.auth.login.AccountNotFoundExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.security.auth.login.AccountNotFoundExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.security.auth.login.AccountNotFoundException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccountNotFoundExceptionTests<SUT extends javax.security.auth.login.AccountNotFoundException>
extends org.j8unit.repository.javax.security.auth.login.AccountExceptionTests<SUT> {

}
