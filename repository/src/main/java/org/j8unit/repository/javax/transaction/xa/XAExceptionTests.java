package org.j8unit.repository.javax.transaction.xa;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.transaction.xa.XAException class javax.transaction.xa.XAException}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link XAExceptionClassTests}.
 * </p>
 *
 * @see javax.transaction.xa.XAException class javax.transaction.xa.XAException (the hereby targeted class-under-test
 *      class)
 * @see XAExceptionClassTests XAExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XAExceptionTests<SUT extends javax.transaction.xa.XAException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
