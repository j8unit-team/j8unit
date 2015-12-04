package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.SecureRandomSpi class java.security.SecureRandomSpi}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.SecureRandomSpiClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SecureRandomSpiTests<SUT extends java.security.SecureRandomSpi>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
