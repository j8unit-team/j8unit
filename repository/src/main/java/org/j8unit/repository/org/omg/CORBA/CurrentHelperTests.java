package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.CurrentHelper class org.omg.CORBA.CurrentHelper},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.CurrentHelperTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.CurrentHelperClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.CurrentHelper
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CurrentHelperTests<SUT extends org.omg.CORBA.CurrentHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
