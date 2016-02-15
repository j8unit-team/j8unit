package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CosNaming.NamingContextExt interface
 * org.omg.CosNaming.NamingContextExt}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link NamingContextExtClassTests}.
 * </p>
 *
 * @see org.omg.CosNaming.NamingContextExt interface org.omg.CosNaming.NamingContextExt (the hereby targeted
 *      class-under-test class)
 * @see NamingContextExtClassTests NamingContextExtClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NamingContextExtTests<SUT extends org.omg.CosNaming.NamingContextExt>
extends NamingContextExtOperationsTests<SUT>, NamingContextTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
