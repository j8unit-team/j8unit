package org.j8unit.repository.javax.sql.rowset.spi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.spi.SyncFactory class javax.sql.rowset.spi.SyncFactory}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link SyncFactoryClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.spi.SyncFactory class javax.sql.rowset.spi.SyncFactory (the hereby targeted class-under-test
 *      class)
 * @see SyncFactoryClassTests SyncFactoryClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SyncFactoryTests<SUT extends javax.sql.rowset.spi.SyncFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
