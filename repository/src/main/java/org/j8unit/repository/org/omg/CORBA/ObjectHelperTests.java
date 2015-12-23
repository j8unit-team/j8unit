package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.ObjectHelper class org.omg.CORBA.ObjectHelper},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.ObjectHelperTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.ObjectHelperClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.ObjectHelper
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectHelperTests<SUT extends org.omg.CORBA.ObjectHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
