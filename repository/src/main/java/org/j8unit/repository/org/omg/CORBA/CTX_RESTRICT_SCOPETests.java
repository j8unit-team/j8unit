package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.CTX_RESTRICT_SCOPE interface
 * org.omg.CORBA.CTX_RESTRICT_SCOPE}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link CTX_RESTRICT_SCOPEClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.CTX_RESTRICT_SCOPE interface org.omg.CORBA.CTX_RESTRICT_SCOPE (the hereby targeted
 *      class-under-test class)
 * @see CTX_RESTRICT_SCOPEClassTests CTX_RESTRICT_SCOPEClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CTX_RESTRICT_SCOPETests<SUT extends org.omg.CORBA.CTX_RESTRICT_SCOPE>
extends RepositoryTests<SUT> {

}
