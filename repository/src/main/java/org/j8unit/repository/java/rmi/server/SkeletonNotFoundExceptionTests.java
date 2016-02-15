package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.server.SkeletonNotFoundException class
 * java.rmi.server.SkeletonNotFoundException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SkeletonNotFoundExceptionClassTests}.
 * </p>
 *
 * @see java.rmi.server.SkeletonNotFoundException class java.rmi.server.SkeletonNotFoundException (the hereby targeted
 *      class-under-test class)
 * @see SkeletonNotFoundExceptionClassTests SkeletonNotFoundExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SkeletonNotFoundExceptionTests<SUT extends java.rmi.server.SkeletonNotFoundException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
