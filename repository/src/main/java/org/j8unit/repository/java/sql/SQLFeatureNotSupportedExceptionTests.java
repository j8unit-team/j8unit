package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.sql.SQLFeatureNotSupportedException class
 * java.sql.SQLFeatureNotSupportedException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.sql.SQLFeatureNotSupportedExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.sql.SQLFeatureNotSupportedExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.sql.SQLFeatureNotSupportedException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SQLFeatureNotSupportedExceptionTests<SUT extends java.sql.SQLFeatureNotSupportedException>
extends org.j8unit.repository.java.sql.SQLNonTransientExceptionTests<SUT> {

}
