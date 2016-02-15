package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.sql.SQLTransientConnectionException class
 * java.sql.SQLTransientConnectionException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SQLTransientConnectionExceptionClassTests}.
 * </p>
 *
 * @see java.sql.SQLTransientConnectionException class java.sql.SQLTransientConnectionException (the hereby targeted
 *      class-under-test class)
 * @see SQLTransientConnectionExceptionClassTests SQLTransientConnectionExceptionClassTests (the complementary j8unit
 *      test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SQLTransientConnectionExceptionTests<SUT extends java.sql.SQLTransientConnectionException>
extends SQLTransientExceptionTests<SUT> {

}
