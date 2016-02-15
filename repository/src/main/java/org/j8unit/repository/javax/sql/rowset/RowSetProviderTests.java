package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.RowSetProvider class javax.sql.rowset.RowSetProvider}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link RowSetProviderClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.RowSetProvider class javax.sql.rowset.RowSetProvider (the hereby targeted class-under-test
 *      class)
 * @see RowSetProviderClassTests RowSetProviderClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RowSetProviderTests<SUT extends javax.sql.rowset.RowSetProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
