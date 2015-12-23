package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CosNaming.NamingContextExt interface
 * org.omg.CosNaming.NamingContextExt}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CosNaming.NamingContextExtTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CosNaming.NamingContextExtClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CosNaming.NamingContextExt
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamingContextExtTests<SUT extends org.omg.CosNaming.NamingContextExt>
extends org.j8unit.repository.org.omg.CosNaming.NamingContextExtOperationsTests<SUT>, org.j8unit.repository.org.omg.CosNaming.NamingContextTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
