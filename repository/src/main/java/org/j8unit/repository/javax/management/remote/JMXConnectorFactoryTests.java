package org.j8unit.repository.javax.management.remote;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.remote.JMXConnectorFactory class
 * javax.management.remote.JMXConnectorFactory}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.management.remote.JMXConnectorFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.remote.JMXConnectorFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.remote.JMXConnectorFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JMXConnectorFactoryTests<SUT extends javax.management.remote.JMXConnectorFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
