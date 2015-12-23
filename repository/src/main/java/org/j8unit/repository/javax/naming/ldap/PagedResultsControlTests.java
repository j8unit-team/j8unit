package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.ldap.PagedResultsControl class
 * javax.naming.ldap.PagedResultsControl}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.ldap.PagedResultsControlTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.ldap.PagedResultsControlClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.ldap.PagedResultsControl
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PagedResultsControlTests<SUT extends javax.naming.ldap.PagedResultsControl>
extends org.j8unit.repository.javax.naming.ldap.BasicControlTests<SUT> {

}
