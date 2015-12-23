package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.NO_RESPONSE class org.omg.CORBA.NO_RESPONSE}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.NO_RESPONSETests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.NO_RESPONSEClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.NO_RESPONSE
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NO_RESPONSETests<SUT extends org.omg.CORBA.NO_RESPONSE>
extends org.j8unit.repository.org.omg.CORBA.SystemExceptionTests<SUT> {

}
