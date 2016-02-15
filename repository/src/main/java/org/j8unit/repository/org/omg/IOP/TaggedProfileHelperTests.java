package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.IOP.TaggedProfileHelper class org.omg.IOP.TaggedProfileHelper}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link TaggedProfileHelperClassTests}.
 * </p>
 *
 * @see org.omg.IOP.TaggedProfileHelper class org.omg.IOP.TaggedProfileHelper (the hereby targeted class-under-test
 *      class)
 * @see TaggedProfileHelperClassTests TaggedProfileHelperClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TaggedProfileHelperTests<SUT extends org.omg.IOP.TaggedProfileHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
