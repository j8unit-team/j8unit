package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.DynamicAny.DynAnyHelper class org.omg.DynamicAny.DynAnyHelper}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.DynamicAny.DynAnyHelperTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.DynamicAny.DynAnyHelperClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.DynamicAny.DynAnyHelper
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynAnyHelperTests<SUT extends org.omg.DynamicAny.DynAnyHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
