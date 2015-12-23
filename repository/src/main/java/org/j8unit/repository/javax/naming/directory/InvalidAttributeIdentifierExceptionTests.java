package org.j8unit.repository.javax.naming.directory;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.directory.InvalidAttributeIdentifierException class
 * javax.naming.directory.InvalidAttributeIdentifierException}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
 * class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.directory.InvalidAttributeIdentifierExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.directory.InvalidAttributeIdentifierExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.directory.InvalidAttributeIdentifierException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidAttributeIdentifierExceptionTests<SUT extends javax.naming.directory.InvalidAttributeIdentifierException>
extends org.j8unit.repository.javax.naming.NamingExceptionTests<SUT> {

}
