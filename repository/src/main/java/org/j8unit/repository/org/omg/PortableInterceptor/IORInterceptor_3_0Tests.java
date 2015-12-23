package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableInterceptor.IORInterceptor_3_0 interface
 * org.omg.PortableInterceptor.IORInterceptor_3_0}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptor_3_0Tests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptor_3_0ClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableInterceptor.IORInterceptor_3_0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IORInterceptor_3_0Tests<SUT extends org.omg.PortableInterceptor.IORInterceptor_3_0>
extends org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptor_3_0OperationsTests<SUT>,
org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptorTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
