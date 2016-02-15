package org.j8unit.repository.javax.lang.model;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.UnknownEntityException class
 * javax.lang.model.UnknownEntityException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link UnknownEntityExceptionClassTests}.
 * </p>
 *
 * @see javax.lang.model.UnknownEntityException class javax.lang.model.UnknownEntityException (the hereby targeted
 *      class-under-test class)
 * @see UnknownEntityExceptionClassTests UnknownEntityExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnknownEntityExceptionTests<SUT extends javax.lang.model.UnknownEntityException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
