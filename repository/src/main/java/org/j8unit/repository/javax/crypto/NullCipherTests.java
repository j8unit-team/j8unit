package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.NullCipher class javax.crypto.NullCipher}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link NullCipherClassTests}.
 * </p>
 *
 * @see javax.crypto.NullCipher class javax.crypto.NullCipher (the hereby targeted class-under-test class)
 * @see NullCipherClassTests NullCipherClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NullCipherTests<SUT extends javax.crypto.NullCipher>
extends CipherTests<SUT> {

}
