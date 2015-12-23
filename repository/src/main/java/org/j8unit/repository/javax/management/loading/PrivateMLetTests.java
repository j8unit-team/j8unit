package org.j8unit.repository.javax.management.loading;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.loading.PrivateMLet class
 * javax.management.loading.PrivateMLet}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.management.loading.PrivateMLetTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.loading.PrivateMLetClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.loading.PrivateMLet
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrivateMLetTests<SUT extends javax.management.loading.PrivateMLet>
extends org.j8unit.repository.javax.management.loading.PrivateClassLoaderTests<SUT>, org.j8unit.repository.javax.management.loading.MLetTests<SUT> {

}
