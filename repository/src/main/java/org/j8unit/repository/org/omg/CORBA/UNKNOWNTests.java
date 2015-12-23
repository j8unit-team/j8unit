package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.UNKNOWN class org.omg.CORBA.UNKNOWN}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.org.omg.CORBA.UNKNOWNTests}
 * .
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.UNKNOWNClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.UNKNOWN
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UNKNOWNTests<SUT extends org.omg.CORBA.UNKNOWN>
extends org.j8unit.repository.org.omg.CORBA.SystemExceptionTests<SUT> {

}
