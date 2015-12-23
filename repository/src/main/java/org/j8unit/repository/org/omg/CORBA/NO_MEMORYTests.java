package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.NO_MEMORY class org.omg.CORBA.NO_MEMORY}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.NO_MEMORYTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.NO_MEMORYClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.NO_MEMORY
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NO_MEMORYTests<SUT extends org.omg.CORBA.NO_MEMORY>
extends org.j8unit.repository.org.omg.CORBA.SystemExceptionTests<SUT> {

}
