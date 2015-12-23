package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sql.rowset.RowSetProvider class javax.sql.rowset.RowSetProvider}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sql.rowset.RowSetProviderTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sql.rowset.RowSetProviderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sql.rowset.RowSetProvider
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RowSetProviderTests<SUT extends javax.sql.rowset.RowSetProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
