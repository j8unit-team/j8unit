package org.j8unit.repository.javax.transaction.xa;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.transaction.xa.XAException class
 * javax.transaction.xa.XAException}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.transaction.xa.XAExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.transaction.xa.XAExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.transaction.xa.XAException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XAExceptionTests<SUT extends javax.transaction.xa.XAException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
