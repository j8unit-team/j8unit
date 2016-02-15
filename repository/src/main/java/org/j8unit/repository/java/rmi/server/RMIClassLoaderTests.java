package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.server.RMIClassLoader class java.rmi.server.RMIClassLoader}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link RMIClassLoaderClassTests}.
 * </p>
 *
 * @see java.rmi.server.RMIClassLoader class java.rmi.server.RMIClassLoader (the hereby targeted class-under-test class)
 * @see RMIClassLoaderClassTests RMIClassLoaderClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RMIClassLoaderTests<SUT extends java.rmi.server.RMIClassLoader>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
