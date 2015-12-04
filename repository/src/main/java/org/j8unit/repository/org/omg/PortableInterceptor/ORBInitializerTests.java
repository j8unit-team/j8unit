package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.ORBInitializer interface
 * org.omg.PortableInterceptor.ORBInitializer}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableInterceptor.ORBInitializerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ORBInitializerTests<SUT extends org.omg.PortableInterceptor.ORBInitializer>
extends org.j8unit.repository.org.omg.PortableInterceptor.ORBInitializerOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
