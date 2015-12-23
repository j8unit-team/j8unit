package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.net.ssl.SSLContextSpi class javax.net.ssl.SSLContextSpi},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.net.ssl.SSLContextSpiTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.net.ssl.SSLContextSpiClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.net.ssl.SSLContextSpi
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SSLContextSpiTests<SUT extends javax.net.ssl.SSLContextSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
