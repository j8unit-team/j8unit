package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.IOP.TaggedComponent class org.omg.IOP.TaggedComponent},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.IOP.TaggedComponentTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.IOP.TaggedComponentClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.IOP.TaggedComponent
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TaggedComponentTests<SUT extends org.omg.IOP.TaggedComponent>
extends org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
