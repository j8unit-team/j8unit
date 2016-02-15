package org.j8unit.repository.javax.naming.spi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.spi.DirectoryManager class javax.naming.spi.DirectoryManager}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link DirectoryManagerClassTests}
 * .
 * </p>
 *
 * @see javax.naming.spi.DirectoryManager class javax.naming.spi.DirectoryManager (the hereby targeted class-under-test
 *      class)
 * @see DirectoryManagerClassTests DirectoryManagerClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DirectoryManagerTests<SUT extends javax.naming.spi.DirectoryManager>
extends NamingManagerTests<SUT> {

}
