package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.DynamicAny.DynArray interface org.omg.DynamicAny.DynArray}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DynArrayClassTests}.
 * </p>
 *
 * @see org.omg.DynamicAny.DynArray interface org.omg.DynamicAny.DynArray (the hereby targeted class-under-test class)
 * @see DynArrayClassTests DynArrayClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynArrayTests<SUT extends org.omg.DynamicAny.DynArray>
extends DynArrayOperationsTests<SUT>, DynAnyTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
