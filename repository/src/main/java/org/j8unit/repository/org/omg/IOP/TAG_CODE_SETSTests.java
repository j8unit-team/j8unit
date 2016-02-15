package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.IOP.TAG_CODE_SETS interface org.omg.IOP.TAG_CODE_SETS}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link TAG_CODE_SETSClassTests}.
 * </p>
 *
 * @see org.omg.IOP.TAG_CODE_SETS interface org.omg.IOP.TAG_CODE_SETS (the hereby targeted class-under-test class)
 * @see TAG_CODE_SETSClassTests TAG_CODE_SETSClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TAG_CODE_SETSTests<SUT extends org.omg.IOP.TAG_CODE_SETS>
extends RepositoryTests<SUT> {

}
