package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.portable.IDLEntity interface
 * org.omg.CORBA.portable.IDLEntity}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link IDLEntityClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.portable.IDLEntity interface org.omg.CORBA.portable.IDLEntity (the hereby targeted
 *      class-under-test class)
 * @see IDLEntityClassTests IDLEntityClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IDLEntityTests<SUT extends org.omg.CORBA.portable.IDLEntity>
extends org.j8unit.repository.java.io.SerializableTests<SUT> {

}
