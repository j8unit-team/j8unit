package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.MBeanServerFactory class
 * javax.management.MBeanServerFactory}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.management.MBeanServerFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.MBeanServerFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.MBeanServerFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MBeanServerFactoryTests<SUT extends javax.management.MBeanServerFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
