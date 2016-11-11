package org.j8unit.repository.java.rmi.server;

import java.rmi.server.SkeletonMismatchException;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.rmi.RemoteExceptionTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link SkeletonMismatchException public class java.rmi.server.SkeletonMismatchException}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.rmi.server.SkeletonMismatchExceptionClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SkeletonMismatchExceptionTests<SUT extends SkeletonMismatchException>
extends RemoteExceptionTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.SkeletonMismatchException]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.SkeletonMismatchException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.SkeletonMismatchException]

}
