package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.sql.SQLSyntaxErrorException class java.sql.SQLSyntaxErrorException}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link SQLSyntaxErrorExceptionClassTests}.
 * </p>
 *
 * @see java.sql.SQLSyntaxErrorException class java.sql.SQLSyntaxErrorException (the hereby targeted class-under-test
 *      class)
 * @see SQLSyntaxErrorExceptionClassTests SQLSyntaxErrorExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SQLSyntaxErrorExceptionTests<SUT extends java.sql.SQLSyntaxErrorException>
extends SQLNonTransientExceptionTests<SUT> {

}
