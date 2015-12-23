package org.j8unit.repository.javax.naming.spi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.spi.DirectoryManager class
 * javax.naming.spi.DirectoryManager}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.spi.DirectoryManagerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.spi.DirectoryManagerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.spi.DirectoryManager
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DirectoryManagerTests<SUT extends javax.naming.spi.DirectoryManager>
extends org.j8unit.repository.javax.naming.spi.NamingManagerTests<SUT> {

}
