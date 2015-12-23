package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.sql.SQLTransientException class java.sql.SQLTransientException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.sql.SQLTransientExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.sql.SQLTransientExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.sql.SQLTransientException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SQLTransientExceptionTests<SUT extends java.sql.SQLTransientException>
extends org.j8unit.repository.java.sql.SQLExceptionTests<SUT> {

}
