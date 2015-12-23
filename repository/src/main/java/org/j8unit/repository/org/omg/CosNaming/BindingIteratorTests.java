package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CosNaming.BindingIterator interface
 * org.omg.CosNaming.BindingIterator}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CosNaming.BindingIteratorTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CosNaming.BindingIteratorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CosNaming.BindingIterator
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BindingIteratorTests<SUT extends org.omg.CosNaming.BindingIterator>
extends org.j8unit.repository.org.omg.CosNaming.BindingIteratorOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
