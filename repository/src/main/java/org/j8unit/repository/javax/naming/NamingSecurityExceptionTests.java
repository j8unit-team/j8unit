package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.NamingSecurityException class
 * javax.naming.NamingSecurityException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link NamingSecurityExceptionClassTests}.
 * </p>
 *
 * @see javax.naming.NamingSecurityException class javax.naming.NamingSecurityException (the hereby targeted
 *      class-under-test class)
 * @see NamingSecurityExceptionClassTests NamingSecurityExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamingSecurityExceptionTests<SUT extends javax.naming.NamingSecurityException>
extends NamingExceptionTests<SUT> {

}
