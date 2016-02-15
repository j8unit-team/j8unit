package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.login.CredentialException class
 * javax.security.auth.login.CredentialException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CredentialExceptionClassTests}.
 * </p>
 *
 * @see javax.security.auth.login.CredentialException class javax.security.auth.login.CredentialException (the hereby
 *      targeted class-under-test class)
 * @see CredentialExceptionClassTests CredentialExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CredentialExceptionTests<SUT extends javax.security.auth.login.CredentialException>
extends LoginExceptionTests<SUT> {

}
