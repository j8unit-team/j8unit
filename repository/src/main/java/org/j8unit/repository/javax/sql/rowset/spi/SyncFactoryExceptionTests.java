package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.spi.SyncFactoryException class
 * javax.sql.rowset.spi.SyncFactoryException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SyncFactoryExceptionClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.spi.SyncFactoryException class javax.sql.rowset.spi.SyncFactoryException (the hereby targeted
 *      class-under-test class)
 * @see SyncFactoryExceptionClassTests SyncFactoryExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SyncFactoryExceptionTests<SUT extends javax.sql.rowset.spi.SyncFactoryException>
extends org.j8unit.repository.java.sql.SQLExceptionTests<SUT> {

}
