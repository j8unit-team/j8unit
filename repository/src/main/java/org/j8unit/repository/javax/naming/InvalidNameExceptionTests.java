package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.InvalidNameException class
 * javax.naming.InvalidNameException}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.InvalidNameExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.InvalidNameExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.InvalidNameException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidNameExceptionTests<SUT extends javax.naming.InvalidNameException>
extends org.j8unit.repository.javax.naming.NamingExceptionTests<SUT> {

}
