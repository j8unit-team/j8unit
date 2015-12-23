package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.DynamicAny.DynArray interface org.omg.DynamicAny.DynArray},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.DynamicAny.DynArrayTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.DynamicAny.DynArrayClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.DynamicAny.DynArray
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynArrayTests<SUT extends org.omg.DynamicAny.DynArray>
extends org.j8unit.repository.org.omg.DynamicAny.DynArrayOperationsTests<SUT>, org.j8unit.repository.org.omg.DynamicAny.DynAnyTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
