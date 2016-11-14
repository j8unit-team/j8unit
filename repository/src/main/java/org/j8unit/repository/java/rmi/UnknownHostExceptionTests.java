package org.j8unit.repository.java.rmi;

import java.rmi.UnknownHostException;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link UnknownHostException public class java.rmi.UnknownHostException}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.rmi.UnknownHostExceptionClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnknownHostExceptionTests<SUT extends UnknownHostException>
extends RemoteExceptionTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.UnknownHostException]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.UnknownHostException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.UnknownHostException]

}
