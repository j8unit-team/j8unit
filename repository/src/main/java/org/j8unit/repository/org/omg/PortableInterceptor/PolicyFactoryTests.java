package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableInterceptor.PolicyFactory interface
 * org.omg.PortableInterceptor.PolicyFactory}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.PolicyFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableInterceptor.PolicyFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableInterceptor.PolicyFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PolicyFactoryTests<SUT extends org.omg.PortableInterceptor.PolicyFactory>
extends org.j8unit.repository.org.omg.PortableInterceptor.PolicyFactoryOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
