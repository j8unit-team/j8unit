package org.j8unit.repository.javax.transaction;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.transaction.TransactionRolledbackException class
 * javax.transaction.TransactionRolledbackException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.transaction.TransactionRolledbackExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.transaction.TransactionRolledbackExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.transaction.TransactionRolledbackException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransactionRolledbackExceptionTests<SUT extends javax.transaction.TransactionRolledbackException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
