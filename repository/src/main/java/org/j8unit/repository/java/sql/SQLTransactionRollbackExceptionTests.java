package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.sql.SQLTransactionRollbackException class
 * java.sql.SQLTransactionRollbackException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.sql.SQLTransactionRollbackExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.sql.SQLTransactionRollbackExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.sql.SQLTransactionRollbackException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SQLTransactionRollbackExceptionTests<SUT extends java.sql.SQLTransactionRollbackException>
extends org.j8unit.repository.java.sql.SQLTransientExceptionTests<SUT> {

}
