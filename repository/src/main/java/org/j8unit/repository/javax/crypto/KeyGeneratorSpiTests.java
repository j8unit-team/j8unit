package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.crypto.KeyGeneratorSpi class javax.crypto.KeyGeneratorSpi},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.crypto.KeyGeneratorSpiTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.crypto.KeyGeneratorSpiClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.crypto.KeyGeneratorSpi
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyGeneratorSpiTests<SUT extends javax.crypto.KeyGeneratorSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
