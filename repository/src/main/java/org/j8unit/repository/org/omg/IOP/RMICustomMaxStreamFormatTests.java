package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.IOP.RMICustomMaxStreamFormat interface
 * org.omg.IOP.RMICustomMaxStreamFormat}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link RMICustomMaxStreamFormatClassTests}.
 * </p>
 *
 * @see org.omg.IOP.RMICustomMaxStreamFormat interface org.omg.IOP.RMICustomMaxStreamFormat (the hereby targeted
 *      class-under-test class)
 * @see RMICustomMaxStreamFormatClassTests RMICustomMaxStreamFormatClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RMICustomMaxStreamFormatTests<SUT extends org.omg.IOP.RMICustomMaxStreamFormat>
extends RepositoryTests<SUT> {

}
