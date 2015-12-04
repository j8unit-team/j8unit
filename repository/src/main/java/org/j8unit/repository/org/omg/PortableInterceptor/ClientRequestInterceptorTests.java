package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.ClientRequestInterceptor interface
 * org.omg.PortableInterceptor.ClientRequestInterceptor}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableInterceptor.ClientRequestInterceptorClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClientRequestInterceptorTests<SUT extends org.omg.PortableInterceptor.ClientRequestInterceptor>
extends org.j8unit.repository.org.omg.PortableInterceptor.ClientRequestInterceptorOperationsTests<SUT>,
org.j8unit.repository.org.omg.PortableInterceptor.InterceptorTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
