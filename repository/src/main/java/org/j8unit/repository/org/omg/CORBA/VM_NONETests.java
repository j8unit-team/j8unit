package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.VM_NONE interface org.omg.CORBA.VM_NONE}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link VM_NONEClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.VM_NONE interface org.omg.CORBA.VM_NONE (the hereby targeted class-under-test class)
 * @see VM_NONEClassTests VM_NONEClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface VM_NONETests<SUT extends org.omg.CORBA.VM_NONE>
extends RepositoryTests<SUT> {

}
