package org.j8unit.repository.javax.transaction;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.transaction.TransactionRolledbackException class
 * javax.transaction.TransactionRolledbackException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link TransactionRolledbackExceptionClassTests}.
 * </p>
 *
 * @see javax.transaction.TransactionRolledbackException class javax.transaction.TransactionRolledbackException (the
 *      hereby targeted class-under-test class)
 * @see TransactionRolledbackExceptionClassTests TransactionRolledbackExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransactionRolledbackExceptionTests<SUT extends javax.transaction.TransactionRolledbackException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
