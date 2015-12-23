package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.PublicKey interface java.security.PublicKey}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.PublicKeyTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.PublicKeyClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.PublicKey
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PublicKeyTests<SUT extends java.security.PublicKey>
extends org.j8unit.repository.java.security.KeyTests<SUT> {

}
