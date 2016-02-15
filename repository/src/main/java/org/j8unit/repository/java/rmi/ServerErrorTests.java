package org.j8unit.repository.java.rmi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.ServerError class java.rmi.ServerError}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link ServerErrorClassTests}.
 * </p>
 *
 * @see java.rmi.ServerError class java.rmi.ServerError (the hereby targeted class-under-test class)
 * @see ServerErrorClassTests ServerErrorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServerErrorTests<SUT extends java.rmi.ServerError>
extends RemoteExceptionTests<SUT> {

}
