package org.j8unit.repository.java.rmi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.AlreadyBoundException class java.rmi.AlreadyBoundException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link AlreadyBoundExceptionClassTests}.
 * </p>
 *
 * @see java.rmi.AlreadyBoundException class java.rmi.AlreadyBoundException (the hereby targeted class-under-test class)
 * @see AlreadyBoundExceptionClassTests AlreadyBoundExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AlreadyBoundExceptionTests<SUT extends java.rmi.AlreadyBoundException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
