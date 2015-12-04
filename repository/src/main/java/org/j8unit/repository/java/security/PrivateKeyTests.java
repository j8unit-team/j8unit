package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.PrivateKey interface java.security.PrivateKey}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.PrivateKeyClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrivateKeyTests<SUT extends java.security.PrivateKey>
extends org.j8unit.repository.java.security.KeyTests<SUT>, org.j8unit.repository.javax.security.auth.DestroyableTests<SUT> {

}
