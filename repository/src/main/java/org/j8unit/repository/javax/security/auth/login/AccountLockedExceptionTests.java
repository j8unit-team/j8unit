package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.login.AccountLockedException class
 * javax.security.auth.login.AccountLockedException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link AccountLockedExceptionClassTests}.
 * </p>
 *
 * @see javax.security.auth.login.AccountLockedException class javax.security.auth.login.AccountLockedException (the
 *      hereby targeted class-under-test class)
 * @see AccountLockedExceptionClassTests AccountLockedExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccountLockedExceptionTests<SUT extends javax.security.auth.login.AccountLockedException>
extends AccountExceptionTests<SUT> {

}
