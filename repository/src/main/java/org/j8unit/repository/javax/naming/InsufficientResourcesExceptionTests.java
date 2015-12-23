package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.InsufficientResourcesException class
 * javax.naming.InsufficientResourcesException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.naming.InsufficientResourcesExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.InsufficientResourcesExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.InsufficientResourcesException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InsufficientResourcesExceptionTests<SUT extends javax.naming.InsufficientResourcesException>
extends org.j8unit.repository.javax.naming.NamingExceptionTests<SUT> {

}
