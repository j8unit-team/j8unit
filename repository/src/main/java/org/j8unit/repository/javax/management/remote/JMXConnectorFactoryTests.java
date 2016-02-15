package org.j8unit.repository.javax.management.remote;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.remote.JMXConnectorFactory class
 * javax.management.remote.JMXConnectorFactory}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link JMXConnectorFactoryClassTests}.
 * </p>
 *
 * @see javax.management.remote.JMXConnectorFactory class javax.management.remote.JMXConnectorFactory (the hereby
 *      targeted class-under-test class)
 * @see JMXConnectorFactoryClassTests JMXConnectorFactoryClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JMXConnectorFactoryTests<SUT extends javax.management.remote.JMXConnectorFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
