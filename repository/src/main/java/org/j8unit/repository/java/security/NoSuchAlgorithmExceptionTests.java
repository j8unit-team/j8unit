package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.NoSuchAlgorithmException class
 * java.security.NoSuchAlgorithmException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.NoSuchAlgorithmExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.NoSuchAlgorithmExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.NoSuchAlgorithmException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NoSuchAlgorithmExceptionTests<SUT extends java.security.NoSuchAlgorithmException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

}
