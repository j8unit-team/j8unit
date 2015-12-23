package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.net.ssl.KeyManagerFactorySpi class
 * javax.net.ssl.KeyManagerFactorySpi}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.net.ssl.KeyManagerFactorySpiTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.net.ssl.KeyManagerFactorySpiClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.net.ssl.KeyManagerFactorySpi
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeyManagerFactorySpiTests<SUT extends javax.net.ssl.KeyManagerFactorySpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
