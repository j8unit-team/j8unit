package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.IOP.TAG_MULTIPLE_COMPONENTS interface
 * org.omg.IOP.TAG_MULTIPLE_COMPONENTS}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link TAG_MULTIPLE_COMPONENTSClassTests}.
 * </p>
 *
 * @see org.omg.IOP.TAG_MULTIPLE_COMPONENTS interface org.omg.IOP.TAG_MULTIPLE_COMPONENTS (the hereby targeted
 *      class-under-test class)
 * @see TAG_MULTIPLE_COMPONENTSClassTests TAG_MULTIPLE_COMPONENTSClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TAG_MULTIPLE_COMPONENTSTests<SUT extends org.omg.IOP.TAG_MULTIPLE_COMPONENTS>
extends RepositoryTests<SUT> {

}
