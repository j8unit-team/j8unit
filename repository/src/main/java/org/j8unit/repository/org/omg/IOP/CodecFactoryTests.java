package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.IOP.CodecFactory interface org.omg.IOP.CodecFactory},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.IOP.CodecFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.IOP.CodecFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.IOP.CodecFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CodecFactoryTests<SUT extends org.omg.IOP.CodecFactory>
extends org.j8unit.repository.org.omg.IOP.CodecFactoryOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
