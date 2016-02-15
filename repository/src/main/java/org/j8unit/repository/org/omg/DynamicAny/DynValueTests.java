package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.DynamicAny.DynValue interface org.omg.DynamicAny.DynValue}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DynValueClassTests}.
 * </p>
 *
 * @see org.omg.DynamicAny.DynValue interface org.omg.DynamicAny.DynValue (the hereby targeted class-under-test class)
 * @see DynValueClassTests DynValueClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynValueTests<SUT extends org.omg.DynamicAny.DynValue>
extends DynValueOperationsTests<SUT>, DynValueCommonTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
