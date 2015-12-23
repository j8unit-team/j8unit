package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.crypto.SecretKey interface javax.crypto.SecretKey}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.crypto.SecretKeyTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.crypto.SecretKeyClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.crypto.SecretKey
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SecretKeyTests<SUT extends javax.crypto.SecretKey>
extends org.j8unit.repository.java.security.KeyTests<SUT>, org.j8unit.repository.javax.security.auth.DestroyableTests<SUT> {

}
