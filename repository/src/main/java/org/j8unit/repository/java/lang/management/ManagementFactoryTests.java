package org.j8unit.repository.java.lang.management;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.management.ManagementFactory class
 * java.lang.management.ManagementFactory}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.lang.management.ManagementFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.management.ManagementFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.management.ManagementFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ManagementFactoryTests<SUT extends java.lang.management.ManagementFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
