package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.BAD_POLICY_TYPE interface org.omg.CORBA.BAD_POLICY_TYPE}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link BAD_POLICY_TYPEClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.BAD_POLICY_TYPE interface org.omg.CORBA.BAD_POLICY_TYPE (the hereby targeted class-under-test
 *      class)
 * @see BAD_POLICY_TYPEClassTests BAD_POLICY_TYPEClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BAD_POLICY_TYPETests<SUT extends org.omg.CORBA.BAD_POLICY_TYPE>
extends RepositoryTests<SUT> {

}
