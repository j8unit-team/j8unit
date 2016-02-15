package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableInterceptor.ClientRequestInterceptor interface
 * org.omg.PortableInterceptor.ClientRequestInterceptor}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link ClientRequestInterceptorClassTests}.
 * </p>
 *
 * @see org.omg.PortableInterceptor.ClientRequestInterceptor interface
 *      org.omg.PortableInterceptor.ClientRequestInterceptor (the hereby targeted class-under-test class)
 * @see ClientRequestInterceptorClassTests ClientRequestInterceptorClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClientRequestInterceptorTests<SUT extends org.omg.PortableInterceptor.ClientRequestInterceptor>
extends ClientRequestInterceptorOperationsTests<SUT>, InterceptorTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
