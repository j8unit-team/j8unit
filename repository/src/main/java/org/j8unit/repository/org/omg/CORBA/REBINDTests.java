package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.REBIND class org.omg.CORBA.REBIND}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.org.omg.CORBA.REBINDTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.REBINDClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.REBIND
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface REBINDTests<SUT extends org.omg.CORBA.REBIND>
extends org.j8unit.repository.org.omg.CORBA.SystemExceptionTests<SUT> {

}
