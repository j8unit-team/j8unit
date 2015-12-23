package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableServer.POAPackage.WrongAdapter class
 * org.omg.PortableServer.POAPackage.WrongAdapter}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.org.omg.PortableServer.POAPackage.WrongAdapterTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableServer.POAPackage.WrongAdapterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableServer.POAPackage.WrongAdapter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WrongAdapterTests<SUT extends org.omg.PortableServer.POAPackage.WrongAdapter>
extends org.j8unit.repository.org.omg.CORBA.UserExceptionTests<SUT> {

}
