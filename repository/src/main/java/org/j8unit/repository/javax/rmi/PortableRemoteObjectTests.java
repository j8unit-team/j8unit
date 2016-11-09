package org.j8unit.repository.javax.rmi;

import javax.rmi.PortableRemoteObject;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link PortableRemoteObject public class javax.rmi.PortableRemoteObject}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link PortableRemoteObjectClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PortableRemoteObjectTests<SUT extends PortableRemoteObject>
extends ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.rmi.PortableRemoteObject]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.rmi.PortableRemoteObject]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.rmi.PortableRemoteObject]
}
