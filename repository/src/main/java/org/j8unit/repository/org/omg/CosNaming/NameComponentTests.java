package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CosNaming.NameComponent class org.omg.CosNaming.NameComponent}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link NameComponentClassTests}.
 * </p>
 *
 * @see org.omg.CosNaming.NameComponent class org.omg.CosNaming.NameComponent (the hereby targeted class-under-test
 *      class)
 * @see NameComponentClassTests NameComponentClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NameComponentTests<SUT extends org.omg.CosNaming.NameComponent>
extends org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
