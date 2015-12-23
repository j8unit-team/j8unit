package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.DomainManager interface org.omg.CORBA.DomainManager},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.DomainManagerTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.DomainManagerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.DomainManager
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DomainManagerTests<SUT extends org.omg.CORBA.DomainManager>
extends org.j8unit.repository.org.omg.CORBA.DomainManagerOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
