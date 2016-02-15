package org.j8unit.repository.javax.transaction;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.transaction.TransactionRequiredException class
 * javax.transaction.TransactionRequiredException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link TransactionRequiredExceptionClassTests}.
 * </p>
 *
 * @see javax.transaction.TransactionRequiredException class javax.transaction.TransactionRequiredException (the hereby
 *      targeted class-under-test class)
 * @see TransactionRequiredExceptionClassTests TransactionRequiredExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransactionRequiredExceptionTests<SUT extends javax.transaction.TransactionRequiredException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
