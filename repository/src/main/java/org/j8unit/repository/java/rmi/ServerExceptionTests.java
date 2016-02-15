package org.j8unit.repository.java.rmi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.ServerException class java.rmi.ServerException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ServerExceptionClassTests}.
 * </p>
 *
 * @see java.rmi.ServerException class java.rmi.ServerException (the hereby targeted class-under-test class)
 * @see ServerExceptionClassTests ServerExceptionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServerExceptionTests<SUT extends java.rmi.ServerException>
extends RemoteExceptionTests<SUT> {

}
