package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableInterceptor.IORInfo interface
 * org.omg.PortableInterceptor.IORInfo}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link IORInfoClassTests}.
 * </p>
 *
 * @see org.omg.PortableInterceptor.IORInfo interface org.omg.PortableInterceptor.IORInfo (the hereby targeted
 *      class-under-test class)
 * @see IORInfoClassTests IORInfoClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IORInfoTests<SUT extends org.omg.PortableInterceptor.IORInfo>
extends IORInfoOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
