package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.ConfigurationException class
 * javax.naming.ConfigurationException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ConfigurationExceptionClassTests}.
 * </p>
 *
 * @see javax.naming.ConfigurationException class javax.naming.ConfigurationException (the hereby targeted
 *      class-under-test class)
 * @see ConfigurationExceptionClassTests ConfigurationExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ConfigurationExceptionTests<SUT extends javax.naming.ConfigurationException>
extends NamingExceptionTests<SUT> {

}
