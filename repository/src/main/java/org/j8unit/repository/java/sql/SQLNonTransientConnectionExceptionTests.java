package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.sql.SQLNonTransientConnectionException class
 * java.sql.SQLNonTransientConnectionException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.sql.SQLNonTransientConnectionExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.sql.SQLNonTransientConnectionExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.sql.SQLNonTransientConnectionException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SQLNonTransientConnectionExceptionTests<SUT extends java.sql.SQLNonTransientConnectionException>
extends org.j8unit.repository.java.sql.SQLNonTransientExceptionTests<SUT> {

}
