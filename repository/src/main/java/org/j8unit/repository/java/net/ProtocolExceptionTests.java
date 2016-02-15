package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.net.ProtocolException class java.net.ProtocolException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ProtocolExceptionClassTests}.
 * </p>
 *
 * @see java.net.ProtocolException class java.net.ProtocolException (the hereby targeted class-under-test class)
 * @see ProtocolExceptionClassTests ProtocolExceptionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ProtocolExceptionTests<SUT extends java.net.ProtocolException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

}
