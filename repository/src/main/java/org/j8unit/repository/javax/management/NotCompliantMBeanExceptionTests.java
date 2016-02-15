package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.NotCompliantMBeanException class
 * javax.management.NotCompliantMBeanException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link NotCompliantMBeanExceptionClassTests}.
 * </p>
 *
 * @see javax.management.NotCompliantMBeanException class javax.management.NotCompliantMBeanException (the hereby
 *      targeted class-under-test class)
 * @see NotCompliantMBeanExceptionClassTests NotCompliantMBeanExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NotCompliantMBeanExceptionTests<SUT extends javax.management.NotCompliantMBeanException>
extends OperationsExceptionTests<SUT> {

}
