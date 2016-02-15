package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.AttributeNotFoundException class
 * javax.management.AttributeNotFoundException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AttributeNotFoundExceptionClassTests}.
 * </p>
 *
 * @see javax.management.AttributeNotFoundException class javax.management.AttributeNotFoundException (the hereby
 *      targeted class-under-test class)
 * @see AttributeNotFoundExceptionClassTests AttributeNotFoundExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AttributeNotFoundExceptionTests<SUT extends javax.management.AttributeNotFoundException>
extends OperationsExceptionTests<SUT> {

}
