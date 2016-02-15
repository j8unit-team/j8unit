package org.j8unit.repository.java.lang.management;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.management.ManagementFactory class
 * java.lang.management.ManagementFactory}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ManagementFactoryClassTests}.
 * </p>
 *
 * @see java.lang.management.ManagementFactory class java.lang.management.ManagementFactory (the hereby targeted
 *      class-under-test class)
 * @see ManagementFactoryClassTests ManagementFactoryClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ManagementFactoryTests<SUT extends java.lang.management.ManagementFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
