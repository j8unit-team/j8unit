package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.InvalidApplicationException class
 * javax.management.InvalidApplicationException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link InvalidApplicationExceptionClassTests}.
 * </p>
 *
 * @see javax.management.InvalidApplicationException class javax.management.InvalidApplicationException (the hereby
 *      targeted class-under-test class)
 * @see InvalidApplicationExceptionClassTests InvalidApplicationExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidApplicationExceptionTests<SUT extends javax.management.InvalidApplicationException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
