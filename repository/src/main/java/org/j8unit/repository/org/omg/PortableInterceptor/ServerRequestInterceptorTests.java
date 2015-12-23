package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableInterceptor.ServerRequestInterceptor interface
 * org.omg.PortableInterceptor.ServerRequestInterceptor}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInterceptorTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInterceptorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableInterceptor.ServerRequestInterceptor
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServerRequestInterceptorTests<SUT extends org.omg.PortableInterceptor.ServerRequestInterceptor>
extends org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInterceptorOperationsTests<SUT>,
org.j8unit.repository.org.omg.PortableInterceptor.InterceptorTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
