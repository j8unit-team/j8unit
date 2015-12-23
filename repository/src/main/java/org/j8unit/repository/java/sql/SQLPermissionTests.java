package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.sql.SQLPermission class java.sql.SQLPermission}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.sql.SQLPermissionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.sql.SQLPermissionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.sql.SQLPermission
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SQLPermissionTests<SUT extends java.sql.SQLPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

}
