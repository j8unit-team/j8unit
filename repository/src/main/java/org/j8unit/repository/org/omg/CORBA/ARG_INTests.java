package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.ARG_IN interface org.omg.CORBA.ARG_IN}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ARG_INClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.ARG_IN interface org.omg.CORBA.ARG_IN (the hereby targeted class-under-test class)
 * @see ARG_INClassTests ARG_INClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ARG_INTests<SUT extends org.omg.CORBA.ARG_IN>
extends RepositoryTests<SUT> {

}
