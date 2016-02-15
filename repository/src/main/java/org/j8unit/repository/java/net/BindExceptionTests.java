package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.net.BindException class java.net.BindException}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link BindExceptionClassTests}.
 * </p>
 *
 * @see java.net.BindException class java.net.BindException (the hereby targeted class-under-test class)
 * @see BindExceptionClassTests BindExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BindExceptionTests<SUT extends java.net.BindException>
extends SocketExceptionTests<SUT> {

}
