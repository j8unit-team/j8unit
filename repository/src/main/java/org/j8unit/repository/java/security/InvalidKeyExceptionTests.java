package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.InvalidKeyException class
 * java.security.InvalidKeyException}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.InvalidKeyExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.InvalidKeyExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.InvalidKeyException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidKeyExceptionTests<SUT extends java.security.InvalidKeyException>
extends org.j8unit.repository.java.security.KeyExceptionTests<SUT> {

}
