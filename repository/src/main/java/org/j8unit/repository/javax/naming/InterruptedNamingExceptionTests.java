package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.InterruptedNamingException class
 * javax.naming.InterruptedNamingException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link InterruptedNamingExceptionClassTests}.
 * </p>
 *
 * @see javax.naming.InterruptedNamingException class javax.naming.InterruptedNamingException (the hereby targeted
 *      class-under-test class)
 * @see InterruptedNamingExceptionClassTests InterruptedNamingExceptionClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InterruptedNamingExceptionTests<SUT extends javax.naming.InterruptedNamingException>
extends NamingExceptionTests<SUT> {

}
