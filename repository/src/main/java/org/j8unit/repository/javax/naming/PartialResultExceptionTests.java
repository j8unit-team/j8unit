package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.PartialResultException class
 * javax.naming.PartialResultException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.PartialResultExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.PartialResultExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.PartialResultException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PartialResultExceptionTests<SUT extends javax.naming.PartialResultException>
extends org.j8unit.repository.javax.naming.NamingExceptionTests<SUT> {

}
