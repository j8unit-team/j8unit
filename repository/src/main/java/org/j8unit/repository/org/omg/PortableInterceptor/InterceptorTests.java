package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableInterceptor.Interceptor interface
 * org.omg.PortableInterceptor.Interceptor}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.InterceptorTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableInterceptor.InterceptorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableInterceptor.Interceptor
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InterceptorTests<SUT extends org.omg.PortableInterceptor.Interceptor>
extends org.j8unit.repository.org.omg.PortableInterceptor.InterceptorOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
