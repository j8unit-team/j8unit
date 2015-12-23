package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sql.rowset.spi.SyncFactory class
 * javax.sql.rowset.spi.SyncFactory}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sql.rowset.spi.SyncFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sql.rowset.spi.SyncFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sql.rowset.spi.SyncFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SyncFactoryTests<SUT extends javax.sql.rowset.spi.SyncFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
