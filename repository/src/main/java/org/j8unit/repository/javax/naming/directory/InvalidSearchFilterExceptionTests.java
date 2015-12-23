package org.j8unit.repository.javax.naming.directory;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.directory.InvalidSearchFilterException class
 * javax.naming.directory.InvalidSearchFilterException}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.naming.directory.InvalidSearchFilterExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.directory.InvalidSearchFilterExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.directory.InvalidSearchFilterException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidSearchFilterExceptionTests<SUT extends javax.naming.directory.InvalidSearchFilterException>
extends org.j8unit.repository.javax.naming.NamingExceptionTests<SUT> {

}
