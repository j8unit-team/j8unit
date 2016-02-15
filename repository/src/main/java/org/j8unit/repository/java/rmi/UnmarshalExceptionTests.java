package org.j8unit.repository.java.rmi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.UnmarshalException class java.rmi.UnmarshalException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link UnmarshalExceptionClassTests}.
 * </p>
 *
 * @see java.rmi.UnmarshalException class java.rmi.UnmarshalException (the hereby targeted class-under-test class)
 * @see UnmarshalExceptionClassTests UnmarshalExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnmarshalExceptionTests<SUT extends java.rmi.UnmarshalException>
extends RemoteExceptionTests<SUT> {

}
