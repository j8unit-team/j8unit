package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.CommunicationException class
 * javax.naming.CommunicationException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link CommunicationExceptionClassTests}.
 * </p>
 *
 * @see javax.naming.CommunicationException class javax.naming.CommunicationException (the hereby targeted
 *      class-under-test class)
 * @see CommunicationExceptionClassTests CommunicationExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CommunicationExceptionTests<SUT extends javax.naming.CommunicationException>
extends NamingExceptionTests<SUT> {

}
