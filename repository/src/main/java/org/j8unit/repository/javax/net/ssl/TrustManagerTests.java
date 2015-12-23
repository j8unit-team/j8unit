package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.net.ssl.TrustManager interface javax.net.ssl.TrustManager},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.net.ssl.TrustManagerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.net.ssl.TrustManagerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.net.ssl.TrustManager
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TrustManagerTests<SUT extends javax.net.ssl.TrustManager>
extends RepositoryTests<SUT> {

}
