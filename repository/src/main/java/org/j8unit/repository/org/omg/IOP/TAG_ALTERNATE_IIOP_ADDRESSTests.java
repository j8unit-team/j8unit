package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS interface
 * org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link TAG_ALTERNATE_IIOP_ADDRESSClassTests}.
 * </p>
 *
 * @see org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS interface org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS (the hereby targeted
 *      class-under-test class)
 * @see TAG_ALTERNATE_IIOP_ADDRESSClassTests TAG_ALTERNATE_IIOP_ADDRESSClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TAG_ALTERNATE_IIOP_ADDRESSTests<SUT extends org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS>
extends RepositoryTests<SUT> {

}
