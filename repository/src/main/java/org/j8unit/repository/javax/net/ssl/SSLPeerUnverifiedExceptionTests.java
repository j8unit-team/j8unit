package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.net.ssl.SSLPeerUnverifiedException class
 * javax.net.ssl.SSLPeerUnverifiedException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.net.ssl.SSLPeerUnverifiedExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.net.ssl.SSLPeerUnverifiedExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.net.ssl.SSLPeerUnverifiedException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SSLPeerUnverifiedExceptionTests<SUT extends javax.net.ssl.SSLPeerUnverifiedException>
extends org.j8unit.repository.javax.net.ssl.SSLExceptionTests<SUT> {

}
