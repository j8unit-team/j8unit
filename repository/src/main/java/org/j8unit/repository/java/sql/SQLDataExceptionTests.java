package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.sql.SQLDataException class java.sql.SQLDataException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SQLDataExceptionClassTests}.
 * </p>
 *
 * @see java.sql.SQLDataException class java.sql.SQLDataException (the hereby targeted class-under-test class)
 * @see SQLDataExceptionClassTests SQLDataExceptionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SQLDataExceptionTests<SUT extends java.sql.SQLDataException>
extends SQLNonTransientExceptionTests<SUT> {

}
