package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.sql.SQLIntegrityConstraintViolationException class
 * java.sql.SQLIntegrityConstraintViolationException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link SQLIntegrityConstraintViolationExceptionClassTests}.
 * </p>
 *
 * @see java.sql.SQLIntegrityConstraintViolationException class java.sql.SQLIntegrityConstraintViolationException (the
 *      hereby targeted class-under-test class)
 * @see SQLIntegrityConstraintViolationExceptionClassTests SQLIntegrityConstraintViolationExceptionClassTests (the
 *      complementary j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SQLIntegrityConstraintViolationExceptionTests<SUT extends java.sql.SQLIntegrityConstraintViolationException>
extends SQLNonTransientExceptionTests<SUT> {

}
