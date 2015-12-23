package org.j8unit.repository.org.omg.Dynamic;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.Dynamic.Parameter class org.omg.Dynamic.Parameter}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.Dynamic.ParameterTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.Dynamic.ParameterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.Dynamic.Parameter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParameterTests<SUT extends org.omg.Dynamic.Parameter>
extends org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
