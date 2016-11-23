package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RemoteStub;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link RemoteStub
 * public abstract class java.rmi.server.RemoteStub}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.rmi.server.RemoteStubClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
@SuppressWarnings("deprecation")
public abstract interface RemoteStubTests<SUT extends RemoteStub>
extends RemoteObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.RemoteStub]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.RemoteStub]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.RemoteStub]

}
