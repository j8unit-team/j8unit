package org.j8unit.repository.java.rmi.registry;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.rmi.registry.LocateRegistry class
 * java.rmi.registry.LocateRegistry}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.rmi.registry.LocateRegistryTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.rmi.registry.LocateRegistryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.rmi.registry.LocateRegistry
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LocateRegistryTests<SUT extends java.rmi.registry.LocateRegistry>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
