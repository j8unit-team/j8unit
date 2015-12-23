package org.j8unit.repository.javax.management.loading;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.loading.PrivateClassLoader interface
 * javax.management.loading.PrivateClassLoader}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.management.loading.PrivateClassLoaderTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.loading.PrivateClassLoaderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.loading.PrivateClassLoader
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrivateClassLoaderTests<SUT extends javax.management.loading.PrivateClassLoader>
extends RepositoryTests<SUT> {

}
