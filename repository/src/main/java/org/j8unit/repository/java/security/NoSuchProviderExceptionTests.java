package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.NoSuchProviderException class
 * java.security.NoSuchProviderException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.NoSuchProviderExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.NoSuchProviderExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.NoSuchProviderException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NoSuchProviderExceptionTests<SUT extends java.security.NoSuchProviderException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

}
