package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.POA interface org.omg.PortableServer.POA}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link POAClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.POA interface org.omg.PortableServer.POA (the hereby targeted class-under-test class)
 * @see POAClassTests POAClassTests (the complementary j8unit test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface POATests<SUT extends org.omg.PortableServer.POA>
extends POAOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
