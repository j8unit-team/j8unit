package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.JMRuntimeException class
 * javax.management.JMRuntimeException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link JMRuntimeExceptionClassTests}.
 * </p>
 *
 * @see javax.management.JMRuntimeException class javax.management.JMRuntimeException (the hereby targeted
 *      class-under-test class)
 * @see JMRuntimeExceptionClassTests JMRuntimeExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JMRuntimeExceptionTests<SUT extends javax.management.JMRuntimeException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
