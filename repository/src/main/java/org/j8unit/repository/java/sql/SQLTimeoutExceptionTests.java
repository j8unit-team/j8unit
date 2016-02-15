package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.sql.SQLTimeoutException class java.sql.SQLTimeoutException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SQLTimeoutExceptionClassTests}.
 * </p>
 *
 * @see java.sql.SQLTimeoutException class java.sql.SQLTimeoutException (the hereby targeted class-under-test class)
 * @see SQLTimeoutExceptionClassTests SQLTimeoutExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SQLTimeoutExceptionTests<SUT extends java.sql.SQLTimeoutException>
extends SQLTransientExceptionTests<SUT> {

}
