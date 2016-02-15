package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.DynamicAny.DynStruct interface org.omg.DynamicAny.DynStruct}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DynStructClassTests}.
 * </p>
 *
 * @see org.omg.DynamicAny.DynStruct interface org.omg.DynamicAny.DynStruct (the hereby targeted class-under-test class)
 * @see DynStructClassTests DynStructClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynStructTests<SUT extends org.omg.DynamicAny.DynStruct>
extends DynStructOperationsTests<SUT>, DynAnyTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
