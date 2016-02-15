package org.j8unit.repository.javax.rmi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.rmi.PortableRemoteObject class javax.rmi.PortableRemoteObject}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PortableRemoteObjectClassTests}.
 * </p>
 *
 * @see javax.rmi.PortableRemoteObject class javax.rmi.PortableRemoteObject (the hereby targeted class-under-test class)
 * @see PortableRemoteObjectClassTests PortableRemoteObjectClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PortableRemoteObjectTests<SUT extends javax.rmi.PortableRemoteObject>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
