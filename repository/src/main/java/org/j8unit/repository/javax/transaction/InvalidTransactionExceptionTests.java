package org.j8unit.repository.javax.transaction;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.transaction.InvalidTransactionException class
 * javax.transaction.InvalidTransactionException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.transaction.InvalidTransactionExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.transaction.InvalidTransactionExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.transaction.InvalidTransactionException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidTransactionExceptionTests<SUT extends javax.transaction.InvalidTransactionException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
