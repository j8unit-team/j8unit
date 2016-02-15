package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.server.SkeletonMismatchException class
 * java.rmi.server.SkeletonMismatchException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SkeletonMismatchExceptionClassTests}.
 * </p>
 *
 * @see java.rmi.server.SkeletonMismatchException class java.rmi.server.SkeletonMismatchException (the hereby targeted
 *      class-under-test class)
 * @see SkeletonMismatchExceptionClassTests SkeletonMismatchExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SkeletonMismatchExceptionTests<SUT extends java.rmi.server.SkeletonMismatchException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
