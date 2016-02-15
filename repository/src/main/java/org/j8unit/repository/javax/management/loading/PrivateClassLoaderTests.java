package org.j8unit.repository.javax.management.loading;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.loading.PrivateClassLoader interface
 * javax.management.loading.PrivateClassLoader}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link PrivateClassLoaderClassTests}.
 * </p>
 *
 * @see javax.management.loading.PrivateClassLoader interface javax.management.loading.PrivateClassLoader (the hereby
 *      targeted class-under-test class)
 * @see PrivateClassLoaderClassTests PrivateClassLoaderClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrivateClassLoaderTests<SUT extends javax.management.loading.PrivateClassLoader>
extends RepositoryTests<SUT> {

}
