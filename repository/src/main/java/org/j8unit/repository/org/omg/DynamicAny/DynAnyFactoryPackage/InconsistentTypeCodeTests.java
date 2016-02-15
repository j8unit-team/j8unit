package org.j8unit.repository.org.omg.DynamicAny.DynAnyFactoryPackage;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode class
 * org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode}. The complementary j8unit test interface containing the
 * class relevant aspects is {@link InconsistentTypeCodeClassTests}.
 * </p>
 *
 * @see org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode class
 *      org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode (the hereby targeted class-under-test class)
 * @see InconsistentTypeCodeClassTests InconsistentTypeCodeClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InconsistentTypeCodeTests<SUT extends org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode>
extends org.j8unit.repository.org.omg.CORBA.UserExceptionTests<SUT> {

}
