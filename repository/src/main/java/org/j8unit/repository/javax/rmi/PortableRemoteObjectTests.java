package org.j8unit.repository.javax.rmi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.rmi.PortableRemoteObject class javax.rmi.PortableRemoteObject},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.rmi.PortableRemoteObjectTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.rmi.PortableRemoteObjectClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.rmi.PortableRemoteObject
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PortableRemoteObjectTests<SUT extends javax.rmi.PortableRemoteObject>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
