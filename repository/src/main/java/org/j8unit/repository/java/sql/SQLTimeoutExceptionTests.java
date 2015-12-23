package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.sql.SQLTimeoutException class java.sql.SQLTimeoutException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.sql.SQLTimeoutExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.sql.SQLTimeoutExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.sql.SQLTimeoutException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SQLTimeoutExceptionTests<SUT extends java.sql.SQLTimeoutException>
extends org.j8unit.repository.java.sql.SQLTransientExceptionTests<SUT> {

}
