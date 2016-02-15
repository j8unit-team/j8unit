package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.SecretKey interface javax.crypto.SecretKey}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SecretKeyClassTests}.
 * </p>
 *
 * @see javax.crypto.SecretKey interface javax.crypto.SecretKey (the hereby targeted class-under-test class)
 * @see SecretKeyClassTests SecretKeyClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SecretKeyTests<SUT extends javax.crypto.SecretKey>
extends org.j8unit.repository.java.security.KeyTests<SUT>, org.j8unit.repository.javax.security.auth.DestroyableTests<SUT> {

}
