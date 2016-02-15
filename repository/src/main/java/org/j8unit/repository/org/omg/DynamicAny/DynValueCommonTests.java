package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.DynamicAny.DynValueCommon interface
 * org.omg.DynamicAny.DynValueCommon}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link DynValueCommonClassTests}.
 * </p>
 *
 * @see org.omg.DynamicAny.DynValueCommon interface org.omg.DynamicAny.DynValueCommon (the hereby targeted
 *      class-under-test class)
 * @see DynValueCommonClassTests DynValueCommonClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynValueCommonTests<SUT extends org.omg.DynamicAny.DynValueCommon>
extends DynValueCommonOperationsTests<SUT>, DynAnyTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
