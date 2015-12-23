package org.j8unit.repository.javax.transaction;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.transaction.TransactionRequiredException class
 * javax.transaction.TransactionRequiredException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.transaction.TransactionRequiredExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.transaction.TransactionRequiredExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.transaction.TransactionRequiredException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransactionRequiredExceptionTests<SUT extends javax.transaction.TransactionRequiredException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
