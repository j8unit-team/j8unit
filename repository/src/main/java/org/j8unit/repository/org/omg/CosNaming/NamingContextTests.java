package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CosNaming.NamingContext interface
 * org.omg.CosNaming.NamingContext}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CosNaming.NamingContextTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CosNaming.NamingContextClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CosNaming.NamingContext
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamingContextTests<SUT extends org.omg.CosNaming.NamingContext>
extends org.j8unit.repository.org.omg.CosNaming.NamingContextOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
