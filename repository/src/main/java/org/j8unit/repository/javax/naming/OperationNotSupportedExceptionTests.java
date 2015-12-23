package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.OperationNotSupportedException class
 * javax.naming.OperationNotSupportedException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.naming.OperationNotSupportedExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.OperationNotSupportedExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.OperationNotSupportedException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OperationNotSupportedExceptionTests<SUT extends javax.naming.OperationNotSupportedException>
extends org.j8unit.repository.javax.naming.NamingExceptionTests<SUT> {

}
