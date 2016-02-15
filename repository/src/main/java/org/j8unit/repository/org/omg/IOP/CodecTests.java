package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.IOP.Codec interface org.omg.IOP.Codec}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link CodecClassTests}.
 * </p>
 *
 * @see org.omg.IOP.Codec interface org.omg.IOP.Codec (the hereby targeted class-under-test class)
 * @see CodecClassTests CodecClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CodecTests<SUT extends org.omg.IOP.Codec>
extends CodecOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
