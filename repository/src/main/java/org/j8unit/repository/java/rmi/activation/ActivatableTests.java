package org.j8unit.repository.java.rmi.activation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.activation.Activatable class java.rmi.activation.Activatable}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link ActivatableClassTests}.
 * </p>
 *
 * @see java.rmi.activation.Activatable class java.rmi.activation.Activatable (the hereby targeted class-under-test
 *      class)
 * @see ActivatableClassTests ActivatableClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActivatableTests<SUT extends java.rmi.activation.Activatable>
extends org.j8unit.repository.java.rmi.server.RemoteServerTests<SUT> {

}
