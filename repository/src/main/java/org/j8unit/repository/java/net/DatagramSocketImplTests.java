package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.net.DatagramSocketImpl class java.net.DatagramSocketImpl}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DatagramSocketImplClassTests}.
 * </p>
 *
 * @see java.net.DatagramSocketImpl class java.net.DatagramSocketImpl (the hereby targeted class-under-test class)
 * @see DatagramSocketImplClassTests DatagramSocketImplClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DatagramSocketImplTests<SUT extends java.net.DatagramSocketImpl>
extends SocketOptionsTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
