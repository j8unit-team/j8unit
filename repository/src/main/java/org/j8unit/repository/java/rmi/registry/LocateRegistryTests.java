package org.j8unit.repository.java.rmi.registry;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.registry.LocateRegistry class java.rmi.registry.LocateRegistry}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link LocateRegistryClassTests}.
 * </p>
 *
 * @see java.rmi.registry.LocateRegistry class java.rmi.registry.LocateRegistry (the hereby targeted class-under-test
 *      class)
 * @see LocateRegistryClassTests LocateRegistryClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LocateRegistryTests<SUT extends java.rmi.registry.LocateRegistry>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
