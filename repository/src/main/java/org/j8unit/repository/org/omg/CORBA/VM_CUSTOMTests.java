package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.VM_CUSTOM interface org.omg.CORBA.VM_CUSTOM}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.VM_CUSTOMTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.VM_CUSTOMClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.VM_CUSTOM
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface VM_CUSTOMTests<SUT extends org.omg.CORBA.VM_CUSTOM>
extends RepositoryTests<SUT> {

}
